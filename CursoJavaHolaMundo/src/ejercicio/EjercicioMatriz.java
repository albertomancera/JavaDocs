package ejercicio;
import java.util.Scanner;

public class EjercicioMatriz {
	public static void main(String[] args) {
		Scanner sc  = new Scanner (System.in);
		
	double notas [][]= new double [4][3];
	double media[]= new double[4];
	
	
	//cargar datos
	for(int i=0;i<notas.length;i++) {
		System.out.println("Ingrese las notas del alumno: "+(i+1));
	for(int j=0;j<notas[0].length;j++) {
			notas[i][j]= sc.nextInt();
	}
	}
	//calcular los pormedios
	double total;
	for(int i=0;i<notas.length;i++) {
		total=0;
		for(int j=0;j<notas[0].length;j++) {
			total = total + notas[i][j];
		}
		media[i] = total/notas[0].length;
	}
	//mostrar notas y promedios
	for(int i=0;i<notas.length;i++) {
		System.out.println("Las notas del alumno Nº "+i+"son: ");
		for(int j=0;j<notas[0].length;j++) {
			System.out.println(notas[i][j]);
		}
		System.out.println("La media fue de :"+media[i]);
		}
	}
}
