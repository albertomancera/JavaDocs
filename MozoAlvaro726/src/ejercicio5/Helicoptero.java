/*
 * Objetivo: Crear la clase Helicoptero
 * Autor: Álvaro Mozo Gaspar
 * Fecha: 03/03/2025
 */
package ejercicio5;

public class Helicoptero extends Aereo {

	private int numeroHelices;

    public Helicoptero(String matricula, String modelo, int asientos, int numeroHelices) {
        super(matricula, modelo, asientos);
        this.numeroHelices = numeroHelices;
    }

    public String toString() {
        return String.format("Helicóptero [Matrícula: " + matricula + ", Modelo: " + modelo + ", Asientos: " + asientos + ", Hélices: " + numeroHelices + "]");
    }

}
