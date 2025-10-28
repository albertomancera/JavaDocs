package mobiliario;

public final class Mesa extends Mueble{
	//Atributos de clase constante
	public final static int MAX_COMENSALES = 16;
	public final static int MIN_COMENSALES = 4;
	
	//Atributos de objeto
	private String forma;
	private int comensales;
	
	//Constructor
	public Mesa (double precio, String descripcion, String forma, int comensales) throws IllegalArgumentException {
		super(precio, descripcion);
		if(comensales<Mesa.MIN_COMENSALES || comensales>Mesa.MAX_COMENSALES) {
			throw new IllegalArgumentException("El número de comensales no está dentro del rango: "+comensales);
		}
		
		this.forma = forma;
		this.comensales = comensales;
	}

	//Métodos
	public String getForma() {
		return forma;
	}

	public int getComensales() {
		return comensales;
	}
	
	@Override
	public String toString() {
		return String.format("%-14s Forma:%-14s Comensales:%2d", 
				super.toString(),
				this.getForma(),
				this.getComensales());
	}
}
