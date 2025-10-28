package gestionInmuebles;

import java.time.LocalDate;

public class LocalComercial extends Local{
	public static final double CENTRO_DEFECTO = 200;//Metros
	
	private double centro_donde;

	public LocalComercial(float superficie, String direccion, LocalDate fechaConstruccion, Localizacion localizacion,
			double centro_donde) throws IllegalArgumentException {
		super(superficie, direccion, fechaConstruccion, localizacion);
		this.centro_donde = centro_donde;
		calcularPrecio();

	}
	
	public LocalComercial(float superficie) {
		this(superficie,Inmueble.DIRECCION_DEFECTO,Inmueble.FECHA_ACTUAL,Local.LOCALIZACION_DEFECTO,CENTRO_DEFECTO);
	}
	
	public LocalComercial() {
		this(Inmueble.SUPERFICIE_DEFECTO,Inmueble.DIRECCION_DEFECTO,Inmueble.FECHA_ACTUAL,Local.LOCALIZACION_DEFECTO,CENTRO_DEFECTO);
	}
	
	public double calcularPrecio() {
		
		return this.precioVenta = superficie*1800;
	}

	@Override
	public String toString() {
		return "LocalComercial [centro_donde=" + centro_donde +" "+ super.toString()+ "]";
	}
	
	
}
