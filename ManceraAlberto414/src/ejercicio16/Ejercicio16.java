package ejercicio16;
import java.util.Scanner;

public class Ejercicio16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tamanno;
		
		System.out.println("Dime un tamaño para el array: ");
		tamanno = sc.nextInt();
		
		int array []= new int [tamanno];
		
		for(int i=0; i<array.length; i++) {
		array[i]= valoresAleatorios(array);
		System.out.println(array[i]);
		}
	}
//Rellena un array con valores aleatorios
	public static int valoresAleatorios(int array[]) {
		int valoresRandom;
		
		valoresRandom=(int) (Math.random()*100);
		
	return valoresRandom;
	}
}


