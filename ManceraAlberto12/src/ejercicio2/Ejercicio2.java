/*
 * Objetivo:Hacer uso del scanner
 * Autor: Alberto Mancera Plaza
 * Fecha: 01/10/2024
 */
package ejercicio2;

import java.util.*;
public class Ejercicio2 {
	public static void main (String args[]){
		Scanner entradaTeclado = new Scanner(System.in);
		
		String nombre;
		System.out.println("Dime el nombre del equipo");
		nombre = entradaTeclado.nextLine();
		System.out.println("Nombre del Equipo: " + nombre);

		int annofundacion;
		System.out.println("En que año se fundó");
		annofundacion = entradaTeclado.nextInt();
		System.out.println("Fundado en: " + annofundacion);
		
		entradaTeclado.nextLine();
		
		String estadio;
		System.out.println("Dime el nombre del estadio");
		estadio = entradaTeclado.nextLine();
		System.out.println("Estadio: " + estadio);
		
		String capitan;
		System.out.println("Dime el nombre del capitán");
		capitan = entradaTeclado.nextLine();
		System.out.println("Capitán: " + capitan);
		
		
		}
	
}
