/*
 * Objetivo: crear una tabla de futbol, columna 1 el nº de goles y columna 2 el numeros aleatorios del 0 al 5
 * Autor: Carlos Rueda Márquez
 * Fecha: 18/11/2024
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		//Solitar los datos para las apuestas
		Scanner teclado = new Scanner (System.in);
		
		//la primera cordenada es el partido y la segunda cordenada es el equipo local y el visitante
		byte	partido[][] = new byte[5][2];
		char	apuesta[] = new char[5];
		
		//este string es de uso temporal para poder recoger el 1º caracter como la apuesta deseada
		String	temp;
		byte	acierto = 0, fallo = 0;//son contadores de lo que su nombre indica
		
		/* el 0 es el local y el 1 es el visitante y rellenamos cuantos goles han 
		 * marcado con un numero entre 0 y 5 de manera aleatoria*/
		for (int i = 0; i < partido.length; i++)
		{
			partido[i][0] = (byte)(Math.random() * 5);
			partido[i][1] = (byte)(Math.random() * 5);
		}
		
		//pedimos la apuesta de cada partido
		for (int i = 0 ; i < apuesta.length; i++)
		{
			System.out.println("Apuesta a como acabara el partido nº "+(i + 1)+":");
			System.out.println("---------------------------------------");
			System.out.println("1: Gana el equipo local");
			System.out.println("X: Empatan los 2 equipos");
			System.out.println("2: Gana el equipo visitante");
			temp = teclado.nextLine();
			System.out.println("---------------------------------------");
			System.out.println();
			
			//usamos charAt 0 porque suponemos que el usuario a puesto el resultado en el primer caracter
			apuesta[i] = temp.charAt(0);
			
		}
		
		teclado.close();
		
		System.out.println();
		for (int i = 0; i < partido.length; i++)
		{
			System.out.print("El partido nº "+(i + 1)+" ha ");
			
			//se hace una comparativa para ver con que terminar de rellenar el mensaje y hacer la accion conveniente en cada caso
			if (partido[i][0] < partido[i][1])
			{
				System.out.println("(2) ganado el equipo visitante");
				
				//Si el resultado dado coincide con el apostado suma 1 a acierto si no suma 1 a fallo
				if (apuesta[i] == '2')
				{
					acierto++;
				}
				else
				{
					fallo++;
				}
			}
			else if (partido[i][0] > partido[i][1])
			{
				System.out.println("(1) ganado el equipo local");
				
				if (apuesta[i] == '1')
				{
					acierto++;
				}
				else
				{
					fallo++;
				}
			}
			else 
			{
				System.out.println("(X) habido empate");
				
				if (apuesta[i] == 'x' || apuesta[i] == 'X')
				{
					acierto++;
				}
				else
				{
					fallo++;
				}
			}
		}
		
		System.out.println();
		System.out.println("Has acertado "+acierto+" apuesta/s y has fallado "+fallo);
	}
		
	}


