package ejercicio19;
import java.util.Scanner;

public class Ejercicio19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x,y,z;
		
		System.out.println("Dame un valor para X:");
		x= sc.nextInt();
		
		System.out.println("Dame un valor para Y:");
		y= sc.nextInt();
		
		System.out.println("Dame un valor para Z:");
		z= sc.nextInt();
		
		if(iguales(x,y,z)) {
			System.out.println("Los valores enteros (3 valores) se ajustan a la ecuación de Pitágoras");
		}else {
			System.out.println("Los valores enteros no se ajustan a la ecuación");
		}
		
	}
//Devuelva si son iguales o no
	public static boolean iguales(int x,int y,int z) {
		boolean sonIguales= false ;
		
		if((x*x) + (y*y) == (z*z)) {
			sonIguales = true;
		}
		return sonIguales;
		}
}
