package ejercicio3;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int horas=0, minutos = 0;

		
		LocalTime horaInicio = LocalTime.of(8, 0);
		LocalTime horaIntroducida;
		
		do {
			try {
			System.out.println("Dime una hora: ");
			horas = sc.nextInt();
			}catch(InputMismatchException exception1) {
				System.out.println("Error de lectura: No es un número entero");
			}
		}while(horas <0 || horas>23);
		
		
		do {
			try {
			System.out.println("Dime el minuto: ");
			minutos = sc.nextInt();
			}catch(InputMismatchException exception1) {
				System.out.println("Error de lectura: No es un número entero");
			}
		}while((minutos <0) || (minutos>59));
	
		horaIntroducida = LocalTime.of(horas, minutos);
		
		System.out.println("Hora introducida: "+horaIntroducida);
			
	if (horaIntroducida.isBefore(horaInicio)) {
		long minutosFaltan = ChronoUnit.MINUTES.between(horaIntroducida, horaInicio);
		System.out.println("Aún no han comenzado las clases.Faltan "+minutosFaltan+ " minutos para empezar la clase.");
	}else if(horaIntroducida.isBefore(horaInicio.plusHours(2))) {
		System.out.println("Estamos en clase de Programación");
	}else if(horaIntroducida.isBefore(horaInicio.plusHours(4))) {
		System.out.println("Estamos en clase de Sistemas Informáticos");
	}else if(horaIntroducida.isBefore(horaInicio.plusHours(6))) {
		System.out.println("Estamos en clase de Entornos de Desarrollo");
	}else {
		long minutosFaltan = ChronoUnit.MINUTES.between(horaInicio.plusHours(6),horaIntroducida);
		System.out.println("Ya han finalizado las clases.Han pasado "+minutosFaltan+" minutos desde que terminó.");
	}
	
	}
}
