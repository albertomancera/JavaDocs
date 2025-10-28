package prog.unidad04.actividad403.ejercicio03;

/**
 * Clase que representa una lavadora
 */
public class Lavadora {

  // Colores válidos
  /**
   * Color de lavdora blanco
   */
  public static final String COLOR_BLANCO = "blanco";
  /**
   * Color de lavdora negro
   */
  public static final String COLOR_NEGRO = "negro";
  /**
   * Color de lavdora rojo
   */
  public static final String COLOR_ROJO = "rojo";
  /**
   * Color de lavdora azul
   */
  public static final String COLOR_AZUL = "azul";
  /**
   * Color de lavdora gris
   */
  public static final String COLOR_GRIS = "gris";
  
  // Letra mínima y máxima de consumo
  private static final char CONSUMO_MINIMO = 'A';
  private static final char CONSUMO_MAXIMO = 'F';
  
  // Valores por defecto
  private static final double DEFECTO_PRECIO_BASE = 200;
  private static final String DEFECTO_COLOR = COLOR_BLANCO;
  private static final char DEFECTO_CONSUMO_ENERGETICO = CONSUMO_MAXIMO;
  private static final double DEFECTO_PESO = 15;
  private static final double DEFECTO_CARGA = 5;
  
  // Plus de precio por consumo energetico
  private static final double PRECIO_CONSUMO_A = 100;
  private static final double PRECIO_CONSUMO_B = 80;
  private static final double PRECIO_CONSUMO_C = 60;
  private static final double PRECIO_CONSUMO_D = 50;
  private static final double PRECIO_CONSUMO_E = 30;
  private static final double PRECIO_CONSUMO_F = 10;
  
  // Tramos de peso y el plus de precio de cada uno
  private static final double PESO_TRAMO_1 = 20;
  private static final double PESO_TRAMO_2 = 50;
  private static final double PESO_TRAMO_3 = 80;
  private static final double PRECIO_PESO_TRAMO_1 = 10;
  private static final double PRECIO_PESO_TRAMO_2 = 50;
  private static final double PRECIO_PESO_TRAMO_3 = 80;
  private static final double PRECIO_PESO_TRAMO_4 = 100;

  // Limite de carga y el plus de precio 
  private static final double LIMITE_CARGA = 30;
  private static final double PRECIO_EXCESO_CARGA = 50;
  
  // Precio base 
  private double precioBase;
  // Color
  private String color;
  // Consumo energético
  private char consumoEnergetico;
  // Peso
  private double peso;
  // Carga maxima
  private double carga;
  
  /**
   * Constructor por defecto. Usa los valores por defecto:<br>
   * <ul>
   * <li>precioBase = 200</li>
   * <li>color = "blanco"</li>
   * <li>consumoEnergetico = 'F'</li>
   * <li>peso = 15</li>
   * <li>carga = 5</li>
   * </ul>
   */
  public Lavadora() {
    this(DEFECTO_PRECIO_BASE, DEFECTO_COLOR, DEFECTO_CONSUMO_ENERGETICO, DEFECTO_PESO, DEFECTO_CARGA);
  }

  /**
   * Constructor con precio y peso<br>
   * Para el resto usa los valores por defecto:
   * <ul>
   * <li>color = "blanco"</li>
   * <li>consumoEnergetico = 'F'</li>
   * <li>carga = 5</li>
   * </ul>
   * @param precioBase Precio base de la nueva lavadora. Debe ser positivo
   * @param peso Peso de la nueva lavadora. Debe ser mayor que cero
   * @throws IllegalArgumentException si alguno de los parámetros no es válido
   */
  public Lavadora(double precioBase, double peso) {
    this(precioBase, DEFECTO_COLOR, DEFECTO_CONSUMO_ENERGETICO, peso, DEFECTO_CARGA);
  }

