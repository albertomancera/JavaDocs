package gestionInmuebles;

import java.time.LocalDate;

public class CasaRural extends Vivienda {
	public static final int PLANTAS_DEFECTO = 2;
	public static final int DISTANCIA_DEFECTO = 1000;//mETROS
	public static final double ALTITUD_DEFECTO = 12;
	
	private int cantidadPlantas;
	private int distanciaAlCentro;
	private double altitudNivelMar;
	
	
	public CasaRural(float superficie, String direccion, LocalDate fechaConstruccion, int numHabitaciones, int numBanos,
			int cantidadPlantas, int distanciaAlCentro, double altitudNivelMar) throws IllegalArgumentException {
		super(superficie, direccion, fechaConstruccion, numHabitaciones, numBanos);
		this.cantidadPlantas = cantidadPlantas;
		this.distanciaAlCentro = distanciaAlCentro;
		this.altitudNivelMar = altitudNivelMar;
		calcularPrecio();
	}

	public CasaRural(float superficie) {
		this(superficie,Inmueble.DIRECCION_DEFECTO,Inmueble.FECHA_ACTUAL,Vivienda.HABITACIONES_DEFECTO,Vivienda.BANOS_DEFECTO,
				PLANTAS_DEFECTO,DISTANCIA_DEFECTO,ALTITUD_DEFECTO);
	}

	public CasaRural() {
		this(Inmueble.SUPERFICIE_DEFECTO,Inmueble.DIRECCION_DEFECTO,Inmueble.FECHA_ACTUAL,Vivienda.HABITACIONES_DEFECTO,Vivienda.BANOS_DEFECTO,
				PLANTAS_DEFECTO,DISTANCIA_DEFECTO,ALTITUD_DEFECTO);
	}

	
	public double calcularPrecio() {
		
		return this.precioVenta = superficie * 1500;
	}

	@Override
	public String toString() {
		return "CasaRural [cantidadPlantas=" + cantidadPlantas + ", distanciaAlCentro=" + distanciaAlCentro
				+ ", altitudNivelMar=" + altitudNivelMar +" "+ super.toString() + "]";
	}

}
