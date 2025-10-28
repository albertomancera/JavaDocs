package estructurasimple;
import java.util.*;

public class For1 {
	public static void main(String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		int suma, numero;
		long producto;
		
		suma = 0;
		producto = 1;
		
		 for (int i=1; i<10;i++) {
		 System.out.println("Dame un número: ");
		 numero= entradaTeclado.nextInt();
		 suma=suma+ numero;
		 producto = producto* numero;
		 }
		 System.out.println("La suma es: " + suma);
		 System.out.println("El producto es: "+ producto);
	}	
}