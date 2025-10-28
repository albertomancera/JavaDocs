/*
 * Objetivo: Crear la clase Vehiculo
 * Autor: Álvaro Mozo Gaspar
 * Fecha: 03/03/2025
 */
package ejercicio5;

public abstract class Vehiculo {

    protected String matricula;
    protected String modelo;

    public Vehiculo(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public abstract String toString();
    
}
