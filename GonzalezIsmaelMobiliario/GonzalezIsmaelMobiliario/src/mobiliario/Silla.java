package mobiliario;

public final class Silla extends Asiento implements Ajustable {
	//Atributos estáticos constantes
	public static final int MIN_POSICION = 1;
	public static final int MAX_POSICION = 4;
	
	//Atributos de objeto
	private int posicionRespaldo;
	
	//Constructores
	public Silla(double precio, String descripcion, String tapiceria, String color) {
		super(precio, descripcion, Asiento.MIN_PLAZAS, tapiceria, color);
		this.posicionRespaldo = Silla.MIN_POSICION;
	}

	//Metodos
	@Override
	public int obtenerPosicion() {
		return posicionRespaldo;
	}

	@Override
	public int subirPosicion() throws IllegalStateException {
		posicionRespaldo++;
		if(posicionRespaldo>Silla.MAX_POSICION) {
			posicionRespaldo--;
			throw new IllegalStateException("Error: no se puede subir a la posición "+(posicionRespaldo++)+", "+
					"ya que la posición máxima es "+Silla.MAX_POSICION);
		}
		return posicionRespaldo;
	}

	@Override
	public int bajarPosicion() throws IllegalStateException {
		posicionRespaldo--;
		if(posicionRespaldo<Silla.MIN_POSICION) {
			posicionRespaldo++;
			throw new IllegalStateException("Error: no se puede bajar a la posición "+(posicionRespaldo--)+", "+
			"ya que la posición mínima es "+Silla.MAX_POSICION);
		}
		return posicionRespaldo;
	}

	@Override
	public String toString() {
		return String.format("%-14s Posicion del Respaldo:%-2d", 
				super.toString(),
				this.obtenerPosicion());
	}
}
