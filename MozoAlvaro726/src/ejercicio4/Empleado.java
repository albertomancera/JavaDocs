/*
 * Objetivo: Crear la clase Empleado
 * Autor: Álvaro Mozo Gaspar
 * Fecha: 03/03/2025
 */
package ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Empleado {

    private String nombre;
    private String dni;
    private double sueldoBruto;
    private int edad;
    private String telefono;
    private String direccion;

    public Empleado(String nombre, String dni, double sueldoBruto) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBruto = sueldoBruto;
    }

    public double calcularSueldoNeto() {
        double sueldoAnual = sueldoBruto * 12;
        double irpf;
        if (sueldoAnual < 12000) {
            irpf = 0.2;
        } else if (sueldoAnual <= 25000) {
            irpf = 0.3;
        } else {
            irpf = 0.4;
        }
        return sueldoBruto * (1 - irpf);
    }

    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre + ", DNI: " + dni + ", Sueldo Bruto: " + sueldoBruto + ", Sueldo Neto: " + calcularSueldoNeto());
    }
    
    public String getDni() {
        return dni;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

}
