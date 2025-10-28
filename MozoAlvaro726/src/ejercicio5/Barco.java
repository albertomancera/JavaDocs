/*
 * Objetivo: Crear la clase Barco
 * Autor: Álvaro Mozo Gaspar
 * Fecha: 03/03/2025
 */
package ejercicio5;

public class Barco extends Acuatico {

    private boolean tieneMotor;

    public Barco(String matricula, String modelo, double eslora, boolean tieneMotor) {
        super(matricula, modelo, eslora);
        this.tieneMotor = tieneMotor;
    }

    public String toString() {
        return String.format("Barco [Matrícula: " + matricula + ", Modelo: " + modelo + ", Eslora: " + eslora + "m, Tiene Motor: " + tieneMotor + "]");
    }

}
