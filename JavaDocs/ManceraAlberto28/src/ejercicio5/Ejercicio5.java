package ejercicio5;
import java.util.*;

public class Ejercicio5 {
	public static void main(String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);

		int numpositivos =0;
		int numnegativos =0;
		int contadorpositivo =0;
		int contadornegativo =0;
		int cantidadceros =0;
		
		for (int num=1; num<=10; num++) {
			System.out.println("Introduce el número "+ num + ": ");
			num = entradaTeclado.nextInt();
			
			if (num > 0) {
				numpositivos += num;
				contadorpositivo++;
			}else {
				if(num <0) {
					numnegativos += num;
					contadornegativo++;
				}else {
					cantidadceros++;
				}
			}
		}
			double mediapositivo= numpositivos/contadorpositivo ;
			double medianegativo= numnegativos/contadornegativo ;
			
			System.out.println("La media de los números postivos son: " + mediapositivo);
			System.out.println("La media de los números negativos son: " + medianegativo);
			System.out.println("La cantidad de ceros es de : "+ cantidadceros);	
	}
}
