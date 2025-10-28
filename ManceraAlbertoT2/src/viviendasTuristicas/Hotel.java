/*
 * Objetivo: desarrollo de clase hija 
 * Fecha: 11/03/2025
 * Autor: Alberto Mancera Plaza
 */
package viviendasTuristicas;

public class Hotel extends Vivienda{
	private int estrellas;
    private int numHabitaciones;
    private boolean tieneSpa;
    
    public Hotel(String direccion, double precioPorNoche, boolean disponible, 
                int estrellas, int numHabitaciones, boolean tieneSpa) {
        super("HO", direccion, precioPorNoche, disponible); // "HO" para el tipo de vivienda
        this.estrellas = estrellas;
        this.numHabitaciones = numHabitaciones;
        this.tieneSpa = tieneSpa;
    }
    
    public Hotel() {
        this("Avenida Playa 1", 120.0, true, 4, 50, false);
    }
    
    // Verifica si es lujoso (5 estrellas y tiene spa)
    public boolean isLujoso() {
        return estrellas == 5 && tieneSpa;
    }
    
    @Override
    public double calcularPrecioEstancia(int dias) {
        double precioBase = precioPorNoche * dias;
        // 5% extra si tiene 3+ estrellas
        if (estrellas >= 3) {
            precioBase *= 1.05;
        }
        // 30€ extra por día si tiene spa
        if (tieneSpa) {
            precioBase += 30 * dias;
        }
        return precioBase;
    }
    
    @Override
    public String getInfoEspecifica() {
        return String.format("HOTEL | Estrellas: %d | Habitaciones: %d | Spa: %s | Lujoso: %s",
                estrellas, numHabitaciones, tieneSpa ? "Sí" : "No", isLujoso() ? "Sí" : "No");
    }


	public void setTieneSpa(boolean tieneSpa) {
		this.tieneSpa = tieneSpa;
	}
    
    
}