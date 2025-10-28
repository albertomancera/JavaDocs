package examenT3;

import java.time.LocalDate;

import examenT3.EnumFormato.Formato;
import examenT3.Genero.Genero_Libro;

public class LDigital extends Libro{
	public static final double TAMANNO_DEFECTO = 0;
	public static final Formato FORMATO_DEFECTO = Formato.EPUB;
	
	private double tamannoArchivo;
	private Formato formato_doc;
	
	
	
	public LDigital() {
		super();
		this.identificador = String.format("D-"+ super.identificador);
		this.tamannoArchivo = TAMANNO_DEFECTO;
		this.formato_doc = FORMATO_DEFECTO;
	}


	public LDigital(String titulo, String autor, LocalDate fechapublicacion, Genero_Libro genero,
			boolean disponibilidad, double tamannoArchivo, Formato formato_doc) throws IllegalArgumentException {
		super(titulo, autor, fechapublicacion, genero, disponibilidad);
			if(!formato_doc.equals(Formato.EPUB) && !formato_doc.equals(Formato.MOBI) && !formato_doc.equals(Formato.PDF)) {
				throw new IllegalArgumentException("El formato del libro solo puede ser o EPUB, MOBI O PDF");
			}
		
		this.identificador = String.format("D-"+ super.identificador);
		this.tamannoArchivo = tamannoArchivo;
		this.formato_doc = formato_doc;
	}
	
	//Metodos
	public double calcularPrecio() throws IllegalArgumentException{
		if(!disponibilidad) {
			throw new IllegalArgumentException("El libro no está disponible");
		}
		double precio = tamannoArchivo * 0.45;
		
		if(!formato_doc.equals(Formato.EPUB)) {
			precio= precio + 1.5;
		}
		return precio;
	}


	@Override
	public String toString() {
		return super.toString() + " LDigital [tamannoArchivo=" + tamannoArchivo + ", formato_doc=" + formato_doc + "]";
	}

	public static LDigital crearLibro(String titulo, String autor, LocalDate fechapublicacion, Genero_Libro genero,
			boolean disponibilidad, double tamannoArchivo, Formato formato_doc) throws IllegalArgumentException {
		return new LDigital(titulo,autor,fechapublicacion,genero,disponibilidad,tamannoArchivo,formato_doc);
	}
	

	
}