  /**
   * Constructor con todos los valores
   * @param precioBase Precio base. Debe ser positivo
   * @param color Color. Debe ser uno de "blanco", "negro", "azul", "rojo", "gris"
   * @param consumoEnergetico Consumo energético. Debe ser una letra entre la 'A' y la 'F', ambas incluidas y en mayúsculas
   * @param peso Peso. Debe ser mayor de cero
   * @param carga Carga máxima de la lavadora. Debe ser mayor de cero
   * @throws IllegalArgumentException Si alguno de los parámetros es correcto
   */
  public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
    if (precioBase < 0) {
      throw new IllegalArgumentException();
    }
    this.precioBase = precioBase;
    if (!color.equals(COLOR_BLANCO) && !color.equals(COLOR_NEGRO) && !color.equals(COLOR_ROJO)
        && !color.equals(COLOR_AZUL) && !color.equals(COLOR_GRIS)) {
      throw new IllegalArgumentException("Color inválido");
    }
    this.color = color;
    if ((consumoEnergetico < CONSUMO_MINIMO) || (consumoEnergetico > CONSUMO_MAXIMO)) {
      throw new IllegalArgumentException("Consumo energético inválido");
    }
    this.consumoEnergetico = consumoEnergetico;
    if (peso <= 0) {
      throw new IllegalArgumentException("Peso negativo");
    }
    this.peso = peso;
    if (carga <= 0) {
      throw new IllegalArgumentException("Carga negativa");
    }
    this.carga = carga;
  }

  /**
   * Obtiene el precio base de la lavadora
   * @return Precio base de la lavadora
   */
  public double getPrecioBase() {
    return precioBase;
  }

  /**
   * Obtiene el color de la lavadora
   * @return color de la lavadora
   */
  public String getColor() {
    return color;
  }

  /**
   * Obtiene el consumo energético de la lavadora
   * @return Consumo energético de la lavadora
   */
  public char getConsumoEnergetico() {
    return consumoEnergetico;
  }

  /**
   * Obtiene el peso de la lavadora
   * @return Peso de la lavadora
   */
  public double getPeso() {
    return peso;
  }

  /**
   * Obtiene la carga máxima de la lavadora
   * @return Carga máxima de la lavadora
   */
  public double getCarga() {
    return carga;
  }
  
  /**
   * Obtiene el precio final de la lavadora.<br>
   * El precio final se obtiene sumando al precio base un plus según el consumo
   * energético, el peso y la carga máxima
   * @return Precio final de la lavadora
   */
  public double getPrecioFinal() {
    // Precio inicial es el precio base
    double precio = precioBase;
    // Añadimos el plus por el consumo energético
    switch (consumoEnergetico) {
      case 'A':
        precio += PRECIO_CONSUMO_A;
        break;
      case 'B':
        precio += PRECIO_CONSUMO_B;
        break;
      case 'C':
        precio += PRECIO_CONSUMO_C;
        break;
      case 'D':
        precio += PRECIO_CONSUMO_D;
        break;
      case 'E':
        precio += PRECIO_CONSUMO_E;
        break;
      case 'F':
        precio += PRECIO_CONSUMO_F;
        break;
      default:
        System.out.println("Error. Consumo energético no válido (" + consumoEnergetico + ")");
        break;
    }
    
    // Añadimos el plus por peso
    if (peso < PESO_TRAMO_1) {
      precio += PRECIO_PESO_TRAMO_1;
    } else if ((peso >= PESO_TRAMO_1) && (peso < PESO_TRAMO_2)) {
      precio += PRECIO_PESO_TRAMO_2;
    } else if ((peso >= PESO_TRAMO_2) && (peso < PESO_TRAMO_3)) {
      precio += PRECIO_PESO_TRAMO_3;
    } else {
      precio += PRECIO_PESO_TRAMO_4;
    }
    
    // Y por último añadimos plus por carga
    if (carga > LIMITE_CARGA) {
      precio += PRECIO_EXCESO_CARGA;
    }
    
    // Devuelve el precio final
    return precio;
  }
}

package prog.unidad04.practica406.libreria;

/**
 * Excepción personalizada para manejar errores con fechas no válidas.
 */
public class FechaException extends Exception {
    public FechaException(String mensaje) {
        super(mensaje);
    }
}

/**
 * Representa una fecha a partir del 1/1/1900.
 * Proporciona métodos para realizar operaciones como comparar fechas,
 * calcular días transcurridos y determinar si un año es bisiesto.
 */
public class Fecha {
    private int dia;   // Día del mes
    private int mes;   // Mes del año (1-12)
    private int anyo;  // Año (>= 1900)

