package correcionNico;

public class Vehiculo {

	//ATRIBUTOS DE CLASE CONSTANTES
		public static final double MIN_CONSUM_MEDIO = 2.0;
		public static final double MAX_CONSUM_MEDIO = 20.0;
		public static final double MIN_CAPACIDAD_DEPOSITO = 10.0;
		public static final double MAX_CAPACIDAD_DEPOSITO = 120.0;
		public static final double CONSUMO_ARRANCAR_VEHICULO = 0.02;
		public static final double CONSUMO_MEDIO_DEFAULT = 5.0;
		public static final double CAPACIDAD_DEPOSITO_DEFAULT = 50.0;
		public static final boolean ESTADO_MOTOR_DEFAULT = false;
		public static final double NIVEL_COMBUSTIBLE_DEFAULT = 50.0;
		public static final double DISTANCIA_RECORRIDA_DEFAULT = 0.0;
		public static final double COMBUSTIBLE_CONSUMIDO_DEFAULT = 0.0;
		public static final double DISTANCIA_RECORRIDA_TOTAL_DEFAULT = 0.0;
		public static final double COMBUSTIBLE_CONSUMIDO_TOTAL_DEFAULT = 0.0;
		//ATRIBUTOS DE CLASE VARIABLES
		private static double distanciaRecorridaFlota;
		private static double combustibleConsumidoFlota;
		private static int numVehiculosArrancadosFlota;
		//ATRIBUTOS DE OBJETO CONSTANTE
		public final double capacidadDeposito;
		public final double consumoMedio;
		//ATRIBUTOS DE OBJETO VARIABLE
		private boolean isArrancado;
		private double nivelCombustible;
		private double distanciaRecorrida;
		private double combustibleConsumido;
		private double distanciaRecorridaTotal;
		private double combustibleConsumidoTotal;
			
		public Vehiculo(double capacidadDeposito, double consumoMedio) throws IllegalArgumentException {
			
			if (capacidadDeposito < MIN_CAPACIDAD_DEPOSITO || capacidadDeposito > MAX_CAPACIDAD_DEPOSITO) {
	            throw new IllegalArgumentException("La capacidad del deposito no esta dentro de los parametros permitidos");
			}
			if (consumoMedio < MIN_CONSUM_MEDIO || consumoMedio > MAX_CONSUM_MEDIO) {
	            throw new IllegalArgumentException("El consumo medio no esta dentro de los parametros permitidos");
			}
			
			this.capacidadDeposito = capacidadDeposito;
			this.consumoMedio = consumoMedio;
			this.isArrancado = ESTADO_MOTOR_DEFAULT;
			this.nivelCombustible = NIVEL_COMBUSTIBLE_DEFAULT;
			this.distanciaRecorrida = DISTANCIA_RECORRIDA_DEFAULT;
			this.combustibleConsumido = COMBUSTIBLE_CONSUMIDO_DEFAULT;
			this.distanciaRecorridaTotal = DISTANCIA_RECORRIDA_TOTAL_DEFAULT;
			this.combustibleConsumidoTotal = COMBUSTIBLE_CONSUMIDO_TOTAL_DEFAULT;
		}
		
		public Vehiculo() {
			this(CAPACIDAD_DEPOSITO_DEFAULT, CONSUMO_MEDIO_DEFAULT);
			}
		
		public boolean isArrancado(){
			return this.isArrancado;
		}
		
		public double getConsumoMedio(){
			return consumoMedio;
		}
		
		public double getCapacidadDeposito(){
			return capacidadDeposito;
		}
		
		public double getNivelCombustible(){
			return nivelCombustible;
		}
		
		public double getDistanciaRecorrida(){
			return distanciaRecorrida;
		}
		
		public double getCombustibleConsumido(){
			return combustibleConsumido;
		}
		
		public double getDistanciaRecorridaTotal(){
			return distanciaRecorridaTotal;
		}
		
		public double getCombustibleConsumidoTotal(){
			return combustibleConsumidoTotal;
		}
		
		public double getDistanciaRecorridaFlota(){
			return distanciaRecorridaFlota;
		}
		
		public double getCombustibleConsumidoFlota(){
			
			combustibleConsumidoFlota = combustibleConsumidoTotal + combustibleConsumidoFlota;
			
			return combustibleConsumidoFlota;
		}
		
		public double getNumVehiculosArrancadosFlota(){
			
			if(isArrancado == true) {
				
				numVehiculosArrancadosFlota++;
			}
			
			return numVehiculosArrancadosFlota;
		}
		

		public void setIsArrancado(boolean isArrancado){
			this.isArrancado = isArrancado;
		}
				
		public void setNivelCombustible(double nivelCombustible){
			this.nivelCombustible = nivelCombustible;
		}
		
