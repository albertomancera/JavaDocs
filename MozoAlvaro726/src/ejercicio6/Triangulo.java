/*
 * Objetivo: Crear la clase Triangulo
 * Autor: Álvaro Mozo Gaspar
 * Fecha: 03/03/2025
 */
package ejercicio6;

public class Triangulo implements Figura2D {

    private double base, altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double perimetro() {
    	double perimetro = base * 3; // Suponiendo un triángulo equilátero
        return perimetro;
    }

    public double area() {
    	double area = (base * altura) / 2;
        return area;
    }

    public void escalar(double escala) {
        if (escala > 0) {
            this.base *= escala;
            this.altura *= escala;
        }
    }

    public void imprimir() {
        System.out.println("Triángulo [Base: " + base + ", Altura: " + altura + ", Perímetro: " + perimetro() + ", Área: " + area() + "]");
    }

}
