/*
 * Objetivo:Calcular su factorial
 * Autor:Alberto Mancera Plaza
 * Fecha: 22/10/2024
 */
package ejercicio5;
import java.util.*;

public class Ejercicio5 {
	public static void main(String args[]) {
	Scanner entradaTeclado = new Scanner(System.in);
	
	int n;
	System.out.println("Dime un número positivo: ");
	n=entradaTeclado.nextInt();
	
	if(n<0) {
		System.out.println("Por favor, introduce un número positivo.");
	}else {
		long factorial = 1;
		
		for (int i =2; i<=n; i++) {
			factorial *=i;
		}
		System.out.println("El factorial de "+n +" es: "+ factorial);
	}
	}
}
