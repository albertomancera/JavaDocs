/*
 * Autor: Alberto Mancera Plaza
 * Objetivo: Hacer un ejercicio de menús, con bucles y métodos
 * Fecha:26/11/2024
 */
package ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcion, num,num1,num2,num3;
		
		do {
		  System.out.println("Indique la operación que quiere realizar (Inserte un número):");
	        System.out.println("(0) Salir");
	        System.out.println("(1) Multiplicar");
	        System.out.println("(2) Calcular media");
	        System.out.println("(3) Calcular el número menor");
	       opcion = sc.nextInt();
		
		
	
		System.out.println("Dime un número entero: ");
		num=sc.nextInt();
		System.out.println("Dime otro número entero: ");
		num1=sc.nextInt();
		System.out.println("Dime otro número entero: ");
		num2=sc.nextInt();
		System.out.println("Dime otro número entero: ");
		num3=sc.nextInt();
		
		 double  resultado = 0;
		 int total= 0;
		 
	        switch (opcion) {
	        case 1:
	        	System.out.println("--------------------");
		        System.out.println("Resultado: " + multiplicar(num1,num2,num3,num));
	        break;
	        case 2:
	        	System.out.println("--------------------");
		        System.out.println("Resultado: " + media(num1,num2,num3,num));
	        break;
	        case 3:
	    		if(num<num1) {
	    			resultado=num;
	    		}else if(num1<num2){
	    			resultado=num1;
	    		}else if(num2<num3){
	    			resultado=num2;
	    		}else {
	    			resultado=num3;
	    		}
	        break;
	        default:
	        	System.out.println("Operación no valida");
	        }
	        System.out.println("--------------------");
	        System.out.println("Resultado: " + resultado);
	        
	      
	        
		}while(opcion !=0 );
	}
	//Multiplicar
	public static int multiplicar(int num, int num1,int num2, int num3){
			int resultado;
			
			return resultado= num*num1*num2*num3;
	}
	//Calcular media
	public static double media(int num, int num1,int num2, int num3){
		int total =num+num1+num2+num3;
    	int media= total/4;
    	
    	return media;
	}
	//Calcular el número menor
	public static int menor (int num, int num1,int num2, int num3){
		int resultado=0;
		if(num<num1) {
			resultado=num;
		}else if(num1<num2){
			resultado=num1;
		}else if(num2<num3){
			resultado=num2;
		}else {
			resultado=num3;
		}
		return resultado;
	}
	}


