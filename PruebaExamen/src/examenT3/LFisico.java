package examenT3;

import java.time.LocalDate;

import examenT3.EnumFormato.Formato;
import examenT3.EnumTapa.Tipo_Tapa;
import examenT3.Genero.Genero_Libro;

public class LFisico extends Libro{
	public static final int NUM_PAG_DEFECTO = 0;
	public static final Tipo_Tapa TAPA_DEFECTO = Tipo_Tapa.BLANDA;
	
	private int numPaginas;
	private Tipo_Tapa tapa;
	
	public LFisico() {
		super();
		this.identificador = String.format("F-"+ super.identificador);
		this.numPaginas = NUM_PAG_DEFECTO;
		this.tapa = TAPA_DEFECTO;
	}
	
	public LFisico(String titulo, String autor, LocalDate fechapublicacion, Genero_Libro genero, boolean disponibilidad, int numPaginas, Tipo_Tapa tapa)
			throws IllegalArgumentException {
		super(titulo, autor, fechapublicacion, genero, disponibilidad);
		if(!tapa.equals(Tipo_Tapa.BLANDA) && !tapa.equals(Tipo_Tapa.DURA)) {
			throw new IllegalArgumentException("La tapa debe de ser o dura o blanda");
		}
		if(numPaginas < 0) {
			throw new IllegalArgumentException("El número de páginas no puede ser negativo");
		}
		this.identificador = String.format("F-"+ super.identificador);
		this.numPaginas = numPaginas;
		this.tapa = tapa;
	}

	//Metodos
	public double calcularPrecio() throws IllegalArgumentException{
		if(!disponibilidad) {
			throw new IllegalArgumentException("El libro no está disponible");
		}
		double precio = numPaginas * 0.75;
		
		if(tapa.equals(Tipo_Tapa.DURA)) {
			precio= precio + 3;
		}
		return precio;
	}

	@Override
	public String toString() {
		return super.toString() + " LFisico [numPaginas=" + numPaginas + ", tapa=" + tapa + "]";
	}
	
	
	
	
}
