package herencia;

import java.time.LocalDate;

public class ProductoFresco extends Producto{
//Atributos
	protected LocalDate fechaEnvasado;
	protected String paisOrigen;
	
	//Constructores
	public ProductoFresco(int codigo, String nombre, LocalDate fechaCaducidad, int numLote, LocalDate fechaEnvasado,
			String paisOrigen) {
		super(codigo, nombre, fechaCaducidad, numLote);
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}
	
	
	//Getter y Setter
	public LocalDate getFechaEnvasado() {
		return fechaEnvasado;
	}



	public void setFechaEnvasado(LocalDate fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}



	public String getPaisOrigen() {
		return paisOrigen;
	}



	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}



	// To String
	@Override
	public String toString() {
		return "ProductoFresco [fechaEnvasado=" + fechaEnvasado + ", paisOrigen=" + paisOrigen + "]";
	}

	
//Metodos

	
	
}
