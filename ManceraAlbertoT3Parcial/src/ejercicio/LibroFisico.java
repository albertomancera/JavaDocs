package ejercicio;

import java.time.LocalDate;

import ejercicio.ENUM.Genero;
import ejercicio.ENUM.TipoTapa;

public class LibroFisico extends Libro {
	//Atributos
	public static int NUMPAGINA_DEFECTO = 100;
	public static TipoTapa TAPA_DEFECTO = TipoTapa.BLADA;
	
	private int numPaginas;
	private TipoTapa tapa;
	
	private static int contador = 0;
	private static int numLibrosFisicos = 0;
	
	public LibroFisico( String titulo, String autor, LocalDate fechaPublicacion,
			Genero genero, boolean disponibilidad, int numPaginas, TipoTapa tapa) throws IllegalArgumentException {
		super( titulo, autor, fechaPublicacion, genero, disponibilidad);
		this.numPaginas = numPaginas;
		this.tapa = tapa;
	
		
		if(this.numPaginas < 0) {
			System.out.println("El número de página no puede ser negativo");
		}
		
		numLibrosFisicos ++;
	}
	
	 public LibroFisico(int numPaginas, TipoTapa tapa) {
	    	this(TITULO_DEFECTO,AUTOR_DEFECTO,FECHA_DEFECTO,GENERO_DEFECTO,DISPONIBILIDAD_DEFECTO, numPaginas, tapa);
	    	numLibrosFisicos ++;
		
		}
	
	 public LibroFisico() {
	    	this(TITULO_DEFECTO,AUTOR_DEFECTO,FECHA_DEFECTO,GENERO_DEFECTO,DISPONIBILIDAD_DEFECTO, NUMPAGINA_DEFECTO,TAPA_DEFECTO);
	    	numLibrosFisicos ++;
		
		}

	 public String getIdentificador(){
		 identificador = String.format("%s-%03d-%03d", "F", genero, contador);
			contador ++;
			
			return identificador;
	 }
	 @Override
	    public double calcularPrecio() {
	        double precio ;
	        if(tapa.DURA != null) {
	        	precio = this.numPaginas * 0.75 + 3;
	        }
	        precio = this.numPaginas * 0.75;
	        return precio;
	 }

	@Override
	public String toString() {
		return "LibroFisico [numPaginas=" + numPaginas + ", tapa=" + tapa + ", identificador=" + identificador
				+ ", titulo=" + titulo + ", autor=" + autor + ", fechaPublicacion=" + fechaPublicacion + ", genero="
				+ genero + ", disponibilidad=" + disponibilidad + "]";
	}
	
	 
	
	
}
