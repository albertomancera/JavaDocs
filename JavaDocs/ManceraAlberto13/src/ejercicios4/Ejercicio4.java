package ejercicios4;

import java.util.*;
public class Ejercicio4 {
	public static void main(String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		double valor;
		System.out.println("Dame un valor decimal: ");
		valor = entradaTeclado.nextDouble();
		
		double valorround =Math.round(valor);
		double valorceil = Math.ceil(valor);
		double valorfloor =Math.floor(valor);
		
		System.out.println("Math.round sirve para rendondear los números a enteros " + valorround);
		System.out.println("Math.ceil sirve para saber el menor de los enteros sigue siendo inferior o igual a ... " + valorceil);
		System.out.println("Math.floor sirve para saber el mayor de los enteros que sigue siendo inferior o igual a ... " + valorfloor);
		
		
	}
}
