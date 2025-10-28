package ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		Persona persona1 = new Persona();
		
		System.out.println("Dime tu nombre: ");
		persona1.nombre = sc.nextLine();
		
		System.out.println("Dime tu apellidos: ");
		persona1.apellidos= sc.nextLine();
		
		System.out.println("Dime tu DNI: ");
		persona1.dni= sc.nextLine();
		
		System.out.println("Dime tu edad: ");
		persona1.edad= sc.nextInt();
		
		if(persona1.edad >=18) {
			System.out.println( persona1.nombre +" "+ persona1.apellidos + " con DNI "+ persona1.dni +" es mayor de edad.");
		}else {
			System.out.println( persona1.nombre +" "+ persona1.apellidos + " con DNI "+ persona1.dni +" es menor de edad.");
		}

		Persona persona2 = new Persona();
		sc.nextLine();
		
		System.out.println("Dime tu nombre: ");
		persona2.nombre = sc.nextLine();
		
		System.out.println("Dime tu apellidos: ");
		persona2.apellidos= sc.nextLine();
		
		System.out.println("Dime tu DNI: ");
		persona2.dni= sc.nextLine();
		
		System.out.println("Dime tu edad: ");
		persona2.edad= sc.nextInt();
		
		
		if(persona2.edad >=18) {
			System.out.println( persona2.nombre +" "+ persona2.apellidos + " con DNI "+ persona2.dni +" es mayor de edad.");
		}else {
			System.out.println( persona2.nombre +" "+ persona2.apellidos + " con DNI "+ persona2.dni +" es menor de edad.");
		}
	}

}
