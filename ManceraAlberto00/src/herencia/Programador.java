package herencia;

import java.time.LocalDate;

public class Programador extends Trabajador {
	public static final String LENGUAJE_DEFAULT = "Java";
	public static final int ANNOSEXP_DEFAULT = 0;
	public static boolean JEFEEQUIPO_DEFAULT = false;
	
	protected String lenguajesProg;
	protected int annosExp;
	protected boolean esJefeEquipo;
	
	public Programador(String dni, String nombre, String apellidos, LocalDate fechaInicio, int numHijos,
			String lenguajesProg, int annosExp, boolean esJefeEquipo) {
		super(dni, nombre, apellidos, fechaInicio, numHijos);
		this.lenguajesProg = lenguajesProg;
		this.annosExp = annosExp;
		this.esJefeEquipo = esJefeEquipo;
	}

	@Override
	public String toString() {
		return "Programador [lenguajesProg=" + lenguajesProg + ", annosExp=" + annosExp + ", esJefeEquipo="
				+ esJefeEquipo + "]";
	}
	
	@Override
	public double calcularNomina(float salarioBase) {
		double salarioTotal = salarioBase;
		
		  salarioTotal += salarioBase * 0.05 * annosExp;
		  
		  if(esJefeEquipo == true) {
			  salarioTotal += salarioBase * 0.25;
		  }
		  return salarioTotal;
	}

	public String getLenguajesProg() {
		return lenguajesProg;
	}

	public void setLenguajesProg(String lenguajesProg) {
		this.lenguajesProg = lenguajesProg;
	}

	public int getAnnosExp() {
		return annosExp;
	}

	public void setAnnosExp(int annosExp) {
		this.annosExp = annosExp;
	}

	public boolean isEsJefeEquipo() {
		return esJefeEquipo;
	}

	public void setEsJefeEquipo(boolean esJefeEquipo) {
		this.esJefeEquipo = esJefeEquipo;
	}


	
	

}
