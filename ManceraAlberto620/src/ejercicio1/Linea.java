package ejercicio1;

public class Linea {
	public final static int PUNTOA_DEFAULT = 0;
	public final static int PUNTOB_DEFAULT = 0;
	
	private double puntoA;
	private double puntoB;
	
	public Linea(double puntoA, double  puntoB) {
		this.puntoA = puntoA;
		this.puntoB = puntoB;
	}	
	
	public Linea() {
		this(PUNTOA_DEFAULT, PUNTOB_DEFAULT);
	}

	

	
	
}
