package herencia;

import java.time.LocalDate;

public class ProductoCongelado extends Producto{

	protected double temperaturaRecomendada;
	protected int mesesConservar;
	
	//Constructor
	public ProductoCongelado(int codigo, String nombre, LocalDate fechaCaducidad, int numLote,
			double temperaturaRecomendada, int mesesConservar) {
		super(codigo, nombre, fechaCaducidad, numLote);
		this.temperaturaRecomendada = temperaturaRecomendada;
		this.mesesConservar = mesesConservar;
	}

	//Getter y Setter
	public double getTemperaturaRecomendada() {
		return temperaturaRecomendada;
	}

	public void setTemperaturaRecomendada(double temperaturaRecomendada) {
		this.temperaturaRecomendada = temperaturaRecomendada;
	}

	public int getMesesConservar() {
		return mesesConservar;
	}

	public void setMesesConservar(int mesesConservar) {
		this.mesesConservar = mesesConservar;
	}

	//Metodos

	//To String
	@Override
	public String toString() {
		return "ProductoCongelado [temperaturaRecomendada=" + temperaturaRecomendada + ", mesesConservar="
				+ mesesConservar + "]";
	}
	
	
}
