 /*
Objetivo: Almacenar y mostrar datos de un array (suma de positivos y negativos)
 * Autor: Alberto Mancera Plaza
 * Fecha: 28/10/2024
  */
package ejercicio4;
import java.util.*;

public class Ejercicio4 {
	public static void main(String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		
		int positivo =0;
		int negativo=0;
		
		int num[]= new int[20];
		for(int i=0; i<20; i++) {
			System.out.println("Dime un número entero: ");
			num[i]= entradaTeclado.nextInt();
			
			if (num[i]<0) {
				positivo +=num[i];
			}else {
				if (num[i]>0) {
					negativo +=num[i];
				}else {
					System.out.println("El NÚMERO ES 0");
				}
			}
		}
			System.out.println("La suma de los números negativos es: "+negativo);
			System.out.println("La suma de los números positivos es: "+positivo);
		
	}
}
