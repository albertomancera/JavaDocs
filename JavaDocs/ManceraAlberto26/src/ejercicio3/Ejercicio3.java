/*
 * Objetivo:
 * Autor: Alberto Mancera Plaza
 * Fecha: 12/10/2024
 */
package ejercicio3;
import java.util.*;

public class Ejercicio3 {
	public static void main(String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		int edad;
		System.out.println("Dime tu edad: ");
		edad = entradaTeclado.nextInt();
		
		
		if (edad >=18){
			
		 entradaTeclado.nextLine();
			
		 String nombre;
			System.out.println("Dime tu nombre: ");
			nombre = entradaTeclado.nextLine();
			
			String apellidos;
			System.out.println("Dime tus apelidos: ");
			apellidos = entradaTeclado.nextLine();
			
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellidos);
			System.out.println("Edad: " + edad);
			System.out.println("Usted ha sido admitido");
			
		} else {
			if (edad <18) {
				System.out.println("No tiene la edad requerida para realizar estos estudios.");
			}
		}
		
		
		
		
	}
}
