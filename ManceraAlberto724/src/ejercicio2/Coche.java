package ejercicio2;

import java.time.LocalDate;

public class Coche {
	//Atributos Constantes
	public static final double CILINDRADA_DEFAULT = 2000;
	public static final double POTENCIA_DEFAULT = 150;
	public static final String MATRICULA_DEFAULT = "0000 AAA";
	public static final String PROPIETARIO_DEFAULT = "Manuel";
	public static final LocalDate FECHAMATRICULACION_DEFAULT = LocalDate.now();
	
	//Atributos de objeto
	protected String matricula;
	protected String nombrePropietario;
	protected final LocalDate fechaMatriculacion;
	protected double cilindrada;
	protected double potencia;
	
	//Constructores
	public Coche (String matricula, String nombrePropietario, LocalDate fechaMatriculacion, double cilindrada, double potencia)  throws IllegalArgumentException{
		if(cilindrada < 0 || potencia < 0) {
			throw new IllegalArgumentException("La cilindrada y la potencia no pueden ser negativos");
		}	if(!matricula.matches("[0-9]{4} [A-Za-z]{3}")) {
			throw new IllegalArgumentException("El formato de la matricula tiene que ser 9999 AAAA");
		}if(matricula == null || matricula.isEmpty()) {
			throw new IllegalArgumentException("La matricula no puede estar vacía");
		}if(nombrePropietario == null || nombrePropietario.isEmpty()) {
			throw new IllegalArgumentException("El nombre no puede estar vacio");
		}
		
		this.matricula = matricula;
		this.nombrePropietario = nombrePropietario;
		this.fechaMatriculacion = fechaMatriculacion;
		this.cilindrada = cilindrada;
		this.potencia = potencia;
	}
	
	public Coche () {
		this(MATRICULA_DEFAULT,PROPIETARIO_DEFAULT, FECHAMATRICULACION_DEFAULT, CILINDRADA_DEFAULT, POTENCIA_DEFAULT);
	}
	
	//Getter y Setters
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) throws IllegalArgumentException{
		if(matricula.matches("[0-9]{4} [A-Za-z]{3}")) {
			throw new IllegalArgumentException("El formato de la matricula tiene que ser 9999 AAAA");
		}if(matricula == null || matricula.isEmpty()) {
			throw new IllegalArgumentException("La matricula no puede estar vacía");
		}
		
		this.matricula = matricula;
	}
	
	public String getNombrePropietario() {
		return nombrePropietario;
	}
	public void setNombrePropietario(String nombrePropietario) throws IllegalArgumentException{
		if(nombrePropietario == null || nombrePropietario.isEmpty()) {
			throw new IllegalArgumentException("El nombre no puede estar vacio");
		}
		this.nombrePropietario = nombrePropietario;
	}
	public LocalDate getFechaMatriculacion() {
		return fechaMatriculacion;
	}
	
	public double getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(double cilindrada) throws IllegalArgumentException {
		if(cilindrada < 0) {
			throw new IllegalArgumentException("La clindrada no puede ser negativa");
		}
		this.cilindrada = cilindrada;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) throws IllegalArgumentException {
		if(potencia < 0) {
			throw new IllegalArgumentException("La potencia no puede ser negativa");
		}
		
		this.potencia = potencia;
	}

	//To STRING
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", nombrePropietario=" + nombrePropietario + ", fechaMatriculacion="
				+ fechaMatriculacion + ", cilindrada=" + cilindrada + ", potencia=" + potencia + "]";
	}
	

	
}
