package examenT3Final;

import java.time.LocalDate;
import java.time.Period;

public class Velero extends Embarcacion {
	//Atributos de clase constantes
		public static final int MASTILES_DEFECTO = 2;
	
		//Atributos de objeto
		private int mastiles;

		
		public Velero(String matricula, LocalDate fechaConstruccion, int eslora, int numPasajero, boolean tieneBase,
				int mastiles) throws IllegalArgumentException {
			super(matricula, fechaConstruccion, eslora, numPasajero, tieneBase);
			this.mastiles = mastiles;
		}
		
		public Velero(LocalDate fechaConstruccion) {
			this(Embarcacion.MATRICULA_DEFECTO,fechaConstruccion, Embarcacion.ESLORA_DEFECTO, Embarcacion.NUM_PASAJEROS_DEFECTO
					, Embarcacion.TIENE_BASE_DEFECTO, MASTILES_DEFECTO);
		}

		public double calcularAtraque(LocalDate fechaIni, LocalDate fechFin) {
			double precio;
			int importeBase = 30;
			Period diferencia = Period.between(fechaIni, fechFin);
			
			precio = diferencia.getDays() * 10 * this.numPasajero + importeBase;
			
			return precio;
		}
		
		
		@Override
		public String toString() {
			return super.toString() + " Velero [mastiles=" + mastiles + "]";
		}


		
		
		
		
}
