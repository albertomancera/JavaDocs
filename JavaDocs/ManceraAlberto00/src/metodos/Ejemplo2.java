package metodos;
import java.util.Scanner;

public class Ejemplo2 {
	public static void main(String[] args) {
		Scanner entradaTeclado = new Scanner(System.in);
		int valor,resto = 0;
		
		System.out.println("Dime números enteros: ");
		valor = entradaTeclado.nextInt();
		
		while(valor !=0) {
			if (resto  == devolverresto(valor)) {
				System.out.println("Este número es multiplo de 5");
			}else {
				(if
				
			}
		}
		
	
		
	}
	//Comprobar si es multiplo de 5
	public static int devolverresto(int num) {
		return num%5;
	}
}
