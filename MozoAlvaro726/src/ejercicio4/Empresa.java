/*
 * Objetivo: Crear la clase Empresa
 * Autor: Álvaro Mozo Gaspar
 * Fecha: 03/03/2025
 */
package ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {

	private String nombre;
    private String cif;
    private String telefono;
    private String direccion;
    private ArrayList<Empleado> empleados;

    public Empresa(String nombre, String cif) {
        this.nombre = nombre;
        this.cif = cif;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void eliminarEmpleado(String dni) {
        empleados.removeIf(e -> e.getDni().equals(dni));
    }

    public void mostrarEmpleados() {
        for (Empleado e : empleados) {
            e.imprimirInformacion();
        }
    }

    public void mostrarSueldos() {
        for (Empleado e : empleados) {
            System.out.println("DNI: " + e.getDni() + ", Sueldo Bruto: " + e.getSueldoBruto() + ", Sueldo Neto: " + e.calcularSueldoNeto());
        }
    }

    public double totalSueldosBrutos() {
        return empleados.stream().mapToDouble(Empleado::getSueldoBruto).sum();
    }

    public double totalSueldosNetos() {
        return empleados.stream().mapToDouble(Empleado::calcularSueldoNeto).sum();
    }

}
