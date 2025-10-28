/*
 * Objetivo: Crear la clase Moto
 * Autor: Álvaro Mozo Gaspar
 * Fecha: 03/03/2025
 */
package ejercicio5;

public class Moto extends Terrestre {

    private String color;

    public Moto(String matricula, String modelo, int ruedas, String color) {
        super(matricula, modelo, ruedas);
        this.color = color;
    }

    public String toString() {
        return String.format("Moto [Matrícula: " + matricula + ", Modelo: " + modelo + ", Ruedas: " + ruedas + ", Color: " + color + "]");
    }

}
