/*
 * Objetivo: Crear la clase Acuatico
 * Autor: Álvaro Mozo Gaspar
 * Fecha: 03/03/2025
 */
package ejercicio5;

public abstract class Acuatico extends Vehiculo {

    protected double eslora;

    public Acuatico(String matricula, String modelo, double eslora) {
        super(matricula, modelo);
        this.eslora = eslora;
    }

}
