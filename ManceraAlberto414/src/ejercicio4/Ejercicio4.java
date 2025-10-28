package ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		int num1;
		
		System.out.println("Dime un número entero: ");
		num1 = sc.nextInt();
		
		System.out.println("El número es (negativo= -1, 0 = 0 y positivo = 1): "+ dimeSigno(num1));
	}
	// Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
	public static int dimeSigno(int num1) {
		int signo = 0;
		
		if(num1<0) {
			signo =-1;
		}else if (num1>0) {
			signo = 1;
		}else {
			signo = 0;
		}
		return signo;
	}

}
