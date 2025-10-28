package ejercicio;

import java.time.LocalDate;
import java.time.Period;

import ejercicio.ENUM.Genero;

public abstract class Libro {

	//Atributos
	public static String TITULO_DEFECTO = "Titulo Defecto";
	public static String AUTOR_DEFECTO = "Autor Defecto";
	public static LocalDate FECHA_DEFECTO = LocalDate.of(2000,01,01);
	public static Genero GENERO_DEFECTO = Genero.CUENTO;
	public static boolean DISPONIBILIDAD_DEFECTO = true;
	
	protected String identificador;
    protected String titulo;
    protected String autor;
    protected LocalDate fechaPublicacion;
    protected Genero genero;
    protected boolean disponibilidad;
    

    public Libro( String titulo, String autor, LocalDate fechaPublicacion,
			Genero genero, boolean disponibilidad) 	throws IllegalArgumentException{
    	if(fechaPublicacion.isAfter(LocalDate.now())) {
    		throw new IllegalArgumentException("La fecha de publicación no puede ser posterior a la fecha actual");
    	}
    	
    	this.titulo = titulo;
		this.autor = autor;
		this.fechaPublicacion = fechaPublicacion;
		this.genero = genero;
		this.disponibilidad = disponibilidad;
    }
    	
    public Libro() {
    	this(TITULO_DEFECTO,AUTOR_DEFECTO,FECHA_DEFECTO,GENERO_DEFECTO,DISPONIBILIDAD_DEFECTO);
    
	
	}
    int contador = 0;
    public String getIdentificador(){
		 identificador = String.format("%s-%03d-%03d", "F", genero, contador);
			contador ++;
			return identificador;
	 }
    
    public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(LocalDate fechaPublicacion) throws IllegalArgumentException{
		if(fechaPublicacion.isAfter(LocalDate.now())) {
    		throw new IllegalArgumentException("La fecha de publicación no puede ser posterior a la fecha actual");
    	}
		this.fechaPublicacion = fechaPublicacion;
	}
	


	public double precioAlquiler(int numDias) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double calcularPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return String.format(
				"Libro [identificador=%s, titulo=%s, autor=%s, fechaPublicacion=%s, genero=%s, disponibilidad=%s, contador=%s]",
			identificador, titulo, autor, fechaPublicacion, genero, disponibilidad, contador);
	}

	
	
	
	
	
	
}




