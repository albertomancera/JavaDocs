package prog.unidad04.atributos.ejercicio05;

import java.util.Scanner;

/**
 * Prueba la clase IntervaloTiempo
 */
public class PruebaIntervaloTiempo {

  /**
   * Punto de entrada a la aplicación
   * @param args
   */
  public static void main(String[] args) {
    // Creamos Scanner para leer desde teclado
    Scanner sc = new Scanner(System.in);
    
    // Mostramos cabecera
    System.out.println("PROGRAMA DE MANEJO DE INTERVALOS DE TIEMPO");
    // Solicitamos la cantidad de intervalos a crear (debe ser mayor o igual a 1)
    int intervalosACrear = 0;
    do {
      // 
      try {
        System.out.print("Introduzca la cantidad de intervalos a crear (1 o mas): ");
        intervalosACrear = Integer.parseInt(sc.nextLine());
        // Si valor no valido
        if (intervalosACrear < 1) {
          // Mensaje
          System.out.println("El valor no es válido. Debe introducir un número entero mayor que cero. Inténtelo de nuevo");
        }
      } catch (NumberFormatException e) {
        // Mensaje
        System.out.println("El valor no es válido. Debe introducir un número entero mayor que cero. Inténtelo de nuevo");
      }
    } while (intervalosACrear < 1);
    
    // Para cada fraccion
    for (int i = 0; i < intervalosACrear; i++) {
      // Creamos el intervalo
      IntervaloTiempo intervalo = new IntervaloTiempo();
      // Solicitamos los datos del intervalo (chequeamos que los valores sean aceptables)
      System.out.print("Introduce la cantidad de horas del intervalo " + (i + 1) + " (Mayor o igual a cero): ");
      intervalo.horas = Integer.parseInt(sc.nextLine());
      // Si el número de horas no es válido
      if (intervalo.horas < 0) {
        // Mostramos error
        System.out.println("Error. El número de horas debe ser mayor o igual a cero");
      } else {
        // Solicitamos los minutos
        System.out.print("Introduce la cantidad de minutos del intervalo " + (i + 1) + " (0-59): ");
        intervalo.minutos = Integer.parseInt(sc.nextLine());
        // Si el número de minutos no es válido
        if ((intervalo.minutos < 0) || (intervalo.minutos > 59)) {
          // Mostramos el error
          System.out.println("Error. El número de minutos no está en el intervalo 0-59");
        } else {
          // Solicitamos los segundos
          System.out.print("Introduce la cantidad de segundos del intervalo " + (i + 1) + " (0-59): ");
          intervalo.segundos = Integer.parseInt(sc.nextLine());
          // Si el número de segundos no es válido
          if ((intervalo.segundos < 0) || (intervalo.segundos > 59)) {
            // Mostramos error
            System.out.println("Error. El número de segundos no está en el intervalo 0-59");
          } else {
            // Todo correcto
            // Imprimimos el intervalor
            System.out.println("Datos del Intervalo " + (i + 1));
            System.out.println("Horas: " + intervalo.horas);
            System.out.println("Minutos: " + intervalo.minutos);
            System.out.println("Segundos: " + intervalo.segundos);
          }
        }
      }
    }
  }
}
