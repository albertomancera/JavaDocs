package ejercicio2;
import java.util.*;

public class Ejercicio2 {
	public static void main(String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		String nombre;
		System.out.println("Dime tu nombre: ");
		nombre = entradaTeclado.nextLine();
		
		String apellidos;
		System.out.println("Dime tus apellidos: ");
		apellidos = entradaTeclado.nextLine();
		
		int edad;
		System.out.println("Dime tu edad: ");
		edad = entradaTeclado.nextInt();
		
		double salario;
		System.out.println("Dime tu salario deseado: ");
		salario = entradaTeclado.nextDouble();
		
		
		
		if (salario > 30000 || edad > 45) {
			System.out.println("Lo sentimos pero no cumple nuestro perfil");
		}else {
			int annos ;
			System.out.println("Dime tus años de experiencia: ");
			annos = entradaTeclado.nextInt();
			
			int numeroproyc ;
			System.out.println("Número de proyectos trabajados anteriormente: ");
			numeroproyc = entradaTeclado.nextInt();
			
			if (annos > 2 && numeroproyc > 3 ) {
				System.out.println("Enhorabuena. Ha sido contratado");
				
				if (annos > 5 || numeroproyc >5){
					System.out.println("Se le asignará como salario anual: 30000 .");
				}else {
					System.out.println("Se le asignará como salario anual: 25000 .");
			}
			}else {
				System.out.println("Lo sentimos pero no cumple nuestro perfil");
				}
			}
	
			}		
		}	
	

