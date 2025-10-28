package recetario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Receta {

	String nombre;
	String tipoDePlato;
	LocalDate fechaCreacion;
	String[] listadoIngredientes;
	String[] instrucciones;
	
	public Receta(String nombre, String tipoDePlato, LocalDate fechaCreacion, String[] listadoIngredientes,
			String[] instrucciones) {
		this.nombre = nombre;
		this.tipoDePlato = tipoDePlato;
		this.fechaCreacion = fechaCreacion;
		this.listadoIngredientes = listadoIngredientes;
		this.instrucciones = instrucciones;
	}

	@Override
	public String toString() {
		return "\n[nombre=" + nombre + ", tipoDePlato=" + tipoDePlato + ", fechaCreacion=" + fechaCreacion
				+ ", \nlistadoIngredientes=" + Arrays.toString(listadoIngredientes) + ", \ninstrucciones=" + instrucciones + "]\n";
	}
	
}
