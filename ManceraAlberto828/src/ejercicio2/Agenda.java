package ejercicio2;

import java.time.LocalDate;
import java.util.Scanner;


import java.time.LocalDate;

public class Agenda {
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;

    public Agenda(String nombre, String direccion, String telefono, String email, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Dirección: " + direccion + ", Teléfono: " + telefono +
               ", Email: " + email + ", Fecha de Nacimiento: " + fechaNacimiento;
    }
}