
package ejercicio5;

import java.time.LocalDate;

public class Helicoptero extends Aereo {
	public static int HELICES_DEFECTO = 4;
	private int numeroHelices;

   
    public Helicoptero(String matricula, String modelo, LocalDate fechaFabricacion, int asientos, int numeroHelices)
			throws IllegalArgumentException {
		super(matricula, modelo, fechaFabricacion, asientos);
		this.numeroHelices = numeroHelices;
	}

    public Helicoptero() {
		this(MATRICULA_DEFECTO, MODELO_DEFECTO, FECHA_FABRICACION_DEFECTO, ASIENTOS_DEFECTO, HELICES_DEFECTO);
	}


	public String toString() {
        return String.format("Helicóptero [Matrícula: " + matricula + ", Modelo: " + modelo + ", Asientos: " + asientos + ", Hélices: " + numeroHelices + "]");
    }

}
