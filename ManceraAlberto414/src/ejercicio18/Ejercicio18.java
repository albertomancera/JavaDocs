package ejercicio18;
import java.util.Scanner;


public class Ejercicio18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dni;
		
		System.out.println("Dime los números de tu DNI: ");
		dni = sc.nextInt();
		
		
		System.out.println("Para el DNI "+dni+" el NIF es "+nif(dni));
		 
	}
	//Devuelve la letra del DNI
	public static String nif(int dni) {
		String letraNif=" ";
		int resultado=0;
		
		//Sacar el resto de la división
		resultado=dni%23;
		
		switch(resultado) {
		case 0: 
			letraNif= "T";
			break;
		case 1:
			letraNif="R";
			break;
		case 2:
			letraNif="W";
			break;
		case 3:
			letraNif="A";
			break;
		case 4:
			letraNif="G";
			break;
		case 5:
			letraNif="M";
			break;
		case 6:
			letraNif="Y";
			break;
		case 7:
			letraNif="F";
			break;
		case 8:
			letraNif="P";
			break;
		case 9:
			letraNif="D";
			break;
		case 10:
			letraNif="X";
			break;
		case 11:
			letraNif="B";
			break;
		case 12:
			letraNif="N";
			break;
		case 13:
			letraNif="J";
			break;
		case 14:
			letraNif="Z";
			break;
		case 15:
			letraNif="S";
			break;
		case 16:
			letraNif="Q";
			break;
		case 17:
			letraNif="V";
			break;
		case 18:
			letraNif="H";
			break;
		case 19:
			letraNif="L";
			break;
		case 20:
			letraNif="C";
			break;
		case 21:
			letraNif="K";
			break;
		case 22:
			letraNif="E";
			break;
		}
			
		
		return letraNif;
	}

}
