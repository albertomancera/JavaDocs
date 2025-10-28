/*
 * Autor: Alberto Mancera Plaza
 * Fecha: 28/01/2025
 * Objetivo: Examen 
 */
package ejercicio1;

import java.time.LocalDate;

import libtarea3.*;
public class Ejercicio01 {

	public static void main(String[] args) {
		//Declaro la fecha creacion
		LocalDate fechaCreacion = LocalDate.of(2000,01, 1);
		
	//2. Declara diez variables 
	CuentaBancaria cuenta [] = new CuentaBancaria [10];
	
	//3. Instancia las diez variables de referencia
	for (int i=0;i<cuenta.length;i++) {
		cuenta[i] = new CuentaBancaria(CuentaBancaria.DEFAULT_SALDO , fechaCreacion, CuentaBancaria.DEFAULT_MAX_DESCUBIERTO );
		}

	//Mostrar la informacion de cada cuenta
	for (int i=0;i<cuenta.length;i++) {
		System.out.println(cuenta[i]);
	}
	
	System.out.println("---------------------------");
	
	
	/*5 Declara e instancia una variable de referencia con el identificador [TuPrimerApellido] y con los siguientes valores:
Saldo inicial: 50€. */
	CuentaBancaria mancera = new CuentaBancaria(50);
	System.out.println("Saldo inicial: "+ mancera.toString());
	
	System.out.println("---------------------------");
	/*6. Declara e instancia otra variable de referencia con los valores por defecto con el
	identificador tTuNombre]. Muestra la información de la cuenta. */
	CuentaBancaria alberto =  new CuentaBancaria();
	System.out.println(alberto.toString());
	
	System.out.println("---------------------------");
	/* 7. Ingresa 1000€ en la cuenta con el identificador [TuPrimerApellido]. Muestra la
	información de la cuenta. */
	mancera.ingresar(1000);
	System.out.println(mancera.toString());
	
	System.out.println("---------------------------");
	/* 8. Extrae en la cuenta con el identificador [TuNombreI Muestra la información de la
	cuenta. */
	try {
		alberto.extraer(500);
	}catch (IllegalStateException e) {
		System.out.println(e.getMessage());
	}
	System.out.println(alberto.toString());
	
	System.out.println("---------------------------");
	/* 9. Transfiere 250C de la cuenta con el identificador CTuNombre] a la cuenta con el
	identificador [TuPrimerApellido). Muestra la información de ambas cuentas.*/
	mancera.transferir(250, alberto);
	System.out.println(mancera.toString());
	System.out.println(alberto.toString());
	
	System.out.println("---------------------------");
	/*10 Embarga el 50% de la cuenta identificador [TuPrimerApeIlido]. Muestra la información
	de la cuenta*/
	mancera.embargar(50);
	System.out.println(mancera.toString());
	
	}
	//1. Generar un valor aleatorio entre 1850 y 1950
	public static int anyoAleatorio () {
		int anyo ;
		
		anyo = (int) Math.random()*100 + 1850;
		return anyo;
	}

}
