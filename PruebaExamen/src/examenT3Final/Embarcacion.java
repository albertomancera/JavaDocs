package examenT3Final;

import java.time.LocalDate;
import java.time.Period;

public abstract class Embarcacion {
	//Atributos de clase constantes
	public static final String MATRICULA_DEFECTO = "Matricula defecto";
	public static final LocalDate FECHA_ACTUAL = LocalDate.now();
	public static final int ESLORA_DEFECTO = 10;
	public static final int NUM_PASAJEROS_DEFECTO = 20;
	public static final boolean TIENE_BASE_DEFECTO = true;
	
	//Atributos de objeto
	protected final String matricula;
	protected  LocalDate fechaConstruccion;
	protected int eslora;
	protected int numPasajero;
	protected boolean tieneBase;
	
	public Embarcacion(String matricula, LocalDate fechaConstruccion, int eslora, int numPasajero, boolean tieneBase) throws IllegalArgumentException{
		if(fechaConstruccion.isAfter(FECHA_ACTUAL)) {
			throw new IllegalArgumentException("La fecha de construcción no puede ser posterior a la fecha actual");
		}
		if(numPasajero <= 0) {
			throw new IllegalArgumentException("El número de pasajeros no puede ser ni 0 ni negativo");
		}
		
		this.matricula = matricula;
		this.fechaConstruccion = fechaConstruccion;
		this.eslora = eslora;
		this.numPasajero = numPasajero;
		this.tieneBase = tieneBase;
	}
	
	public Embarcacion() {
		this(MATRICULA_DEFECTO,FECHA_ACTUAL,ESLORA_DEFECTO,NUM_PASAJEROS_DEFECTO,TIENE_BASE_DEFECTO);
	}


	public String getMatricula() {
		return matricula;
	}

	public LocalDate getFechaConstruccion() {
		return fechaConstruccion;
	}
	
	public int getEslora() {
		return eslora;
	}
	
	public abstract double calcularAtraque(LocalDate fechaIni, LocalDate fechFin);
	
	@Override
	public String toString() {
		return "Embarcacion [matricula=" + matricula + ", fechaConstruccion=" + fechaConstruccion + ", eslora=" + eslora
				+ ", numPasajero=" + numPasajero + ", tieneBase=" + tieneBase + "]";
	}

	

	
	
	
}
