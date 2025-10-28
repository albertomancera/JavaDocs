/*
 * Objetivo: Uso de las condicionales
 * Autor: Alberto Mancera Plaza
 * Fecha: 12/10/2024
 */
package ejercicio5;
import java.util.*;

public class Ejercicio5 {
	public static void main(String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		String nombre;
		System.out.println("Dime tu nombre: ");
		nombre = entradaTeclado.nextLine();
		
		String apellidos;
		System.out.println("Dime tus apellidos: ");
		apellidos = entradaTeclado.nextLine();
		
		String ciclo;
		System.out.println("Dime tu ciclo formativo: ");
		ciclo = entradaTeclado.nextLine();
		
		int nota;
		System.out.println("Dime tu nota académica:(entero) ");
		nota = entradaTeclado.nextInt();
		
			String resultado;
			
		if (nota <5) {
			resultado = "Insuficente";
		}else {
			if (nota ==5) {
				resultado = "Aprobado";
			}else {		
				if(nota ==6) {
					resultado = "Bien";
				}else {
					if (nota ==7 && nota <=8) {
					resultado="Notable";
				}else {
					resultado = "Sobresaliente";
				}
			}
		
		}
}
		System.out.println("Nombre: " + nombre);
		System.out.println("Appellidos: " + apellidos);
		System.out.println("Ciclo Formativo: " + ciclo);
		System.out.println("Nota académico: " + nota + " ("+resultado + ")");
		
		
}
}

