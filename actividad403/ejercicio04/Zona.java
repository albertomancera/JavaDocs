package prog.unidad04.actividad403.ejercicio04;

/**
 * Zona de asientos en un teatro
 */
public class Zona {

  // Número de entradas por vender en la zona
  private int entradasPorVender;
  
  /**
   * Crea una zona con el número de entradas por vender especificado
   * @param entradasIniciales Número inicial de entradas por vender. Debe ser superior a cero
   * @throws ZonaException Si el número inicial de entradas es inferior a 1
   */
  public Zona(int entradasIniciales) throws ZonaException {
    // Si el número de entradas es superior a cero
    if (entradasIniciales > 0) {
      // Inicializael número de entradas
      entradasPorVender = entradasIniciales;
    } else {
      // Lanza una excepción
      throw new ZonaException("El número de entradas iniciales es menor que 1");
    }
  }
  
  /**
   * Obtiene el número de entradas por vender
   * @return Número de entradas por vender en la zona
   */
  public int getEntradasPorVender() {
    return entradasPorVender;
  }
  
  /**
   * Intenta vender el número de entradas indicado, si es que quedan suficientes
   * @param entradas Número de entradas a vender
   * @throws ZonaException Si no hay suficientes entradas para satisfacer la venta
   */
  public void vender(int entradas) throws ZonaException {
    // Si hay entradas suficientes
    if (entradasPorVender >= entradas) {
      // Restamos las que vendemos
      entradasPorVender -= entradas;
    } else {
      // No hay suficientes entradas
      // Lanzamos excepcion
      throw new ZonaException("No hay suficientes entradas para realizar la venta");
    }
  }
}
