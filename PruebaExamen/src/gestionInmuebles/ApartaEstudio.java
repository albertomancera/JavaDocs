package gestionInmuebles;

import java.time.LocalDate;

public class ApartaEstudio extends Vivienda{
	public static final double CUOTA_DEFECTO = 200;
	
	private double cuotaComunidad;

	public ApartaEstudio(float superficie, String direccion, LocalDate fechaConstruccion, int numHabitaciones,
			int numBanos, double cuotaComunidad) throws IllegalArgumentException {
		super(superficie, direccion, fechaConstruccion, 1, numBanos);
		this.cuotaComunidad = cuotaComunidad;
		calcularPrecio();
	}
	
	public ApartaEstudio(float superficie) {
		this(superficie,Inmueble.DIRECCION_DEFECTO,Inmueble.FECHA_ACTUAL,1,Vivienda.BANOS_DEFECTO,
				CUOTA_DEFECTO);
	}
	
	public ApartaEstudio() {
		this(Inmueble.SUPERFICIE_DEFECTO,Inmueble.DIRECCION_DEFECTO,Inmueble.FECHA_ACTUAL,1,Vivienda.BANOS_DEFECTO,
				CUOTA_DEFECTO);
	}
	
	
	public double calcularPrecio() {
		
		return this.precioVenta = superficie*1250;
	}

	@Override
	public String toString() {
		return "ApartaEstudio [cuotaComunidad=" + cuotaComunidad +" "+ super.toString() +"]";
	}
	
	
}
