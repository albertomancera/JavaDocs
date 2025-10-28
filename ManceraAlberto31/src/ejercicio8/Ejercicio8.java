/*
 * Objetivo: Almacenar y mostrar datos de un array(iguales o superiores) 
 * Autor: Alberto Mancera Plaza
 * Fecha: 28/10/2024
 */
package ejercicio8;
import java.util.*;

public class Ejercicio8 {
	public static void main(String args[]) {
	Scanner entradaTeclado = new Scanner(System.in);
	
	double[] array= new double [100];
	for (int i=0; i<100; i++) {
		array[i] =(Math.random()*1.0);
		}
	
	System.out.println("Dime un valor real R(entre 0.0 y 1.0): ");
	double r = entradaTeclado.nextDouble();
	double contador=0;
	
	for(int i=0; i<array.length; i++) {
		if( array[i]>= r) {
			contador++;
		}
		}
	System.out.println("Valores del array igual o superiores a R: "+ contador);
	}
}
