package estructuras;
import java.util.*;

public class Estructuraswhile {

	public static void main(String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
		

		System.out.println("Ingrese un número entero:(0 para salir) ");
		int num1 = entradaTeclado.nextInt();
		
		while ( num1 !=0) {
			//analizo el número
		if (num1 < 0 && (num1%2==0) ) {
			System.out.println("El valor es negativo y numero par ");

				System.out.println("El número es negativo.");
		} else {
			if (num1 > 0) {
			System.out.println("El numero es positivo.");
		} else {
			System.out.println("Es cero");
		}
		}
		//pido otro número
				System.out.println("Ingrese un número entero:(0 para salir) ");
				 num1 = entradaTeclado.nextInt();
		}
		
		}

}
