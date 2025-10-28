package herencia;

import java.time.LocalDate;

public class Producto {
	
	protected static int productosCreados = 0;

	protected int codigo;
	protected String nombre;
	protected LocalDate fechaCaducidad;
	protected int numLote;
	
	//Constructores
	
	public Producto(int codigo, String nombre, LocalDate fechaCaducidad, int numLote) {
		this.codigo += codigo;
		this.nombre = nombre;
		this.fechaCaducidad = fechaCaducidad;
		this.numLote = numLote;
		
		productosCreados ++;
	}
	
	public Producto () {
		
	}

	//Getter y Setters
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getNumLote() {
		return numLote;
	}

	public void setNumLote(int numLote) {
		this.numLote = numLote;
	}


	public void caducado1 (LocalDate fechaActual) throws IllegalArgumentException{
		if(fechaActual.isBefore(fechaCaducidad)) {
			throw new IllegalArgumentException ("Este producto está caducado");
		}else {
			System.out.println("El producto no está caducado");
		}
	}
	
	/*public int diasHasta(LocalDate fechaActual) throws IllegalArgumentException{
		int dias = 0;
		
		 dias = fechaActual - fechaCaducidad;
	}
	*/
	
	//To String
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", fechaCaducidad=" + fechaCaducidad + ", numLote="
				+ numLote + ", getCodigo()=" + getCodigo() + ", getNombre()=" + getNombre() + ", getFechaCaducidad()="
				+ getFechaCaducidad() + ", getNumLote()=" + getNumLote() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public void caducado(LocalDate fechaCompra) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}
	
	
	

	
	
}
