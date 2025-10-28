package ejercicio2;

import java.time.LocalDate;

public class Deportivo extends Coche{

	//Atributos
	public static enum Trac{TOTAL, DELANTERA}; 
	
	private Trac traccion;

	//Constructor
	public Deportivo(String matricula, String nombrePropietario, LocalDate fechaMatriculacion, double cilindrada,
			double potencia, Trac traccion) {
		super(matricula, nombrePropietario, fechaMatriculacion, cilindrada, potencia);
		this.traccion = traccion;
	}

	//Getter y Setter
	public Trac getTraccion() {
		return traccion;
	}
	
	public void setTraccion(Trac traccion) throws IllegalArgumentException{
		this.traccion = traccion;
	}

	//ToString
	@Override
	public String toString() {
		return "Deportivo [traccion=" + traccion + ", matricula=" + matricula + ", nombrePropietario="
				+ nombrePropietario + ", fechaMatriculacion=" + fechaMatriculacion + ", cilindrada=" + cilindrada
				+ ", potencia=" + potencia + "]";
	}	
	
}
