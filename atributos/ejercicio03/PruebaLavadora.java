package prog.unidad04.atributos.ejercicio03;

import java.util.Scanner;

/**
 * Prueba la clase Lavadora
 */
public class PruebaLavadora {

  // Colores
  private static final String COLOR_BLANCO = "blanco";
  private static final String COLOR_NEGRO = "negro";
  private static final String COLOR_ROJO = "rojo";
  private static final String COLOR_AZUL = "azul";
  private static final String COLOR_GRIS = "gris";

  /**
   * Punto de entrada a la aplicación
   * @param args
   */
  public static void main(String[] args) {
    // Creamos Scanner para leer desde teclado
    Scanner sc = new Scanner(System.in);
    
    // Mostramos cabecera
    System.out.println("PROGRAMA DE MANEJO DE LAVADORAS");
    // Solicitamos la cantidad de lavadoras a crear (debe ser mayor o igual a 1)
    int lavadorasACrear = 0;
    do {
      // 
      try {
        System.out.print("Introduzca la cantidad de lavadoras a crear (1 o mas): ");
        lavadorasACrear = Integer.parseInt(sc.nextLine());
        // Si valor no valido
        if (lavadorasACrear < 1) {
          // Mensaje
          System.out.println("El valor no es válido. Debe introducir un número entero mayor que cero. Inténtelo de nuevo");
        }
      } catch (NumberFormatException e) {
        // Mensaje
        System.out.println("El valor no es válido. Debe introducir un número entero mayor que cero. Inténtelo de nuevo");
      }
    } while (lavadorasACrear < 1);
    
    // Para cada lavadora
    for (int i = 0; i < lavadorasACrear; i++) {
      // Creamos la lavadora
      Lavadora lavadora = new Lavadora();
      // Solicitamos los datos de la lavadora
      System.out.println("Introduce los datos de la lavadora " + (i + 1));
      System.out.print("Introduce el precio base de la lavadora: ");
      lavadora.precioBase = Double.parseDouble(sc.nextLine());
      if (lavadora.precioBase > 0) {
        System.out.print("Introduce el color de la lavadora (debe ser uno de: blanco, negro, rojo, azul, gris): ");
        lavadora.color = sc.nextLine().toLowerCase();
        if (lavadora.color.equals(COLOR_BLANCO) || lavadora.color.equals(COLOR_NEGRO) || lavadora.color.equals(COLOR_ROJO)
          || lavadora.color.equals(COLOR_AZUL) || lavadora.color.equals(COLOR_GRIS)) {
          System.out.print("Introduce la calificación energética de la lavadora (sebe ser una letra mayúscula entre la A y la F, ambas incluidas): ");
          lavadora.calificacionEnergetica = sc.nextLine().toUpperCase().charAt(0);
          if ((lavadora.calificacionEnergetica >= 'A') && (lavadora.calificacionEnergetica <= 'F')) {
            System.out.print("Introduce el peso de la lavadora (en kilogramos. Debe ser mayor que cero): ");
            lavadora.peso = Double.parseDouble(sc.nextLine());
            if (lavadora.peso > 0) {
              System.out.print("Introduce la carga máxima de la lavadora (en kilogramos. Debe ser mayor que cero): ");
              lavadora.cargaMaxima = Double.parseDouble(sc.nextLine());
              if (lavadora.cargaMaxima > 0) {
                // Imprimirmos la lavadora
                System.out.println("Datos de la lavadora " + (i + 1));
                System.out.println("Precio base: " + lavadora.precioBase);
                System.out.println("Color: " + lavadora.color);
                System.out.println("Calificación Energética: " + lavadora.calificacionEnergetica);
                System.out.println("Peso: " + lavadora.peso);
                System.out.println("Carga Máxima: " + lavadora.cargaMaxima);
              } else {
                System.err.println("Error. La carga máxima de la lavadora debe ser mayor que cero");
              }
            } else {
              System.out.println("Error. El peso de la lavadora debe ser mayor que cero");
            }
          } else {
            System.out.println("Error. La calificación energética de la lavadora debe ser una letra entre A y F, ambas incluidas");
          }
        } else {
          System.out.println("Error. El color de la lavadora debe ser uno de: blanco, negro, rojo, azul o gris");
        }
      } else {
        System.out.println("Error. El precio de la lavadora debe ser mayor de cero");
      }
    }
  }
}
