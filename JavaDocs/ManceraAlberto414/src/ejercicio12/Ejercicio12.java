package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
		
		int kilometros;
		System.out.println("Dime un valor entero en kilometros: ");
		kilometros = sc.nextInt();
		
		System.out.println("El equivalente en millas es: "+ kilometrosMillas(kilometros));

	}
	// Devuelve la conversión de millas a kilómetros
	public static double kilometrosMillas(int kilometros) {
		double millas;
		
		millas = kilometros/1.60934;
		return (millas);
	}
}


