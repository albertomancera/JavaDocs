package ejerciciosBasicos;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String frase;
		char letra;
		int contador = 0;
		
		System.out.println("Escribe una frase: ");
		frase =  sc.nextLine();
		
		System.out.println("Ahora di un letra la cual quieres que contemos las que ahy en la frase : ");
		letra = sc.next().charAt(0);
		
		for (int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) == letra){
				contador++;
			}
		}
		
		System.out.println("El número de veces que aparece la letra " + letra + " en la frase "+ frase + " es : "+ contador+ " veces");
		
	}
	
}
