/*
 * Objetivo: Crear la clase PlayamarBank
 * Autor: Álvaro Mozo Gaspar
 * Fecha: 03/03/2025
 */
package ejercicio7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayamarBank {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
        String iban, titular;
        CuentaBancaria cuenta;
        System.out.println("CUENTA BANCARIA:");
        System.out.println("Introduzca el IBAN:");
        iban = teclado.nextLine();
        System.out.println("Introduzca el titular:");
        titular = teclado.nextLine();
        try {
            cuenta = new CuentaBancaria(iban, titular);
            System.out.println("Cuenta creada correctamente");
        } catch (CuentaException excepcion1) {
            System.out.printf("Error: %s\n", excepcion1.getMessage());
            iban = CuentaBancaria.IBAN_DEFAULT;
            System.out.printf("IBAN por omisión: %s\n", CuentaBancaria.IBAN_DEFAULT);
            try {
                cuenta = new CuentaBancaria(iban, titular);
                System.out.println("Cuenta creada correctamente");
            } catch (CuentaException e) {
                System.out.println("Error al crear la cuenta por omisión");
                return;
            }
        }
        int opcion;
        do {
            System.out.println();
            System.out.println("Menú Principal:");
            System.out.println("1. Datos de la cuenta");
            System.out.println("2. IBAN");
            System.out.println("3. Titular");
            System.out.println("4. Saldo");
            System.out.println("5. Ingreso");
            System.out.println("6. Retirada");
            System.out.println("7. Movimientos");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine();
            try {
                switch (opcion) {
                    case 1:
                        System.out.println("IBAN: " + cuenta.getIban());
                        System.out.println("Titular: " + cuenta.getTitular());
                        System.out.println("Saldo: " + cuenta.getSaldo() + "€");
                        break;
                    case 2:
                        System.out.println("IBAN: " + cuenta.getIban());
                        break;
                    case 3:
                        System.out.println("Titular: " + cuenta.getTitular());
                        break;
                    case 4:
                        System.out.println("Saldo: " + cuenta.getSaldo() + "€");
                        break;
                    case 5:
                        System.out.print("Cantidad a ingresar: ");
                        double ingreso = teclado.nextDouble();
                        cuenta.ingresar(ingreso);
                        break;
                    case 6:
                        System.out.print("Cantidad a retirar: ");
                        double retirada = teclado.nextDouble();
                        cuenta.retirar(retirada);
                        break;
                    case 7:
                        System.out.println("Historial de movimientos:");
                        for (String movimiento : cuenta.getMovimientos()) {
                            System.out.println(movimiento);
                        }
                        break;
                    case 8:
                        System.out.println("FIN DEL PROGRAMA");
                        break;
                    default:
                        System.out.println("Opción no válida, inténtelo de nuevo");
                }
            } catch (CuentaException | AvisarHaciendaException e) {
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace();
            }
        } while (opcion != 8);
        teclado.close();

	}

}
