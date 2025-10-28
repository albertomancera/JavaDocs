package poo;

public class Gerente extends Persona{

	private String departamento;

	public Gerente(String nombre, String apellidos, int edad, String departamento) throws IllegalArgumentException {
		super(nombre, apellidos, edad);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public double sueldo() {
		switch (this.departamento) {
		case "informatica":
			return 1500;
		case "contabilidad":
			return 1600;
		case "rrhh":
			return 1459;
		default:
			return 1200;
		}
	}
	@Override
	public String toString() {
		return super.toString() + "Gerente [departamento=" + departamento + "]";
	}
	
	
}
