package gestionInmuebles;

import java.time.LocalDate;

public class Oficina extends Local {
	public static final boolean SON_GOBIERNO = false;
	
	private boolean sonGobierno;

	public Oficina(float superficie, String direccion, LocalDate fechaConstruccion, Localizacion localizacion,
			boolean sonGobierno) throws IllegalArgumentException {
		super(superficie, direccion, fechaConstruccion, localizacion);
		this.sonGobierno = sonGobierno;
		calcularPrecio();

	}
	
	public Oficina(float superficie) {
		this(superficie,Inmueble.DIRECCION_DEFECTO,Inmueble.FECHA_ACTUAL,Local.LOCALIZACION_DEFECTO,SON_GOBIERNO);
	}
	
	public Oficina() {
		this(Inmueble.SUPERFICIE_DEFECTO,Inmueble.DIRECCION_DEFECTO,Inmueble.FECHA_ACTUAL,Local.LOCALIZACION_DEFECTO,SON_GOBIERNO);
	}
	
	
	public double calcularPrecio() {
		return this.precioVenta = superficie * 2200;
	}

	@Override
	public String toString() {
		return "Oficina [sonGobierno=" + sonGobierno +" "+ super.toString()+ "]";
	}
	
	
	
}
