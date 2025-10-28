package operArrayList;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.spi.FileSystemProvider;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PrincipalLinkedList {

	public static void main(String[] args) {
		LinkedList<Estudiante> lista;
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
		guardarEnArchivo(lista,"LinkedList3.txt");
		System.out.println("Guardamos las lista ordenada ");
		
		System.out.println("4. Inserta siguiente registro:");
		System.out.println("-----------------------------------------");
		Estudiante est1 = new Estudiante("1º ESO D","López Muro, Rosario",3,3,4,4,3);
		lista.add(lista.size()/2,est1);
		System.out.println("Número de registros: "+ lista.size());
		System.out.println("Posición del nuevo registro : "+ lista.indexOf(est1));
		
		System.out.println("5. Añade el mismo registro al principio de la lista:");
		System.out.println("-----------------------------------------");
		lista.addFirst(est1);
		System.out.println("Número de registros: "+ lista.size());
		System.out.println("Posición del nuevo registro : "+ lista.indexOf(est1));
		
		System.out.println("6. Importa los registros del documento notas2.txt a un Lista auxiliar");
		LinkedList<Estudiante>lista2;
		File f1 = new File("notas2.txt");
		System.out.println("Total registros antes de añadir: "+ lista.size());
		lista2 = importarDatos(f1);
		System.out.println("Total registros de la lista auxiliar: "+ lista2.size());
		
		System.out.println("7.Añade la lista auxiliar al principio de la lista original.");
		lista.addAll(0,lista2);
		System.out.println("Total registros después de añadir: "+ lista.size());
		guardarEnArchivo(lista,"LinkedList7.txt");
		
		System.out.println("8.Muestra el registro que está en la primera posición de la lista...");
		System.out.println("-----------------------------------------");
		System.out.println(lista.getFirst());
		
		
		System.out.println("9. Muestra el registro que está en la última posición de la lista...");
		System.out.println("-----------------------------------------");
		System.out.println(lista.getLast());
		
		System.out.println("10.Muestra el registro que está en la mitad de la lista....");
		System.out.println("-----------------------------------------");
		
		System.out.println("Registro en la posición 74" + lista.get(lista.size()/2));
		

		System.out.println("11. ¿Qué posición ocupa la primera ocurrencia del registro insertado?...");
		System.out.println("-----------------------------------------");
		System.out.println(lista.indexOf(est1));
		
		System.out.println("12. Qué posición ocupa la última ocurrencia del registro insertado?...");
		System.out.println(lista.lastIndexOf(est1));
		
		System.out.println("13. ¿El siguiente registro está en la lista? 1º ESO E;Postigo Vázquez,Salvador;3;6;5;3;4...");
		System.out.println(buscarEstudiante("Fernández Rico, Paula", lista));
		
		System.out.println("14. ¿El siguiente registro está en la lista? 1º ESO A;García Fernández,María;6;5;6;5;5..");
		System.out.println(buscarEstudiante("García Fernández,María", lista));
		
		System.out.println("15. Elimina la primera ocurrencia del registro insertado y muestra su posición y contenido... ");
		int pos = lista.indexOf(est1);
		lista.removeFirstOccurrence(est1);
		System.out.println("Primera ocurrencia = Posición: "+ pos + " Registro: "+ est1);
		
		System.out.println("16. Elimina el registro que ocupa la posición media de la lista mostrando su contenido. ");
		System.out.println(lista.get(lista.size()/2));
		lista.remove(lista.size()/2);
		System.out.println(lista.get(lista.size()/2));
		
		System.out.println("17. Elimina el registro cuyo nombre es: Carrillo Segura, Félix, indicando su posición y contenido.");
		eliminarEstudiante(lista, "Carrillo Segura, Félix");
		
		System.out.println("18. Elimina el registro cuyo nombre es: Robles Ortiz, Rafael, indicando su posición y contenido.");
		eliminarEstudiante(lista, "Robles Ortiz, Rafael");
		
		System.out.println("19. Intenta simular una pila con la lista original. Realiza dos inserciones y extracciones detallando su funcionamiento.");
		simularPila(lista);
		
		System.out.println("20. Intenta simular una cola con la lista original. Realiza dos inserciones y extracciones detallando su funcionamiento.");
		simularCola(lista);
		
		
	}

	private static LinkedList<Estudiante> importarDatos(File f) {
		LinkedList<Estudiante> e1 = new LinkedList<>();
		
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
	
	
	private static void guardarEnArchivo(LinkedList<Estudiante> lista, String nombreArchivo ) {
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
	
	private static String buscarEstudiante(String nombre, LinkedList<Estudiante> lista){
		Iterator<Estudiante> iterador = lista.iterator();
		
		while(iterador.hasNext()) {
			Estudiante est = iterador.next();
			if(est.getNombre().equalsIgnoreCase(nombre)) {
				return "Registro encontrado: " + est.toString();
			}
		}
		return "Registro no encontrado";
	}
		
	
	private static void eliminarEstudiante(LinkedList<Estudiante> lista, String nombre) {
		Iterator<Estudiante> iterador = lista.iterator();
		
		while(iterador.hasNext()) {
			Estudiante est = iterador.next();
			if(est.getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("Posición: "+ lista.indexOf(est)+ " Registro: "+ est);
				iterador.remove();
				return;
			}
		}
		System.out.println("Registro no encontrado");
	}
	
	private static void simularPila (LinkedList<Estudiante> lista) {
		//LIFO: Last In First Out (Insertar y eliminar al final)
		Estudiante nuevo1 = new Estudiante("1º ESO A", "Lopez Rivero, José", 6,5,6,5,5);
		Estudiante nuevo2 = new Estudiante("1º ESO B", "Perez García, Elena", 7,6,4,8,3);
		
		 // Operaciones push() - añadir al tope de la pila (al principio)
	    System.out.println("Operación push() - Añadiendo estudiantes a la pila:");
		
	    lista.push(nuevo1); //Equivalente a addFirst
	    System.out.println("Push 1: "+ nuevo1.getNombre() + " Tope actual: " + lista.peek().getNombre());
	    
	    lista.push(nuevo2);
	    System.out.println("Push 2: "+ nuevo2.getNombre() + " Tope: "+ lista.peek().getNombre());
	    
	 // Operaciones peek() - ver el tope sin sacarlo
	    System.out.println("Operación peek() - Elemento en el tope: "+ lista.peek());
	    
	 // Operaciones pop() - sacar del tope de la pila (del principio)
	    System.out.println("Operación pop() - Sacando estudiantes de la pila:");
	    Estudiante sacado1 = lista.pop(); //Equivalente a removeFirst
	    System.out.println("Pop 1: "+ sacado1.getNombre());
	    
	    Estudiante sacado2 = lista.pop();
	    System.out.println("Pop 2: "+ sacado2.getNombre());
	    
	}
	
	private static void simularCola (LinkedList<Estudiante> lista) {
		//FIFO: First In First Out (insertar al final, eliminar al principio)
		Estudiante nuevo1 = new Estudiante ("1º ESO C", "Mancera Plaza, Alberto",9,8,7,6,5);
		Estudiante nuevo2 = new Estudiante ("1º ESO B", "Lopez Perez, Alvaro", 5,6,7,8,9);
		
		//Operaciones enqueue() - añadir al final de la cola
		System.out.println("Operación enqueue() - Añadiendo estudiantes a la cola:");
		
		lista.offer(nuevo1); //Equivalente a addLast()
		 System.out.println("Enqueue 1: " + nuevo1.getNombre() + " | Frente: " + lista.peek().getNombre());
		 
		 lista.offer(nuevo2);
		 System.out.println("Enqueue 2: " + nuevo2.getNombre() + " | Frente: " + lista.peek().getNombre());
		 
		 // Operaciones peek() - ver el tope sin sacarlo
		    System.out.println("Operación peek() - Elemento en el tope: "+ lista.peek());
		    
		    // Operaciones dequeue() - sacar del frente de la cola
		    System.out.println("Operación dequeue() - Sacando estudiantes de la cola:");
		    Estudiante atendido1 = lista.poll(); //Equivalente a removeFirst()
		    System.out.println("Dequeue 1: "+ atendido1.getNombre());
		    
		    Estudiante atendido2 = lista.poll();
		    System.out.println("Dequeue 2: "+ atendido2.getNombre());

	}
}


