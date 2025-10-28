/*
 * Objetivo: Condicionales
 * Autor: Alberto Mancera Plaza
 * Fecha:08/10/2024
 */
package ejercicio1;

import java.util.*;

public class Ejercicio1 {
	public static void main(String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		int num1 ;
		System.out.println("Dame un número entero: ");
		num1 = entradaTeclado.nextInt();
		
		int num2 ;
		System.out.println("Dame otro número entero: ");
		num2 = entradaTeclado.nextInt();
		
		if (num1 > num2) {
			System.out.println("El primer número es mayor que el segundo");
		} else {
			if (num2 > num1) {
				System.out.println("El segundo número es mayor que el primero");
			} else {
				if (num1 == num2) {
					System.out.println("Los números son iguales");
				}
			}
		}
		
		
	}
}
