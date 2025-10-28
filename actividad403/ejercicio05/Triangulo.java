package prog.unidad04.actividad403.ejercicio05;

/**
 * Representa a un triángulo
 */
public class Triangulo {

  /**
   * Primer vértice
   */
  private Punto primerVertice;

  /**
   * Segundo vértice
   */
  private Punto segundoVertice;
  
  /**
   * Tercer vértice
   */
  private Punto tercerVertice;
  
  /**
   * Crea un triángulo a partir de los tres vértices
   * @param vertice1 Primer vértice del triángulo
   * @param vertice2 Segundo vértice del triángulo
   * @param vertice3 Tercer vértice del triángulo
   * @throws FiguraException Si los tres puntos están alineados
   */
  public Triangulo(Punto vertice1, Punto vertice2, Punto vertice3) {
    if (!alineados(vertice1, vertice2, vertice3)) {
      this.primerVertice = vertice1;
      this.segundoVertice = vertice2;
      this.tercerVertice = vertice3;
    } else {
      throw new FiguraException("Los tres vértices están alineados");
    }
  }
  
  /**
   * Obtiene el área del triángulo
   * @return Área del triángulo
   */
  public double area() {
    // Calculamos las longitudes de los tres lados (a, b y c)
    double a = getLongitudSegmento(primerVertice, segundoVertice);
    double b = getLongitudSegmento(segundoVertice, tercerVertice);
    double c = getLongitudSegmento(tercerVertice, primerVertice);
    
    // Según la fórmula de Heron, en primer lugar calculamos s
    double s = (a + b + c) / 2;
    
    // Y el área a partir de s
    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
  }
  
  /**
   * Obtiene el perímetro del triángulo
   * @return Perímetro del triángulo
   */
  public double perimetro() {
    // Calculamos las longitudes de los tres lados (a, b y c)
    double a = getLongitudSegmento(primerVertice, segundoVertice);
    double b = getLongitudSegmento(segundoVertice, tercerVertice);
    double c = getLongitudSegmento(tercerVertice, primerVertice);
    
    // Y las sumamos para obtener el resultado
    return a + b + c;
  }
  
  /**
   * Calcula la longitud del segmento situado entre los dos puntos dados
   * @param p1 Punto origen del segmento
   * @param p2 Punto destino del segmento
   * @return Longitud del segmento
   */
  private double getLongitudSegmento(Punto p1, Punto p2) {
    // Aplicamos el teorema de Pitágoras
    return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
  }

  /**
   * Comprueba si los tres puntos están alineados
   * @param punto1 Primer punto 
   * @param punto2 Segundo punto
   * @param punto3 Tercer punto
   * @return true si los tres puntos están en la misma línea. false en caso contrario
   */
  private boolean alineados(Punto punto1, Punto punto2, Punto punto3) {
    // Calculamos los vectores que forman los puntos 1 y 2 y el 2 y 3
    Punto vector1 = new Punto(punto2.getX() - punto1.getX(), punto2.getY() - punto1.getY());
    Punto vector2 = new Punto(punto3.getX() - punto2.getX(), punto3.getY() - punto2.getY());
    
    // Si los dos vectores son proporcionales, devuelve true, si no, false
    return (vector2.getX() / vector1.getX()) == (vector2.getY() / vector1.getY());
  }

}
