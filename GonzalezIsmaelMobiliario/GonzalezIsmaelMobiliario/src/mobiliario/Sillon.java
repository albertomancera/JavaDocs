package mobiliario;

public final class Sillon extends Asiento implements Ajustable {
	//Atributos de clase constantes
	public final static byte POS_BAJADO = 0;
	public final static byte POS_SUBIDO = 1;
	
	//Atributos de objeto
	private byte posicionPies;
	
	//Constructores
	public Sillon(double precio, String descripcion, String tapiceria, String color) {
		super(precio, descripcion, Asiento.MIN_PLAZAS, tapiceria, color);
		this.posicionPies = Sillon.POS_BAJADO;
	}

	@Override
	public int obtenerPosicion() {
		return posicionPies;
	}

	@Override
	public int subirPosicion() throws IllegalStateException {
		posicionPies++;
		if (posicionPies>Sillon.POS_SUBIDO) {
			posicionPies--;
			throw new IllegalStateException("Error: no se pueden subir los pies del sillón. Ya están subidos");
		}
		return posicionPies;
	}

	@Override
	public int bajarPosicion() {
		posicionPies--;
		if(posicionPies<Sillon.POS_BAJADO) {
			posicionPies++;
			throw new IllegalStateException("Error: no se pueden bajar los pies del sillón. Ya están bajados");
		}
		return 0;
	}
	
	@Override
	public String toString() {
		String cadena; 
		if(posicionPies==Sillon.POS_BAJADO) {
			cadena = String.format("%-14s Posicion de los Pies: bajado", 
					super.toString());
		} else {
			cadena = String.format("%-14s Posicion de los Pies: subido", 
					super.toString());
		}
		
		return cadena;
	}
}
