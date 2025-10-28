package estructurasimple;
import java.util.*;

public class Dowhile {
	public static void main(String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
	 	
		int num;
		
		do {
		System.out.println("Dame un número par: ");
		num = entradaTeclado.nextInt();
		} while(num %2 !=0);
		System.out.println("Este número es par");
		
		if (num < 0 ) {
			System.out.println("El número es negativo.");
	} else {
		if (num > 0) {
		System.out.println("El numero es positivo.");
	} else {
		System.out.println("Es cero");
	}
	}
	}
}
