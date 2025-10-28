package cadenacaracteres;
import java.util.*;

public class CadenaCaracteres {
	public static void main(String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		String cad1;
		
		System.out.println("Introduce una cadena de carácteres");
		cad1 = entradaTeclado.nextLine();
		
		System.out.println("La longitud es: "+ cad1.length());
		System.out.println("La cadena en minuscula es: "+ cad1.toLowerCase());
		System.out.println("La cadena en mayúsculas es: "+ cad1.toUpperCase());
		
	}
}
