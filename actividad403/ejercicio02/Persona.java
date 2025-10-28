package prog.unidad04.actividad403.ejercicio02;

import java.util.Random;

/**
 * Clase que representa a una persona
 */
public class Persona {
  
  // Valores válidos para sexo
  private static final char SEXO_HOMBRE = 'H';
  private static final char SEXO_MUJER = 'M';
  
  
  // Valores por defecto
  private static final String NOMBRE_POR_DEFECTO = "";
  private static final int EDAD_POR_DEFECTO = 0;
  private static final char SEXO_POR_DEFECTO = SEXO_MUJER;
  private static final double PESO_POR_DEFECTO = 0;
  private static final double ALTURA_POR_DEFECTO = 0;
  
  // Limites del IMC
  private static final int IMC_MINIMO = 20;
  private static final int IMC_MAXIMO = 25;
  
  /**
   * Nombre de la persona
   */
  private String nombre;
  /**
   * Edad de la persona
   */
  private int edad;
  
  /**
   * DNI de la persona. Debería ser 8 números y una letra
   */
  private String dni;
  
  /**
   * Sexo de la persona. Debe ser H o M
   */
  private char sexo;
  
  /**
   * Peso de la persona. Debería ser positivo
   */
  private double peso;
  
  /**
   * Altura de la persona, en metros
   */
  private double altura;

  /**
   * Constructor por defecto
   * Crea el objeto con los siguientes valores:<ul>
   * <li>nombre = ""</li>
   * <li>edad = 0</li>
   * <li>sexo = 'M'</li>
   * <li>peso = 0</li>
   * <li>altura = 0</li>
   * <li>DNI = Valor generado al azar</li>
   * </ul>
   */
  public Persona() {
    // Usamos los valores por defecto
    nombre = NOMBRE_POR_DEFECTO;
    edad = EDAD_POR_DEFECTO;
    sexo = SEXO_POR_DEFECTO;
    peso = PESO_POR_DEFECTO;
    altura = ALTURA_POR_DEFECTO;
    // Generamos el DNI
    dni = generarDNI();
  }

  /**
   * Constructor con algunos parámetros. El resto toma los valores por defecto
   * @param nombre Nombre de la nueva persona
   * @param edad Edad de la nueva persona. Debe ser positiva
   * @param sexo sexo de la nueva persona. Debe ser 'H' o 'M'.
   * @throws IllegalArgumentException Si edad o sexo no son válidos
   */
  public Persona(String nombre, int edad, char sexo) {
    // Usa el constructor por defecto
    this();

    // Si la edad y sexo son válidos
    if ((edad >= 0) && ((sexo == SEXO_HOMBRE) || (sexo == SEXO_MUJER))){
      // Actualiza los atributos
      // Ahora modifica los atributos que se nos han dado para inicializar
      this.nombre = nombre;
      this.edad = edad;
      this.sexo = sexo;
    } else {
      // Algún valor de atributo no es válido. Lanzamos excepción
      throw new IllegalArgumentException("Edad o sexo no válidos");
    }
  }

  /**
   * Constructor con todos los parámetros
   * @param nombre Nombre de la nueva persona
   * @param edad Edad de la nueva persona. Debe ser positiva
   * @param sexo Sexo de la nueva persona Debe ser 'H' o 'M'
   * @param peso Peso de la persona (en kilogramos). Debe ser positivo
   * @param altura Altura de la persona (en metros). Debe ser positivo
   * @throws IllegalArgumentException Si edad, sexo, peso o altura no son válidos
   */
  public Persona(String nombre, int edad, char sexo, double peso, double altura) {
    // Usa al constructor de tres parametros
    this(nombre, edad, sexo);
    
    // Si el peso y la altura son válidos
    if ((peso >= 0) && (altura >= 0)) {
      // Las guarda
      this.peso = peso;
      this.altura = altura;
    } else {
      // Lanza una excepción
      throw new IllegalArgumentException("Peso o altura negativos");
    }
  }
  
  /**
   * Obtiene el Indice de Masa Corporal (IMC) de la persona según su peso y altura
   * @return Indice de masa corporal de la persona
   */
  public double getIMC() {
    // Si la altura no es cero
    if (altura != 0) {
      // Calcula y devuelve el IMC
      return peso / (altura * altura);
    } else {
      // Devolvemos cero
      return 0;
    }
  }
  
  /**
   * Determina si la persona tiene o no el peso correcto
   * @return -1 si el peso es inferior al correcto, 0 si el peso es correcto y 1 si el peso es superior al correcto
   */
  public int getPesoCorrecto() {
    // Calcula el IMC
    double imc = getIMC();
    
    // Si es menor que el minimo
    if (imc < IMC_MINIMO) {
      // Infrapeso
      return -1;
    } else if (imc > IMC_MAXIMO) {
      // Sobreperos
      return 1;
    } else {
      // Peso ideal
      return 0;
    }
  }

  /**
   * Determina si la persona es o no mayor de edad
   * @return true si la persona es mayor de edad o false si no lo es
   */
  public boolean esMayorDeEdad() {
    return edad >= 18;
  }

  /**
   * Obtiene una representación en cadena de la persona en formato:<br>
   * <code>Nombre: "NNNN", Edad: EEEE, Sexo: S, Peso: PPPP, Altura: AAAA</code><br>
   * donde <code>NNNN</code> es el nombre de la persona, <code>EEEE</code> es
   * la edad, <code>S</code> es el sexo (H o M), <code>PPPP</code> es el peso
   * y <code>AAAA</code> es la altura.
   * @return Cadena con la información de la persona
   */
  public String toString() {
    // Obtiene la representacion
    return "Nombre: \"" + nombre  + "\", Edad: " + edad + ", Sexo: " + sexo + ", Peso: " + peso + ", Altura: " + altura + ", DNI: " + dni;
  }
  
  /**
   * Genera un DNI de forma aleatoria, con letra y todo
   * @return DNI generado aleatoriamente
   */
  private String generarDNI() {
    // DNI en construcciom
    String dni = "";
    // Generador de numeros aleatorios
    Random generador = new Random();

    // Para cada dígito del DNI
    for (int i = 0; i < 8; i++) {
      // Lo genera
      int digito = generador.nextInt(0, 10);
      // Añade el dígito al dni
      dni += digito;
    }
    // Por último añade la letra
    dni += getLetraDNI(dni);
    // Devuelve el DNI
    return dni;
  }

  /**
   * Calcula la letra de un DNI
   * @param dni DNI (solo números)
   * @return Letra del DNI correspondiente al número
   */
  private char getLetraDNI(String dni) {
    // Convierte el DNI a entero
    int dniEnNumero = Integer.parseInt(dni);
    // Obtiene el módulo 23
    int modulo = dniEnNumero % 23;
    // Obtiene la letra correspondiente al número
    switch(modulo) {
      case 0: return 'T';
      case 1: return 'R';
      case 2: return 'W';
      case 3: return 'A';
      case 4: return 'G';
      case 5: return 'M';
      case 6: return 'Y';
      case 7: return 'F';
      case 8: return 'P';
      case 9: return 'D';
      case 10: return 'X';
      case 11: return 'B';
      case 12: return 'N';
      case 13: return 'J';
      case 14: return 'Z';
      case 15: return 'S';
      case 16: return 'Q';
      case 17: return 'V';
      case 18: return 'H';
      case 19: return 'L';
      case 20: return 'C';
      case 21: return 'K';
      case 22: return 'E';
      default: return 'A';
    }
  }
}
