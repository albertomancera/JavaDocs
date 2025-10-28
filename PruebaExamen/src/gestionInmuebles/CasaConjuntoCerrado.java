package gestionInmuebles;

import java.time.LocalDate;

public class CasaConjuntoCerrado extends Vivienda {
	public static final int PLANTAS_DEFECTO = 2;
	public static final double CUOTA_DEFECTO =1200;
	public static final boolean AREA_COMUN = true;

	private int cantidadPlantas;
	private double cuotaPropietario;
	private boolean incluyenAreaComun;
	
	
	public CasaConjuntoCerrado(float superficie, String direccion, LocalDate fechaConstruccion, int numHabitaciones,
			int numBanos, int cantidadPlantas, double cuotaPropietario, boolean incluyenAreaComun)
			throws IllegalArgumentException {
		super(superficie, direccion, fechaConstruccion, numHabitaciones, numBanos);
		this.cantidadPlantas = cantidadPlantas;
		this.cuotaPropietario = cuotaPropietario;
		this.incluyenAreaComun = incluyenAreaComun;
		calcularPrecio();
	}

	public CasaConjuntoCerrado(float superficie) {
		this(superficie,Inmueble.DIRECCION_DEFECTO,Inmueble.FECHA_ACTUAL,Vivienda.HABITACIONES_DEFECTO,Vivienda.BANOS_DEFECTO,
				PLANTAS_DEFECTO,CUOTA_DEFECTO,AREA_COMUN);
	}
	
	public CasaConjuntoCerrado() {
		this(Inmueble.SUPERFICIE_DEFECTO,Inmueble.DIRECCION_DEFECTO,Inmueble.FECHA_ACTUAL,Vivienda.HABITACIONES_DEFECTO,Vivienda.BANOS_DEFECTO,
				PLANTAS_DEFECTO,CUOTA_DEFECTO,AREA_COMUN);
	}

	public double calcularPrecio() {
		double precio;
		
		return this.precioVenta = superficie * 2500;
	}

	@Override
	public String toString() {
		return "CasaConjuntoCerrado [cantidadPlantas=" + cantidadPlantas + ", cuotaPropietario=" + cuotaPropietario
				+ ", incluyenAreaComun=" + incluyenAreaComun +" "+ super.toString() +"]";
	}
	
	


}
