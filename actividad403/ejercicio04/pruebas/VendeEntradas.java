package prog.unidad04.actividad403.ejercicio04.pruebas;

import java.util.Scanner;
import prog.unidad04.actividad403.ejercicio04.Zona;
import prog.unidad04.actividad403.ejercicio04.ZonaException;

/**
 * Usa la clase Zona para vender entradas de un teatro
 */
public class VendeEntradas {

  public static void main(String[] args) {
    
    // Asientos en cada zona
    final int ASIENTOSPLATEA = 150;
    final int ASIENTOSPALCO = 50;
    final int ASIENTOSATICO = 100;
    
    // OPCIONES DE MENU
    final int OPCIONMOSTRAR = 1;
    final int OPCIONVENDER = 2;
    final int OPCIONSALIR = 3;
    
    // Scanner para leer desde teclado
    Scanner sc = new Scanner(System.in);

    // Creamos las zonas con el número inicial de entradas
    Zona platea;
    Zona palco;
    Zona atico;
    try {
      platea = new Zona(ASIENTOSPLATEA);
      palco = new Zona(ASIENTOSPALCO);
      atico = new Zona(ASIENTOSATICO);
    } catch (ZonaException e) {
      // Esto no se debe producir, pero en caso que pase salimos inmediatamente con un mensaje
      System.out.println("Error. Se ha intentado crear una zona con menos de una entrada. Terminando");
      return;
    }

    // Iniciamos la opción del menú
    int opcion = 0;
    do {
      // Mostramos el menú
      System.err.println();
      System.out.println("GESTION DE ENTRADAS");
      System.out.println("-------------------");
      System.out.println("1.- Mostrar asientos libres por zona");
      System.out.println("2.- Vender asientos");
      System.out.println("3.- Salir del programa");
      System.out.print("Elija una opción (1, 2, 3): ");
      opcion = Integer.parseInt(sc.next());
      if (opcion == OPCIONMOSTRAR) {
        System.err.println();
        System.out.println("ASIENTOS LIBRES POR ZONA");
        System.out.println("------------------------");
        System.out.printf("Zona Platea: %d%n", platea.getEntradasPorVender());
        System.out.printf("Zona Palco: %d%n", palco.getEntradasPorVender());
        System.out.printf("Zona Ático: %d%n", atico.getEntradasPorVender());
      }
      if (opcion == OPCIONVENDER) {
        // Solicita zona y número de entradas
        System.out.println();
        System.out.println("VENTA DE ENTRADAS");
        System.out.println("-----------------");
        System.out.print("Seleccione la zona en la que se localizan los asientos a vender (1 = Platea, 2 = Palco, 3 = Ático): ");
        int numeroZona = Integer.parseInt(sc.next());
        System.out.print("Introduzca el número de asientos a vender: ");
        int asientos = Integer.parseInt(sc.next());
        // Si el numero de la zona es correcto
        if ((numeroZona >= 1) && (numeroZona <= 3)) {
          // Accede al objeto zona en cuestion
          Zona zona;
          if (numeroZona == 1) {
            zona = platea;
          } else if (numeroZona == 2) {
            zona = palco;
          } else {
            zona = atico;
          }
          // Intenta vender las entradas. Si no hay se lanza una excepcion
          try {
            zona.vender(asientos);
            System.out.println("Venta realizada correctamente");
          } catch (ZonaException e) {
            System.out.printf("No se pudo realizar la venta de entradas. La razon es: \"%s\"%n", e.getMessage());
          }
        }
      }
      if (opcion == OPCIONSALIR) {
        System.out.println("Saliendo del programa.....");
      }
    } while (opcion != OPCIONSALIR);
  }
  
}
