/*
 * Objetivo: desarrollo de clase hija 
 * Fecha: 11/03/2025
 * Autor: Alberto Mancera Plaza
 */
package viviendasTuristicas;

import java.time.LocalDate;
import java.time.Period;

public class CasaRural extends Vivienda{
	  private double metrosCuadrados;
	    private LocalDate fechaConstruccion;
	    private boolean admiteMascotas;
	    
	    public CasaRural(String direccion, double precioPorNoche, boolean disponible, 
	                    double metrosCuadrados, LocalDate fechaConstruccion, boolean admiteMascotas) {
	        super("CR", direccion, precioPorNoche, disponible); // "CR" para el tipo de vivienda
	        this.metrosCuadrados = metrosCuadrados;
	        this.fechaConstruccion = fechaConstruccion;
	        this.admiteMascotas = admiteMascotas;
	    }
	    
	    public CasaRural() {
	        this("Camino Rural 45", 80.0, true, 120.0, LocalDate.now().minusYears(5), false);
	    }
	    
	    // Verifica si es pet friendly (más de 100m² y admite mascotas)
	    public boolean isPetFriendly() {
	        return metrosCuadrados > 100 && admiteMascotas;
	    }
	    
	    
	    
	    @Override
	    public double calcularPrecioEstancia(int dias) {
	        double precioBase = precioPorNoche * dias;
	        // 10% extra si la construcción es menor a 10 años
	        if (Period.between(fechaConstruccion, LocalDate.now()).getYears() < 10) {
	            precioBase *= 1.10;
	        }
	        return precioBase;
	    }
	    
	    @Override
	    public String getInfoEspecifica() {
	        return String.format("CASA RURAL | m²: %.2f | Construida: %s | Mascotas: %s | Pet Friendly: %s",
	                metrosCuadrados, fechaConstruccion, admiteMascotas ? "Sí" : "No", 
	                isPetFriendly() ? "Sí" : "No");
	    }

		public double getMetrosCuadrados() {
			return metrosCuadrados;
		}

		public boolean isAdmiteMascotas() {
			return admiteMascotas;
		}

		

		
	}

