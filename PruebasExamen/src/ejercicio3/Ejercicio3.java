package ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {
	
	 String []capital= {"Almeria","Cádiz","Córdoba","Granada","Huelva","Jaen","Málaga","Sevilla"};
	 double []media= new double[8];
	 int [][] temperaturas= {
			 {29, 17, 32, 28, 22, 18, 25, 12},
			 {26, 26, 13, 20, 31, 16, 32, 27},
			 {23, 32, 31, 10, 33, 34, 24, 21},
	         {26, 36, 28, 11, 11, 39, 40, 13},
	         {27, 12, 20, 10, 39, 34, 15, 17},
	         {19, 32, 35, 39, 17, 14, 11, 34},
	         {17, 24, 16, 22, 35, 22, 30, 21},
	         {15, 17, 31, 32, 22, 35, 38, 13},
	         {39, 35, 14, 26, 19, 26, 13, 19},
	         {20, 38, 30, 22, 34, 19, 10, 14},
	         {36, 13, 33, 27, 31, 25, 10, 23},
	         {27, 38, 36, 40, 36, 24, 22, 25},
	         {27, 13, 18, 28, 32, 40, 31, 40},
	         {20, 17, 26, 21, 11, 36, 25, 12},
	         {32, 23, 17, 23, 39, 26, 24, 23}
	 };
	 for(int i=0;i<media.length;i++) {
		 media[i]= temperaturaMedia(temperaturas[i]);
		 System.out.println("La temperatura media de "+ capital[i]+" es: "+ media[i]);
	 }
	 
	 for(int i=0; i<media.length; i++) {
		 if(media[i]==mediaMasBaja(media));
		 System.out.println("La temperatura media más baja de "+capital[i]+" es: "+ mediaMasBaja(media));
	 }

	 for(int i=0; i<capital.length;i++) {
		 System.out.println("La temperatura más baja es: "+temperaturasMasBaja(temperaturas));
	 }
	 
	 
	}
//Temperatura media de la capital
	public static double temperaturaMedia(int []temperaturas) {
		double media =0;
		int suma=0;
	
	for (int i=0; i<temperaturas.length; i++) {
		suma += temperaturas[i];
		
	}
	media= suma/15;
	return media;
	}
	
	public static double mediaMasBaja(double []media) {
		double mediaMasBaja = media[0];
		
		for (int i=0; i<media.length; i++) {
			if( media[i]<mediaMasBaja) {
				mediaMasBaja= media[i];
			}
		}
		return mediaMasBaja;
		
	}
	
	public static int temperaturasMasBaja(int[] []temperaturas) {
		int temperaturaBaja = temperaturas[0][0];
		
		for(int i=0;i<temperaturas.length;i++) {
			for (int j=0;j<temperaturas.length;j++) {
			if(temperaturas[i][j]<temperaturas.length) {
				temperaturaBaja= temperaturas[i][j];
			}
			}
		}
		return temperaturaBaja;
	}
}
