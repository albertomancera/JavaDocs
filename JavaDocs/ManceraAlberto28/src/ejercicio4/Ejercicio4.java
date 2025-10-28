package ejercicio4;
import java.util.*;

public class Ejercicio4 {
	public static void main(String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		int num;
		System.out.println("Introduzca valores positivos: ");
		num = entradaTeclado.nextInt();
		
		int suma=0;
		int contador=0;
		
		while(num != 0) {
			if (num >0) {
				suma += num;
				contador++;
			}else {
				System.out.println("Solo se pueden números positivos");
			}
			System.out.println("Introduce otro número positivo (o 0 para terminar)");
			num = entradaTeclado.nextInt();
		}
		if(contador >0) {
			System.out.println("La cantidad de números mayores de O han sido :"+ contador);
			System.out.println("Y la suma de todos ellos el resultado es: " + suma);
			}else {
				System.out.println("No has introducido números mayores de 0");
			}
	}
}
