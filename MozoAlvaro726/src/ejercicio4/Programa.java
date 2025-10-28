/*
 * Objetivo: Crear la clase Programa
 * Autor: Álvaro Mozo Gaspar
 * Fecha: 03/03/2025
 */
package ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;


public class Programa {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        Empresa empresa = new Empresa("TechCorp", "A12345678");
        int opcion;

        do {
        	System.out.println("MENÚ DE OPCIONES");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Eliminar empleado");
            System.out.println("3. Mostrar empleados");
            System.out.println("4. Mostrar sueldos");
            System.out.println("5. Total sueldos brutos y netos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("DNI: ");
                    String dni = scanner.nextLine();
                    System.out.print("Sueldo Bruto: ");
                    double sueldo = scanner.nextDouble();
                    empresa.agregarEmpleado(new Empleado(nombre, dni, sueldo));
                    break;
                case 2:
                    System.out.print("DNI del empleado a eliminar: ");
                    String dniEliminar = scanner.nextLine();
                    empresa.eliminarEmpleado(dniEliminar);
                    break;
                case 3:
                    empresa.mostrarEmpleados();
                    break;
                case 4:
                    empresa.mostrarSueldos();
                    break;
                case 5:
                    System.out.println("Total Sueldos Brutos: " + empresa.totalSueldosBrutos());
                    System.out.println("Total Sueldos Netos: " + empresa.totalSueldosNetos());
                    break;
                case 0:
                    System.out.println("FIN");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        scanner.close();

	}

}
