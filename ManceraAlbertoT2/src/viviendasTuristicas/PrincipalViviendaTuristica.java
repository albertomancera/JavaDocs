/*
 * Objetivo: mostrar el desarrollo de las clases creadas
 * Fecha: 11/03/2025
 * Autor: Alberto Mancera Plaza
 */
package viviendasTuristicas;

import java.time.LocalDate;
import java.util.Scanner;

public class PrincipalViviendaTuristica {
	 private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		// 1. Crea un apartamento con valores por defecto.
		// Evidencia. El valor de cada uno de los atributos
	    Apartamento apto1 = new Apartamento();
        System.out.println("\n1. Apartamento por defecto creado:");
        System.out.println(apto1.toString());
		
		//2. Calcula el precio para una estancia de 3 días.
		// Evidencia: el precio de la estancia.
        System.out.printf("2. Precio para 3 noches: %.2f€\n", apto1.calcularPrecioEstancia(3));
		
		//3. Crea un apartamento con precio por noche (valor solicitado al usuario) y distancia al centro (solicitado al usuario). Resto de valores por defecto.
		// Evidencia. El valor de cada uno de los atributos
        System.out.println("\n3. Ingrese datos para nuevo apartamento:");
        System.out.print("Precio por noche: ");
		double precioApto = scanner.nextDouble();
        System.out.print("Distancia al centro (km): ");
        double distancia = scanner.nextDouble();
        Apartamento apto2 = new Apartamento("Calle Nueva 456", precioApto, true, 3, distancia, LocalDate.now());
        System.out.println("Apartamento creado:");
        System.out.println(apto2);

		
		//4. Calcula el precio para una estancia de 5 días.
		// Evidencia: el precio de la estancia.
        System.out.printf("4. Precio para 5 noches: %.2f€\n", apto2.calcularPrecioEstancia(5));

		
		//5. Crea una casa rural con valores por defecto.
		// Evidencia. El valor de cada uno de los atributos.
        CasaRural casa1 = new CasaRural();
        System.out.println("\n5. Casa rural por defecto creada:");
        System.out.println(casa1);
		
		//6. Crea una casa rural con precio por noche (valor solicitado al usuario) y el resto por defecto.
		// Evidencia. El valor de cada uno de los atributos.
        System.out.println("\n6. Ingrese precio para casa rural:");
        System.out.print("Precio por noche: ");
        double precioCasa = scanner.nextDouble();
        CasaRural casa2 = new CasaRural("Camino Viejo 78", precioCasa, true, 150.0, LocalDate.now().minusYears(8), false);
        System.out.println("Casa rural creada:");
        System.out.println(casa2);
        

		
		// 7. Calcula el precio de una estancia de 10 días.
		// Evidencia: el precio de la estancia.
        System.out.printf("7. Precio para 10 noches: %.2f€\n", casa2.calcularPrecioEstancia(10));

		
		// 8. Modifica la fecha de construcción a 1/1/2023.
		// Evidencia. El valor de cada uno de los atributos.
        casa2 = new CasaRural(casa2.getDireccion(), casa2.getPrecioPorNoche(), 
                casa2.isDisponible(), casa2.getMetrosCuadrados(), 
                LocalDate.of(2023, 1, 1), casa2.isAdmiteMascotas());
        System.out.println("\n8. Casa rural con fecha modificada (1/1/2023):");
        System.out.println(casa2);
		

		// 9. Indica si la casa es pet friendly.
		// Evidencia. Indica si es "pet friendly".
        System.out.printf("9. ¿Es pet friendly? %s\n", casa2.isPetFriendly() ? "Sí" : "No");

		
		// 10. Crea un hotel con valores por defecto.
		// Evidencia. El valor de cada uno de los atributos.
        Hotel hotel1 = new Hotel();
        System.out.println("\n10. Hotel por defecto creado:");
        System.out.println(hotel1);

		
		// 11. Crea un hotel con todos los valores solicitados al usuario. (el objeto debe ser creado por un método)
		// Evidencia. El valor de cada uno de los atributos.
        System.out.println("\n11. Ingrese datos para nuevo hotel:");
        System.out.print("Precio por noche: ");
        double precioHotel = scanner.nextDouble();
        System.out.print("Estrellas (1-5): ");
        int estrellas = scanner.nextInt();
        System.out.print("Habitaciones: ");
        int habitaciones = scanner.nextInt();
        System.out.print("¿Tiene spa? (true/false): ");
        boolean spa = scanner.nextBoolean();
        
        Hotel hotel2 = new Hotel("Avenida Principal 100", precioHotel, true, estrellas, habitaciones, spa);
        System.out.println("Hotel creado:");
        System.out.println(hotel2);

		
		//12. Calcula el precio de una estancia de 1 día.
		// Evidencia: el precio de la estancia.
        System.out.printf("12. Precio para 1 noche: %.2f€\n", hotel2.calcularPrecioEstancia(1));

		
		// 13. Modifica el valor de Spa a sí.
		// Evidencia. El valor de cada uno de los atributos.
        hotel2.setTieneSpa(true);
        System.out.println("\n13. Hotel con spa modificado:");
        System.out.println(hotel2);

		
		// 14. Calcula el precio de una estancia de 1 día.
		// Evidencia: el precio de la estancia.
        System.out.printf("14. Precio para 1 noche con spa: %.2f€\n", hotel2.calcularPrecioEstancia(1));

		
	
		// 15. Calcula el número de viviendas creadas.
		// Evidencia. El número de viviendas creadas.
        System.out.printf("\n15. Total viviendas creadas: %d\n", Vivienda.getTotalViviendas());
		
		
	}

}
