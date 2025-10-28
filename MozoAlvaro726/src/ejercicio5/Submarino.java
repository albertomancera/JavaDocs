/*
 * Objetivo: Crear la clase Submarino
 * Autor: Álvaro Mozo Gaspar
 * Fecha: 03/03/2025
 */
package ejercicio5;

public class Submarino extends Acuatico {

    private int profundidadMax;

    public Submarino(String matricula, String modelo, double eslora, int profundidadMax) {
        super(matricula, modelo, eslora);
        this.profundidadMax = profundidadMax;
    }

    public String toString() {
        return String.format("Submarino [Matrícula: " + matricula + ", Modelo: " + modelo + ", Eslora: " + eslora + "m, Profundidad Máxima: " + profundidadMax + "m]");
    }

}
