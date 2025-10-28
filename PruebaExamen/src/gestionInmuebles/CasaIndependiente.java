package gestionInmuebles;

import java.time.LocalDate;

public class CasaIndependiente extends Vivienda {
	public static final int PLANTAS_DEFECTO = 1;
	
	private int cantidadPlantas;
	
	
	
	public CasaIndependiente(float superficie, String direccion, LocalDate fechaConstruccion, int numHabitaciones,
			int numBanos, int cantidadPlantas) throws IllegalArgumentException {
		super(superficie, direccion, fechaConstruccion, numHabitaciones, numBanos);
		this.cantidadPlantas = cantidadPlantas;
		calcularPrecio();
	}

	public CasaIndependiente(float superficie) {
		this(superficie,Inmueble.DIRECCION_DEFECTO,Inmueble.FECHA_ACTUAL,Vivienda.HABITACIONES_DEFECTO,Vivienda.BANOS_DEFECTO,
				PLANTAS_DEFECTO);
	}
	
	public CasaIndependiente() {
		this(Inmueble.SUPERFICIE_DEFECTO,Inmueble.DIRECCION_DEFECTO,Inmueble.FECHA_ACTUAL,Vivienda.HABITACIONES_DEFECTO,Vivienda.BANOS_DEFECTO,
				PLANTAS_DEFECTO);
	}

	public double calcularPrecio() {

		
		return this.precioVenta = superficie * 3000;
	}

	@Override
	public String toString() {
		return "CasaIndependiente [cantidadPlantas=" + cantidadPlantas +" "+super.toString() + "]";
	}
	
	
}