		public void setDistanciaRecorrida(double distanciaRecorrida){
			this.distanciaRecorrida = distanciaRecorrida;
		}
		
		public void setCombustibleConsumido(double combustibleConsumido){
			this.combustibleConsumido = combustibleConsumido;
		}
		
		public void setDistanciaRecorridaTotal(double distanciaRecorridaTotal){
			this.distanciaRecorridaTotal = distanciaRecorridaTotal;
		}
		
		public void setCombustibleConsumidoTotal(double combustibleConsumidoTotal){
			this.combustibleConsumidoTotal = combustibleConsumidoTotal;
		}
		
		public void setDistanciaRecorridaFlota(double distanciaRecorridaFlota){
			this.distanciaRecorridaFlota = distanciaRecorridaFlota;
		}
		
		public void setCombustibleConsumidoFlota(double combustibleConsumidoFlota){
			this.combustibleConsumidoFlota = combustibleConsumidoFlota;
		}
		
		public void setNumVehiculosArrancadosFlota(int numVehiculosArrancadosFlota){
			this.numVehiculosArrancadosFlota = numVehiculosArrancadosFlota;
		}
		
		public double repostar(double litrosReposta) throws IllegalStateException {
			double excesoCombustible;
			
			if (isArrancado == true) {
	            throw new IllegalStateException("Se intentó repostar con el motor encendido. No se ha repostado.");
			}
			if (litrosReposta <= 0) {
				throw new IllegalArgumentException("Los litros a repostar son 0 o menores a 0");
			}
			if (this.capacidadDeposito < this.nivelCombustible + litrosReposta)
			{
				this.nivelCombustible = litrosReposta + this.nivelCombustible;
				excesoCombustible = this.nivelCombustible - capacidadDeposito;
				this.nivelCombustible = this.capacidadDeposito;
				throw new IllegalArgumentException("Depósito lleno. Se ha sobrepasado la capaciad del depósito de combustible en " + excesoCombustible + " litros.");
			}
			
				nivelCombustible = litrosReposta + nivelCombustible;
			excesoCombustible = this.nivelCombustible - this.capacidadDeposito;
			
			if (this.nivelCombustible > this.capacidadDeposito) {
				this.nivelCombustible = this.capacidadDeposito;
			}
			
			
			return nivelCombustible;
		}
		
		public boolean arrancar() {
			
			if (nivelCombustible - CONSUMO_ARRANCAR_VEHICULO < 0) {
				 throw new IllegalStateException("El vehicula no tiene combustible suficiente para arrancar");
			}
			
			if (isArrancado == true) {
				throw new IllegalStateException("El motor ya se encuentra arrancado.");
			}
			
			isArrancado = true;
			nivelCombustible = nivelCombustible - CONSUMO_ARRANCAR_VEHICULO;
			return isArrancado;
		}
		
		public double realizarTrayecto(double distanciaTrayecto) {
			double trayectoIncompleto;
			double distanciaDisponible;
			double consumoTrayecto;
			
			if (distanciaTrayecto < 0) {
				throw new IllegalArgumentException ("Se intentó realizar un trayecto negativo.");
			}
			
			if (this.isArrancado == false) {
				throw new IllegalStateException("Se intentó realizar un trayecto con el motor apagado. No se ha avanzado.");
			}
			consumoTrayecto = distanciaTrayecto * this.consumoMedio;
			this.nivelCombustible = this.nivelCombustible - consumoTrayecto;
			distanciaDisponible = this.nivelCombustible / this.consumoMedio;
			if (distanciaDisponible < distanciaTrayecto) {
				trayectoIncompleto = distanciaTrayecto - distanciaDisponible;
				throw new IllegalArgumentException ("no se ha podido finalizar el trayecto completamente. Depósito vacío. Han faltado por recorrer " + trayectoIncompleto + " km.");
			}
			
			return this.nivelCombustible;
		}
		
		public boolean apagar() {
			if (isArrancado == true) {
				throw new IllegalStateException("El motor ya se encuentra apagado.");
			}
			this.distanciaRecorrida = 0;
			this.combustibleConsumido = 0;
			
			return this.isArrancado == false;
		}
		
		@Override
		public String toString() {
			String resultado;
			if (this.isArrancado == true) {
				resultado= "- Motor: Arrancado " + "- Deposito: " + nivelCombustible +"Litros" +"- Dist: "+ this.distanciaRecorrida +"Kilometros" +"- Consumo: "+ this.combustibleConsumido +"Litros" ;
			}
			else {
				resultado= "- Motor: Apagado " + "- Deposito: " + nivelCombustible +"Litros" +"- Dist: "+ this.distanciaRecorrida +"Kilometros" +"- Consumo: "+ this.combustibleConsumido +"Litros";
			}
			
			  return resultado.toString();
		}
		
		
}
