/*
 * Objetivo: Almacenar y mostrar datos de un array (maximo y minimo)
 * Autor: Alberto Mancera Plaza
 * Fecha: 28/10/2024
 */
package ejercicio3;
import java.util.*;

public class Ejercicio3 {
	public static void main(String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		
		
		int num[]= new int[10];
		for (int i=0; i<num.length; i++) {
			System.out.println("Dime un número real: ");
			num[i]= entradaTeclado.nextInt();
		}
		//igualar el max y min con el array 0
		int maximo =num[0], minimo=num[0];
		
		for (int i=0; i<num.length; i++) {
			if (num[i]>maximo) {
				maximo = num[i];
			}
			if (num[i]<minimo) {
				minimo = num[i];
				}
			}
		
			System.out.println("El máximo de estos números es: "+maximo);	
			System.out.println("El mínimo de estos números es: "+minimo);
		
	}
}
