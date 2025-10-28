/*
 * Objetivo: Crear la clase Coche
 * Autor: Álvaro Mozo Gaspar
 * Fecha: 03/03/2025
 */
package ejercicio5;

public class Coche extends Terrestre {

	private boolean aireAcondicionado;

    public Coche(String matricula, String modelo, int ruedas, boolean aireAcondicionado) {
        super(matricula, modelo, ruedas);
        this.aireAcondicionado = aireAcondicionado;
    }

    public String toString() {
        return String.format("Coche [Matrícula: " + matricula + ", Modelo: " + modelo + ", Ruedas: " + ruedas + ", Aire Acondicionado: " + aireAcondicionado + "]");
    }

}
