package ejercicio8;
import java.util.*;

public class Ejercicio8 {
	public static void main(String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		String nombre;
		System.out.println("Dime tu nombre: ");
		nombre= entradaTeclado.nextLine();
		
		String apellidos;
		System.out.println("Dime tus apelidos: ");
		apellidos = entradaTeclado.nextLine();
		
		
		
		System.out.println("Dime tu edad: ");
		int edad = entradaTeclado.nextInt();
		
		while (edad <=17 && edad >=45 ) {
			System.out.println("Esa edad no es correcta");
		}
		
		int numrutas;
		System.out.println("Dime tu número de rutas realizadas: ");
		numrutas = entradaTeclado.nextInt();
		
		System.out.println("Dime la distancia de tu última ruta: ");
		double dist = entradaTeclado.nextDouble();
		
		double distancia;
		double distmax = 0 ;
		String ciudad ;
		String ciudadmax = null  ;
		double distmedia = 0;
		
		for (int i=1 ; i<=5 ; i++ ) {
			System.out.println("Dime la distancia de la caminata realizada: ");
			distancia = entradaTeclado.nextDouble();
			
			System.out.println("Dime el número de participantes: ");
			int numpart = entradaTeclado.nextInt();
			 
			entradaTeclado.nextLine();
			
			System.out.println("En que ciudad se realizó: ");
			ciudad = entradaTeclado.nextLine();
	
			distmedia = distancia/5;
			
			if(distancia>distmax) {
				distmax = distancia;
				ciudadmax = ciudad;
			}
		}
		System.out.println("------------------------------------------------------------");
		System.out.println("La distancia media ( 5 últimas rutas): "+ distmedia);
		System.out.println("Distancia más larga de las últimas 5 rutas: " + distmax);
		System.out.println("Ciudad de la ruta más larga: " +ciudadmax);
		System.out.println("------------------------------------------------------------");


	}	
}
