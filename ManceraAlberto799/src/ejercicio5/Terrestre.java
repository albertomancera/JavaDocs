
package ejercicio5;

import java.time.LocalDate;

public abstract class Terrestre extends Vehiculo {

	protected final int ruedas;

	public Terrestre(String matricula, String modelo, LocalDate fechaFabricacion, int ruedas) throws  IllegalArgumentException{
		super(matricula, modelo, fechaFabricacion);
		if(!matricula.matches("[0-9]{4}[A-Za-z]{3}")) {
			throw new IllegalArgumentException("El formato de la  matricula tiene que ser 9999 AAAA");
		}
		if(matricula == null || matricula.isEmpty()) {
			throw new IllegalArgumentException("La matricula no puede estar vacía");
		}
		
		this.ruedas = ruedas;
	}

	public void setMatricula(String matricula) throws IllegalArgumentException{
		if(matricula.matches("[0-9]{4}[A-Za-z]{3}")) {
			throw new IllegalArgumentException("El formato de la matricula tiene que ser 9999 AAAA");
		}if(matricula == null || matricula.isEmpty()) {
			throw new IllegalArgumentException("La matricula no puede estar vacía");
		}
		
		this.matricula = matricula;
	}
  


}
