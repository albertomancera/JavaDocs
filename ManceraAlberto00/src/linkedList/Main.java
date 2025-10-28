package linkedList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;

public class Main {

	public static void main(String args[]) {

		/*ArraysList*
		 * Rapido al recorrer*/
		ArrayList<Integer> lista = new ArrayList<>();
		lista.add(0);
		lista.add(1);
		lista.add(2, 5);
		lista.set(2, 7);
		System.out.println(lista.get(2));
		
		lista.contains(Integer.valueOf(2));
		lista.contains(2);
		String parImpar;
		for(int numero : lista) {
			if(numero %2 == 0) {
				parImpar = "Par";
			}
			else {
				parImpar = "Impar";
			}
			System.out.printf("\t%d %s\n", numero, parImpar);
		}
		
		System.out.println(lista.size());
		lista.remove(2);
		lista.clear();
		for(int numero : lista) {
			
			System.out.println(lista);
		}
		
		/*HashSet
		 * No mantiene el order
		 * Es el mas rapido en insertar datos)*/
		HashSet<String> listaHash = new HashSet<>();
		listaHash.add("Pepe");
		listaHash.add("Juan");
		listaHash.add("alberto");
		for(String texto : listaHash) {
			System.out.println(texto);
		}
		/*LinkedHashSet
		 * Mantiene el order de inserción
		 * Rapido al añadir
		 * Rapido al eliminar*/
		LinkedHashSet<String> listaLinked = new LinkedHashSet<>();
		listaLinked.add("Pepe");
		listaLinked.add("Juan");
		listaLinked.add("alberto");
		for(String texto : listaLinked) {
			System.out.println(texto);
		}
		/*TreeSet
		 * Lo ordena automaticamente
		 * es lento*/
		TreeSet<Integer> listaTree = new TreeSet<>();
		listaTree.add(8);
		listaTree.add(10);
		listaTree.add(1);
		for(int numero : listaTree) {
			System.out.println(numero);
		}
		
		/*Pila(Stack)*/
		Stack<Integer> listaStack = new Stack<>();
		listaStack.push(8);
		listaStack.push(10);
		listaStack.push(1);
		listaStack.pop();
		for(int numero : listaStack) {
			System.out.println(numero);
		}
		/*Cola(Queue)*/
		Queue<Integer> listaQueue = new LinkedList<>();
		listaQueue.offer(8);
		listaQueue.offer(10);
		listaQueue.offer(1);
		listaQueue.poll();
		for(int numero : listaQueue) {
			System.out.println(numero);
		}
	}
}
