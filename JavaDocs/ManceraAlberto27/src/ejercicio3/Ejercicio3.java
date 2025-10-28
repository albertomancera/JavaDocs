package ejercicio3;
import java.util.*;

public class Ejercicio3 {
	public static void main(String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
	
		int nota;
		System.out.println("Dime una nota en valor entero: ");
		nota = entradaTeclado.nextInt();
		
		switch (nota) {
		case 0:
			System.out.println("Tu nota es un 0");
			break;
		case 1:
			System.out.println("Tu nota es un 1");
			break;
		case 2:
			System.out.println("Tu nota es un 2");
			break;
		case 3:
			System.out.println("Tu nota es un 3");
			break;
		case 4:
			System.out.println("Tu nota es un 4");
			break;
		case 5:
			System.out.println("Tu nota es un 5");
			break;
		case 6:
			System.out.println("Tu nota es un 6");
			break;
		case 7:
			System.out.println("Tu nota es un 7");
			break;
		case 8:
			System.out.println("Tu nota es un 8");
			break;
		case 9:
			System.out.println("Tu nota es un 9");
			break;
		case 10:
			System.out.println("Tu nota es un 10");
			break;
		default:
			System.out.println("La nota introducida ha sido incorrecta.");
			
			
			
		}
	}
}
