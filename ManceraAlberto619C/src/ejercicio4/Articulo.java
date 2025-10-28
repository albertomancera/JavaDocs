package ejercicio4;

import java.util.Objects;

public class Articulo {

	private String nombre;
	private double precio;
	private int iva ;
	private int cuantosQuedan;
	
	//Constructores
	public Articulo (String nombre, double precio, int iva, int cuantosQuedan) throws IllegalArgumentException{
		if(nombre == null || nombre.isEmpty()) {
			throw new IllegalArgumentException ("el parámetro nombre es null o contiene la cadena vacía");
		}else if(precio <0) {
			throw new IllegalArgumentException ("el precio no puede ser negativo");
		}else if(iva !=21) {
			throw new IllegalArgumentException("el IVA siempre es 21");
		}else if(iva <0) {
			throw new IllegalArgumentException ("el iva no puede ser negativo");
		}else if(cuantosQuedan <0) {
			throw new IllegalArgumentException ("el cuantosQuedan no puede ser negativo");
		}
		
		this.nombre = nombre;
		this.precio = precio;
		this.iva = iva;
		this.cuantosQuedan = cuantosQuedan;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	public void setCuantosQuedan(int cuantosQuedan) {
		this.cuantosQuedan = cuantosQuedan;
	}



	
}