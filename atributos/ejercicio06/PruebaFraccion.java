package prog.unidad04.atributos.ejercicio06;

import java.util.Scanner;

/**
 * Prueba la clase Fraccion
 */
public class PruebaFraccion {

  /**
   * Punto de entrada a la aplicación
   * @param args
   */
  public static void main(String[] args) {
    // Creamos Scanner para leer desde teclado
    Scanner sc = new Scanner(System.in);
    
    // Mostramos cabecera
    System.out.println("PROGRAMA DE MANEJO DE FRACCIONES");
    // Solicitamos la cantidad de fracciones a crear (debe ser mayor o igual a 1)
    int fraccionesACrear = 0;
    do {
      // 
      try {
        System.out.print("Introduzca la cantidad de fracciones a crear (1 o mas): ");
        fraccionesACrear = Integer.parseInt(sc.nextLine());
        // Si valor no valido
        if (fraccionesACrear < 1) {
          // Mensaje
          System.out.println("El valor no es válido. Debe introducir un número entero mayor que cero. Inténtelo de nuevo");
        }
      } catch (NumberFormatException e) {
        // Mensaje
        System.out.println("El valor no es válido. Debe introducir un número entero mayor que cero. Inténtelo de nuevo");
      }
    } while (fraccionesACrear < 1);
    
    // Para cada fraccion
    for (int i = 0; i < fraccionesACrear; i++) {
      // Creamos la fraccion
      Fraccion fraccion = new Fraccion();
      // Solicitamos los datos de la fraccion (no vamos a chequear mucho lo que se introduce, excepto que el denominador no sea cero)
      System.out.print("Introduce el numerador de la fracción " + (i + 1) + ": ");
      fraccion.numerador = Integer.parseInt(sc.nextLine());
      System.out.print("Introduce el denominador de la fracción " + (i + 1) + ": ");
      fraccion.denominador = Integer.parseInt(sc.nextLine());
      // Si el denominador es cero
      if (fraccion.denominador == 0) {
        // Mostramos un error 
        System.out.println("Error. La fraccion no puede tener un denominador negativo");
      } else {
        // Imprimirmos la fraccion
        System.out.println("Datos de la Fraccion " + (i + 1));
        System.out.println("Numerador: " + fraccion.numerador);
        System.out.println("Denominador: " + fraccion.denominador);
      }
    }
  }
}
