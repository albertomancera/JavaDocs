package ciclista;

public class Escalador extends Ciclista{

	//Atributos de objeto
	private double aceleracionPromedio;
	private int gradoRampa;
	
	public Escalador(int identificador, String nombre, double aceleracionPromedio, int gradoRampa)
			throws IllegalArgumentException {
		super(identificador, nombre);
		if(aceleracionPromedio < 0 || gradoRampa < 0) {
			throw new IllegalArgumentException("Los valores no pueden ser negativa");
		}
		
		this.aceleracionPromedio = aceleracionPromedio;
		this.gradoRampa = gradoRampa;
	}

	
	@Override
	public String toString() {
		return  super.toString() + " Escalador [aceleracionPromedio=" + aceleracionPromedio + ", gradoRampa=" + gradoRampa + "]";
	}
	
	
	
}
