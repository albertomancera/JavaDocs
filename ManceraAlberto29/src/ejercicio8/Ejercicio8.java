package ejercicio8;
import java.util.*;

public class Ejercicio8 {
	public static void main(String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		int num ;
		int contador=0;
		int positivo=0;
		int negativo = 0;
		
		do {
			System.out.println("Dime un número entero: ");
			num = entradaTeclado.nextInt();
			
			if(num<0) {
				contador++;
				negativo++;
			}else {
				if (num>0){
				positivo++;	
				}
			}
		}while(num!=0);
		System.out.println("Has finalizado el proceso");
		
		if (contador>0) {
			System.out.println("Se ha ingresado al menos un número negativo");
		}else {
			System.out.println("No se ha ingresado ningún número negativo");
		}
		
		System.out.println("He leido "+positivo+" positvos y "+negativo+" negativos");
		
	
			
			
		
	}
}
