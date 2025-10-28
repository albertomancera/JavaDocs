package prog.unidad04.atributos.ejercicio04;

import java.util.Scanner;

/**
 * Prueba la clase Figura
 */
public class PruebaFigura {

  /**
   * Punto de entrada a la aplicación
   * @param args
   */
  public static void main(String[] args) {
    // Creamos Scanner para leer desde teclado
    Scanner sc = new Scanner(System.in);
    
    // Mostramos cabecera
    System.out.println("PROGRAMA DE MANEJO DE FIGURAS");
    // Solicitamos la cantidad de figuras a crear (debe ser mayor o igual a 1)
    int figurasACrear = 0;
    do {
      // 
      try {
        System.out.print("Introduzca la cantidad de figuras a crear (1 o mas): ");
        figurasACrear = Integer.parseInt(sc.nextLine());
        // Si valor no valido
        if (figurasACrear < 1) {
          // Mensaje
          System.out.println("El valor no es válido. Debe introducir un número entero mayor que cero. Inténtelo de nuevo");
        }
      } catch (NumberFormatException e) {
        // Mensaje
        System.out.println("El valor no es válido. Debe introducir un número entero mayor que cero. Inténtelo de nuevo");
      }
    } while (figurasACrear < 1);
    
    // Para cada figura
    for (int i = 0; i < figurasACrear; i++) {
      // Solicitamos el tipo de figura a crear
      System.out.print("¿Qué tipo de figura quieres crear? (t=triángulo, c=círculo, r=rectángulo): ");
      char figura = sc.nextLine().toLowerCase().charAt(0);
      // Si es un triángulo
      if (figura == 't') {
        // Creamos el triángulo
        Triangulo triangulo = new Triangulo();
        // Solicitamos los datos del primer vértice
        Punto punto = new Punto();
        System.out.print("Introduce la coordenada X del primer vértice del triángulo: ");
        punto.x = Double.parseDouble(sc.nextLine());
        System.out.print("Introduce la coordenada Y del primer vértice del triángulo: ");
        punto.y = Double.parseDouble(sc.nextLine());
        // Asigna el primer vértice y crea el siguiente
        triangulo.primerVertice = punto;
        punto = new Punto();
        // Solicitamos los datos del segundo vértice
        System.out.print("Introduce la coordenada X del segundo vértice del triángulo: ");
        punto.x = Double.parseDouble(sc.nextLine());
        System.out.print("Introduce la coordenada Y del segundo vértice del triángulo: ");
        punto.y = Double.parseDouble(sc.nextLine());
        // Asigna el segundo vértice y crea el último
        triangulo.segundoVertice = punto;
        punto = new Punto();
        // Solicitamos los datos del tercer y último vértice
        System.out.print("Introduce la coordenada X del tercer vértice del triángulo: ");
        punto.x = Double.parseDouble(sc.nextLine());
        System.out.print("Introduce la coordenada Y del tercer vértice del triángulo: ");
        punto.y = Double.parseDouble(sc.nextLine());
        // Asigna el último vértice
        triangulo.tercerVertice = punto;
        
        // Imprimirmos el triangulo
        System.out.println("Datos del triángulo");
        System.out.println("Primer vértice: (" + triangulo.primerVertice.x + ", " + triangulo.primerVertice.y + ")");
        System.out.println("Segundo vértice: (" + triangulo.segundoVertice.x + ", " + triangulo.segundoVertice.y + ")");
        System.out.println("Tercer vértice: (" + triangulo.tercerVertice.x + ", " + triangulo.tercerVertice.y + ")");
      } else if (figura == 'c') {
        // Tenemos un circulo
        // Lo creamos
        Circulo circulo = new Circulo();
        // Solicitamos los datos del centro
        Punto punto = new Punto();
        System.out.print("Introduce la coordenada X del centro del círculo: ");
        punto.x = Double.parseDouble(sc.nextLine());
        System.out.print("Introduce la coordenada Y del centro del círculo: ");
        punto.y = Double.parseDouble(sc.nextLine());
        // Asigna el centro
        circulo.centro = punto;
        // Solicitamos el radio
        System.out.print("Introduce la longitud del radio del círculo (debe ser mayor o igual a 0): ");
        circulo.radio = Double.parseDouble(sc.nextLine());
        if (circulo.radio >= 0) {
         // Imprimirmos el circulo
          System.out.println("Datos del circulo");
          System.out.println("Centro: (" + circulo.centro.x + ", " + circulo.centro.y + ")");
          System.out.println("Radio del círculo: " + circulo.radio);
        } else {
          // Radio no válido. Mensaje de error
          System.out.println("Error. El radio del círculo no puede ser menor que 0");
        }
      } else if (figura == 'r') {
        // Tenemos un rectángulo
        // Lo creamos
        Rectangulo rectangulo = new Rectangulo();
        // Solicitamos los datos de la primera esquina
        Punto punto = new Punto();
        System.out.print("Introduce la coordenada X de una esquina del rectángulo: ");
        punto.x = Double.parseDouble(sc.nextLine());
        System.out.print("Introduce la coordenada Y de la misma esquina del rectángulo: ");
        punto.y = Double.parseDouble(sc.nextLine());
        // Asigna la esquina y crea otro punto
        rectangulo.esquina1 = punto;
        punto = new Punto();
        // Solicita la otra esquina
        System.out.print("Introduce la coordenada X de la esquina opuesta del rectángulo: ");
        punto.x = Double.parseDouble(sc.nextLine());
        System.out.print("Introduce la coordenada Y de la misma esquina del rectángulo: ");
        punto.y = Double.parseDouble(sc.nextLine());
        // Asigna la esquina
        rectangulo.esquina2 = punto;
        // Imprimirmos el rectángulo
        System.out.println("Datos del rectángulo");
        System.out.println("Primera esquina del rectángulo: (" + rectangulo.esquina1.x + ", " + rectangulo.esquina1.y + ")");
        System.out.println("Segunda esquina del rectángulo: (" + rectangulo.esquina2.x + ", " + rectangulo.esquina2.y + ")");
      } else {
        // Figura no válido
        System.out.println("La figura introducida no es válida.");
      }
    }
  }
}
