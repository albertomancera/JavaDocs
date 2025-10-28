package calculadora;
import java.util.*;

public class Calculadora {
	public static void main(String[] args) {
		Scanner entradaTeclado = new Scanner(System.in);

		double num, num1, suma;
		
		System.out.println("Dime un número: ");
		num=entradaTeclado.nextDouble();
		
		System.out.println("Dime otro número: ");
		num1=entradaTeclado.nextDouble();
		
		suma= num + num1;
		System.out.println("Este es el resultado de la suma: "+ suma);

	}

}
