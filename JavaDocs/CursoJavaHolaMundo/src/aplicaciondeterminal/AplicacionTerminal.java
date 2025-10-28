package aplicaciondeterminal;

import java.util.Scanner;

public class AplicacionTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String input = " ";
		
		while(!input.equals("salir")) {
			System.out.println("Ingresa comando: ");
			input = sc.nextLine().toLowerCase();
			System.out.println(input);
		}
		
		System.out.println("Saliendo del while");
	}

}
