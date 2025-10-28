package gestionInmuebles;

import java.time.LocalDate;

public abstract class Inmueble {
	public static final float SUPERFICIE_DEFECTO = 50;
	public static final String DIRECCION_DEFECTO = "Málaga";
	public static final LocalDate FECHA_ACTUAL = LocalDate.now();

	private static int numInmobiliario = 0;
	
	protected String identificador;
	protected float superficie;
	protected String direccion;
	protected LocalDate fechaConstruccion;
	protected double precioVenta = 0;

	
	
	public Inmueble( float superficie, String direccion, LocalDate fechaConstruccion) throws IllegalArgumentException{
		if(superficie < 0) {
			throw new IllegalArgumentException("La superficie no puede ser negativo");
		}
		
		numInmobiliario +=2;
		
		this.identificador  = String.format("-%04d", numInmobiliario);;
		this.superficie = superficie;
		this.direccion = direccion;
		this.fechaConstruccion = fechaConstruccion;
	}
	
	
	
	public Inmueble() {
		this(SUPERFICIE_DEFECTO,DIRECCION_DEFECTO,FECHA_ACTUAL);
	}

	public abstract double calcularPrecio() ;



	@Override
	public String toString() {
		return "Inmueble [ identificador=" + identificador + ", superficie="
				+ superficie + ", direccion=" + direccion + ", fechaConstruccion=" + fechaConstruccion
				+ "Precio Venta=" + precioVenta + "€ ]";
	}
	
	
	
}
