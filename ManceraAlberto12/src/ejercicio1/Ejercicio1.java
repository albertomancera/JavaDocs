/*
 * Objetivo:Hacer uso del scanner
 * Autor: Alberto Mancera Plaza
 * Fecha: 01/10/2024
 */
package ejercicio1;

import java.util.*;
public class Ejercicio1 {
	public static void main (String args[]){
	Scanner entradaTeclado = new Scanner(System.in);
	
	String nombre;
	System.out.println("Dime tu nombre");
	nombre = entradaTeclado.nextLine();
	System.out.println("Tu nombre es: " + nombre);
	
	String apellidos;
	System.out.println("Dime tu appellido");
	apellidos = entradaTeclado.nextLine();
	System.out.println("Tu apellido es: " + apellidos);
	
	int edad;
	System.out.println("Dime tu edad");
	edad = entradaTeclado.nextInt();
	System.out.println("Tu edad es: " + edad);

	entradaTeclado.nextLine();
	
	String direccion;
	System.out.println("Dime tu dirección");
	direccion = entradaTeclado.nextLine();
	System.out.println("Tu dirección es: " + direccion);
	

	double altura;
	System.out.println("Dime tu altura");
	altura = entradaTeclado.nextDouble();
	System.out.println("Tu altura es: " + altura);
	
	double peso;
	System.out.println("Dime tu peso");
	peso = entradaTeclado.nextDouble();
	System.out.println("Tu peso es: " + peso);
	
	}
}
