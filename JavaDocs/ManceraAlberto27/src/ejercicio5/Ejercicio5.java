package ejercicio5;
import java.util.*;

public class Ejercicio5 {
	public static void main(String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		double num1;
		System.out.println("Dame un valor númerico: ");
		num1 = entradaTeclado.nextDouble();
		
		double num2;
		System.out.println("Dame otro valor númerico: ");
		num2 = entradaTeclado.nextDouble();
		
		  System.out.println("Indique la operación que quiere realizar (Inserte un número):");
	        System.out.println("(1) Suma");
	        System.out.println("(2) Resta");
	        System.out.println("(3) Multiplicación");
	        System.out.println("(4) División");
	        int opcion = entradaTeclado.nextInt();
	        
	        double  resultado = 0;
	        
	        switch (opcion) {
	        case 1:
	        	resultado = num1 + num2;
	        break;
	        case 2:
	        	resultado = num1 - num2;
	        break;
	        case 3:
	        	resultado = num1 * num2;
	        break;
	        case 4:
	        	resultado = num1 / num2;
	        break;
	        default:
	        	System.out.println("Operación no valida");
	        }
		  
	        System.out.println("--------------------");
	        System.out.println("Resultado: " + resultado);
	   }
}
