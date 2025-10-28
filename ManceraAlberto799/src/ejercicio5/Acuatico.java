
package ejercicio5;

import java.time.LocalDate;

public abstract class Acuatico extends Vehiculo {

    protected final double eslora;

    public Acuatico(String matricula, String modelo, LocalDate fechaFabricacion, double eslora) {
		super(matricula, modelo, fechaFabricacion);
		this.eslora = eslora;
	}

   }


