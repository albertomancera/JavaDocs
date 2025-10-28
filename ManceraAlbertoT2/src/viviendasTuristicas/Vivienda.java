/*
 * Objetivo: Crear clase padre Vivienda
 * Fecha: 11/03/2025
 * Autor: Alberto Mancera Plaza
 */
package viviendasTuristicas;


abstract class Vivienda {
	
	    protected final String identificador;
	    protected String direccion;
	    protected double precioPorNoche;
	    protected boolean disponible;
	    private static int contador = 0;
	    
	    // Constructor de Vivienda
	    public Vivienda(String tipo, String direccion, double precioPorNoche, boolean disponible) {
	        this.direccion = direccion;
	        this.precioPorNoche = precioPorNoche;
	        this.disponible = disponible;
	        // Formato del ID: tipo + número de 3 dígitos múltiplo de 5
	        this.identificador = String.format("%s-%03d", tipo, contador);
	        contador += 5; // Incrementamos de 5 en 5 para el próximo ID
	    }
	    
	    // Métodos comunes a todas las viviendas
	    public String getIdentificador() { return identificador; }
	    public String getDireccion() { return direccion; }
	    public double getPrecioPorNoche() { return precioPorNoche; }
	    public boolean isDisponible() { return disponible; }
	    
	    // Métodos abstractos que cada subclase debe implementar
	    public abstract double calcularPrecioEstancia(int dias);
	    public abstract String getInfoEspecifica();
	    
	    // Método estático para obtener el total de viviendas creadas
	    public static int getTotalViviendas() {
	        return contador / 5; // Como incrementamos de 5 en 5, dividimos para obtener el conteo real
	    }
	    
	    @Override
	    public String toString() {
	        return String.format("ID: %s | Dirección: %s | Precio/noche: %.2f€ | Disponible: %s | %s",
	                identificador, direccion, precioPorNoche, disponible ? "Sí" : "No", getInfoEspecifica());
	    }
	}