
package ejercicio5;

import java.time.LocalDate;

public class Coche extends Terrestre {

	private boolean aireAcondicionado;

   
    public Coche(String matricula, String modelo, LocalDate fechaFabricacion, int ruedas, boolean aireAcondicionado) {
		super(matricula, modelo, fechaFabricacion, ruedas);
		this.aireAcondicionado = aireAcondicionado;
	}

    public double precioAlquiler(int numDias) {
    	double precio = numDias * 50;
    	return precio;
    }

	public String toString() {
        return String.format("Coche [Matrícula: " + matricula + ", Modelo: " + modelo + ", Ruedas: " + ruedas + ", Aire Acondicionado: " + aireAcondicionado + "]");
    }

}
