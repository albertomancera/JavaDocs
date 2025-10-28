/*
 * Objetivo: Almacenar y mostrar datos de un array 
 * Autor: Alberto Mancera Plaza
 * Fecha: 28/10/2024
 */
package ejercicio6;
import java.util.*;

public class Ejercicio6 {
	public static void main(String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
	
		System.out.println("Dime un número entero (N): ");
		int n = entradaTeclado.nextInt();
		
		System.out.println("Dime un número entero (M): ");
		int m = entradaTeclado.nextInt();
		
		int array[]= new int[n];
		for(int i=0; i<array.length; i++) {
			array[i]=m;
			System.out.println("El valor "+i+" es: "+array[i]);
		}
	}
}
