/*
 * Objetivo: Crear la clase Rectángulo
 * Autor: Álvaro Mozo Gaspar
 * Fecha: 03/03/2025
 */
package ejercicio6;

public class Rectangulo implements Figura2D {

    private double anchura, altura;

    public Rectangulo(double anchura, double altura) {
        this.anchura = anchura;
        this.altura = altura;
    }

    public double perimetro() {
        double perimetro = (anchura + altura) * 2;
        return perimetro;
    }

    public double area() {
    	double area = anchura * altura;
        return area;
    }

    public void escalar(double escala) {
        if (escala > 0) {
            this.anchura *= escala;
            this.altura *= escala;
        }
    }

    public void imprimir() {
        System.out.println("Rectángulo [Ancho: " + anchura + ", Alto: " + altura + ", Perímetro: " + perimetro() + ", Área: " + area() + "]");
    }

}
