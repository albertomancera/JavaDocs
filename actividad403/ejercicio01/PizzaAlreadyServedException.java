package prog.unidad04.actividad403.ejercicio01;

/**
 * Excepción que se lanza cuando una pizza se intenta servir 
 * y ya estaba servida
 */
public class PizzaAlreadyServedException extends Exception {

  public PizzaAlreadyServedException() {
    super();
  }

  public PizzaAlreadyServedException(String message) {
    super(message);
  }

}
