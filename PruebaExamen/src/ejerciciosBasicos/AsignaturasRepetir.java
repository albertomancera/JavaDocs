package ejerciciosBasicos;

import java.util.ArrayList;
import java.util.Scanner;

public class AsignaturasRepetir {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		 ArrayList<String> asignaturas = new ArrayList<>();
	        asignaturas.add("Matemáticas");
	        asignaturas.add("Física");
	        asignaturas.add("Química");
	        asignaturas.add("Historia");
	        asignaturas.add("Lengua");

	        ArrayList<String> repetir = new ArrayList<>();

	        for (String asignatura : asignaturas) {
	            System.out.print("Nota en " + asignatura + ": ");
	            double nota = sc.nextDouble();
	            if (nota < 5) {
	                repetir.add(asignatura);
	            }
	        }

	        System.out.println("\nAsignaturas que tienes que repetir:");
	        for (String a : repetir) {
	            System.out.println("- " + a);
	        }
	}

}
