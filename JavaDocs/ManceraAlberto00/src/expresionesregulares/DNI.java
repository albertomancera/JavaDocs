package expresionesregulares;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DNI {
	public static void main(String[] args) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		String dni ;
		
		System.out.println("Dime tu DNI: ");
		dni=entradaTeclado.nextLine();
		
		Pattern patron=Pattern.compile("[0-9]{8}[A-Za-z]");
		Matcher texto= patron.matcher(dni);
		boolean encaja=texto.matches();
		
		if(encaja) {
			System.out.println("Su DNI es correcto");
		}else {
			System.out.println("Su DNI es incorrecto");
		}
		
		
		
	}
}
