/*
 * Objetivo: Usar la excepción InputMismatchException y ArithmeticException
 * Autor: Alberto Mancera Plaza
 * Fecha: 29/11/2024
 */
package ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a,b;
		try {
		System.out.println("Dime un valor entero: ");
		a = sc.nextInt();
		
		System.out.println("Dime otro valor entero: ");
		b = sc.nextInt();
		
		double resultado = a/b;
		System.out.println("El resultado es : "+resultado);
			
		}catch (InputMismatchException exception1) {
			System.out.println("Error: no es un número entero");
		
			sc.next();
		}catch (ArithmeticException exception2) {
			System.out.println("Es imposible hacer la operación");
			
		}
	}

}
