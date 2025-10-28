/*
 * Objetivo:
 * Autor: Alberto Mancera Plaza
 * Fecha:12/10/2024
 */
package ejercicio2;
import java.util.*;

public class Ejercicio2 {
	public static void main(String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
	
		String nombre ;
		System.out.println("Dime tu nombre: ");
		nombre = entradaTeclado.nextLine();
		
		int edad ;
		System.out.println("Dime tu edad: ");
		edad = entradaTeclado.nextInt();
		
		int nota ;
		System.out.println("Dime tu nota académica: ");
		nota = entradaTeclado.nextInt();
		
		if (edad >= 18 && nota >= 7) { 
			System.out.println( nombre + " , usted ha sido admitido en el curso, cumple la condiciones requeridas.");
			}else {
				if (edad <18 && nota <7) {
				System.out.println( nombre + " , lo sentimos, no ha sido admitido en el curso ya que no cumple los requisitos mínimos.");
		}
	}
	}
}

