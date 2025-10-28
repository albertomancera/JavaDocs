package gestionInmuebles;

import java.time.LocalDate;

public class ApartamentoFamiliar extends Vivienda{
	public static final double CUOTA_DEFECTO = 150;
	
	private double cuotaComunidad;

	public ApartamentoFamiliar(float superficie, String direccion, LocalDate fechaConstruccion, int numHabitaciones,
			int numBanos, double cuotaComunidad) throws IllegalArgumentException {
		super(superficie, direccion, fechaConstruccion, numHabitaciones, numBanos);
		this.cuotaComunidad = cuotaComunidad;
		calcularPrecio();
	}
	
	public ApartamentoFamiliar(float superficie) {
		this(superficie,Inmueble.DIRECCION_DEFECTO,Inmueble.FECHA_ACTUAL,1,Vivienda.BANOS_DEFECTO,
				CUOTA_DEFECTO);
	}
	
	public ApartamentoFamiliar() {
		this(Inmueble.SUPERFICIE_DEFECTO,Inmueble.DIRECCION_DEFECTO,Inmueble.FECHA_ACTUAL,1,Vivienda.BANOS_DEFECTO,
				CUOTA_DEFECTO);
	}
	
	public double calcularPrecio() {
	
		return this.precioVenta = superficie * 1800;
	}

	@Override
	public String toString() {
		return "ApartamentoFamiliar [cuotaComunidad=" + cuotaComunidad +" "+ super.toString() +"]";
	}
	
	
}
