/*
 * Objetivo: Excepciones con arrays y bucles
 * Autor: Alberto Mancera Plaza
 * Fecha: 10/12/2024 
 */
package ejercicio4;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	
		
		final int N= (int) (Math.random()*100);
		
		int[]array = new int [N];
		for(int i=0; i<array.length;i++) {
			array[i]= (int) (Math.random()*10);
		}
		for(int i=0; i<array.length;i++) {
			int z = 0;
			do {
			System.out.println("Dime la posición del array que quieres mostrar en pantalla: ");
			try {
			 z= sc.nextInt();
			z= array[i];
			System.out.println(array[i]);
			}catch (InputMismatchException excepcion1) {
				System.out.println("Error: no es un número");
				sc.next();		
			}catch (ArrayIndexOutOfBoundsException exepcion2){
				System.out.println("Error: El número es negativo");
			}
			}while(z>0);
		}
	}

}
