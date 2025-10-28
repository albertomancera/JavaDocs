package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int millas;
		System.out.println("Dime un valor entero en millas: ");
		millas = sc.nextInt();
		
		System.out.println("El equivalente en kilometros es: "+ millasKilometros(millas)+" km");

	}
	// Devuelve la conversión de millas a kilómetros
	public static double millasKilometros(int millas) {
		double kilometros;
		
		kilometros = millas*1.60934;
		return (kilometros);
	}
}
