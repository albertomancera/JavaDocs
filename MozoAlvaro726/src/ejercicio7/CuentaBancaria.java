/*
 * Objetivo: Crear la clase CuentaBancaria
 * Autor: Álvaro Mozo Gaspar
 * Fecha: 03/03/2025
 */
package ejercicio7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CuentaBancaria {

    public static final String IBAN_DEFAULT = "ES1234567890123456789012";
    private String iban;
    private String titular;
    private double saldo;
    private List<String> movimientos;

    public CuentaBancaria(String iban, String titular) throws CuentaException {
        if (iban == null || iban.isEmpty()) {
            throw new CuentaException("IBAN no válido");
        }
        this.iban = iban;
        this.titular = titular;
        this.saldo = 0;
        this.movimientos = new ArrayList<>();
    }

    public String getIban() {
        return iban;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<String> getMovimientos() {
        return movimientos;
    }

    public void ingresar(double cantidad) throws AvisarHaciendaException, CuentaException {
        if (cantidad <= 0) {
            throw new CuentaException("Cantidad a ingresar no válida");
        }
        saldo += cantidad;
        movimientos.add("Ingreso: " + cantidad + "€");
        if (cantidad >= 3000) {
            throw new AvisarHaciendaException("Ingreso de " + cantidad + "€ en cuenta de " + titular + " (IBAN: " + iban + ")");
        }
    }

    public void retirar(double cantidad) throws CuentaException {
        if (cantidad <= 0 || cantidad > saldo) {
            throw new CuentaException("Fondos insuficientes o cantidad no válida");
        }
        saldo -= cantidad;
        movimientos.add("Retirada: " + cantidad + "€");
    }

}
