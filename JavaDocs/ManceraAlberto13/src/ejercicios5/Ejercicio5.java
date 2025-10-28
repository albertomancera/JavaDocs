package ejercicios5;
import java.util.*;

public class Ejercicio5 {
	public static void main(String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		int num1;
		System.out.println("Dame un número entero: ");
		num1 = entradaTeclado.nextInt();
		
		int num2;
		System.out.println("Dame otro número entero: ");
		num2 = entradaTeclado.nextInt();
		
		Math.min(num1, num2);
		System.out.println("El número menor entre estos es: " + Math.min(num1, num2));
		
		Math.pow(num1, num2);
		System.out.println("El resultado de el primer número elevado al segundo es: " + Math.pow(num1, num2));
		
		Math.sqrt(num1);
		System.out.println("La raíz del primer número es: " + Math.sqrt(num1));
		
		Math.random();
		System.out.println("Un valor random del segundo número es:" + Math.random());
		
	}
}
