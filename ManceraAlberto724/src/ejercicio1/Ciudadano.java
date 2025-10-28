package ejercicio1;

public class Ciudadano extends Humano {

	//Atributo de objeto
	protected String documento;
	
	//Constructor
	public Ciudadano(String nombre, String apellido, String documento){	
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
	}


	
	//Metodo
	public String identificacion() {
		return (super.getNombreCompleto() + documento);
	}
	
}
