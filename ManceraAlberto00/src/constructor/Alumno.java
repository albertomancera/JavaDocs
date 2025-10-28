package constructor;

import java.time.LocalDate;
import java.time.LocalTime;

public class Alumno {
	// Atributos de clase constantes
		public static final int NUMERO_MAXIMO_ALUMNOS = 800;
		public static final int NUM_MAX_ALUMNOS_GRUPO = 30;
		public static final int NUM_MIN_ALUMNOS_GRUPO = 5;
		public static final LocalTime HORA_MAX_ESTANCIA_CENTRO = LocalTime.of(20,0);
		public static final LocalDate fechaNacimiento_DEFAULT = LocalDate.of(2000,01,01) ;
		
		//Atributos de clase variables
		private static int numeroAlumnos;
		
		//Atributos de objeto constantes
		
		//Atributos de objeto variables
		private String dni;
		private String nombre;
		private String apellidos;
		private LocalDate fechaNacimiento;
		private double altura;
		private boolean esMayorEdad;
		private int numeroHermanos;
		private LocalTime horaMaxEstancia;
		
		
		//Constructor
		public Alumno(String dni, String nombre, String apellidos, LocalDate fechaNacimiento ,double altura, boolean esMayorEdad, int numeroHermanos, LocalTime horaMaxEstancia) {
			this.dni = dni;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.fechaNacimiento = fechaNacimiento;
			this.altura = altura;
			this.esMayorEdad = esMayorEdad;
			this.numeroHermanos = numeroHermanos;
			this.horaMaxEstancia = horaMaxEstancia;
			
			
		}
		
		//Constructor con fecha de nacimiento por defecto
		public Alumno (String dni, String nombre, String apellidos,double altura, boolean esMayorEdad, int numeroHermanos, LocalTime horaMaxEstancia) {
			this (dni,nombre, apellidos, fechaNacimiento_DEFAULT, altura, esMayorEdad, numeroHermanos, horaMaxEstancia);
		}
			
		public Alumno (Alumno al1) {
			this (al1.dni , al1.nombre, al1.apellidos , al1.fechaNacimiento, al1.altura, al1.esMayorEdad, al1.numeroHermanos, al1.horaMaxEstancia );
		}
		
		public String getDni() {
			return this.dni;
		}
		
		public String getNombre() {
			return this.nombre;
		}
		
		public String getApellidos() {
			return this.apellidos;
		}
		
		public LocalDate getFechaNac() {
			return this.fechaNacimiento;
		}
		

		  public void setDni (String dni2) {
		    this.dni= dni2 ;
		  }
		  
		  public void setNombre (String nombre2) {
			    this.nombre= nombre2 ;
			  }
		  
		  public void setApellidos (String apellidos2) {
			    this.apellidos= apellidos2 ;
			  }
		  
		  public void setFechaNac (LocalDate fechaNacimiento2) {
			    this.fechaNacimiento= fechaNacimiento2 ;
			  }
}



