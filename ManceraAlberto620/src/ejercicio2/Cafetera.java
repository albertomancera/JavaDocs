package ejercicio2;

public class Cafetera {
    public static final double CAPACIDAD_MAX = 1000;
    
    private double capacidadMaxima;
    private double cantidadActual = 0;
    
    public Cafetera() {
        this(CAPACIDAD_MAX, 0);
    }
    
    public Cafetera(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
    }
    
    public Cafetera(double capacidadMaxima, double cantidadActual) throws IllegalArgumentException {
        if (cantidadActual > capacidadMaxima) {
            double sobrante = cantidadActual - capacidadMaxima;
            this.capacidadMaxima = capacidadMaxima;
            this.cantidadActual = capacidadMaxima;
            throw new IllegalArgumentException("La cantidad actual es mayor que la capacidad máxima por: " + sobrante + " cc sobrante de café.");
        } else {
            this.capacidadMaxima = capacidadMaxima;
            this.cantidadActual = cantidadActual;
        }
    }
    
    public void llenarCafetera(double cantidad) throws IllegalArgumentException {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa.");
        }
        if (cantidad + this.cantidadActual > this.capacidadMaxima) {
            this.cantidadActual = this.capacidadMaxima;
            throw new IllegalArgumentException("La cantidad supera la capacidad máxima de la cafetera. Se llenó hasta el máximo.");
        }
        this.cantidadActual += cantidad;
    }
    
    public void servirTaza(int cantidad) throws IllegalStateException {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad a servir no puede ser negativa.");
        }
        if (this.cantidadActual < cantidad) {
            double servido = this.cantidadActual;
            this.cantidadActual = 0;
            throw new IllegalStateException("No hay suficiente café. Se han servido solo " + servido + " cc.");
        }
        this.cantidadActual -= cantidad;
    }
    
    public void vaciarCafetera() {
        this.cantidadActual = 0;
    }
    
    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }
    
    public double getCantidadActual() {
        return cantidadActual;
    }
    
    public void setCantidadActual(double cantidadActual) {
        if (cantidadActual > capacidadMaxima) {
            throw new IllegalArgumentException("Cantidad actual no puede superar la capacidad máxima.");
        }
        this.cantidadActual = cantidadActual;
    }
    
    @Override
    public String toString() {
        return "Cafetera [capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + "]";
    }
}
