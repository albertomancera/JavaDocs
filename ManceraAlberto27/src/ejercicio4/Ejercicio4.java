package ejercicio4;
import java.util.*;

public class Ejercicio4 {
	public static void main(String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		double nota1;
		System.out.println("Dime la nota de una asignatura: ");
		nota1 = entradaTeclado.nextDouble();
		
		double nota2;
		System.out.println("Dime la nota de otra asignatura: ");
		nota2 = entradaTeclado.nextDouble();
		
		double nota3;
		System.out.println("Dime la nota de otra asignatura: ");
		nota3 = entradaTeclado.nextDouble();
		
		double nota4;
		System.out.println("Dime la nota de otra asignatura: ");
		nota4 = entradaTeclado.nextDouble();
		
		double notamedia;
		notamedia = (nota1 + nota2 + nota3 + nota4 /4);
		System.out.println("La nota media es: " + notamedia);
		
		System.out.println("La nota media redondeada hacia arriba es: "+ Math.ceil(notamedia));
		System.out.println("La nota media redondeada hacia abajo es: "+ Math.floor(notamedia));
		
		if (notamedia >= 8) {
			System.out.println("Puedes acceder a estudios superiores");
		}else {
			System.out.println("La nota media obtenida no es suficiente para acceder a los estudios que deseaba");
		}
	}
}
