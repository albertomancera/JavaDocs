package ejercicio1;
import libtarea3.*;
public class ejercicio1 {

	public static void main(String[] args) {
		
		System.out.println(numEntradas());
		//Apartado 4
		Teatro teatro1 = new Teatro("Mancera", 800);
		System.out.println(teatro1.toString());
		
		//Apartado 5
		Teatro teatro2 = new Teatro("Plaza", 500);
		System.out.println(teatro2.toString());
		
	}
	
		 //Apartado 1
		public static int numEntradas() {
			int numeroEntradas = (int) ((Math.random()*100) +950);
		
			return numeroEntradas;
		}
		
		
	}


