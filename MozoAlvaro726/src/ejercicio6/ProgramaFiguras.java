/*
 * Objetivo: Crear la clase ProgramaFiguras
 * Autor: Álvaro Mozo Gaspar
 * Fecha: 03/03/2025
 */
package ejercicio6;

public class ProgramaFiguras {

    public static void main(String[] args) {
        Figura2D[] figuras = {
            new Cuadrado(4),
            new Rectangulo(4, 6),
            new Triangulo(5, 8),
            new Circulo(3)
        };

        System.out.println("Figuras originales:");
        for (Figura2D figura : figuras) figura.imprimir();

        System.out.println();
        System.out.println("Escalando todas las figuras por 2:");
        for (Figura2D figura : figuras) {
            figura.escalar(2);
            figura.imprimir();
        }

        System.out.println();
        System.out.println("Escalando todas las figuras por 0.1:");
        for (Figura2D figura : figuras) {
            figura.escalar(0.1);
            figura.imprimir();
        }
    }

}