    /**
     * Constructor que inicializa una fecha con día, mes y año.
     *
     * @param dia  Día del mes (1-31 dependiendo del mes y año).
     * @param mes  Mes del año (1-12).
     * @param anyo Año (debe ser mayor o igual a 1900).
     */
    public Fecha(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    /**
     * Determina si el año de esta fecha es bisiesto.
     *
     * @return {@code true} si el año es bisiesto, {@code false} en caso contrario.
     */
    public boolean esBisiesto() {
        return (anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0);
    }

    /**
     * Determina si un año específico es bisiesto.
     *
     * @param anyo Año a evaluar.
     * @return {@code true} si el año es bisiesto, {@code false} en caso contrario.
     */
    private boolean esBisiesto(int anyo) {
        return (anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0);
    }

    /**
     * Calcula el número de días transcurridos desde el 1/1/1900 hasta esta fecha.
     *
     * @return Número total de días transcurridos desde el inicio del calendario.
     */
    public long diasTranscurridos() {
        long diasTotales = 0;

        // Sumar días de los años completos
        for (int i = 1900; i < this.anyo; i++) {
            diasTotales += esBisiesto(i) ? 366 : 365;
        }

        // Sumar días de los meses completos del año actual
        for (int i = 1; i < this.mes; i++) {
            // Determinamos el número de días del mes según el año
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                diasTotales += 31; // Meses con 31 días
            } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                diasTotales += 30; // Meses con 30 días
            } else if (i == 2) {
                diasTotales += esBisiesto(this.anyo) ? 29 : 28; // Febrero (28 o 29 días)
            }
        }

        // Sumar días del mes actual
        diasTotales += this.dia;

        return diasTotales;
    }

    /**
     * Calcula la diferencia en días entre esta fecha y otra.
     *
     * @param otraFecha Fecha a comparar.
     * @return Diferencia en días entre las dos fechas.
     * @throws FechaException Si la fecha proporcionada es anterior a la fecha actual.
     */
    public long diasEntre(Fecha otraFecha) throws FechaException {
        long diasDiferencia = this.diasTranscurridos() - otraFecha.diasTranscurridos();
        
        if (diasDiferencia < 0) {
            // Lanzamos la excepción si la fecha proporcionada es anterior a la fecha actual
            throw new FechaException("La fecha proporcionada es anterior a la fecha actual.");
        }
        
        return diasDiferencia;
    }

    /**
     * Compara esta fecha con otra fecha.
     *
     * @param otraFecha Fecha a comparar.
     * @return {@code 1} si esta fecha es mayor, {@code 0} si son iguales,
     *         {@code -1} si esta fecha es menor.
     */
    public int compara(Fecha otraFecha) {
        if (this.anyo > otraFecha.anyo ||
            (this.anyo == otraFecha.anyo && this.mes > otraFecha.mes) ||
            (this.anyo == otraFecha.anyo && this.mes == otraFecha.mes && this.dia > otraFecha.dia)) {
            return 1; // Esta fecha es mayor
        } else if (this.anyo == otraFecha.anyo && this.mes == otraFecha.mes && this.dia == otraFecha.dia) {
            return 0; // Las fechas son iguales
        } else {
            return -1; // Esta fecha es menor
        }
    }

    /**
     * Obtiene el día de esta fecha.
     *
     * @return Día de la fecha.
     */
    public int getDia() {
        return dia;
    }

    /**
     * Obtiene el mes de esta fecha.
     *
     * @return Mes de la fecha.
     */
    public int getMes() {
        return mes;
    }

    /**
     * Obtiene el año de esta fecha.
     *
     * @return Año de la fecha.
     */
    public int getAnyo() {
        return anyo;
    }

    /**
     * Devuelve una representación en texto de la fecha en el formato:
     * "DD de MMMM de AAAA".
     * <p>
     * Ejemplo de salida: "05 de marzo de 2024".
     *
     * @return Una cadena que representa la fecha en formato legible.
     */
    @Override
    public String toString() {
        String nombreMes;

        // Determina el nombre del mes basado en su número
        switch (mes) {
            case 1:  nombreMes = "enero"; break;
            case 2:  nombreMes = "febrero"; break;
            case 3:  nombreMes = "marzo"; break;
            case 4:  nombreMes = "abril"; break;
            case 5:  nombreMes = "mayo"; break;
            case 6:  nombreMes = "junio"; break;
            case 7:  nombreMes = "julio"; break;
            case 8:  nombreMes = "agosto"; break;
            case 9:  nombreMes = "septiembre"; break;
            case 10: nombreMes = "octubre"; break;
            case 11: nombreMes = "noviembre"; break;
            case 12: nombreMes = "diciembre"; break;
            default: nombreMes = "mes inválido";
        }

        // Formatea la fecha en formato "DD de MMMM de AAAA"
        String diaConFormato = (dia < 10 ? "0" + dia : String.valueOf(dia));
        return diaConFormato + " de " + nombreMes + " de " + anyo;
    }
}
