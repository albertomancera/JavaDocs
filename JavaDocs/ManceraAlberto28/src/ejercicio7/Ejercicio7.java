package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		int num;
		int numRandom = (int)(Math.random()*50);
		
		do {
			System.out.println("Dime un número");
			num= entradaTeclado.nextInt();
			if (num>numRandom) {
				System.out.println("Tu número es mayor");
			}else {
				if(num<numRandom) {
					System.out.println("Tu numero es menor");
				}
				}
			}
		while (num!=numRandom);
		System.out.println("Enhorabuena has acertado");
	
	}
}
