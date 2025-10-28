package ejercicio1;

public class Humano {
	//Atributos de objeto
	protected String nombre;
	protected String apellido;
	
	//Constructores
	public Humano(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public Humano() {
		this("Juan", "García");
	}
	
	//Metodos
	public String getNombreCompleto(){
		return (apellido + " ," + nombre);
	}
	
	
}
