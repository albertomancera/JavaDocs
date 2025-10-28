/*
 * Autor: Alberto Mancera Plaza
 * Objetivo: Ejercicio de arrays bidimensionales y métodos
 * Fecha:26/11/2024
 */
package ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {
		String []pueblos= {"MIJAS", "JUBRIQUE", "PUJERRA", "OJEN", "MÁLAGA", "RONDA", "COÍN", "TORROX", "ARDALES", "MARBELLA"};
		 double []media= new double[10];
		 int [][] lluvia= {
				 {0, 31, 1, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 33, 42, 22},
				 {24, 56, 7, 0, 0, 0, 0, 0, 0, 0, 2, 12, 2, 10, 30, 29},
				 {17, 22, 5, 0, 0, 0, 0, 0, 0, 1, 2, 9, 1, 13, 36, 32},
		         {2, 41, 2, 0, 0, 0, 0, 0, 0, 0, 1, 7, 0, 11, 13, 32},
		         {0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 11, 58, 3},
		         {18, 8, 2, 0, 0, 0, 0, 0, 0, 0, 0, 11, 1, 7, 50, 36},
		         {1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 17, 35, 64},
		         {7, 3, 1, 0, 0, 0, 0, 0, 0, 0, 5, 7, 0, 26, 23, 0},
		         {3, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, 4, 7, 130, 43},
		         {4, 33, 1, 0, 0, 0, 0, 0, 0, 0, 4, 2, 0, 10, 20, 31}
		 };
	
		 for(int i=0;i<media.length;i++) {
			 media[i]= diaMasLluvioso(lluvia[i]);
			 System.out.println("El día que fue más lluvioso en "+ pueblos[i]+" es: "+ media[i]);
		 
		 
		}
	}
	//Para cada  municipio, ¿Qué día fue el más lluvioso?
		public static int diaMasLluvioso (int lluvia[]) {
			int diaMasLluvia=0;
		
		for (int i=0; i<lluvia.length; i++) {
			if(lluvia[i]>lluvia.length) {
				diaMasLluvia= lluvia[i];
			}
    		}
			return diaMasLluvia;	
		}
		
		
		
	
	

	}


