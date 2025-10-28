/*
 * Objetivo: Indicar si la frase es un palíndromo o no
 * Autor:Alberto Mancera Plaza
 * Fecha:11/11/2024
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		String frase;
		boolean palindromo = true;
		
		System.out.println("Dime una frase: ");
		frase = sc.nextLine();
		
		frase = frase.toLowerCase();
		frase = frase.replace(" ", "");
		
		int longitud =frase.length();
		
		for (int i=0; i<longitud && palindromo;i++) {
			if (frase.charAt(i) != frase.charAt((longitud-1) -i)) {
				palindromo = false;
			}
		}
		
		if(palindromo) {
			System.out.println("La frase es palindromo");
		}else {
			System.out.println("La frase no es palindromo");
		}
	}

}
