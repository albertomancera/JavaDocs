package examenT1parcial;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hora,minutos;
		String nombre;
		
		System.out.println("Introduce tu nombre: ");
		nombre = sc.nextLine();
		
		do {
			System.out.println("Introduce la hora: (0-24): ");
			hora = sc.nextInt();
		}while(hora < 0 || hora > 24);
		
		do {
			System.out.println("Introduce los minutos: (0-60): ");
			minutos = sc.nextInt();
		}while(minutos < 0 || minutos > 60);//Mientras que minutos sea menor q 0 o mayor que 60 se repetira la pregunta
		
		if(hora < 12 || (hora == 12 && minutos == 0))  {
			//Desde las 00:00 hasta las 12:00 incluidas
			System.out.println("Buenos días, "+ nombre);
		}else if ((hora == 12 && minutos >= 1) || (hora == 16 || (hora < 16 && minutos <=30))){
			//Desde las 12:01 hasta las 16:30
			System.out.println("Buena sobremesa, "+ nombre);
		}else if((hora == 16 && minutos >= 31) || (hora < 20 || (hora == 20 && minutos <=30))){
			//Desde las 16:31 hasta las 20:30
			System.out.println("Buenas tardes, "+ nombre);
		}else {
			System.out.println("Buenas noches ," + nombre);
		}
		
	}

}
