package ejercicio6;
import java.util.*;

public class Ejercicio6 {
	public static void main(String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		double num;
		System.out.println("Dame un número: ");
		num = entradaTeclado.nextDouble();
	
		
		while (num >=0) {
		double cuadrado = num*num;
		System.out.println("El resultado de su cuadrado es: "+ cuadrado);
		System.out.println("Para cerrar el programa introduce un número negativo");
		num= entradaTeclado.nextDouble();
		}
		System.out.println("El porgrama se ha cerrado");
	}
		
	}
	
