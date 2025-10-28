package ejercicio;

import java.time.LocalDate;

import ejercicio.ENUM.FormatoDigital;
import ejercicio.ENUM.Genero;

public class LibroDigital extends Libro {
	
	//Atributos
	public static double TAMANNO_DEFECTO = 20;
	public static FormatoDigital FORMATO_DEFECTO = FormatoDigital.EPUB;
	
	private double tamannoArchivo;
	FormatoDigital formatoDocumento;
	
	private static int contador = 0;
	private static int numLibrosDigitales = 0;
	
	
	
	public LibroDigital( String titulo, String autor, LocalDate fechaPublicacion,
			Genero genero, boolean disponibilidad, double tamannoArchivo, FormatoDigital formatoDocumento) {
		super( titulo, autor, fechaPublicacion, genero, disponibilidad);
		this.tamannoArchivo = tamannoArchivo;
		this.formatoDocumento = formatoDocumento;
		
		numLibrosDigitales ++;
	}

	 public LibroDigital() {
	    	this(TITULO_DEFECTO,AUTOR_DEFECTO,FECHA_DEFECTO,GENERO_DEFECTO,DISPONIBILIDAD_DEFECTO, TAMANNO_DEFECTO, FORMATO_DEFECTO);
	    numLibrosDigitales ++;
		
		}
	 
	 public String getIdentificador(){
		 identificador = String.format("%s-%03d-%03d", "D", genero, contador);
			contador ++;
			
			return identificador;
	 }
	 
	  @Override
	    public double calcularPrecio() {
	        double precio ;
	        if(formatoDocumento.EPUB != null) {
	        	precio = tamannoArchivo * 0.45 + 1.5;
	        }
	       precio = tamannoArchivo * 0.45;
	       
	       return precio;
	    }

	@Override
	public String toString() {
		return "LibroDigital [tamannoArchivo=" + tamannoArchivo + ", formatoDocumento=" + formatoDocumento
				+ ", identificador=" + identificador + ", titulo=" + titulo + ", autor=" + autor + ", fechaPublicacion="
				+ fechaPublicacion + ", genero=" + genero + ", disponibilidad=" + disponibilidad + "]";
	}


	
	
	

	
	
}
