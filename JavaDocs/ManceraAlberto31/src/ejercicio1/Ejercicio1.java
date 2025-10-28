/*
 * Objetivo: Almacenar y mostrar datos de un array
 * Autor: Alberto Mancera Plaza
 * Fecha: 28/10/2024
 */
package ejercicio1;
import java.util.*;

public class Ejercicio1 {
	public static void main(String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);

		int[]num = new int[10]; //Array de 10 numeros
		for (int i=0; i<10; i++) {
			System.out.println("Dime un número real: ");
			num[i]= entradaTeclado.nextInt();
		}
		//para que me muestre los datos
		for (int i=0; i<num.length; i++) {
			System.out.println("Numero "+i+" = "+num[i] );
		}
			
	}
}
