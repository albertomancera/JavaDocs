package ejercicio17;
import java.util.Scanner;

public class Ejercicio17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		boolean esNumPrimo;
		
		do {
		System.out.println("Dime un número: ");
		numero= sc.nextInt();
		
		esNumPrimo = esPrimo(numero);
		
		if( esNumPrimo == true) {
			System.out.println("El número "+numero+" es primo");
		}else {
			System.out.println("El número "+numero+" no es primo");
		}
		}while(numero!=0);
	}
//Devuelve booleano igual a true si el número es primo, false si no lo es
	public static boolean esPrimo(int numero) {
		boolean esNumPrimo = true;
		int contador = 2;
		
		if (numero ==2) {//El número 2 es una excepción, ya que este sí solo es divisible por 1 y por sí mismo, por lo que si que es primo
		esNumPrimo = true;
		}else if(numero<0) {
			esNumPrimo= false;
		}else {
			do {
				if (numero%contador==0) {
					esNumPrimo = false;
				}
				contador ++;
			}while(contador<numero && esNumPrimo ==true);
		}
		return esNumPrimo;
	}

}


