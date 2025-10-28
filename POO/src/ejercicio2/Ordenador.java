package ejercicio2;

public class Ordenador {
	//Atributos
	//Atributos constantes
	public static int RAM_DEFECTO = 4;
	public static double CAPACIDAD_DISCO_DEFECTO = 50;
	public static boolean ENCENDIDO = false;
	
	//Atributos de clase
	private String marca;
	private String modelo;
	private int gbRam;
	private double capacidadDisco;
	private double espacioDiscoUtilizado;
	private boolean encendio;
	
	//Constructores

	public Ordenador(int gbRam) {
		this.gbRam = gbRam;
	}

	public Ordenador(int gbRam, double capacidadDisco) {
		this.gbRam = gbRam;
		this.capacidadDisco = capacidadDisco;
	}

	public Ordenador(String marca, String modelo, int gbRam, double capacidadDisco) {
		this.marca = marca;
		this.modelo = modelo;
		this.gbRam = gbRam;
		this.capacidadDisco = capacidadDisco;
	}
	
	public Ordenador(){
		this("", "", RAM_DEFECTO,CAPACIDAD_DISCO_DEFECTO);
	}
	//Getter y Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getGbRam() {
		return gbRam;
	}

	public void setGbRam(int gbRam) {
		this.gbRam = gbRam;
	}

	public double getCapacidadDisco() {
		return capacidadDisco;
	}

	public void setCapacidadDisco(double capacidadDisco) {
		this.capacidadDisco = capacidadDisco;
	}

	public double getEspacioDiscoUtilizado() {
		return espacioDiscoUtilizado;
	}

	public void setEspacioDiscoUtilizado(double espacioDiscoUtilizado) {
		this.espacioDiscoUtilizado = espacioDiscoUtilizado;
	}

	public boolean isEncendio() {
		return encendio;
	}

	public void setEncendio(boolean encendio) {
		this.encendio = encendio;
	}

	
	
	//Metodos
	public void encender() throws IllegalArgumentException {
		if(this.encendio == true) {
			throw new IllegalArgumentException("El ordenador ya está encendido");
		}
		
		this.encendio = true;
	}
	
	public void apagar() throws IllegalArgumentException{
		if(this.encendio == false) {
			throw new IllegalArgumentException("El ordenador ya está apagado");
		}
		
		this.encendio = false;
	}
	
	public void transferir(int gbRam) throws IllegalArgumentException{
		if(gbRam + this.espacioDiscoUtilizado > this.capacidadDisco) {
			throw new IllegalArgumentException("No se puede transferir el archivo porque no queda espacio suficiente");
		}if(this.encendio == false) {
			throw new IllegalArgumentException("No se puede transferir el archivo con el ordenador apgado");
		}
		
		this.espacioDiscoUtilizado += gbRam;
	}
	
	public void eliminar(int gbRam) throws IllegalArgumentException{
		if(gbRam - this.espacioDiscoUtilizado < 0) {
			espacioDiscoUtilizado = 0;
		}if(this.encendio == false) {
			throw new IllegalArgumentException("No se puede eliminar el archivo con el ordenador apgado");
		}
		
		this.espacioDiscoUtilizado -= gbRam;
	}
	
	//To String
	@Override
	public String toString() {
		return "Ordenador [Marca=" + marca + ", modelo=" + modelo + ", gbRam=" + gbRam + ", capacidadDisco="
				+ capacidadDisco + ", espacioDiscoUtilizado=" + espacioDiscoUtilizado + ", encendio=" + encendio + "]";
	}
	}

