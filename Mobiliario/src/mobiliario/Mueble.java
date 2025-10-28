package mobiliario;

public abstract class Mueble {
	//Atributos
	//Atributos constantes
	public static final double MIN_PRECIO = 0.01;
	public static final double MAX_PRECIO = 10000.00;
	
	//Atributos de clase
	 private static int contador = 0;
	    private int id;
	    private double precio;
	    private String descripcion;

	    public Mueble(double precio, String descripcion) {
	        this.id = ++contador;
	        this.precio = precio;
	        this.descripcion = descripcion;
	    }

	    public int getId() {
	        return id;
	    }

	    public double getPrecio() {
	        return precio;
	    }

	    public String getDescripcion() {
	        return descripcion;
	    }

	    @Override
	    public String toString() {
	        return String.format("Tipo:%-11s Id:%2d Precio:%8.2f Descripción:%-20s", 
	                             this.getClass().getSimpleName(), id, precio, descripcion);
	    }

	
	
	
}
