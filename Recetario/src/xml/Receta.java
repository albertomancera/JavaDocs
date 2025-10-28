package xml;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;

public class Receta implements Serializable {

	private static final long serialVersionUID = 42L;
	protected String nombre;
	protected String tipoDePlato;
	protected LocalDate fechaCreacion;
	protected String[] listadoIngredientes;
	protected String[] instrucciones;
	
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
