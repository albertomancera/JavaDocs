package herencia;

import java.time.LocalDate;

public class Trabajador {

	public static final String DNI_DEFAULT = "88888888L";
	public static final String NOMBRE_DEFAULT = "Nombre";
	public static final String APELLIDOS_DEFAULT = "Apellidos";
	public static final LocalDate FECHA_DEFAULT = LocalDate.of(2000, 1, 1);
	public static final int HIJOS_DEFAULT = 0;
	//Atributos de clase
	private static int numTrabajadores = 0;
	//Atributos de objetos
	protected String dni;
	protected String nombre;
	protected String apellidos;
	protected LocalDate fechaInicio;
	protected int numHijos;
	
	//Constructor con todos los atributos
	public Trabajador(String dni, String nombre, String apellidos, LocalDate fechaInicio, int numHijos) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaInicio = fechaInicio;
		this.numHijos = numHijos;
		
		numTrabajadores ++;
	};

	//Constructor con valores por defecto
	public Trabajador() {
		
		this(Trabajador.DNI_DEFAULT, Trabajador.NOMBRE_DEFAULT, Trabajador.APELLIDOS_DEFAULT, Trabajador.FECHA_DEFAULT, Trabajador.HIJOS_DEFAULT);
		
		numTrabajadores ++;
	};
	
	public double calcularNomina (float salarioBase) {
		return 0;
	}
	
	@Override
	public String toString() {
		return "Trabajador [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaInicio="
				+ fechaInicio + ", numHijos=" + numHijos + "]";
	};
	
	
	
	
	 
	 
	
	
}
