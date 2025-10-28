package ciclista;

public class Velocista extends Ciclista {
	
	//Atributos de objeto
	private double potenciaPromedio;
	private double velocidadPromedio;
	
	public Velocista(int identificador, String nombre, double potenciaPromedio, double velocidadPromedio)
			throws IllegalArgumentException {
		super(identificador, nombre);
		if(potenciaPromedio < 0 || velocidadPromedio < 0) {
			throw new IllegalArgumentException("La potencia promedio no puede ser negativo");
		}
		this.potenciaPromedio = potenciaPromedio;
		this.velocidadPromedio = velocidadPromedio;
	}

	@Override
	public String toString() {
		return super.toString() + " Velocista [potenciaPromedio=" + potenciaPromedio + ", velocidadPromedio=" + velocidadPromedio + "]";
	}
	

}
