package cadenadetexto;
import java.util.*;


public class cadenadetexto {
	public static void main(String args[]) {
	   
		Scanner teclado = new Scanner(System.in);
	      System.out.print ("Introduzca una palabra: ");
	      String palabra = teclado.nextLine();
	      
	      
	      char primeraLetra= palabra.charAt (0);
	      char ultimaLetra=  palabra.charAt ( palabra.length()-1 );	
	    int tamanno= palabra.length() ;
	    
	      System.out.println ("La palabra introducida es: " + palabra);
	      System.out.println("El tamaño de la palabra es: " + tamanno);
		  System.out.println ("La primera letra de la palabra es: " + primeraLetra);
		  System.out.println ("La última letra de la palabra es: "  + ultimaLetra);
/*
		  String toLowerCase(); Convierte todos los caracteres en minúsculas.

		  String toUpperCase(); Convierte todos los caracteres a mayúsculas.
		 
		  String trim(); Elimina los espacios en blanco de la cadena.
		 
		  int indexOf(int ch)
		  */
		  
}
	 
}
