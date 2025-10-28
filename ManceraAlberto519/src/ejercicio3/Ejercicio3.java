/*
 * Objetivo: Excepciones con vectores
 * Autor: Alberto Mancera Plaza
 * Fecha: 02/12/2024
 */
package ejercicio3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double[]array = new double [5];
		for(int i=0; i<array.length;i++) {
			System.out.println("Dame un valor: ");
			try {
			array[i]= sc.nextDouble();
			}catch(InputMismatchException exception1) {
				System.out.println("Error: no es un número");
				sc.next();
			}
		}
		
	}

}
