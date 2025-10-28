/*
 * Objetivo: Crear la clase Terrestre
 * Autor: Álvaro Mozo Gaspar
 * Fecha: 03/03/2025
 */
package ejercicio5;

public abstract class Terrestre extends Vehiculo {

	protected int ruedas;

    public Terrestre(String matricula, String modelo, int ruedas) {
        super(matricula, modelo);
        this.ruedas = ruedas;
    }

}
