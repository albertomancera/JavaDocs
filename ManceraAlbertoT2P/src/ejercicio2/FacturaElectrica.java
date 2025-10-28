/*
 * Autor: Alberto Mancera Plaza
 * Fecha: 28/01/2025
 * Objetivo: Exam
 */
package ejercicio2;

import java.time.LocalDate;

public class FacturaElectrica {
	 //Atributos de objeto
	private LocalDate fecha;
	private int hora;
	private int consumo;
	private double precio;
	private double costeHora;
	
	//Constructor
	public FacturaElectrica(LocalDate fecha, int hora , int consumo, double precio, double costeHora){
		if (hora < 0 || consumo <0 || precio <0 || costeHora <0) {
			throw new IllegalArgumentException("Estos datos no pueden ser negativos");
		}
		this.hora = hora;
		this.consumo = consumo;
		this.precio = precio;
		this.costeHora = costeHora;
	}

	//Getter y Setter
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getCosteHora() {
		return costeHora;
	}

	public void setCosteHora(double costeHora) {
		this.costeHora = costeHora;
	}
	

	

}
