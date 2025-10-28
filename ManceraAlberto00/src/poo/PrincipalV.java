package poo;

public class PrincipalV {
	    public static void main(String[] args) {
	        try {
	            // Crear vehículos
	            Vehiculo v1 = new Vehiculo(150, 10); // Debería lanzar excepción por capacidad fuera de rango
	        } catch (IllegalArgumentException e) {
	            System.out.println("Error al crear v1: " + e.getMessage());
	        }

	        try {
	            Vehiculo v2 = new Vehiculo(60, 25); // Debería lanzar excepción por consumo fuera de rango
	        } catch (IllegalArgumentException e) {
	            System.out.println("Error al crear v2: " + e.getMessage());
	        }

	        Vehiculo v3 = new Vehiculo(); // Vehículo con valores por defecto

	        // Repostar 20 litros en v3
	        try {
	            v3.repostar(20);
	            System.out.println("Vehículo v3 repostado con 20 litros.");
	        } catch (IllegalStateException | IllegalArgumentException e) {
	            System.out.println("Error al repostar v3: " + e.getMessage());
	        }

	        // Arrancar v3
	        try {
	            v3.arrancar();
	            System.out.println("Vehículo v3 arrancado.");
	        } catch (IllegalStateException e) {
	            System.out.println("Error al arrancar v3: " + e.getMessage());
	        }

	        // Realizar un trayecto de 100 km con v3
	        try {
	            v3.realizarTrayecto(100);
	            System.out.println("Vehículo v3 ha realizado un trayecto de 100 km.");
	        } catch (IllegalArgumentException | IllegalStateException e) {
	            System.out.println("Error al realizar trayecto con v3: " + e.getMessage());
	        }

	        // Mostrar estado de v3
	        System.out.println("Estado de v3: " + v3.toString());

	        // Mostrar estadísticas de la flota
	        System.out.println("Distancia total recorrida por la flota: " + Vehiculo.getDistanciaRecorridaFlota() + " km");
	        System.out.println("Combustible total consumido por la flota: " + Vehiculo.getCombustibleConsumidoTotal() + " litros");
	        
	        v3.apagar();
	        
	        System.out.println("Estado de v3: " + v3.toString());
	    }
	    
	    	
	    	
	}