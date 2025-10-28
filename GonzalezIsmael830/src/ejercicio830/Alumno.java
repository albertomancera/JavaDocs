package ejercicio830;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Alumno {
	//Atributos de objeto
	private String grupo;
	private String nombre;
	private int matematicas;
	private int lengua;
	private int fisica;
	private int quimica;
	private int ingles;
	
	//Construcotes de objeto
	public Alumno(String grupo, String nombre, int matematicas, int lengua, int fisica, int quimica, int ingles) {
		this.grupo = grupo;
		this.nombre = nombre;
		this.matematicas = matematicas;
		this.lengua = lengua;
		this.fisica = fisica;
		this.quimica = quimica;
		this.ingles = ingles;
	}

	//Métodos
	public String getGrupo() {
		return grupo;
	}

	public String getNombre() {
		return nombre;
	}

	public int getMatematicas() {
		return matematicas;
	}

	public int getLengua() {
		return lengua;
	}

	public int getFisica() {
		return fisica;
	}

	public int getQuimica() {
		return quimica;
	}

	public int getIngles() {
		return ingles;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setMatematicas(int matematicas) {
		this.matematicas = matematicas;
	}

	public void setLengua(int lengua) {
		this.lengua = lengua;
	}

	public void setFisica(int fisica) {
		this.fisica = fisica;
	}

	public void setQuimica(int quimica) {
		this.quimica = quimica;
	}

	public void setIngles(int ingles) {
		this.ingles = ingles;
	}
	
	public double getNotaMedia() {
		return ((this.getMatematicas()+this.getLengua()+this.getFisica()+this.getQuimica()+this.getIngles())/5);
	}
	
	public int getAsignatura(int num) throws IllegalArgumentException {
		int variable=0;
		if(num<1 || num>5) {
			throw new IllegalArgumentException("Los valores deben estar entre 1 y 5");
		} else if(num==1) {
			variable=matematicas;
		} else if(num==2) {
			variable=lengua;
		} else if(num==3) {
			variable=fisica;
		} else if(num==4) {
			variable=quimica;
		} else if(num==5) {
			variable=ingles;
		} 
		return variable;
	}

	@Override
	public String toString() {
		return ""+ grupo + ";" + nombre + ";" + matematicas + ";" + lengua
				+ ";" + fisica + ";" + quimica + ";" + ingles;
	}

	public int compareTo(String anotherString) {
		return nombre.compareTo(anotherString);
	}

	public int compareToIgnoreCase(String str) {
		return nombre.compareToIgnoreCase(str);
	}
	
}
