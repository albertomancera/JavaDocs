package ejercicio2;

import java.time.LocalDate;
import java.util.Scanner;

import ejercicio2.Deportivo.Trac;

public class Principal {

	  public static void main(String[] args) {
		  Scanner sc = new Scanner (System.in);
	     
		  try {
	        Coche coche1 = new Coche();
	        System.out.println("--------------------");
	        System.out.println(coche1);
		  }catch (IllegalArgumentException e){
			  System.out.println("Error al crear coche: " + e.getMessage());
		  }
	       
	        Coche coche2 = new Coche("1234 ABC", "Juan Pérez", LocalDate.of(2000, 2, 10), 1800, 140);
	        
	        System.out.println("--------------------");
	        System.out.println(coche2);

	        try {
	            Coche coche3 = new Coche("1234 A1C", "",LocalDate.of(1986, 05, 5) , -1000, -150);
	            System.out.println("--------------------");
	            System.out.println(coche3);
	        } catch (IllegalArgumentException e) {
	            System.out.println("Error al crear coche: " + e.getMessage());
	        }

	        Deportivo dep1 = new Deportivo("1234 ABC", "Juan Pérez", LocalDate.of(2000, 2, 10), 1800, 140,Deportivo.Trac.DELANTERA);
	        
	        
	        Trac tipo;

	       
	        System.out.println("Dame la tracción (DELANTERA, TRASERA):");
	        String input = sc.nextLine().toUpperCase();  

	        try {
	            tipo = Trac.valueOf(input);
	            System.out.println("La tracción elegida es: " + tipo);
	        } catch (IllegalArgumentException e) {
	            System.out.println("Opción no válida. Por favor elige una tracción válida.");
	        }
	    }


	       
	    }
	


