/*
 * Autor: Alberto Mancera Plaza
 * Fecha: 18/02/2025
 * Objetivo: Clase Automovil
 */
package ejercicio1;

public class Automovil {
//Atributos
	//Atributos Constantes
	public static final int MAXIMO_AUTOMOVIL = 500;
	public static final double VELOCIDAD_MAX = 240;
	public static  tipoPro PROPIETARIO_DEFAULT = tipoPro.valueOf("empresa");
	public static  tipoMot TIPOMOTOR_DEFAULT = tipoMot.valueOf("híbrido");
	public static final double VELOCIDAD_DEFAULT = 55;
	
	//Atributos de clase
	private static int cantidadAutomoviles = 0;
	private static int cantidadCombustion = 0;
	private static int cantidadHibridos = 0;
	private static int cantidadElectricos = 0;
	
	
	public enum tipoPro{empresa, particular};
	public enum tipoMot{combustión, híbrido, eléctrico};
	
	//Atributos de objetos
	private String codigo;
	private tipoPro tipoPropietario;
	private int anioMatriculacion;
	private tipoMot tipoMotor;
	private double velocidadActual;
	
	//Constructores
	public Automovil(String codigo, tipoPro tipoPropietario, int anioMatriculacion, tipoMot tipoMotor,
			 double velocidadActual) throws IllegalArgumentException {
		this.codigo = codigo;
		this.tipoPropietario = tipoPropietario;
		this.anioMatriculacion = anioMatriculacion;
		this.tipoMotor = tipoMotor;
		this.velocidadActual = velocidadActual;
		
		
		cantidadAutomoviles ++;
	}
	
	public Automovil(){
		this.tipoPropietario = PROPIETARIO_DEFAULT;
		this.tipoMotor = TIPOMOTOR_DEFAULT;
		this.velocidadActual = VELOCIDAD_DEFAULT;
		
		cantidadAutomoviles ++;
	}

	//Getter y Setter
	public static int getCantidadAutomoviles() {
		return cantidadAutomoviles;
	}

	public static void setCantidadAutomoviles(int cantidadAutomoviles) {
		Automovil.cantidadAutomoviles = cantidadAutomoviles;
	}

	public static int getCantidadCombustion() {
		return cantidadCombustion;
	}

	public static void setCantidadCombustion(int cantidadCombustion) {
		Automovil.cantidadCombustion = cantidadCombustion;
	}

	public static int getCantidadHibridos() {
		return cantidadHibridos;
	}

	public static void setCantidadHibridos(int cantidadHibridos) {
		Automovil.cantidadHibridos = cantidadHibridos;
	}

	public static int getCantidadElectricos() {
		return cantidadElectricos;
	}

	public static void setCantidadElectricos(int cantidadElectricos) {
		Automovil.cantidadElectricos = cantidadElectricos;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) throws IllegalArgumentException {
		if(codigo.matches("[0-9]{2}-[0-9]{5}")) {
			throw new IllegalArgumentException("El fromato del código tiene que ser AA-99999");
		}
		this.codigo = codigo;
	}

	public tipoPro getTipoPropietario() {
		return tipoPropietario;
	}

	public void setTipoPropietario(tipoPro tipoPropietario) {
		this.tipoPropietario = tipoPropietario;
	}

	public int getAnioMatriculacion() {
		return anioMatriculacion;
	}

	public void setAnioMatriculacion(int anioMatriculacion) {
		this.anioMatriculacion = anioMatriculacion;
	}

	public tipoMot getTipoMotor() {
		return tipoMotor;
	}

	public void setTipoMotor(tipoMot tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	public double getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(double velocidadActual) {
		this.velocidadActual = velocidadActual;
	}
	
	//Metodos
	public void aumentarVelocidad(double velocidad) throws IllegalArgumentException {
		if(this.velocidadActual + velocidad > VELOCIDAD_MAX) {
			throw new IllegalArgumentException("No se puede superar el límite maximo de velocidad");
		}
		
		velocidadActual = velocidadActual + velocidad;
	}
	
	
	public void bajarVelocidad(double velocidad) throws IllegalArgumentException{
		if(this.velocidadActual - velocidad < 0 ) {
			throw new IllegalArgumentException ("No se puede quedar en velocidad negativa");
		}
		
		velocidadActual = velocidadActual - velocidad;
	}
	

	public static Automovil [] crearArrayAutomovil (int cantidad) throws IllegalArgumentException{
		if(cantidad < 1 || cantidad >= MAXIMO_AUTOMOVIL) {
			throw new IllegalArgumentException("Numero de automoviles incorrecto "+ cantidad + " , debe ser mayor o igual que 1 y menor o igual que 500");
		}
		
		Automovil[] array = new Automovil [cantidad]; 
		for (int i = 0; i <cantidad; i++) {
			array[i] = new Automovil();
			
			cantidadAutomoviles ++;
		}
		
		return array;
	}

	//To String
	@Override
	public String toString() {
		return "Automovil [Codigo = " + codigo + ", Tipo Propietario = " + tipoPropietario + ", Año Matriculacion = "
				+ anioMatriculacion + ", Tipo Motor = " + tipoMotor + ", Velocidad Actual=" + velocidadActual + "]";
	}
	
	
}
