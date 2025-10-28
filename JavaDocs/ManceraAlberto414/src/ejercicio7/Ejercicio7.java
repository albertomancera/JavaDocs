package ejercicio7;
import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		double ancho, alto;
		System.out.println("Dime el ancho de un rectángulo: ");
		ancho = sc.nextDouble();
		
		System.out.println("Dime el alto de un rectángulo: ");
		alto = sc.nextDouble();
		
		System.out.println("El perímetro de un rectángulo es: "+perimetroRectangulo(ancho,alto));
		System.out.println("El área  de un rectángulo es: "+areaRectangulo(ancho,alto));
	}
	//Devuelve el perímetro
	public static double perimetroRectangulo(double ancho, double alto) {
		double perimetro;
		 perimetro= 2*(ancho + alto);
		 return (perimetro);
	}
	//Devuelve el área
	public static double areaRectangulo(double ancho, double alto) {
		double area;
		area = ancho * alto;
		return (area);
	}
}
