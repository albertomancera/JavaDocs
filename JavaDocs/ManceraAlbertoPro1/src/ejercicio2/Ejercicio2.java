package ejercicio2;
import java.util.*;

public class Ejercicio2 {
	public static void main(String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
	
		String nombre;
		System.out.println("Dime tu nombre: ");
		nombre = entradaTeclado.nextLine();
		
		String apellido;
		System.out.println("Dime tu primer apellido: ");
		apellido = entradaTeclado.nextLine();
		
		int dianac;
		System.out.println("Dime tu día de nacimiento: ");
		dianac = entradaTeclado.nextInt();
		
		int mesnac;
		System.out.println("Dime tu més de nacimiento en formato número: ");
		mesnac = entradaTeclado.nextInt();
		
		int annonac;
		System.out.println("Dime tu año de nacimiento en formato AAAA (2020): ");
		annonac = entradaTeclado.nextInt();
		
		entradaTeclado.nextLine();
		
		String genero;
		System.out.println("Dime tu género (M/F): ");
		genero = entradaTeclado.nextLine();
		
		char primeraletraN = nombre.charAt(2);
		char primeraletraA = apellido.charAt(01);
		//int ultimosdigitos = annonac.intAt (annonac.length()-1);
		
		
		System.out.println("Su identificador de usuario es: ");
		System.out.println("-------");
		System.out.println(genero + primeraletraA + primeraletraN  );
		
	}
}
