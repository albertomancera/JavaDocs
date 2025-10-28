/*
 * Objetivo: mostrar el desarrollo de las clases creadas
 * Fecha: 11/03/2025
 * Autor: Alberto Mancera Plaza
 */
package teatros;
import java.util.Random;

import libtarea3.Teatro;
public class PrincipalTeatro {

	public static void main(String[] args) {
		//1. Crea diez teatros por defecto.
		//Evidencia: mostrar el estado de los teatros creados 
		System.out.println("1 -------------------");
		System.out.println("---------------------");
		Teatro [] teatros = new Teatro [10] ;
		
		for (int i = 0; i < teatros.length; i++) {
			teatros [i] = new Teatro();
			System.out.println(teatros[i]);
		};
		
		  // 2. Comprar 25 entradas para cada uno de los teatros
		System.out.println("2 -------------------");
		System.out.println("---------------------");
        for (Teatro teatro : teatros) {
            try {
                if (!teatro.tieneObra()) {
                    teatro.asignarObra("Obra por defecto");
                }
                teatro.comprarEntradas(25);
            } catch (Exception e) {
                System.out.println("Error al comprar entradas: " + e.getMessage());
            }
            System.out.println(teatro);
        }

        // 3. Asignar "La Celestina" a los cinco primeros teatros
        System.out.println("3 -------------------");
		System.out.println("---------------------");
        for (int i = 0; i < 5; i++) {
            try {
                if (teatros[i].tieneObra()) {
                    teatros[i].terminarObra();
                }
                teatros[i].asignarObra("La Celestina");
                System.out.println(teatros[i]);
            } catch (Exception e) {
                System.out.println("Error al asignar obra: " + e.getMessage());
            }
        }

        // 4. Crear el teatro "Cervantes" con aforo 500 y asignar la obra "La vida es bella"
        Teatro cervantes = new Teatro("Cervantes", 500);
        try {
            cervantes.asignarObra("La vida es bella");
        } catch (Exception e) {
            System.out.println("Error al asignar obra en el teatro Cervantes: " + e.getMessage());
        }
        System.out.println(cervantes);

        // 5. Comprar un número aleatorio de entradas entre 100 y 1000 para el teatro "Cervantes"
        Random random = new Random();
        int entradasAComprar = random.nextInt(901) + 100; // Entre 100 y 1000
        System.out.println("Intentando comprar " + entradasAComprar + " entradas en el teatro Cervantes");
        try {
            cervantes.comprarEntradas(entradasAComprar);
        } catch (Exception e) {
            System.out.println("Error al comprar entradas en Cervantes: " + e.getMessage());
        }
        System.out.println(cervantes);

        // 6. Crear el teatro "Soho Málaga" con aforo 1000
        Teatro sohoMalaga = new Teatro("Soho Málaga", 1000);
        System.out.println(sohoMalaga);

        // 7. Traspasar la obra del teatro "Cervantes" al teatro "Soho Málaga"
        try {
            cervantes.traspasarObra(sohoMalaga);
        } catch (Exception e) {
            System.out.println("Error al traspasar la obra: " + e.getMessage());
        }
        System.out.println("Estado de los teatros tras el traspaso:");
        System.out.println(cervantes);
        System.out.println(sohoMalaga);

        // 8. Mostrar entradas vendidas y entradas por vender para "Cervantes" y "Soho Málaga"
        System.out.println("Teatro Cervantes - Entradas Vendidas: " + cervantes.getEntradasVendidas() + ", Entradas por vender: " + (cervantes.getAforo() - cervantes.getEntradasVendidas()));
        System.out.println("Teatro Soho Málaga - Entradas Vendidas: " + sohoMalaga.getEntradasVendidas() + ", Entradas por vender: " + (sohoMalaga.getAforo() - sohoMalaga.getEntradasVendidas()));
    }
}
