package mobiliario;

public abstract class Mueble {
	//Atributos de clase constantes
	public final static double MIN_PRECIO = 0.01;
	public final static double MAX_PRECIO = 10000.00;
	
	//Atributos de clase
	private static int numId = 0;
	
	//Atributos de objetos inmutables
	private int id;
	private String descripcion;
	
	//Atributos de objeto mutables
	protected double precio;

	//Constructores
	public Mueble(double precio, String descripcion) throws IllegalArgumentException {
		if(precio>Mueble.MAX_PRECIO || precio<Mueble.MIN_PRECIO) {
			throw new IllegalArgumentException("El precio no está en el rango permitido: "+precio);
		}
		
		this.id = numId++;
		this.precio = precio;
		this.descripcion = descripcion;
	}

	//Métodos

	public int getId() {
		return id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		 return String.format("Tipo:%-11s Id:%2d Precio:%8.2f Descripción:%-20s",
				 this.getClass().getSimpleName(),
				 this.getId(),
				 this.getPrecio(),
				 this.getDescripcion());
	}
}
