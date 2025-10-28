
package ejercicio5;

import java.time.LocalDate;

public class Submarino extends Acuatico {

    private int profundidadMax;

  

    public Submarino(String matricula, String modelo, LocalDate fechaFabricacion, double eslora, int profundidadMax) throws IllegalArgumentException{
		super(matricula, modelo, fechaFabricacion, eslora);
		if(this.profundidadMax < 0) {
			throw new IllegalArgumentException ("No puede ser negativa la profundidad maxima");
		}
		this.profundidadMax = profundidadMax;
	}



	public String toString() {
        return String.format("Submarino [Matrícula: " + matricula + ", Modelo: " + modelo + ", Eslora: " + eslora + "m, Profundidad Máxima: " + profundidadMax + "m]");
    }

}
