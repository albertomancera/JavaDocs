package ejercicio2;

import java.util.*;
public class Ejercicio2 {

	public static void main(String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		double euros;
		System.out.println("Dame la cantidad en euros ");
		euros = entradaTeclado.nextDouble();
		
		double pesetas;
		pesetas = (euros * 166.386);
		System.out.println("Esta es la transformación en pesetas " + pesetas);
		
		double pesetas2;
		System.out.println("Dame la cantidad en pesetas ");
		pesetas2 = entradaTeclado.nextDouble();
		
		double euros2;
		euros2 = (pesetas2/166.386);
		System.out.println("Esta es la transformación en euros " + euros2);
	}
}
