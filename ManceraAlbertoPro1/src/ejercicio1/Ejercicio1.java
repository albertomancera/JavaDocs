package ejercicio1;
import java.util.*;

public class Ejercicio1 {
	public static void main(String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
	System.out.println("Introduzca tres números reales: ");
		
		double x;
		System.out.println("Valor para la X: ");
		x = entradaTeclado.nextDouble();
		
		double y;
		System.out.println("Valor para la Y: ");
		y = entradaTeclado.nextDouble();
		
		double z;
		System.out.println("Valor para la Z: ");
		z = entradaTeclado.nextDouble();
		
		
		double resultado ;
		resultado = (x/3 +( 8));
		
		double resultado1;
		resultado1 = (x*x/(y*y )+(y*y )/(z*z));
		
		double resultado2;
		resultado2 = (((x*x)+(3*x*y)+(y*y))/(1/(x*x)));
		
		System.out.println ("RESULTADO");
		System.out.println("------");
		System.out.println("OPERACION_1: " + resultado);
		System.out.println("OPERACION_2: " + resultado1);
		System.out.println("OPERACION_2: " + resultado2);
	}
}
