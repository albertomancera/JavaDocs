package bucles;
import java.util.*;

public class Bucles {
	public static void main(String[] args) {
		Scanner entradaTeclado = new Scanner(System.in);
	/*
	 * Bucles indeterminados: no sabemos cuantas lineas vamos a hacer
	 * 	-While ( mientras)
	 * 		
	 * 		
	 * 	-Do-while
	 * Bucles determinados: sabemos cuantas veces los vamos a hacer
	 */
	
		int aleatorio=(int)(Math.random()*100);
		
		int num=0;
		int intentos=0;
		
		while(num !=aleatorio) {
			intentos++;
			System.out.println("Dime un número: ");
			num=entradaTeclado.nextInt();
			
			if(aleatorio<num) {
				System.out.println("Más bajo");
			}else if(aleatorio>num){
				System.out.println("Más alto");
			}
		}
		System.out.println("Correcto. Lo has conseguido en "+intentos+" intentos");
		
	}
}
