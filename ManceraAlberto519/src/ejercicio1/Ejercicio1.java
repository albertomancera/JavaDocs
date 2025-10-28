/*
 * Objetivo: Usar la excepción InputMismatchException
 * Autor: Alberto Mancera Plaza
 * Fecha: 29/11/2024
 */
package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a;
		
		System.out.println("Dime un valor entero: ");
		
		try {
			a = sc.nextInt();
			System.out.println("Valor introducido: "+a);
			
		}catch (InputMismatchException exception1) {
			System.out.println("Valor introducido incorrecto");
	
		}
	}

}
