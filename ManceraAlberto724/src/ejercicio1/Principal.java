package ejercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* Crearemos tres objetos, un objeto de la clase Humano y otros dos de la clase
		Ciudadano. Al crearlos usaremos el constructor para darle valores en la propia
		creación. */
		Humano humano1 = new Humano("Luis" , "Peréz"); 
		
		Ciudadano ciudadano1 = new Ciudadano("Alberto", "Lopez" ," doc1");
		Ciudadano ciudadano2 = new Ciudadano("Jose", "Luis" ," doc2");
		
		System.out.println("Humano 1: ");
		System.out.println(humano1.getNombreCompleto());
		System.out.println("Ciudadano 1: ");
		System.out.println(ciudadano1.getNombreCompleto());
		System.out.println("Ciudadano 2: ");
		System.out.println(ciudadano2.getNombreCompleto());
		
		Humano humano2 = new Humano();
		
		System.out.println("Dime un nombre: ");
		humano2.nombre = sc.nextLine();
		System.out.println("Dime un apellido: ");
		humano2.apellido = sc.nextLine();
		
		System.out.println("Humano 2: ");
		System.out.println(humano2.getNombreCompleto());
		
	
	}

}
