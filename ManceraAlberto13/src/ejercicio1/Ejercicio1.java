/*
 * Objetivo:Calcular el salario neto y solicitar datos
 * Autor: Alberto Mancera Plaza
 * Fecha: 04/10/2024
 */
package ejercicio1;

import java.util.*;

public class Ejercicio1 {
	public static void main(String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		String nombre;
		System.out.println("Dime tu nombre");
		nombre = entradaTeclado.nextLine();
		
		String apellidos;
		System.out.println("Dime tu apellido");
		apellidos = entradaTeclado.nextLine();
		
		String fechanacimiento;
		System.out.println("Dime tu fecha de nacimiento");
		fechanacimiento = entradaTeclado.nextLine();
		
		double salariobruto;
		System.out.println("Dime tu salario bruto");
		salariobruto = entradaTeclado.nextDouble();
		
		int annos;
		System.out.println("Dime tus años trabajando en la empresa");
		annos = entradaTeclado.nextInt();
		
		double salarioneto;
		salarioneto = (salariobruto*0.15 ) ; 
		
		double aumento;
		aumento = ((annos*0.02)*100);
		
		double aumentoTotal;
		aumentoTotal = (salarioneto+(salariobruto *(aumento/100)));
		
		System.out.println("Estimad@ " + nombre + " " + apellidos + ", su salario bruto es " + salariobruto + ", teniendo en cuenta un IRPF del 15% su salario neto es " + salarioneto + ".")  ;
		System.out.println("Debido a sus " + annos + " años trabajando en la empresa su salario se incrementará en un 2% por cada año. El aumento es de " + aumento + " y el salario total es " + aumentoTotal + " ." );
	
	}
}
