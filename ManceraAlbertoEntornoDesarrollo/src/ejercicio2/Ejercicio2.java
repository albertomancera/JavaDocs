package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int num=0, cont=0;
		
		while(num>=0) {
			System.out.println("Introduce un número (El programa acaba cuando salga un número negativo): ");
			num=sc.nextInt();
			
			if (num>=0) {
				cont ++;
			}
			
		}
		System.out.println("Se ha introducido "+cont+" numeros positivos.");
		System.out.println("El programa a acabado");
	}

}
