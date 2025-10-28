package ejercicio8;
import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("Dame un valor N entero: ");
		n= sc.nextInt();
		
		System.out.println("El sumatorio de 1 a N es: "+suma1aN(n));
		System.out.println("El productorio de 1 a N es: "+producto1aN(n));
		System.out.println("El intermedio de 1 a N es: "+intermedio1aN(n));
	}
	 // Devuelve la suma de enteros de 1 a n
	public static int suma1aN(int n) {
		int suma=0;
		for (int i=1;i<=n;i++) {
			suma +=i;
		}
		return suma;
	}
	 // Devuelve el producto de enteros de 1 a n
	public static int producto1aN(int n) {
		int producto= 1;
		for (int i=1;i<=n;i++) {
			producto *=i;
		}
		return producto;
	}
	// Devuelve el valor intermedio entre 1 y n
	public static double intermedio1aN(int n) {
		  return (1 + n) / 2;
	}
}
