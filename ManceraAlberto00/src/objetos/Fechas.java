package objetos
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Fechas {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String fecha;
		LocalDate hoy, fechaTeclado;
		 
		System.out.println("Dime una fecha:(año-mes-dias) ");
		fecha = sc.nextLine();
		fechaTeclado = LocalDate.parse(fecha);
		
		hoy = LocalDate.now();
		
		System.out.println("La fecha introducida es: "+ fecha);
		System.out.println("Fecha actual: "+hoy);
		
		Period tiempoTranscurrido = fechaTeclado.until(hoy);
		
		System.out.println("Ha transcurrido "+tiempoTranscurrido.toString());
	    
	
	}

}
