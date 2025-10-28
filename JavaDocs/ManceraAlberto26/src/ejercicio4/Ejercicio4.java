/*
 * Objetivo: Calculos y uso de las condicionales
 * Autor: Alberto Mancera Plaza
 * Fecha: 12/10/2024
 */
package ejercicio4;
import java.util.*;

public class Ejercicio4 {
	public static void main(String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		String nombre;
		System.out.println("Dime tu nombre: ");
		nombre = entradaTeclado.nextLine();
		
		String apellidos;
		System.out.println("Dime tus apellidos: ");
		apellidos = entradaTeclado.nextLine();
		
		double importe1;
		System.out.println("Dime tu primer importe: ");
		importe1 = entradaTeclado.nextDouble();
		
		double importe2;
		System.out.println("Dime tu segundo importe: ");
		importe2 = entradaTeclado.nextDouble();
		
		double importe3;
		System.out.println("Dime tu tercer importe: ");
		importe3 = entradaTeclado.nextDouble();
		
		double importe4;
		System.out.println("Dime tu cuarto importe: ");
		importe4 = entradaTeclado.nextDouble();
		
		double importetotal;
		importetotal = importe1 + importe2 + importe3 + importe4;
		
		double importemedio;
		importemedio = importetotal/4;
		
		if (importetotal >=300) {
			System.out.println("Nombre: " + nombre );
			System.out.println("Apellidos: " + apellidos);
			System.out.println("Importe Gastado1: " + importe1 + " euros");
			System.out.println("Importe Gastado2: " + importe2 + " euros");
			System.out.println("Importe Gastado3: " + importe3 + " euros");
			System.out.println("Importe Gastado4: " + importe4 + " euros");
			System.out.println("Importe Medio: " + importemedio + " euros");
			System.out.println("Sus compras han alcanzado los 300 euros este mes, dispones de 50 euros de descuento.");
		}else {
			if(importetotal <300) {
				System.out.println("Nombre: " + nombre);
				System.out.println("Apellidos: " + apellidos);
				System.out.println("Importe Gastado1: " + importe1 + " euros");
				System.out.println("Importe Gastado2: " + importe2 + " euros");
				System.out.println("Importe Gastado3: " + importe3 + " euros");
				System.out.println("Importe Gastado4: " + importe4 + " euros");
				System.out.println("Importe Medio: " + importemedio + " euros");
				System.out.println("Lo sentimos pero sus compras no han alcanzado los 300 euros este mes, no dispone del descuento.");
			}
			}
	
	}
}
