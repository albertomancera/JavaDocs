/*
 * Objetivo: Pedir una cadena de texto y indicar si son iguales
 * Autor: Alberto Mancera Plaza
 * Fecha: 08/11/2024
 */
package ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		String cad1, cad2;
		
		System.out.println("Dime una cadena de texto: ");
		cad1 = entradaTeclado.nextLine();

		System.out.println("Dime otra cadena de texto: ");
		cad2 = entradaTeclado.nextLine();
		
		if (cad1.equalsIgnoreCase(cad2)) {
			System.out.println("Estas cadenas son iguales");
		}else {
			System.out.println("Estas cadenas no son iguales");
		}
		
		
	}

}
