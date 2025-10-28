package ejercicio3;

import java.time.LocalDate;

public class Profesor extends Personal {
	//Atributos
	
	private String titulacion;
	private String asignatura1;
	private String asignatura2;
	private String tutor;
	private int anyosExperiencia;
	
	//Constructor
	public Profesor(String dni, String nombre, String apellidos, LocalDate fechaNacimiento, String genero, int telefono,
			String email, double salario, String titulacion, String asignatura1, String asignatura2, String tutor,
			int anyosExperiencia) {
		super(dni, nombre, apellidos, fechaNacimiento, genero, telefono, email, salario);
		this.titulacion = titulacion;
		this.asignatura1 = asignatura1;
		this.asignatura2 = asignatura2;
		this.tutor = tutor;
		this.anyosExperiencia = anyosExperiencia;
	}

	//Metodos
	public void aumentarSalario() {
		if(anyosExperiencia >= 5) {
			super.aumentoSalario(5);
		}
		if(anyosExperiencia >= 3) {
			super.aumentoSalario(2);
		}
		if(anyosExperiencia >= 1) {
			super.aumentoSalario(1);
		}
	}

	//To String
	@Override
	public String toString() {
		return super.toString() + "Profesor [titulacion=" + titulacion + ", asignatura1=" + asignatura1 + ", asignatura2=" + asignatura2
				+ ", tutor=" + tutor + ", anyosExperiencia=" + anyosExperiencia + "]";
	}
	
	
	
	
}
