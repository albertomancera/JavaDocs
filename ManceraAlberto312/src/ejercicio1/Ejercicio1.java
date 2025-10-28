/*
 * Objetivo: Pedir una cadena de texto y mostrarlo en lineas diferentes
 * Autor: Alberto Mancera Plaza
 * Fecha: 08/11/2024
 */
package ejercicio1;

import java.util.*;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		 String frase;
	        String[] frasedividida;
	        int i;
	        
	        System.out.print("Introduce la frase: ");
	        frase = entradaTeclado.nextLine();
	        
	        frasedividida = frase.split(" ");
	        
	        System.out.println("La frase dividida es: ");
	        
	        for(i = 0; i < frasedividida.length; i++)
	        {
	            System.out.println(frasedividida[i]);
	        }
	    }
	}


