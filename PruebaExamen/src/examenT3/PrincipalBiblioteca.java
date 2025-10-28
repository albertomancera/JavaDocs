/*
 * Autor:Alberto Mancera Plaza
 * Fecha: 01/04/2025
 * Objetivo: Hacer el main
 */
package examenT3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

import examenT3.EnumFormato.Formato;
import examenT3.EnumTapa.Tipo_Tapa;
import examenT3.Genero.Genero_Libro;

public class PrincipalBiblioteca {

	public static void main(String[] args) {
		
		// 1. Crea un libro digital con 3.5 Mb de tamaño y formato PDF
		System.out.println("==== 1 =====");
		LDigital libro1;
		try {
			libro1 = new LDigital(Libro.TITULO_DEFAULT,Libro.AUTOR_DEFAULT,Libro.FECHA_ACTUAL,Libro.GENERO_DEFECTO,
					Libro.DISPONIBILIDAD_DEFECTO,3.5,Formato.PDF);
			System.out.println(libro1);
		}catch(IllegalArgumentException e) {
			libro1 = new LDigital();
			System.out.println(e.getMessage());
		}
		
		// 2. Modifica la fecha de publicación a 20/12/2030.
		System.out.println("==== 2 =====");
		try {
			libro1.setFechapublicacion(LocalDate.of(2030, 12, 20));
			System.out.println(libro1.getFechapublicacion());
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			System.out.println(libro1);
		}
		// 3. Crea un libro físico con 350 páginas y tapa dura. Los demás valores por defecto.
		System.out.println("==== 3 =====");
		LFisico libro2;
		try {
			libro2 = new LFisico(Libro.TITULO_DEFAULT,Libro.AUTOR_DEFAULT,Libro.FECHA_ACTUAL,
					Libro.GENERO_DEFECTO,Libro.DISPONIBILIDAD_DEFECTO,350,Tipo_Tapa.DURA);
			System.out.println(libro2);
		}catch(IllegalArgumentException e) {
			libro2 = new LFisico();
			System.out.println(e.getMessage());
		}
		
		// 4. Crea 20 libros físicos con número aleatorio de páginas entre -150 y 150 páginas y agrégalos a una colección que controle los duplicados a través del identificador.
		System.out.println("==== 4 =====");
		LFisico[] libros = new LFisico[20];
		HashSet<Libro> conjunto = new HashSet<>();
		
		for(int i = 0; i<libros.length; i++) {
			try {
				libros[i] = new LFisico(Libro.TITULO_DEFAULT,Libro.AUTOR_DEFAULT,Libro.FECHA_ACTUAL,
						Libro.GENERO_DEFECTO,Libro.DISPONIBILIDAD_DEFECTO,obtenerNumeroAleatorio(),Tipo_Tapa.DURA);
				conjunto.add(libros[i]);
			}catch(IllegalArgumentException e) {
				libros[i] = new LFisico();
				conjunto.add(libros[i]);
				System.out.println(e.getMessage()+ ".Así que se asignaran valores por defecto");
			}
		}
		for (Libro libro : conjunto) {
			System.out.println(libro);
		}
		System.out.println("Numero de libros  en la colección: "+ conjunto.size());
		
		
		// 5. Crea 10 libros digitales con valores por defecto y agrégalos a la colección anterior.
		System.out.println("==== 5 =====");
		LDigital[] libros2 = new LDigital[10];
		for(int i =0; i < libros2.length; i++) {
			try {
				libros2[i] = new LDigital();
				conjunto.add(libros2[i]);
			}catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		for (Libro libro : conjunto) {
			System.out.println(libro);
		}
		System.out.println("Numeros de  libros en la coleccion: "+ conjunto.size());
		
		// 6. Calcula el precio de cada uno de los libros de la colección.
		System.out.println("==== 6 =====");
		for (Libro libro : conjunto) {
			try {
				System.out.println(libro + " Precio: "+ libro.calcularPrecio());
			}catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		
		// 7.  Indica la cantidad de libros que están en la colección y el importe total de todos los libros.
		System.out.println("==== 7 =====");
		double importeTotal = 0;
		for (Libro libro : conjunto) {
			importeTotal = importeTotal + libro.calcularPrecio();
		}
		System.out.println("El número de libros en la colleción es: "+ conjunto.size()+ " y el importe total es: "+ importeTotal);
		
		// 8. Ordena los libros por orden alfabético de título.
		System.out.println("==== 8 =====");
		ArrayList<Libro> lista = new ArrayList<>(conjunto);
		Collections.sort(lista,Comparator.comparing(Libro::getIdentificador).reversed());
		for (Libro libro : lista) {
			System.out.println(libro);
		}
		
		// 9. Elimina los tres primeros libros con precio por debajo de 5€.
		System.out.println("==== 9 =====");
		int contador = 0;
		Iterator<Libro> it = lista.iterator();
		while(contador<3 && it.hasNext()) { /*Bucle while que se ejecuta mientras: No se hayan eliminado aún 3 libros (contador < 3) y Queden libros por recorrer (it.hasNext())*/
			Libro l = it.next(); /*Obtiene el siguiente libro de la colección y lo guarda en la variable l.*/
			if(l.calcularPrecio()<5) { /* Comprueba si el precio del libro es menor de 5€.*/
				System.out.println("Borrando libro ..."+l);
				it.remove();
				contador++;
			}
		}
		
		System.out.println("Numero de elementos en la lista: "+ lista.size());
		// 10. Crea un libro digital con los siguientes valores usando un pseudoconstructor.
		System.out.println("==== 10 =====");
		LDigital libro3;
		try {
			libro3 = LDigital.crearLibro("El Quijote", "Miguel de Cervantes", LocalDate.of(1605, 01,01), Genero_Libro.NOVELA, true, 8.5, Formato.EPUB);
			System.out.println(libro3);
		}catch(IllegalArgumentException e) {
			libro3 = new LDigital();
			System.out.println(e.getMessage());
		}
		// 11.Calcula el número de años transcurridos desde la fecha de publicación del libro "El quijote".
				System.out.println("==== 11 =====");
				System.out.println("El numero de años transcurridos desde el quijote es : "+ libro3.calcularAnnosPubl()+ " años");
	}
	
	public static int obtenerNumeroAleatorio() {
        // Math.random() devuelve un valor entre 0.0 (inclusive) y 1.0 (exclusivo)
        // Multiplicamos por 301 para obtener un rango de 0 a 300
        // Luego restamos 150 para moverlo al rango de -150 a 150
        return (int)(Math.random() * 301) - 150;
    }

	public class NumeroAleatorio {
	    public static void main(String[] args) {
	        int min = 850;
	        int max = 950;
	        // Genera un número entre 850 (incluido) y 951 (excluido)
	        int numeroAleatorio = (int) (Math.random() * (max - min + 1)) + min;
	        System.out.println("Número aleatorio: " + numeroAleatorio);
	    }
	}
}
		