package linkedList;

import java.util.LinkedList;
import java.util.List;

public class OpenLinkendList {

	public static void main(String[] args) {
	
		int cantidad = enteroAleatorio();
		
		List<Integer> miLista = new LinkedList<>();
		
		for (int i=0; i<10; i++) {
			miLista.add(enteroAleatorio());
		}
		System.out.println(miLista.size());
		System.out.println(miLista);
		
		
		//Simulacro de una cola (FIFO : First In, First Out)
		
		for(int i=0; i<10 ; i++) {
			int numeroAnyadir = enteroAleatorio();
			
			
		}
		
		//Simulacro de una pila (LIFO: Last In, Fist Out)
		
	
		
	}

	public static int enteroAleatorio() {
		return (int) (Math.random()*100);
	}
	
}
