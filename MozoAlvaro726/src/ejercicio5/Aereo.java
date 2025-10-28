/*
 * Objetivo: Crear la clase Aereo
 * Autor: Álvaro Mozo Gaspar
 * Fecha: 03/03/2025
 */
package ejercicio5;

public abstract class Aereo extends Vehiculo {

    protected int asientos;

    public Aereo(String matricula, String modelo, int asientos) {
        super(matricula, modelo);
        this.asientos = asientos;
    }

}
