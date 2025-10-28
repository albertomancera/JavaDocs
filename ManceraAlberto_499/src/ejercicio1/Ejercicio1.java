/*
 * Objetivo: 
 */
package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		String []pueblos= {"Mijas","Jubrique","Pujerra","Ojen","Málaga","Ronda","Coín","Torrox","Ardales","Marbella"};
		 double []media= new double[10];
		 int [][] puvliometria= {
				 {0, 31, 1, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 33, 42, 22},
				 {24, 56, 7, 0, 0, 0, 0, 0, 0, 0, 2, 12, 2, 10, 30, 29},
				 {17, 22, 5, 0, 0, 0, 0, 0, 0, 1, 2, 9, 1, 13, 36, 32},
		         {2, 41, 2, 0, 0, 0, 0, 0, 0, 0, 1, 7, 0, 11, 13, 32},
		         {0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 11, 58, 3},
		         {18, 8, 2, 0, 0, 0, 0, 0, 0, 0, 0, 11, 1, 7, 50, 36},
		         {1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 17, 35, 64},
		         {7, 3, 1, 0, 0, 0, 0, 0, 0, 0, 5, 7, 0, 26, 23, 0},
		         {3, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, 4, 7, 130, 43},
		         {4, 33, 1, 0, 0, 0, 0, 0, 0, 0, 4, 2, 0, 10, 20, 31},
		 };
		 for(int i=0;i<media.length;i++) {
			 media[i]= temperaturaMedia(puvliometria[i]);
			 System.out.println("La media puvliometríca de "+ pueblos[i]+" es: "+ media[i]);
		 }
		 
	
	
		}

	
	//Temperatura media del municipio
		public static double temperaturaMedia(int []puvliometria) {
			double media =0;
			int suma=0;
		
		for (int i=0; i<puvliometria.length; i++) {
			suma += puvliometria[i];
			
		}
		media= suma/16;
		return media;
		}
		
		

}

