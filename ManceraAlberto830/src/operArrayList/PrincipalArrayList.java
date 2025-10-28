package operArrayList;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class PrincipalArrayList {

	public static void main(String[] args) {
		ArrayList<Estudiante> lista;
		File f = new File("notas1.txt");
		System.out.println("Importa la información contenida en el documento notas1.txt");
		System.out.println("--------------------------------------------");
		lista = importarDatos(f);
		
		System.out.println("2. Muestra el número de registros que contiene.");
		System.out.println("-----------------------------------------");
		System.out.println("Número de registros: "+ lista.size());
		
		System.out.println("3. Ordena los registros por grupo y nombre.");
		System.out.println("-----------------------------------------");
		Collections.sort(lista, Comparator.comparing(Estudiante::getGrupo)
	            .thenComparing(Estudiante::getNombre));
		guardarEnArchivo(lista,"notasPorGrupoYNombre.txt");
		System.out.println("Guardamos las lista ordenada en: notasPorGrupoYNombre.txt");
		
		System.out.println("4. Inserta siguiente registro:");
		System.out.println("-----------------------------------------");
		Estudiante est1 = new Estudiante("1º ESO D","López Muro, Rosario",3,3,4,4,3);
		lista.add(est1);
		System.out.println("Número de registros: "+ lista.size());
		
		System.out.println("5. Inserta siguiente registro en mitad de la lista:");
		System.out.println("-----------------------------------------");
		Estudiante est2 = new Estudiante("1º ESO B","Duarte Durán, Alba", 2,3,4,1,3);
		lista.add(lista.size()/2, est2);
		
		System.out.println("6. Posición del nuevo registro: "+ lista.indexOf(est2));
		
		System.out.println("7. Importa los registros del documento notas2.txt a un ArraList auxiliar e incluye los elementos\r\n"
				+ "de este ArrayList auxiliar al primer ArrayList.");
		ArrayList<Estudiante>lista2;
		File f1 = new File("notas2.txt");
		System.out.println("Total registros antes de añadir: "+ lista.size());
		lista2 = importarDatos(f1);
		System.out.println("Total registros de la lista auxiliar: "+ lista2.size());
		lista.addAll(lista2);
		System.out.println("Total registros después de añadir: "+ lista.size());
		Collections.sort(lista,Comparator.comparing(Estudiante::getGrupo));
		guardarEnArchivo(lista,"registroCompletoDeNotas.txt");
		System.out.println("Guardamos la lista completa y ordenada en: registroCompeltoDeNotas.txt");
		
		System.out.println("8. Busca el registro con el nombre “Cordero Benítez, Alejandro” y muestra toda su información");
		System.out.println("-----------------------------------------");
		System.out.println(buscarNombre("Cordero Benítez, Alejandro", lista));
		
		
		System.out.println("9. Busca el registro con el nombre “Fernández Villalón, Carlos” y muestra toda su información");
		System.out.println("-----------------------------------------");
		System.out.println(buscarNombre("Fernández Villalón, Carlos", lista));
		
		System.out.println("10. Borra el registro que está en la posición mitad más 1 e imprime toda su información...");
		System.out.println("-----------------------------------------");
		System.out.println("Posición mitad + 1: "+(lista.size()/2)+1);
		System.out.println("Registro en la posición 74" + lista.get(74));
		
		lista.remove((lista.size()/2)+1);
		System.out.println("Borramos registro ...");
		System.out.println("Nuevo registro en la posicion 74 :"+ lista.get(74));

		System.out.println("11. Borramos los primeros 10 registros");
		System.out.println("-----------------------------------------");
		System.out.println("Total registros: "+ lista.size());
		if(lista.size() >=10) {
			for(int i =0; i<10; i++) {
				lista.remove(0);
			}
		}
		System.out.println("Total registros después de borrar: "+ lista.size());
		
		
		System.out.println("12. Borra todos los registros que tengan en matemáticas un 2. Indica cuántos registros borras");
		System.out.println("Se han borrado : "+ borrarRegistrosMatematicas(lista));
		
		System.out.println("13. Calcula la nota media para cada alumno :");
		guardarNotasMedia(lista);
		System.out.println("Se ha guardado el nombre y la nota media en cada registro en nombre_y_nota_media.txt");
		
		System.out.println("14. Crea una sublista por cada grupo y órdenala por nombre descendente");
		crearSublistasPorGrupo(lista);
		System.out.println("Creando");
		
		System.out.println("15. Calcula para cada grupo la nota media: ");
		
		System.out.println("16. Mostrar las diez mejores notas en matemáticas ");
		guardarTop10MatematicasPorGrupo(lista);
	}

	private static ArrayList<Estudiante> importarDatos(File f) {
		ArrayList<Estudiante> e1 = new ArrayList<>();
		
		try {
			Scanner lector = new Scanner(f);
		
			while(lector.hasNext()) {
				String linea = lector.nextLine();
				String [] partes = linea.split(";");
				String grupo = partes[0];
				String nombre = partes[1];
				int matematicas = Integer.parseInt(partes[2]);
				int lengua = Integer.parseInt(partes[3]);
				int fisica = Integer.parseInt(partes[4]);
				int quimica = Integer.parseInt(partes[5]);
				int ingles = Integer.parseInt(partes[6]);
				
				Estudiante estudiante = new Estudiante(grupo,nombre,matematicas,lengua,fisica,quimica,ingles);
				e1.add(estudiante);
			}
			lector.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return e1;
	}
	
	private static void guardarEnArchivo(ArrayList<Estudiante> lista, String nombreArchivo ) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo));
			
			for (Estudiante estudiante : lista) {
				writer.write(estudiante.getGrupo() + ";"
				+estudiante.getNombre() + ";"
				+ estudiante.getMatematicas()+ ";"
				+ estudiante.getLengua() + ";"
				+estudiante.getFisica() + ";"
				+ estudiante.getQuimica() + ";"
				+ estudiante.getIngles()); 
				
				writer.newLine();
			}
			
			writer.close();
		}catch (IOException e) {
			System.out.println("Erro al guardar el archivo: " + e.getMessage());
		}
		
	}
	
	private static String buscarNombre(String nombre, ArrayList<Estudiante> lista){
		String informacion = "Registro no encontrado";
		
		Iterator<Estudiante> iterador1 = lista.iterator();
		
		while(iterador1.hasNext()) {
			Estudiante al=iterador1.next();
			if(al.getNombre().equalsIgnoreCase(nombre)) {
				informacion = al.toString();
			}
		}
		return informacion;
	}
	
	private static int borrarRegistrosMatematicas (ArrayList<Estudiante> lista) {
		int contador = 0;
		Iterator<Estudiante> iterador = lista.iterator();
		
		while (iterador.hasNext()) {
			if (iterador.next().getMatematicas() == 2) {
				iterador.remove();
				contador ++;
			}
		}
		return contador;
	}
	
	private static void guardarNotasMedia(ArrayList<Estudiante> lista) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("nombre_y_nota_media.txt"));
			
			for (Estudiante estudiante : lista) {
				writer.write(estudiante.getNombre() + ";"
				+ estudiante.calcularNotaMedia());
				writer.newLine();
			}
			
			writer.close();
		}catch (IOException e) {
			System.out.println("Erro al guardar el archivo: " + e.getMessage());
		}
		
	}
	
	private static void crearSublistasPorGrupo(ArrayList<Estudiante> lista) {
	   // Paso 1: Crear un mapa donde la clave es el grupo y el valor es una lista de estudiantes
	Map<String, List<Estudiante>> grupoMap = new HashMap<>();
	 // Paso 2: Recorrer la lista original y agrupar los estudiantes por grupo
	for (Estudiante est : lista) {
		//Si el grupo no existe en el mapa, lo añade con una nueva lista vacía
		grupoMap.putIfAbsent(est.getGrupo(), new ArrayList<>());
		//Agrega el estudiante a la lista correspondiente
		grupoMap.get(est.getGrupo()).add(est);
	}
	  // Paso 3: Ordenar cada sublista por nombre en orden descendente
	for (Map.Entry<String, List<Estudiante>> entry : grupoMap.entrySet()) {
		//Obtiene la lista de estudiantes de ese grupo
		List<Estudiante> est = entry.getValue();
		//Ordena la lista en orden descendente ((reversed)
		est.sort(Comparator.comparing(Estudiante::getNombre).reversed());
		 // Paso 4: Guardar la sublista ordenada en un archivo con el nombre del grupo
		//getKey: Obtiene el nombre del grupo
		guardarEnArchivo(new ArrayList<>(est), entry.getKey());
		}
	}
	
	private static void calcularNotaMediaPorGrupo(ArrayList<Estudiante> lista) {
		Map<String, List<Double>> notasPorGrupo = new HashMap<>();
		
		for (Estudiante est : lista) {
			double notaMediaEstudiante = (est.getMatematicas()+ est.getFisica()+ est.getIngles()
			+est.getQuimica()+ est.getLengua())/ 5;
			
			notasPorGrupo.putIfAbsent(est.getGrupo(), new ArrayList<>());
			notasPorGrupo.get(est.getGrupo()).add(notaMediaEstudiante);
		}
		
	}
	
	private static void guardarTop10MatematicasPorGrupo(ArrayList<Estudiante> lista) {
		Map<String, List<Estudiante>> grupoMap = new HashMap<>();
		
		for (Estudiante est : lista) {
			grupoMap.putIfAbsent(est.getGrupo(), new ArrayList<>());
			grupoMap.get(est.getGrupo()).add(est);
		}
		
		for (Map.Entry<String, List<Estudiante>> entry : grupoMap.entrySet()) {
			List<Estudiante> estudiantes = entry.getValue();
			estudiantes.sort(Comparator.comparingInt(Estudiante::getMatematicas));
			guardarEnArchivo(new ArrayList<>(estudiantes), entry.getKey()+ "_diez_mejores.txt");
		}
		
	}
}
