/*
 * Objetivo: Crear la clase Circulo
 * Autor: Álvaro Mozo Gaspar
 * Fecha: 03/03/2025
 */
package ejercicio6;

public class Circulo implements Figura2D {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double perimetro() {
    	double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }

    public double area() {
        double area = Math.PI * radio * radio;
    	return area;
    }

    public void escalar(double escala) {
        if (escala > 0) this.radio *= escala;
    }

    public void imprimir() {
        System.out.println("Círculo [Radio: " + radio + ", Perímetro: " + perimetro() + ", Área: " + area() + "]");
    }

}
