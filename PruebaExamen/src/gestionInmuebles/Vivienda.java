package gestionInmuebles;

import java.time.LocalDate;

public abstract class Vivienda extends Inmueble {
	public static final int HABITACIONES_DEFECTO = 4;
	public static final int BANOS_DEFECTO = 1;

	protected int numHabitaciones;
	protected int numBanos;
	
	public Vivienda(float superficie, String direccion, LocalDate fechaConstruccion, int numHabitaciones, int numBanos)
			throws IllegalArgumentException {
		super(superficie, direccion, fechaConstruccion);
		this.identificador = String.format("VI" + super.identificador);
		this.numHabitaciones = numHabitaciones;
		this.numBanos = numBanos;
	}

	@Override
	public String toString() {
		return super.toString() + "Vivienda [identificador= "+ identificador + " numHabitaciones=" + numHabitaciones + ", numBanos=" + numBanos + "]";
	}
	

	
}
