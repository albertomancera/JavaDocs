package objetos;

public class Bombilla {
	//Atributos de clase
	public static final boolean ESTADO_DEFAULT = false;

	private static int creadas = 0;
	private static int encendidas = 0;
	
	//Atributos de objeto
	private boolean estadoBombillas;
	private int numEncendidas;
	
	//Costructor

	public Bombilla(boolean estadoBombillas) {
		this.estadoBombillas = estadoBombillas;
		creadas++;
		
		if(estadoBombillas == true) {
			this.numEncendidas = 1;
			numEncendidas ++;
		}else {
			this.numEncendidas = 0;
		}
		
		
	}
	
	public Bombilla() {
		this(ESTADO_DEFAULT);
	}

	
}
