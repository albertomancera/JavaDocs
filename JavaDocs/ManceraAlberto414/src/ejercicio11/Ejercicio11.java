package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int num;
		System.out.println("Dime un número entero: ");
		num = sc.nextInt();
		
	 tablaMultiplicar(num);
	}
	//Devolver la tabla de multiplicar del número
	public static void tablaMultiplicar(int num) {
		int multiplicacion=0;
		for (int i =1; i<=10;i++){
			multiplicacion= num * i;
			
			System.out.println(multiplicacion);
		}
		
	}
}
