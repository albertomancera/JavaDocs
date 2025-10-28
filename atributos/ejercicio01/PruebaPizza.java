package prog.unidad04.atributos.ejercicio01;

import java.util.Scanner;

/**
 * Prueba la clase Pizza
 */
public class PruebaPizza {

  /**
   * Punto de entrada a la aplicación
   * @param args
   */
  public static void main(String[] args) {
    // Creamos Scanner para leer desde teclado
    Scanner sc = new Scanner(System.in);
    
    // Mostramos cabecera
    System.out.println("PROGRAMA DE MANEJO DE PIZZAS");
    // Solicitamos la cantidad de pizzas a crear (debe ser mayor o igual a 1)
    int pizzasACrear = 0;
    do {
      // 
      try {
        System.out.print("Introduzca la cantidad de pizzas a crear (1 o mas): ");
        pizzasACrear = Integer.parseInt(sc.nextLine());
        // Si valor no valido
        if (pizzasACrear < 1) {
          // Mensaje
          System.out.println("El valor no es válido. Debe introducir un número entero mayor que cero. Inténtelo de nuevo");
        }
      } catch (NumberFormatException e) {
        // Mensaje
        System.out.println("El valor no es válido. Debe introducir un número entero mayor que cero. Inténtelo de nuevo");
      }
    } while (pizzasACrear < 1);
    
    // Para cada pizza
    for (int i = 0; i < pizzasACrear; i++) {
      // Creamos la pizza
      Pizza pizza = new Pizza();
      // Solicitamos los datos de la pizza (no vamos a chequear mucho lo que se introduce)
      System.out.print("Introduce el tamaño de la pizza " + (i + 1) + " (mediana / familiar): ");
      pizza.tamanyo = sc.nextLine();
      System.out.print("Introduce el tipo de la pizza " + (i + 1) + " (margarita / cuatro quesos / funghi): ");
      pizza.tipo = sc.nextLine();
      // El estao inicialmente es pedida
      pizza.estado = "pedida";
      // Añadimos 1 al número de pizzas creadas
      Pizza.pizzasCreadas++;
      // Preguntamos si la pizza se debe servir o no
      System.out.print("¿Servir la pizza? (s/n): ");
      char respuesta = sc.nextLine().charAt(0);
      if (respuesta == 's') {
        pizza.estado = "servida";
        Pizza.pizzasServidas++;
      }
      
      // Imprimirmos la pizza
      System.out.println("Datos de la pizza " + (i + 1));
      System.out.println("Tamaño: " + pizza.tamanyo);
      System.out.println("Tipo: " + pizza.tipo);
      System.out.println("Estado: " + pizza.estado);
      // Y el estao general (pizzas creadas y servidas)
      System.out.println("Pizzas totales creadas: " + Pizza.pizzasCreadas);
      System.out.println("Pizzas totales servidas: " + Pizza.pizzasServidas);
    }
      
    
  }

}
