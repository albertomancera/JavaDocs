/*
 * Objetivo: Crear la clase Principal
 * Autor: Álvaro Mozo Gaspar
 * Fecha: 03/03/2025
 */
package ejercicio5;

public class Principal {

	public static void main(String[] args) {

		Vehiculo coche = new Coche("1234DFG", "Toyota Corolla", 4, true);
        Vehiculo moto = new Moto("5678HJK", "Yamaha R1", 2, "Rojo");
        Vehiculo barco = new Barco("VELERO", "Beneteau", 12.5, true);
        Vehiculo submarino = new Submarino("SUB1", "Nautilus", 25.0, 200);
        Vehiculo avion = new Avion("AVIO123456", "Boeing 747", 300, 15);
        Vehiculo helicoptero = new Helicoptero("HELI567890", "Black Hawk", 6, 4);

        Vehiculo[] vehiculos = {coche, moto, barco, submarino, avion, helicoptero};

        for (Vehiculo v : vehiculos) {
            System.out.println(v);
        }

	}

}
