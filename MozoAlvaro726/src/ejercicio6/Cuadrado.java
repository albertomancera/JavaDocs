/*
 * Objetivo: Crear la clase Cuadrado
 * Autor: Álvaro Mozo Gaspar
 * Fecha: 03/03/2025
 */
package ejercicio6;

public class Cuadrado implements Figura2D {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double perimetro() {
        double perimetro = lado * 4;
    	return perimetro;
    }

    public double area() {
        double area = lado * lado;
    	return area;
    }

    public void escalar(double escala) {
        if (escala > 0) this.lado *= escala;
    }

    public void imprimir() {
        System.out.println("Cuadrado [Lado: " + lado + ", Perímetro: " + perimetro() + ", Área: " + area() + "]");
    }

}
