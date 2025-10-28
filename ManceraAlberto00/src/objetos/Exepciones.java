package objetos;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exepciones {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 int numero;
		 boolean error= false;
		 
		do {
		System.out.println("Dame un número: ");
		try {
			numero = sc.nextInt();
			System.out.println("El número es: "+numero);
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
		
		sc.close();
	}

}
