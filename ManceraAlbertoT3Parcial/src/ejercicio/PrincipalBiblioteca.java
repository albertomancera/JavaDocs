/*
 * Autor:Alberto Mancera Plaza
 * Fecha: 01/04/2025
 * Objetivo: Hacer el main
 */
package ejercicio;

import java.time.LocalDate;
import java.util.HashSet;

import ejercicio.ENUM.TipoTapa;



public class PrincipalBiblioteca {

	public static void main(String[] args) {
		
		// 1. Crea un libro digital con 3.5 Mb de tamaño y formato PDF
		System.out.println("==== 1 =====");
		Libro libro1 = new LibroDigital ();
		System.out.println(libro1.toString());
		
		// 2. Modifica la fecha de publicación a 20/12/2030.
		System.out.println("==== 2 =====");
		try {
		libro1.setFechaPublicacion(LocalDate.of(2030,12,20));
		System.out.println(libro1.toString());
		}catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		// 3. Crea un libro físico con 350 páginas y tapa dura. Los demás valores por defecto.
		System.out.println("==== 3 =====");
		Libro  libro2 = new LibroFisico(350, TipoTapa.DURA);
		System.out.println(libro2.toString());
		
		// 4. Crea 20 libros físicos con número aleatorio de páginas entre -150 y 150 páginas y agrégalos a una colección que controle los duplicados a través del identificador.
		System.out.println("==== 4 =====");
		
		HashSet<Libro> lista = new HashSet<>();
		Libro [] libros = new LibroFisico[20];
		for (int i = 0; i < libros.length; i++) {
			int numPaginas = (int) (Math.random());
			libros [i] = new LibroFisico(numPaginas, TipoTapa.BLADA);
		
			
			lista.add(libros[i]);
		};
	
		for (int i = 0; i < libros.length; i++) {
			libros [i] = new LibroFisico();
			System.out.println(libros[i]);
		};
		
		// 5. Crea 10 libros digitales con valores por defecto y agrégalos a la colección anterior.
		System.out.println("==== 5 =====");
		Libro [] librosD = new LibroDigital[10];
		for (int i = 0; i < librosD.length; i++) {
			librosD [i] = new LibroDigital();
			System.out.println(librosD[i]);
		};
		// 6. Calcula el precio de cada uno de los libros de la colección.
		System.out.println("==== 6 =====");

		
		// 7.  Indica la cantidad de libros que están en la colección y el importe total de todos los libros.
		System.out.println("==== 7 =====");
	
		
		// 8. Ordena los libros por orden alfabético de título.
		System.out.println("==== 8 =====");
		
		
		// 9. Elimina los tres primeros libros con precio por debajo de 5€.
		System.out.println("==== 9 =====");
		
		
		// 10. Crea un libro digital con los siguientes valores usando un pseudoconstructor.
		System.out.println("==== 10 =====");
		
		
		// 11.Calcula el número de años transcurridos desde la fecha de publicación del libro "El quijote".
				System.out.println("==== 11 =====");
	}
}
		