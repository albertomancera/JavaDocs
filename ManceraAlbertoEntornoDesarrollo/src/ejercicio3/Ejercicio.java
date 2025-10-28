package ejercicio3;
import java.util.Scanner;

public class Ejercicio {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		double nota;
		
		System.out.println("Dime la nota dé último examen realizado: ");
		nota = sc.nextDouble();
		
		if(nota<5) {
			System.out.println("Ánimo a superar el siguiente examen");
		}else {
			System.out.println("Enhorabuena");
		}
	
	}

}
