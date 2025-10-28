package ejercicio1_canciones;

public class CD {
	private Canciones[] canciones;
    private int contador;

    // Constructor predeterminado
    public CD() {
        this.canciones = new Canciones[10]; // Tamaño fijo de 10 para este ejemplo
        this.contador = 0;
    }

    // Método para obtener el número de canciones
    public int numeroCanciones() {
        return contador;
    }

    // Método para obtener una canción por su posición
    public Canciones dameCancion(int posicion) throws IndexOutOfBoundsException {
        if (posicion < 0 || posicion >= contador) {
            throw new IndexOutOfBoundsException("Posición fuera de rango.");
        }
        return canciones[posicion];
    }

    // Método para grabar una canción en una posición específica
    public void grabaCancion(int posicion, Canciones nuevaCancion) throws IndexOutOfBoundsException {
        if (posicion < 0 || posicion >= contador) {
            throw new IndexOutOfBoundsException("Posición fuera de rango.");
        }
        canciones[posicion] = nuevaCancion;
    }

    // Método para agregar una canción
    public void agrega(Canciones nuevaCancion) throws IllegalStateException {
        if (contador >= canciones.length) {
            throw new IllegalStateException("El CD está lleno.");
        }
        canciones[contador] = nuevaCancion;
        contador++;
    }

    // Método para eliminar una canción
    public void elimina(int posicion) throws IndexOutOfBoundsException {
        if (posicion < 0 || posicion >= contador) {
            throw new IndexOutOfBoundsException("Posición fuera de rango.");
        }
        for (int i = posicion; i < contador - 1; i++) {
            canciones[i] = canciones[i + 1];
        }
        canciones[contador] = null;
        contador--;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < contador; i++) {
            sb.append(i + 1).append(". ").append(canciones[i]).append("\n");
        }
        return sb.toString();
    }
}
