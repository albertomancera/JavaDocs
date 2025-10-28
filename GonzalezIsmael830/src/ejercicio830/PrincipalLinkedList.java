package ejercicio830;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PrincipalLinkedList {

	public static void main(String[] args) {
		File f = new File("notas1.txt");
		LinkedList <Alumno> lista = importarAlumno(f);
		System.out.println("2. Muestra el número de registros que contiene.");
		System.out.println("Cantidad de registros: "+lista.size());
		System.out.println("-----------------------------------------------");
		
		System.out.println("3. Ordena los registros por grupo y nombre.");
		Collections.sort(lista, Comparator.comparing(Alumno::getGrupo)
				.thenComparing(Alumno::getNombre));
		exportarDatos("notasPorGrupoYNombreLinked.txt", lista);
		System.out.println("-----------------------------------------------");
		
		System.out.println("4. Añade el registro abajo indicado en la mitad de la lista.\r\n"
				+ "1º ESO A;Plaza Gallego, Juan;1;1;3;1;1");
		Alumno al1 = new Alumno("1º ESO A", "Plaza Gallego, Juan", 1, 1, 3 ,1, 1);
		lista.add(lista.size()/2,al1);
		System.out.println("Añadimos el registro: "+lista.size());
		System.out.println("Posición del nuevo registro: "+lista.indexOf(al1));
		System.out.println("-----------------------------------------------");
		
		System.out.println("5. Añade el mismo registro al principio de la lista");
		lista.addFirst(al1);
		System.out.println("Añadimos el registro: "+lista.size());
		System.out.println("Posición del nuevo registro: "+lista.indexOf(al1));
		System.out.println("-----------------------------------------------");
		
		System.out.println("6. Importa los registros contenidos en el documento notas2.txt en una lista auxiliar.");
		f = new File("notas2.txt");
		LinkedList<Alumno> listaAuxiliar = importarAlumno(f);
		System.out.println("Total de registros antes de añadir: "+lista.size());
		System.out.println("Total de registros de la lista auxiliar: "+listaAuxiliar.size());
		System.out.println("-----------------------------------------------");
		
		System.out.println("7. Añade la lista auxiliar al principio de la lista original.");
		lista.addAll(0, listaAuxiliar);
		System.out.println("Total de registros después de añadir: "+lista.size());
		exportarDatos("LinkedList7.txt", lista);
		System.out.println("-----------------------------------------------");
		
		System.out.println("8. Muestra el registro que está en la primera posición de la lista");
		System.out.println("Primer Registro: "+lista.getFirst());
		System.out.println("-----------------------------------------------");
		
		System.out.println("9. Muestra el registro que está en la última posición posición de la lista.");
		System.out.println("Último Registro: "+lista.getLast());
		System.out.println("-----------------------------------------------");
		
		System.out.println("10. Muestra el registro que está en la mitad de la lista");
		System.out.println("Último Registro: "+lista.get(lista.size()/2));
		System.out.println("-----------------------------------------------");
		
		System.out.println("13. ¿El siguiente registro está en la lista? 1º ESO E;Postigo Vázquez, Salvador;3;6;5;3;4");
		Alumno buscar1 = new Alumno("1º ESO E", "Postigo Vázquez, Salvador", 3, 6, 5, 3, 4);
		if(lista.contains(buscar1)) {
			System.out.println("Sí está");
		} else {
			System.out.println("No está");
		}
		System.out.println("-----------------------------------------------");
		
		System.out.println("14. ¿Y éste? 1º ESO A;García Fernández, María;6;5;6;5;5");
		Alumno buscar2 = new Alumno("1º ESO A", "García Fernández, María", 6, 5, 6, 5, 5);
		if(lista.contains(buscar2)) {
			System.out.println("Sí está");
		} else {
			System.out.println("No está");
		}
		System.out.println("-----------------------------------------------");
		
		System.out.println("15. Eliminar primera ocurrencia del registro insertado");
        int pos = lista.indexOf(al1);
        Alumno eliminado = lista.remove(pos);
        System.out.println("Eliminado en posición " + pos + ": " + eliminado);
        System.out.println("-----------------------------------------------");
        
        System.out.println("16. Eliminar registro en posición media");
        int posMedia = lista.size()/2;
        Alumno eliminadoMedia = lista.remove(posMedia);
        System.out.println("Eliminado en posición media (" + posMedia + "): " + eliminadoMedia);
        System.out.println("El nuevo registro en dicha posición es: "+lista.get(posMedia));
        System.out.println("-----------------------------------------------");
        
        System.out.println("17. Elimina el registro cuyo nombre es: Carrillo Segura, Félix, indicando su posición y\r\n"
        		+ "contenido");
        System.out.println(eliminarAlumno(lista, "Carrillo Segura, Félix"));
        System.out.println("-----------------------------------------------");
        
        System.out.println("18. Elimina el registro cuyo nombre es: Robles Ortiz, Rafael, indicando su posición y contenido.");
        System.out.println(eliminarAlumno(lista, "Robles Ortiz, Rafael"));
        System.out.println("-----------------------------------------------");
	}
	
	private static LinkedList<Alumno> importarAlumno(File f) {
		LinkedList<Alumno> l1 = new LinkedList<>();
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
	
	private static String eliminarAlumno (List<Alumno> l, String nombre) {
		int pos = -1;
		String el="";
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).getNombre().equals(nombre)) {
                pos = i;
                break;
            }
        }
        if (pos != -1) {
            Alumno eliminado = l.remove(pos);
            el="Eliminado "+nombre+" en posición " + pos + ": " + eliminado;
        } else {
        	el="Registro no encontrado";
        }
        return el;
	}
	
	private static LinkedList<Alumno> exportarGrupos(List<Alumno> l, String grupo, String nombre) {
		LinkedList<Alumno> li = new LinkedList<>();
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
		LinkedList<String> li = new LinkedList<>();
		for (Alumno alumno : l) {
			li.add("Nota Mates: "+alumno.getMatematicas()+" Nombre: "+alumno.getNombre()+"\r\n");
		}
		return li;
	}
}
