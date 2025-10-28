package buclecadenadecaracteres;
import java.util.*;

public class Buclecadenacaracteres {
	public static void main(String args[]) {
		
	Scanner teclado = new Scanner(System.in);
    System.out.print ("Introduzca una palabra: ");
    String palabra = teclado.nextLine();
    
    int tamanno= palabra.length() ;
    char caracter1 = palabra.charAt(3);
    char caracter2 = palabra.charAt(6);
    
    while (tamanno >=8) {
    	System.out.println("El caracter 3 es: " + caracter1+ "y el caracter 5 es : "+ caracter2);
    	System.out.println("Dame una cadena: ( menos de 8 caracteres para salir)");
    	palabra = teclado.nextLine();
    }
    
	}
}
	
