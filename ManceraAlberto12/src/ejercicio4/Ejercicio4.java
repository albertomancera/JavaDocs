/*
 * Objetivo: Tipos enumerados
 * Autor: Alberto Mancera Plaza
 * Fecha: 03/10/2024
 */
package ejercicio4;

public class Ejercicio4 {
	public enum Tamanno{
		PEQUEÑA, MEDIANA, GRANDE, EXTRAGRANDE
	}
	public static void main (String args[]) {
		
		Tamanno habitacion = Tamanno.PEQUEÑA;
		Tamanno piso = Tamanno.MEDIANA;
		Tamanno casa = Tamanno.GRANDE;
		Tamanno mansion = Tamanno.EXTRAGRANDE;
		
		System.out.println("El tamaño de la habitación es: " + habitacion);
		System.out.println("El tamaño del piso es: " + piso);
		System.out.println("El tamaño de la casa es: " + casa);
		System.out.println("El tamaño de la mansión es: " + mansion);
		
	}
}
