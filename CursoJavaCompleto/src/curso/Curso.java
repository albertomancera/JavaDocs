package curso;

public class Curso {

	public static void main(String[] args) {
		/*
		 * Variable : Es un espacio de memoria que tiene un nombre asociado y puede contener un valor cambiante
		 * DECLARACIÓN: Asignar el tipo de dato y el nombre de la variable sin darle un valor inicial
		 * DEFINICION: Asignar el tipo de dato y el nombre de la variable dándole o no un valor inicial
		 * ASIGNACION: Darle un valor a la variable ya declarada
		 */

		
		String texto = "     Este es un texto asignado a una variable String    ";
		System.out.println(texto);
		
		int longitud = texto.length();
		System.out.println(longitud);
		
		char caracter = texto.charAt(1);
		System.out.println(caracter);
		
		String subString = texto.substring(5, 16);
		System.out.println(subString);
		
		String minuscula = texto.toLowerCase();
		System.out.println(minuscula);
		
		String mayuscula = texto.toUpperCase();
		System.out.println(mayuscula);
		
		int indice = texto.indexOf("variable");
		System.out.println(indice);
		
		String reemplazado = texto.replace("texto", "parrafo2");
		System.out.println(reemplazado);
		
		boolean contiene = texto.contains("asignado");
		System.out.println("¿Tiene la palabra asignado? "+ contiene);
		
		String sinEspacio = texto.trim();
		System.out.println(sinEspacio);
	}

}
