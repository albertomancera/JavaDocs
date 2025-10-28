package mobiliario;

public abstract class Asiento extends Mueble {
	//Atributos constantes de clase
	public static final int MIN_PLAZAS = 1;
	public static final int MAX_PLAZAS = 9;
	
	//Atributos de objeto
	private int numPlazas;
	private String tapiceria;
	private String color;
	
	//Constructores
	public Asiento (double precio, String descripcion, int numPlazas, String tapiceria, String color) throws IllegalArgumentException {
		super(precio, descripcion);
		if (numPlazas<Asiento.MIN_PLAZAS || numPlazas>Asiento.MAX_PLAZAS) {
			throw new IllegalArgumentException("El número de plazas no está en el rango permitido: "+numPlazas);
		}
		this.numPlazas = numPlazas;
		this.tapiceria = tapiceria;
		this.color = color;
	}

	//Metodos
	public int getNumPlazas() {
		return numPlazas;
	}

	public String getTapiceria() {
		return tapiceria;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return String.format("%-14s Tapicería: %-14s Color:%-10s Número de plazas:%-2d",
				 super.toString(),
				 this.getTapiceria(),
				 this.getColor(),
				 this.getNumPlazas() );
	}
}
