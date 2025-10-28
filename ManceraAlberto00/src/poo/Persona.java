package poo;

public class Persona {

	//Atributos
	private String nombre;			//public , privated, protected   ENCAPSULAMIENTO CON private
	private String apellidos;
	private int edad;
	
	//Constructor por defecto
	public Persona() {
		this.nombre = "";
		this.apellidos = "";
		this.edad = 0;
	}
	
	public Persona(String nombre, String apellidos, int edad) {
		if (edad < 0) {
			throw new IllegalArgumentException("La edad debe ser positiva");
		}
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	//Getter (obtener) Setter (modificar)

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//Metodos
	public String nombreCompleto() {
		return this.nombre + " " + this.apellidos;
	}
	
	public boolean mayorEdad() {
		return this.edad >=18;
	}

	
	//To String
	@Override
	public String toString() {
		return this.nombreCompleto() + " " + edad;
		
	}
	
	
}


