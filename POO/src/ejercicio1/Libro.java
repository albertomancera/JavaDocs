package ejercicio1;

import java.util.Objects;

public class Libro {
	//Atributos
	private String isbn;
	private String titulo;
	private int numPaginas;
	private String autor;
	private boolean prestado;
	
	//Constructores
	
	public Libro(String isbn, String titulo, int numPaginas, String autor, boolean prestado) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.numPaginas = numPaginas;
		this.autor = autor;
		this.prestado = prestado;
	}
	
	public Libro() {
		this("","",0,"", false);
	}

	//Getter y Setters
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	//Metodos
	public void prestar() throws IllegalArgumentException{
		if(prestado) {
			throw new IllegalArgumentException("El libro esta prestado");
		}
		
		this.prestado = true;
	}
	
	public void devolver() throws IllegalArgumentException{
		if(!prestado) {
			throw new IllegalArgumentException("El libro no esta prestado");
		}
		
		this.prestado = false;
	}
	
	public double imprimir(double coste) throws IllegalArgumentException{
		if(coste < 0 ) {
			throw new IllegalArgumentException("El coste no puede ser negativo");
		}
		
		return coste = coste * this.numPaginas;
	}


	
	//To String
	@Override
	public String toString() {
		String mensaje = "El libro " + this.isbn + " con titulo "+ this.titulo + " y autor " + this.autor + " tiene " + this.numPaginas + " páginas y ";
		
		if(!this.prestado) {
			mensaje += " no ";
		}
		mensaje += "esta prestado";
		
		return mensaje;
	}
	
	
	//Equals y Hash
	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(isbn, other.isbn);
	}
	
}
