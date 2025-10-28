package condicionalsimple;
import java.util.*;

public class Condicionalsimple2 {
	public static void main(String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		int num ; 
		System.out.println("Dime un número del día de la semana: ");
		num = entradaTeclado.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("Este día es el Lunes ");
			break;
		case 2:
			System.out.println("Este día es el Martes");
			break;
		case 3:
			System.out.println("Este día es el Miercolés");
		break;
		case 4 :
			System.out.println("Este día es el Jueves");
		break;
		case 5 :
			System.out.println("Este día es el Viernes");
		break;
		case 6 :
			System.out.println("Este día es el Sábado");
		break;
		case 7:
			System.out.println("Este día es el Domingo");
			break;
		default:
			System.out.println("Número no valido");
			
		}
	}
		
}
	
