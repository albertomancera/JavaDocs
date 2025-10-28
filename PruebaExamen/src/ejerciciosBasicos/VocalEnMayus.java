package ejerciciosBasicos;

import java.util.Scanner;

public class VocalEnMayus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		 System.out.print("Introduce una frase: ");
	        String frase = sc.nextLine();

	        System.out.print("Introduce una vocal: ");
	        char vocal = sc.nextLine().toLowerCase().charAt(0);

	        // Convertir la vocal a mayúscula en la frase
	        String nuevaFrase = frase.replace(vocal, Character.toUpperCase(vocal));

	        System.out.println("Frase con la vocal en mayúscula: " + nuevaFrase);
	  
		
	}

}
