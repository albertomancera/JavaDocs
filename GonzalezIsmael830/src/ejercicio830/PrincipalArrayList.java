package ejercicio830;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PrincipalArrayList {

	public static void main(String[] args) {
		ArrayList<Alumno> lista;
		File f1 = new File("notas1.txt");
		lista = importarAlumno(f1);
		System.out.println("2. Muestra el número de registros que contiene.");
		System.out.println("Cantidad de registros: "+lista.size());
		System.out.println("-----------------------------------------------");
		
		System.out.println("3. Ordena los registros por grupo y nombre.");
		Collections.sort(lista, Comparator.comparing(Alumno::getGrupo)
				.thenComparing(Alumno::getNombre));
		exportarDatos("notasPorGrupoYNombreArray.txt", lista);
		
		System.out.println("-----------------------------------------------");
		
		System.out.println("4. Inserta siguiente registro:\r\n"
				+ "1º ESO D;López Muro, Rosario;3;3;4;4;3");
		Alumno al1 = new Alumno("1º ESO D", "López Muro, Rosario", 3, 3, 4, 4, 3);
		lista.add(al1);
		System.out.println("Añadimos el registro: "+lista.size());
		System.out.println("-----------------------------------------------");
		
		System.out.println("5. Insertar el siguiente registro en mitad de la lista:\r\n"
				+ "1º ESO B;Duarte Durán, Alba;2;3;4;1;3\r\n"+
				"6. Mostrar la posición que ocupa el último registro anterior insertado.");
		Alumno al2 = new Alumno("1º ESO B", "Duarte Durán, Alba", 2, 3, 4, 1, 3);
		lista.add(lista.size()/2, al2);
		System.out.println("Posición del nuevo registro: "+lista.indexOf(al2));
		System.out.println("-----------------------------------------------");
		
		System.out.println("7. Importa los registros del documento notas2.txt a un ArraList auxiliar e incluye los elementos\r\n"
				+ "de este ArrayList auxiliar al primer ArrayList");
		ArrayList<Alumno> lista2;
		File f2 = new File("notas2.txt");
		lista2 = importarAlumno(f2);
		System.out.println("Total de registros antes de añadir: "+lista.size());
		System.out.println("Total de registros de la lista auxiliar: "+lista2.size());
		lista.addAll(lista2);
		System.out.println("Total de registros después de añadir: "+lista.size());
		Collections.sort(lista, Comparator.comparing(Alumno::getGrupo)
				.thenComparing(Alumno::getNombre));
		exportarDatos("registroCompletoDeNotasArray.txt", lista);
		System.out.println("-----------------------------------------------");
		
		System.out.println("8. Busca el registro con el nombre “Cordero Benítez, Alejandro” y muestra toda su\r\n"
				+ "información.");
		System.out.println(buscarAlumno(lista, "Cordero Benítez, Alejandro"));
		System.out.println("-----------------------------------------------");
		
		System.out.println("9. Busca el registro con el nombre “Fernández Villalón, Carlos” y muestra toda su\r\n"
				+ "información.");
		System.out.println(buscarAlumno(lista, "Fernández Villalón, Carlos"));
		System.out.println("-----------------------------------------------");
		
		System.out.println("10. Borra el registro que está en la posición mitad más 1, indicando la información del registro\r\n"
				+ "que borras.");
		System.out.println("Posición mitad +1 de la lista: "+((lista.size()/2)+1));
		System.out.println("Registro en la posición "+((lista.size()/2)+1)+": "+lista.get(lista.size()/2));
		System.out.println("Borramos el registro...");
		lista.remove(lista.size()/2);
		System.out.println("Nuevo registro en la posición "+((lista.size()/2)+1)+": "+lista.get(lista.size()/2));
		lista.trimToSize();
		System.out.println("-----------------------------------------------");
		
		System.out.println("11. Borra los primeros 10 registros");
		System.out.println("Total de registros: "+lista.size());
		exportarDatos("registrosBorradosArray.txt", lista.subList(0, 10));
		lista.subList(0, 10).clear();
		lista.trimToSize();
		System.out.println("Total registros después de borrar: "+lista.size());
		System.out.println("-----------------------------------------------");
		
		System.out.println("12. Borra todos los registros que tengan en matemáticas un 2. Indica cuántos registros borras");
		ArrayList<Alumno> listaMatematicas = new ArrayList<>();
		for (Alumno alumno : lista) {
			if(alumno.getMatematicas()==2) {
				listaMatematicas.add(alumno);
			}
		}
		exportarDatos("registroBorradosMatematicasArray.txt", listaMatematicas);
		int tamannoAnterior = lista.size();
		lista.removeIf(a -> a.getMatematicas()==2);
		lista.trimToSize();
		System.out.println("Se han borrado "+(tamannoAnterior-lista.size())+" registros");
		System.out.println("-----------------------------------------------");
		
		System.out.println("13. Calcula la nota media para cada alumno.");
		ArrayList<String> listaMedias = new ArrayList<>();
		for (Alumno alumno : lista) {
			listaMedias.add("Nombre: "+alumno.getNombre()+", Media: "+alumno.getNotaMedia());
		}
		exportarDatos("notaMediaArray.txt", listaMedias);
		System.out.println("Se ha guardado el nombre y la nota media de cada registro en notaMedia.txt");
		System.out.println("-----------------------------------------------");
		
		
		System.out.println("14. Crea una sublista por cada grupo y ordénala por nombre descendente.");
		ArrayList<Alumno> sub1A, sub1B, sub1C, sub1D, sub1E;
		sub1A = exportarGrupos(lista, "1º ESO A", "sublista1A.txt");
		System.out.println("Sublista para '1º ESO A' ordenada por nombre descendente en: 'sublista1A.txt'");
		sub1B = exportarGrupos(lista, "1º ESO B", "sublista1B.txt");
		System.out.println("Sublista para '1º ESO B' ordenada por nombre descendente en: 'sublista1B.txt'");
		sub1C = exportarGrupos(lista, "1º ESO C", "sublista1C.txt");
		System.out.println("Sublista para '1º ESO C' ordenada por nombre descendente en: 'sublista1C.txt'");
		sub1D = exportarGrupos(lista, "1º ESO D", "sublista1D.txt");
		System.out.println("Sublista para '1º ESO D' ordenada por nombre descendente en: 'sublista1D.txt'");
		sub1E = exportarGrupos(lista, "1º ESO E", "sublista1E.txt");
		System.out.println("Sublista para '1º ESO E' ordenada por nombre descendente en: 'sublista1E.txt'");
		System.out.println("-----------------------------------------------");
		
		System.out.println("15. Calcula para cada grupo la nota media de cada materia.");
		ArrayList<String> lista1A = new ArrayList<>();
		ArrayList<String> lista1B = new ArrayList<>();
		ArrayList<String> lista1C = new ArrayList<>();
		ArrayList<String> lista1D = new ArrayList<>();
		ArrayList<String> lista1E = new ArrayList<>();
		annadirEntradas(lista1A, sub1A);
		annadirEntradas(lista1B, sub1B);
		annadirEntradas(lista1C, sub1C);
		annadirEntradas(lista1D, sub1D);
		annadirEntradas(lista1E, sub1E);
		exportarDatos("notasMedias1Array.txt", lista1A);
		exportarDatos("notasMedias1BArray.txt", lista1B);
		exportarDatos("notasMedias1CArray.txt", lista1C);
		exportarDatos("notasMedias1DArray.txt", lista1D);
		exportarDatos("notasMedias1EArray.txt", lista1E);
		System.out.println("Los resultados se han guardado en el archivo 'notasMedias1A.txt'");
		System.out.println("Los resultados se han guardado en el archivo 'notasMedias1B.txt'");
		System.out.println("Los resultados se han guardado en el archivo 'notasMedias1C.txt'");
		System.out.println("Los resultados se han guardado en el archivo 'notasMedias1D.txt'");
		System.out.println("Los resultados se han guardado en el archivo 'notasMedias1E.txt'");
		System.out.println("-----------------------------------------------");
		
		System.out.println("16. Para cada grupo muestra las diez mejores notas en matemáticas ordenadas por nota y\r\n"
				+ "nombre");
		System.out.println("Diez mejores de 1º A: "+mostrarDiez(sub1A));
		System.out.println("Diez mejores de 1º B: "+mostrarDiez(sub1B));
		System.out.println("Diez mejores de 1º C: "+mostrarDiez(sub1C));
		System.out.println("Diez mejores de 1º D: "+mostrarDiez(sub1D));
		System.out.println("Diez mejores de 1º E: "+mostrarDiez(sub1E));
	}
	
	private static ArrayList<Alumno> importarAlumno(File f) {
		ArrayList<Alumno> l1 = new ArrayList<>();
		try {
			Scanner lector = new Scanner(f);
			while(lector.hasNext()) {
				String linea = lector.nextLine();
				String[] partes = linea.split(";");
				String grupo = partes[0];
				String nombre = partes[1];
				int matematicas = Integer.parseInt(partes[2]);
				int lengua = Integer.parseInt(partes[3]);
				int fisica = Integer.parseInt(partes[4]);
				int quimica = Integer.parseInt(partes[5]);
				int ingles = Integer.parseInt(partes[6]);
				
				Alumno al = new Alumno(grupo, nombre, matematicas, lengua, fisica, quimica, ingles);
				l1.add(al);
			}
			lector.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return l1;
	}
	
	private static <T> void exportarDatos(String nombre, List<T> lista) {
		File f = new File(nombre);
		try {
			FileWriter escritor = new FileWriter(f);
			for (Object objeto : lista) {
				escritor.write(""+objeto);
				escritor.write("\r\n");
			}
			escritor.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static Alumno buscarAlumno (List<Alumno> l, String nombre) {
		Alumno al = null;
		Iterator<Alumno> itrAlumnos = l.iterator();
		while(itrAlumnos.hasNext()) {
			Alumno alumno = itrAlumnos.next();
			if(alumno.getNombre().equalsIgnoreCase(nombre)) {
				al = alumno;
			}
		}
		
		return al;
	}
	
	private static ArrayList<Alumno> exportarGrupos(List<Alumno> l, String grupo, String nombre) {
		ArrayList<Alumno> li = new ArrayList<>();
		for (Alumno alumno : l) {
			if(alumno.getGrupo().equalsIgnoreCase(grupo)) {
				li.add(alumno);
			}
		}
		Collections.sort(li, Comparator.comparing(Alumno::getNombre).reversed());
		exportarDatos(nombre, li);
		return li;
	}
	
	private static double exportarMediaAsignatura(List<Alumno> l, int num) {
		double notaTotal = 0;
		for (Alumno alumno : l) {
			try {
				notaTotal += alumno.getAsignatura(num);
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		double media;
		media = notaTotal/l.size();
		return media;
	}
	
	private static void annadirEntradas(List<String> l, List<Alumno> l2) {
		l.add("Matematicas: "+exportarMediaAsignatura(l2, 1));
		l.add("Lenguaje: "+exportarMediaAsignatura(l2, 2));
		l.add("Fisica: "+exportarMediaAsignatura(l2, 3));
		l.add("Quimica: "+exportarMediaAsignatura(l2, 4));
		l.add("Ingles: "+exportarMediaAsignatura(l2, 5));
	}
	
	private static List<String> mostrarDiez(List<Alumno> l) {
		Collections.sort(l, Comparator.comparing(Alumno::getMatematicas).thenComparing(Alumno::getNombre).reversed());
		l.subList(10, l.size()).clear();
		ArrayList<String> li = new ArrayList<>();
		for (Alumno alumno : l) {
			li.add("Nota Mates: "+alumno.getMatematicas()+" Nombre: "+alumno.getNombre()+"\r\n");
		}
		return li;
	}
}
