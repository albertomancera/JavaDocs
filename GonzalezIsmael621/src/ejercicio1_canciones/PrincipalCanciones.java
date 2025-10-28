package ejercicio1_canciones;

public class PrincipalCanciones {

	public static void main(String[] args) {
        // 1. Crear una canción sin título y sin autor.
        Canciones cancion1 = new Canciones();

        // 2. Crear una canción con los valores por defecto.
        Canciones cancion2 = new Canciones("Despacito", "Luis Fonsi");

        // 3. Modificar el título de la canción anterior con y sin contenido.
        try {
            cancion2.ponTitulo("Shape of You");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            cancion2.ponTitulo(""); // Esto debería lanzar una excepción
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // 4. Clonar la canción anterior.
        Canciones cancionClonada = cancion2.clonar();

        // 5. Crear una variable de referencia a la canción clonada.
        Canciones referenciaCancion = cancionClonada;

        // 6. Modificar el autor de la canción clonada usando la variable de referencia.
        referenciaCancion.ponAutor("Ed Sheeran");

        // 7. Mostrar la información de todas las canciones.
        System.out.println(cancion1);
        System.out.println(cancion2);
        System.out.println(cancionClonada);

	}

}
