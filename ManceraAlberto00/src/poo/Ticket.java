package poo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ticket {

	private static final int SECUENCIA_MAX = 99999999;
	
	private static short anno = (short) LocalDate.now().getYear();
	private static int secuencia = 0;
	
	private LocalDate fecha;
	private String identificador;
	private LocalTime hora;
	
	public Ticket(LocalDate fecha) throws IllegalArgumentException {
		
		}
	}
	
	
}
