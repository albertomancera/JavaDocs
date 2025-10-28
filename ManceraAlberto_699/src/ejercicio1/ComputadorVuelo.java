package ejercicio1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ComputadorVuelo {
	//ATRIBUTOS
	//ATRIBUTOS CONSTANTES
	public static final String PILOTO_DEFECTO = "Juan Pérez";
	public static final String MATRICULA_DEFECTO = "EC-ABC";
	public static final String MODELO_DEFECTO = "Cessna 152";
	public static final int MIN_ALTITUD = 1000;
	public static final int MAX_ALTITUD = 3000;
	public static final int VUELO_ESCUELA = 0;
	public static final int VUELO_PRIVADO = 1;
	
	//ATRIBUTOS DE CLASE
	private static int cantidadTotalAero = 0;
	private static int cantidadVolando;
	private static int numHorasVuelo;
	
	private String matricula ;
	private final String modelo;
	
	//Van cambiando
	private boolean volando;
	private String nombrePiloto;
	private int tipoVuelo;
	private double tiempoTotalVuelo;
	private double velocidad;
	private double rumbo;
	private double altitud;

	//Constructores
	public ComputadorVuelo(String matricula, String modelo, String nombrePiloto) throws NullPointerException , IllegalArgumentException {
		
		Pattern patron=Pattern.compile("EC-[A-Z]{3}");
		Matcher texto= patron.matcher(matricula);
		boolean encaja=texto.matches();
		if(matricula == null) {
			throw new NullPointerException (" La matrícula de la aeronave no puede ser nula");		
		}else if(encaja == true) {
			throw new IllegalArgumentException (" El formato de la matrícula es incorrecto:");
		}else if(matricula == " " ) {
			throw new IllegalArgumentException ("La matrícula contiene una cadena vacía");			
		}
			
		this.matricula = matricula;
		this.modelo = modelo;
		this.nombrePiloto = nombrePiloto;
		
		cantidadTotalAero ++;
		
	}

	public ComputadorVuelo(String matricula, String modelo) {
		
		this.matricula = matricula;
		this.modelo = modelo;
		this.nombrePiloto = PILOTO_DEFECTO;
		
		cantidadTotalAero ++;
	}

	public ComputadorVuelo() {
	this( MATRICULA_DEFECTO, MODELO_DEFECTO, PILOTO_DEFECTO);
	}
	
	//METODOS
	public static ComputadorVuelo [] crearArrayComputadorVuelo (int cantidad) throws IllegalArgumentException{
		if(cantidad < 1 || cantidad > 10) {
			throw new IllegalArgumentException("Numero de aviones incorrecto "+ cantidad + " , debe ser mayor o igual que 1 y menor o igual que 10");
		}
		
		ComputadorVuelo[] array = new ComputadorVuelo [cantidad]; 
		for (int i = 0; i <cantidad; i++) {
			array[i] = new ComputadorVuelo();
		}
		
		return array;
	}

	//Getters
	public String getMatricula() {
		return matricula;
	}

	public boolean isVolando() {
		return volando;
	}

	public String getPiloto() {
		return nombrePiloto;
	}

	public int getTipoVuelo() {
		return tipoVuelo;
	}

	public double getTiempoTotalVuelo() {
		return tiempoTotalVuelo;
	}
	
	public double getVelocidad() {
		return velocidad;
	}


	public double getRumbo() {
		return rumbo;
	}

	public double getAltitud() {
		return altitud;
	}


	public String getModelo() {
		return modelo;
	}

	//Setters
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public void setRumbo(double rumbo) {
		this.rumbo = rumbo;
	}

	public void setAltitud(double altitud) {
		this.altitud = altitud;
	}

	//Geters
	public static int getNumAeronaves() {
		return cantidadTotalAero;
	}

	public static int getNumAeronavesVolando() {
		return cantidadVolando;
	}

	public static int getNumHorasVuelo() {
		return numHorasVuelo;
	}

	//Metodos
	public void despegar(int tipoVuelo, double velocidad, double altitud ) throws IllegalStateException, IllegalArgumentException {
		if(altitud < MIN_ALTITUD || altitud > MAX_ALTITUD) {
			throw new IllegalArgumentException("La altitud de vuelo de "+ altitud + " metros es incorrecta.");
		}if (this.volando == true) {
			throw new IllegalStateException (matricula + " ya ha despegado y se encuentra fuera del aeropuerto");
		}
		
		cantidadVolando ++;
		this.volando = true;
	}
	
	public void aterrizar(String aeropuertoSalida, String aeropuertoLLegada, int tiempoVuelo) throws IllegalStateException {
		if(!volando ) {
			throw new IllegalStateException ( matricula + " ya ha aterrizado y debe despegar de nuevo antes de aterrizar");
		}
		
		this.volando = false;
		
		tiempoVuelo += tiempoTotalVuelo;
		tiempoTotalVuelo += numHorasVuelo;
	}

	//To String
	@Override
	public String toString() {
		return "[Matricula=" + matricula + ", Modelo=" + modelo + ", isVolando=" + volando
				+ ", Piloto=" + nombrePiloto + ", TipoVuelo=" + tipoVuelo + ", TiempoTotal="
				+ tiempoTotalVuelo + ", V=" + velocidad + ", Rumbo=" + rumbo + ", Altitud=" + altitud + " metros]";
	}
	
	
	
	
	
	
	
	
	
}
