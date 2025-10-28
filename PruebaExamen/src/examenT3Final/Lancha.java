package examenT3Final;

import java.time.LocalDate;
import java.time.Period;

public class Lancha extends Embarcacion{
	//ATRIBUTOS DE CLASE CONSTANTE
	public static final int POTENCIA_DEFECTO = 80;
	
	//ATRIBUTOS DE OBJETO
	private int potencia_motor;

	public Lancha(String matricula, LocalDate fechaConstruccion, int eslora, int numPasajero, boolean tieneBase,
			int potencia_motor) throws IllegalArgumentException {
		super(matricula, fechaConstruccion, eslora, numPasajero, tieneBase);
		this.potencia_motor = potencia_motor;
	}
	
	public Lancha() {
		this(Embarcacion.MATRICULA_DEFECTO, Embarcacion.FECHA_ACTUAL, Embarcacion.ESLORA_DEFECTO,Embarcacion.NUM_PASAJEROS_DEFECTO
				,Embarcacion.TIENE_BASE_DEFECTO, POTENCIA_DEFECTO);
	}
	
	public double calcularAtraque(LocalDate fechaIni, LocalDate fechFin) {
		int importeBase = 30;
		return importeBase ;
	}

	@Override
	public String toString() {
		return super.toString() + " Lancha [potencia_motor=" + potencia_motor + "]";
	}
	
	
}
