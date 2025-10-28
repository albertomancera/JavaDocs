package herencia;

import java.time.LocalDate;

public class ProductoRefrigerado extends Producto {

	protected int codigoOrganismo;
	protected double temperaturaMinima;
	protected LocalDate fechaConsumo;
	
	//Constructor
	public ProductoRefrigerado(int codigo, String nombre, LocalDate fechaCaducidad, int numLote, int codigoOrganismo,
			double temperaturaMinima, LocalDate fechaConsumo) {
		super(codigo, nombre, fechaCaducidad, numLote);
		this.codigoOrganismo = codigoOrganismo;
		this.temperaturaMinima = temperaturaMinima;
		this.fechaConsumo = fechaConsumo;
	}

	//Getter y Setter
	public int getCodigoOrganismo() {
		return codigoOrganismo;
	}

	public void setCodigoOrganismo(int codigoOrganismo) {
		this.codigoOrganismo = codigoOrganismo;
	}

	public double getTemperaturaMinima() {
		return temperaturaMinima;
	}

	public void setTemperaturaMinima(double temperaturaMinima) {
		this.temperaturaMinima = temperaturaMinima;
	}

	public LocalDate getFechaConsumo() {
		return fechaConsumo;
	}

	public void setFechaConsumo(LocalDate fechaConsumo) {
		this.fechaConsumo = fechaConsumo;
	}

	//To String
	@Override
	public String toString() {
		return "ProductoRefrigerado [codigoOrganismo=" + codigoOrganismo + ", temperaturaMinima=" + temperaturaMinima
				+ ", fechaConsumo=" + fechaConsumo + "]";
	}
	

	
	
}
