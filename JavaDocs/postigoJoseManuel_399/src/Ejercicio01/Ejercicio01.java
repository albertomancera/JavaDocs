/* El programa pide el nombre de los equipos y da resultados random de los goles. 
 * A continuación, el usuario debe decir quien a ganado de los dos o empatado y 
 * al final le daremos el resultado de los goles de cada uno y si ha acertado si ha ganado 
 * o no.
 * Autor: Jose Manuel Postigo
 * Fecha: 18/11/2024
 */

package Ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

	static final int NUMEROPARTIDO = 5;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] goles = new int[2];
		String[] nombreEquipos = new String[2];

		int i, aciertos = 0, fallos = 0;
		char apuesta;

		// Pedimos los nombres de los equipos.
		System.out.println("Escribe primero el nombre del equipo local y despues visitante.");
		System.out.println("---------------------------------------------------------------");
		for (i = 0; i < nombreEquipos.length; i++) {
			System.out.print("Escribe el nombre del equipo(" + (i + 1) + "/2): ");
			nombreEquipos[i] = sc.nextLine();
		}

		// Hacemos un bucle de 5 partidos.
		for ( i = 0; i < NUMEROPARTIDO; i++) {
			// Hacemos que los goles sean aleatorios
			for (int j = 0; j < goles.length; j++) {
				goles[j] = (int) (Math.random() * 6);
			}
			
			// Aqui pedimos al usuario que escribe uno o dos para quien a ganado o x para empate
			System.out.print("Escribe 1 si gana el equipo local, x si es empate o 2 si gana el equipo visitante: ");
			apuesta = sc.next().charAt(0);

			// Hacemos la comprobacion de si el usuario ha acertado o no en su respuesta anterior.
			switch (apuesta) {
			case '1': {
				if (goles[0] > goles[1]) {
					aciertos++;
				} else {
					fallos++;
				}
				break;
			}
			case '2': {
				if (goles[0] < goles[1]) {
					aciertos++;
				} else {
					fallos++;
				}
				break;
			}
			case 'x', 'X': {
				if (goles[0] == goles[1]) {
					aciertos++;
				} else {
					fallos++;
				}
				break;
			}
			default:
				System.out.println("El dato metido no es valido...");
			}
			
			// Mostramos la combinacion ganadora de cada partido.
			System.out.println("----------------------------------------");
			System.out.println("Combinacion ganadora (" + (i + 1) + "/5)");
			
			for (int k = 0; k < goles.length; k++) {
				System.out.println("Equipo " + (nombreEquipos[k]) + ": " + (goles[k]));
			}
			System.out.println("----------------------------------------");
		}
		
		// Mostramos cuanto ha acertado o fallado.
		System.out.println("RESULTADO");
		System.out.println("---------");
		System.out.println("Has Acertado: " + aciertos);
		System.out.println("Has fallado: " + fallos);

		sc.close(); // Cerramos el escaner

	}

}
