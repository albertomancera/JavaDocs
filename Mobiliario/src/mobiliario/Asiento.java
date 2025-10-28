package mobiliario;

public abstract class Asiento extends Mueble {

	 private int numPlazas;
	    private String tapiceria;
	    private String color;

	    public static final int MIN_PLAZAS = 1;
	    public static final int MAX_PLAZAS = 10;

	    public Asiento(double precio, String descripcion, int numPlazas, String tapiceria, String color) {
	        super(precio, descripcion);
	        if (numPlazas < MIN_PLAZAS || numPlazas > MAX_PLAZAS) {
	            throw new IllegalArgumentException("El número de plazas no está en el rango permitido: " + MIN_PLAZAS + " - " + MAX_PLAZAS);
	        }
	        this.numPlazas = numPlazas;
	        this.tapiceria = tapiceria;
	        this.color = color;
	    }

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
	        return String.format("%s Tapicería: %-14s Color:%-10s Número de plazas:%-2d", 
	                             super.toString(), tapiceria, color, numPlazas);
	    }
}
