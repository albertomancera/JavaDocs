package prog.unidad04.actividad403.ejercicio01.pruebas;

import prog.unidad04.actividad403.ejercicio01.Pizza;
import prog.unidad04.actividad403.ejercicio01.PizzaAlreadyServedException;

/**
 * Prueba la clase Pizza
 */
public class PruebaPizza {
  public static void main(String[] args) {
    
    // Cabecera
    System.out.println("PROGRAMA DE PRUEBA DE PIZZAS 2");

    // Creamos dos pizzas distintas
    Pizza pizza1 = new Pizza("mediana", "margarita");
    Pizza pizza2 = new Pizza("familiar", "funghi");
    
    // Intentamos crear pizzas con valores erróneos y debe lanzar excepciones
    try {
      Pizza pizzaErronea1 = new Pizza("grande", "margarita");
      System.out.println("Error. Se ha creado una pizza con valores erróneos");
    } catch (IllegalArgumentException e) {
      System.out.printf("Se ha intentando crear una pizza con valores erróneos y ha fallado con el error: \"%s\"%n", e.getMessage());
    }
    try {
      Pizza pizzaErronea2 = new Pizza("mediana", "barbacoa");
      System.out.println("Error. Se ha creado una pizza con valores erróneos");
    } catch (IllegalArgumentException e) {
      System.out.printf("Se ha intentando crear una pizza con valores erróneos y ha fallado con el error: \"%s\"%n", e.getMessage());
    }
    
    // Servimos la segunda pizza. Puede pero no debería lanzar una excepcion
    try {
      pizza2.sirve();
      System.out.println("La pizza se sirvió con éxito");
    } catch (PizzaAlreadyServedException e) {
      System.out.println("Error. La pizza no debía estar servida aun");
    }
    
    // Creamos otra pizza mas
    Pizza pizza3 = new Pizza("mediana", "cuatro quesos");
    
    // Imprimimos las pizzas
    System.out.printf("Pizza 1. %s%n", pizza1);
    System.out.printf("Pizza 2. %s%n", pizza2);
    System.out.printf("Pizza 3. %s%n", pizza3);

    // Servimos la segunda pizza (otra vez). Debe producir una excepcion
    try {
      pizza2.sirve();
      System.out.println("Error. La pizza se sirvió dos veces");
    } catch (PizzaAlreadyServedException e) {
      System.out.println("Ok. La pizza ya se había servido y ha fallado al hacerlo otra vez");
    }
    
    // Mostramos el número de pizzas creadas y servidas
    System.out.printf("Número de pizzas creadas: %d%n", Pizza.getPizzasCreadas());
    System.out.printf("Número de pizzas servidas: %d%n", Pizza.getPizzasServidas());
  }

}
