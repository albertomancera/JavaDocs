package mobiliario;

import java.util.Arrays;

public abstract class Almacenaje extends Mueble implements Personalizable {
	//Atributos de clase constante
	public final static int MIN_MODULOS = 1;
	public final static int MAX_MODULOS = 20;
	
	//Atributos de objeto
	protected double anchura;
	protected double altura;
	private int numMaxModulos;
	protected Modulo[] array;
	protected int modulosAnadidos = 0;
	
	//Constructores
	public Almacenaje (double precio, String descripcion, double anchura, double altura, int numMaxModulos) throws IllegalArgumentException {
		super(precio, descripcion);
		if (numMaxModulos>Almacenaje.MAX_MODULOS || numMaxModulos<Almacenaje.MIN_MODULOS) {
			throw new IllegalArgumentException("Error: no se puede crear el mueble de Almacenaje. El número de módulos no está en el rango permitido: "+numMaxModulos);
		}
		
		this.anchura = anchura;
		this.altura = altura;
		this.numMaxModulos = numMaxModulos;
		this.array = new Modulo[numMaxModulos];
		array[modulosAnadidos] = Modulo.BALDA;
		modulosAnadidos++;
	}

	//Métodos
	public double getAnchura() {
		return anchura;
	}

	public double getAltura() {
		return altura;
	}

	public int getNumModulos() {
		return numMaxModulos;
	}

	public int getModulosAnyadidos() {
		return modulosAnadidos;
	}

	@Override
	public String obtenerModulos() {
		return Arrays.toString(array);
	}

	@Override
	public void anyadirModulo (Modulo modulo) throws NullPointerException, IllegalStateException {
		modulosAnadidos++;
		if (modulo==null) {
			modulosAnadidos--;
			throw new NullPointerException("Error: el módulo a añadir no puede ser nulo");
		} if (modulosAnadidos>numMaxModulos) {
			modulosAnadidos--;
			throw new IllegalStateException("Error: no se puede añadir el modulo "+modulo+". El número de módulos no puede superar el máximo permitido: "+numMaxModulos);
		}
	}

	@Override
	public Modulo extraerModulo() throws IllegalStateException {
		modulosAnadidos--;
		if (modulosAnadidos<Almacenaje.MIN_MODULOS) {
			modulosAnadidos++;
			throw new IllegalStateException("Error: no se puede quitar el módulo. El número de módulos no puede ser inferior a "+Almacenaje.MIN_MODULOS);
		}
		return array[modulosAnadidos];
	}

	@Override
	public String toString() {
		return String.format("%-14s Anchura:%8.2f Altura:%8.2f Número máximo de módulos:%2d", 
				super.toString(),
				this.getAnchura(),
				this.getAltura(), 
				this.getNumModulos());
	}
}
