package poo;

import java.util.Objects;

public class Persona {
	//Atributos	  		Modificadores Acceso: private, public, protected
	
	private String nombre;
	private String apellidos;
	private int edad;
	
	//Constructores
	
	public Persona (String nombre, String apellidos, int edad) throws IllegalArgumentException {
		if(edad < 0) {
			throw new IllegalArgumentException("La edad debe ser positiva");
		}
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		
	}
	
	//Con valores por defecto
		public Persona() {
			this.nombre = "";
			this.apellidos = "";
			this.edad = 0;
		}

		//Getter = obtiene Setter= modificar
		
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
			return this.nombre + " "+ this.apellidos;
		}
		
		public boolean mayorEdad() {
			return this.edad >=18;
		}

		//To String
		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
		}

		//Metodos equals y hashcode
		@Override
		public int hashCode() {
			return Objects.hash(apellidos);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Persona other = (Persona) obj;
			return Objects.equals(apellidos, other.apellidos);
		}
	
		
	
		

}
