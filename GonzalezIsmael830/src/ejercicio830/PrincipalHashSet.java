package ejercicio830;

import java.io.File;
import java.io.FileWriter;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class PrincipalHashSet {

	public static void main(String[] args) {
		File f = new File("notas1hs.txt");
		HashSet<Alumno> conjunto= importarAlumno(f);
		
		System.out.println("2. Muestra el número de registros que contiene.");
		System.out.println("El número de registros es de: "+conjunto.size());
		System.out.println("-----------------------------------------------");
		
		System.out.println("3. Ordena los registros por grupo y nombre");
		ArrayList ordenado = new ArrayList(conjunto);
		Collections.sort(ordenado, Comparator.comparing(Alumno::getGrupo)
				.thenComparing(Alumno::getNombre));
		exportarDatos("HashSet3.txt", ordenado);
		System.out.println("-----------------------------------------------");
		
		System.out.println("4. Añade el registro abajo indicado.\r\n"
				+ "1º ESO A;Plaza Gallego, Juan;1;1;3;1;1");
		Alumno al1 = new Alumno("1º ESO A", "Plaza Gallego, Juan", 1, 1, 3, 1, 1);
		if(conjunto.add(al1)) {
			System.out.println("Alumno añadido con éxito");
			System.out.println("El número de registros es de: "+conjunto.size());
		} else {
			System.out.println("Alumno ya existente");
			System.out.println("El número de registros es de: "+conjunto.size());
		}
		System.out.println("-----------------------------------------------");
		
		System.out.println("5. Añade el registro abajo indicado.\r\n"
				+ "1º ESO A;Suárez Cano, Francisco José;2;3;4;1;2");
		Alumno al2 = new Alumno("1º ESO A", "Suárez Cano, Francisco José", 2, 3, 4, 1, 2);
		if(conjunto.add(al2)) {
			System.out.println("Alumno añadido con éxito");
			System.out.println("El número de registros es de: "+conjunto.size());
		} else {
			System.out.println("Alumno ya existente");
			System.out.println("El número de registros es de: "+conjunto.size());
		}
		System.out.println("-----------------------------------------------");
		
		System.out.println("6. Importa los registros contenidos en el documento notas2hs.txt en un arralist.");
		File f2 = new File("notas2hs.txt");
		ArrayList<Alumno> importado = importarAlumnos(f2);
		System.out.println("El número de registros es de: "+importado.size());
		System.out.println("-----------------------------------------------");
		
		System.out.println("7. Inserta los registros contenidos en el arralist anterior en el HashSet");
		conjunto.addAll(importado);
		System.out.println("El número de registros es de: "+conjunto.size());
		System.out.println("-----------------------------------------------");
		
		System.out.println("8. Comprueba que el registro del punto 4 está en el conjunto.");
		if(conjunto.contains(al1)) {
			System.out.println("Si está");
		} else {
			System.out.println("No está");
		}
		System.out.println("-----------------------------------------------");
		
		System.out.println("9. Comprueba que el registro del punto 5 está en el conjunto.");
		if(conjunto.contains(al2)) {
			System.out.println("Si está");
		} else {
			System.out.println("No está");
		}
		System.out.println("-----------------------------------------------");
	}
	
	private static HashSet<Alumno> importarAlumno(File f) {
		HashSet<Alumno> l1 = new HashSet<>();
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
	
	private static ArrayList<Alumno> importarAlumnos(File f) {
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
