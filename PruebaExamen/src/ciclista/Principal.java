package ciclista;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		// Creamos ciclistas
		Velocista ciclista1 = new Velocista(1,"Contador",60,35.0);
		Escalador ciclista2 = new Escalador(2,"Pedro",40,20);
		
		crearCiclista(ciclista1);
		crearCiclista(ciclista2);
		
		//Creamos equipo
		Equipo equipo1 = new Equipo("MalagaCF","España");
		crearEquipo(equipo1);
		
		//Asignamos ciclistas
		añadirCiclistaAEquipo(1,"MalagaCF");
		añadirCiclistaAEquipo(2,"MalagaCF");
		
		//Importar particiones desde archivo
		try {
			importarParticionesDesdeArchivo("participaciones.txt");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	
		//Mostrar participaciones
		System.out.println("Participaciones en Vuelta España");
		mostrarCiclistasPorEvento("Vuelta España");
		
		System.out.println("Ciclistas por equipo :");
		exportarCiclistasPorEquipo();
		
		System.out.println("Datos del ciclista con dorsal 2:");
		mostrarDatosCiclista(2);
		
	
	}
	
	static Map<Integer, Ciclista> ciclistas = new HashMap<>();//Guardamos ciclistas por dorsal
	static List<Equipo> equipos = new ArrayList<>(); //Lista de equipos
	static Map<String, List<Ciclista>> eventos = new HashMap<>(); //Ciclistas que participaron en cada evento
	
	//Añadir un nuevo ciclista
	public static void crearCiclista(Ciclista c) {
		ciclistas.put(c.getIdentificador(), c);
	}
	
	//Añadir un nuevo equipo
	public static void crearEquipo(Equipo e) {
		equipos.add(e);
	}
	
	//Asignar un ciclista a un equipo por su dorsal y nombre del equipo
	public static void añadirCiclistaAEquipo(int identificador, String nombreEquipo) {
		Ciclista c = ciclistas.get(identificador);
		for (Equipo equipo : equipos) {
			if(equipo.getNombre().equals(nombreEquipo)) {
				equipo.añadirCilista(c);
			}
		}
	}
	
	//Registrar una participación manualmente
	public static void registrarParticipacion (int identificador, String evento, String fecha, String tiempo) {
		Ciclista c = ciclistas.get(identificador);
		if(c != null) {
			c.registrarEvento(evento, fecha, tiempo);
			eventos.putIfAbsent(evento, new ArrayList<>());
			if(!eventos.get(evento).contains(c)) {
				eventos.get(evento).add(c);
			}
			}
	}
	
	public static void importarParticionesDesdeArchivo(String nombreArchivo) throws IOException {
		try(BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))){
			String linea;
			while((linea = br.readLine()) != null) {
				String[] partes = linea.split(","); 
				if(partes.length == 4) {
					int identificador = Integer.parseInt(partes[0].trim());
					String fecha = partes[1].trim();
					String evento = partes[2].trim();
					String tiempo = partes[3].trim();
					registrarParticipacion(identificador,evento,fecha,tiempo);
				}
			}
			System.out.println("Particiones importadas correctamentes desde " + nombreArchivo);
		}catch(IOException e) {
			System.out.println("Error al leer el archivo: " + e.getMessage());
		}
	}
	
	//Mostrar ciclistas de un evento
	public static void mostrarCiclistasPorEvento(String evento) {
		List<Ciclista> lista = eventos.get(evento);
		if(lista == null || lista.isEmpty()) {
			System.out.println("No hay participantes en ese evento");
			return; //Esto evita que se siga ejecutando con lista == null
		}
		
		for (Ciclista ciclista : lista) {
			System.out.println(ciclista);
		}
	}
	
	//Mostrar los ciclistas agrupados por equipo
	public static void exportarCiclistasPorEquipo() {
		for (Equipo equipo : equipos) {
			System.out.println("Equipo: "+ equipo.getNombre());
			for (Ciclista c : equipo.getCiclistas()) {
				System.out.println("  " + c);
			}
		}
	}
	
	//Mostrar informacion de un ciclista por su dorsal
	public static void mostrarDatosCiclista(int identificador) {
		Ciclista c = ciclistas.get(identificador);
		if (c == null) {
			System.out.println("Ciclista  no encontrado");
		}else {
			System.out.println(c);
		}
	}
	
	
}
