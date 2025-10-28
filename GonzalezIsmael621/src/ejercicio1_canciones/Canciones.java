package ejercicio1_canciones;

public class Canciones {
    //Atributos de objeto
	private String titulo;
    private String autor;

    // Constructor con parámetros
    public Canciones (String titulo, String autor) throws IllegalArgumentException {
        if (titulo == null || titulo.isEmpty() || autor == null || autor.isEmpty()) {
            throw new IllegalArgumentException("El título y el autor no pueden ser nulos o vacíos.");
        }
        this.titulo = titulo;
        this.autor = autor;
    }

    // Constructor predeterminado
    public Canciones() {
        this("Título desconocido", "Autor desconocido");
    }

    // Métodos getter
    public String dameTitulo() {
        return titulo;
    }

    public String dameAutor() {
        return autor;
    }

    // Métodos setter
    public void ponTitulo(String titulo) throws IllegalArgumentException {
        if (titulo == null || titulo.isEmpty()) {
            throw new IllegalArgumentException("El título no puede ser nulo o vacío.");
        }
        this.titulo = titulo;
    }

    public void ponAutor(String autor) throws IllegalArgumentException {
        if (autor == null || autor.isEmpty()) {
            throw new IllegalArgumentException("El autor no puede ser nulo o vacío.");
        }
        this.autor = autor;
    }

    // Método para clonar la canción
    public Canciones clonar() {
        return new Canciones(this.titulo, this.autor);
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor;
    }
}
