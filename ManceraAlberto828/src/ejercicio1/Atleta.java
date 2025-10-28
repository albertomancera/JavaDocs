package ejercicio1;

public class Atleta {

	//Atributos
	String nombre;
	int edad;
	double altura;
	
	//Constructor
	public Atleta(String nombre, int edad, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
	}

	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}
