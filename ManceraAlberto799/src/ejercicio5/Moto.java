
package ejercicio5;

import java.time.LocalDate;

public class Moto extends Terrestre {

    private String color;

   
    public Moto(String matricula, String modelo, LocalDate fechaFabricacion, int ruedas, String color)
			throws IllegalArgumentException {
		super(matricula, modelo, fechaFabricacion, ruedas);
		this.color = color;
	}


	public String toString() {
        return String.format("Moto [Matrícula: " + matricula + ", Modelo: " + modelo + ", Ruedas: " + ruedas + ", Color: " + color + "]");
    }

}
