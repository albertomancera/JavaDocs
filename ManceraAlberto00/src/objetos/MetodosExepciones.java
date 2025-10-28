package objetos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MetodosExepciones {
	public static void main(String[] args) {
		int numero, edad;
		Scanner sc = new Scanner(System.in);
		edad = pedirNumero(sc, "Dime tu edad: ");
		System.out.println("La edad es: "+edad);
		
		numero = pedirNumero(sc, "Dime un número: ");
		System.out.println("El número  es: "+numero);
		sc.close();
	}
	
	//Pedir un entero al usuario controlando excepciones
	public static int pedirNumero(Scanner sc, String mensaje) {
		 int numero=0;
		 boolean error= false;
	do {
		System.out.println(mensaje);
		try {
			numero = sc.nextInt();
			error=false;
		}catch (InputMismatchException exception1) {
			System.out.println("Error: no es un número entero");
			error=true;
			sc.next();
		}catch (Exception exception2) {
			System.out.println("Se ha producido un error inesperado");
			error=true;
		}
		}while(error);
	return numero;
	}
}

	

