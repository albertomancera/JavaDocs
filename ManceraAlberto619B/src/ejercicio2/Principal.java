package ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		Persona persona1 = new Persona("88888888L", "Luis","Lopera", 23);
		
		System.out.println(persona1.dni);
		System.out.println(persona1.nombre);
		System.out.println(persona1.apellidos);
		System.out.println(persona1.edad);
}
}