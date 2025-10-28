package ejercicio4;

public class Informacion {
	enum sexo{MASCULINO, FEMENINO};
	enum estadoCivil{SOLTERO, CASADO, VIUDO, DIVORCIADO};
	

	private String nombre;
	private sexo sexo;
	private estadoCivil estadoCivil;
	private int edad;
	
	
	public Informacion(String nombre, sexo sexo,estadoCivil estadoCivil,
			int edad) {
	
		this.nombre = nombre;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}

	public sexo getSexo() {
		return sexo;
	}

	public estadoCivil getEstadoCivil() {
		return estadoCivil;
	}


	public int getEdad() {
		return edad;
	}

	
}
