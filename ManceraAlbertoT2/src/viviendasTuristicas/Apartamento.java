/*
 * Objetivo: desarrollo de clase hija 
 * Fecha: 11/03/2025
 * Autor: Alberto Mancera Plaza
 */
package viviendasTuristicas;

import java.time.LocalDate;

public class Apartamento extends Vivienda{
	 private int numHabitaciones;
	    private double distanciaCentro; // en km
	    private LocalDate fechaUltimaReforma;
	    
	    // Constructor completo
	    public Apartamento(String direccion, double precioPorNoche, boolean disponible, 
	                      int numHabitaciones, double distanciaCentro, LocalDate fechaUltimaReforma) {
	        super("AP", direccion, precioPorNoche, disponible); // "AP" para el tipo de vivienda
	        this.numHabitaciones = numHabitaciones;
	        this.distanciaCentro = distanciaCentro;
	        this.fechaUltimaReforma = fechaUltimaReforma;
	    }
	    
	    // Constructor por defecto
	    public Apartamento() {
	        this("Calle Principal 123", 50.0, true, 2, 0.8, LocalDate.now().minusYears(1));
	    }
	    
	    // Implementación del cálculo de precio específico para apartamentos
	    @Override
	    public double calcularPrecioEstancia(int dias) {
	        double precioBase = precioPorNoche * dias;
	        // 20% extra si está a menos de 1km del centro
	        if (distanciaCentro < 1.0) {
	            precioBase *= 1.20;
	        }
	        return precioBase;
	    }
	    
	    // Información específica del apartamento
	    @Override
	    public String getInfoEspecifica() {
	        return String.format("APARTAMENTO | Habitaciones: %d | Distancia centro: %.2f km | Reforma: %s",
	                numHabitaciones, distanciaCentro, fechaUltimaReforma);
	    }
	}

	

