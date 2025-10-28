package ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int edad;
		boolean esmayor;
		
		System.out.println("Dime tu edad: ");
		edad = sc.nextInt();
		
		if (esMayorEdad(edad)) {
			System.out.println("Eres mayor de edad");
		}else {
			System.out.println("No eres mayor de edad");
		}
		
	}
	// Devuelve verdadero si a>=18, falso en caso contrario
	public static boolean esMayorEdad(int edad) {
	 boolean esmayor ;
	 if (edad >=18) {
		 esmayor= true;
	 }else {
		 esmayor=false;
	 }		
	 return esmayor;
	}
}
