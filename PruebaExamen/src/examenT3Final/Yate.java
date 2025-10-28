package examenT3Final;

import java.time.LocalDate;
import java.time.Period;

import examenT3Final.EnumTipo.TipoYate;

public class Yate extends Embarcacion{
		//Atributos de objeto
			private TipoYate tipo;

	
		public Yate(String matricula, LocalDate fechaConstruccion, int eslora, int numPasajero, boolean tieneBase) throws IllegalArgumentException {
			super(matricula, fechaConstruccion, eslora, numPasajero, tieneBase);
			if(eslora>=10 && eslora<24) {
				this.tipo = TipoYate.YATE;
			}else if(eslora >=24 && eslora <40) {
				this.tipo = TipoYate.YATEGRANDE;
			}else if(eslora >=40 && eslora <60) {
				this.tipo = TipoYate.SUPERYATE;
			}else if(eslora >=60) {
				this.tipo = TipoYate.MEGAYATE;
			}
		}
		
		public Yate(int eslora) {
			this(Embarcacion.MATRICULA_DEFECTO, Embarcacion.FECHA_ACTUAL, eslora ,Embarcacion.NUM_PASAJEROS_DEFECTO, Embarcacion.TIENE_BASE_DEFECTO);
		}

		

		public TipoYate getTipo() {
			return tipo;
		}


		public double calcularAtraque(LocalDate fechaIni, LocalDate fechFin) {
			double precio = 0;
			int importeBase = 30;
			Period diferencia = Period.between(fechaIni, fechFin);
			if(this.tipo == TipoYate.YATE) {
				precio = diferencia.getDays() * 15 + importeBase;
			}else if (this.tipo == TipoYate.YATEGRANDE) {
				precio = diferencia.getDays() * 20 + importeBase;	
			}else if (this.tipo == TipoYate.SUPERYATE) {
				precio = diferencia.getDays() * 30 + importeBase;
 			}else if(this.tipo == TipoYate.MEGAYATE) {
 				precio = diferencia.getDays() * 50 + importeBase;
 			}
			
			return precio;
		}
		
		@Override
		public String toString() {
			return super.toString() +  "Yate [tipo=" + tipo + "]";
		};
	
		
			
}
