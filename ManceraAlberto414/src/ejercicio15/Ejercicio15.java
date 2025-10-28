package ejercicio15;

public class Ejercicio15 {

	public static void main(String[] args) {
	
	int array[] = new int [50];
	
	for(int i=0; i<array.length; i++) {
		array[i]= 50+i ;
	}
	
	System.out.println(suma(array));
	System.out.println(media(array));

	}
//Devuelve la suma de un array
	public static int suma(int array[]) {
		int resultado = 0;
		
		for(int i=0; i<array.length; i++) {
			resultado +=array[i];
		}
	return resultado;	
	}
//Devuelve la media del array
	public static double media(int array[]) {
		double mediaArray = 0;
		
		
		for(int i=0; i<array.length; i++) {
			mediaArray = suma(array)/array.length;
		}
		return mediaArray;
	}
}
