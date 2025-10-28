package ejercicios3;

import java.util.*;
public class Ejercicio3 {
	
	public static void main(String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		int num1;
		System.out.println("Dame un valor entero");
		num1 = entradaTeclado.nextInt();
		
		int num2;
		System.out.println("Dame otro valor entero");
		num2 = entradaTeclado.nextInt();
		
		int num3;
		
		num3 = num1;
		num1 = num2;
		
		System.out.println("El primer numero ingresado se intercambia con el segundo: " + num1);
		System.out.println("El segundo numero ingresado se intercambia con el primero: " + num3);
		
		}
}
