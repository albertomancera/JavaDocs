package prog.unidad04.actividad403.ejercicio06;

/**
 * Excepción que indica que no hay fondos suficientes para hacer una operación
 */
public class InsufficientFundsException extends RuntimeException {

  public InsufficientFundsException() {
  }
  
  public InsufficientFundsException(String message) {
    super(message);
  }

}
