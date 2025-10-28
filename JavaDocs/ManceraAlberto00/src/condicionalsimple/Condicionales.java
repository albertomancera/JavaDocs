package condicionalsimple;
 import java.util.*;
 
public class Condicionales {
	public static void main(String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		int num ;
		System.out.println("Dime un número del día de la semana: ");
		num = entradaTeclado.nextInt();
		
		if (num == 1){
			System.out.println("Este día es el Lunes ");
		} else {
			if (num == 2){
			System.out.println("Este día es el Martes");
		} else {
			if (num == 3){
			System.out.println("Este día es el Miercolés");
		} else {
			if (num == 4) {
			System.out.println("Este día es el Jueves");
		} else {
			if (num == 5) {
			System.out.println("Este día es el Viernes");
		} else {
			if (num == 6) {
			System.out.println("Este día es el Sábado");
		}else {
			System.out.println("Este día es el Domingo");
		}
		}
		}
		}
		}
		}
	}
}
	

