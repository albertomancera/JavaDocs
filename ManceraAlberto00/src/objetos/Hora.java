package objetos;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.Period;

public class Hora{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String horas;
		LocalTime ahora, horasTeclado;
		  
		System.out.println("Dime una hora: (hora-minutos-segundos) ");
		horas = sc.nextLine();
		horasTeclado = LocalTime.parse(horas);
		
		ahora = LocalTime.now();
		
		System.out.println("La hora introducida es: "+ horas);
		System.out.println("La hora actual: "+ahora);
		
		//Period tiempoTranscurrido = horasTeclado.(ahora);
		
		//System.out.println("Ha transcurrido "+tiempoTranscurrido.toString());
	    
	
	}

}
