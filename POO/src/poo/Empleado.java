package poo;

public class Empleado extends Persona {
	//Atributos
	private double salario;

	//Constructor
	public Empleado(String nombre, String apellidos, int edad, double salario) throws IllegalArgumentException {
		super(nombre, apellidos, edad);
		this.salario = salario;
	}

	//Getter y Setters
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public double sueldo(){
		if(super.getEdad() <=30) {
			return this.salario + 500;
		}
		return this.salario;
	
	}

	@Override
	public String toString() {
		return super.toString() + ", con salario = " + salario;
	}
	
	
}
