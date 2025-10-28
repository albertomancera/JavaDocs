package gestionInmuebles;

import java.time.LocalDate;

public abstract class Local extends Inmueble{
	public static final Localizacion LOCALIZACION_DEFECTO = Localizacion.CALLE;

	private Localizacion localizacion;

	public Local(float superficie, String direccion, LocalDate fechaConstruccion, Localizacion localizacion)
			throws IllegalArgumentException {
		super(superficie, direccion, fechaConstruccion);
		this.identificador = String.format("LO" + super.identificador);
		this.localizacion = localizacion;
	}

	@Override
	public String toString() {
		return super.toString() +" Local [localizacion=" + localizacion + "]";
	}
	
}
