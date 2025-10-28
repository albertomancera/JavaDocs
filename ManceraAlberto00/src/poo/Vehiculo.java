package poo;

public class Vehiculo {
	//Atributos constantes
	public static final double CONSUMO_MINIMO_MEDIO = 2;
	public static final double CONSUMO_MAXIMO_MEDIO = 20;
	public static final int CAPACIDAD_MINIMA_DEPOSITO = 10;
	public static final int CAPACIDAD_MAXIMA_DEPOSITO = 100;
	public static final double CONSUMO_ARRANCAR = 0.02;
	public static final double OMISION_CONSUMO_MEDIO = 5;
	public static final double OMISION_CAPACIDAD = 50;
	
	//Atributos de clase
	private static double distanciaTotal;
	private static double consumoTotal;
	private static int numVehEncendido = 0;
	
	private final double capacidadDeposito ;
	private final double consumoMedio ;
	
	//Van cambiando
	private boolean encendido;
	private double nivelDeposito;
	private double cantidadKm;
	private double consumoRealizado;
	private double totalKm;
	private double consumoTotalRealizado;
	
	//Constructores
	public Vehiculo(double capacidadDeposito, double consumoMedio) throws IllegalArgumentException {
		if(capacidadDeposito > CAPACIDAD_MINIMA_DEPOSITO || capacidadDeposito <CAPACIDAD_MAXIMA_DEPOSITO)  {
			throw new IllegalArgumentException("La capacidad del Deposito debe estar entre los 10 y los 120 litros");
		} if (consumoMedio < CONSUMO_MINIMO_MEDIO && consumoMedio > CONSUMO_MAXIMO_MEDIO) {
			throw new IllegalArgumentException("El consumo medio debe estar entre 2 y 20 litros");
	};
	
		this.capacidadDeposito = capacidadDeposito;
		this.consumoMedio = consumoMedio;
		
	}
	
	public Vehiculo(){
		this.capacidadDeposito = OMISION_CAPACIDAD;
		this.consumoMedio = OMISION_CONSUMO_MEDIO;
		
	}

	
	public boolean isArrancado() {
		return encendido;
	}


	public double getCapacidadDeposito1() {
		return capacidadDeposito;
	}

	public double getConsumoMedio1() {
		return consumoMedio;
	}

	public static double getDistanciaRecorridaFlota() {
		return distanciaTotal;
	}

	public static double getCombustibleConsumidoTotal() {
		return consumoTotal;
	}

	public double getNivelCombustible() {
		return nivelDeposito;
	}

	public double getCantidadKm() {
		return cantidadKm;
	}

	public double getConsumoRealizado() {
		return consumoRealizado;
	}

	public double getTotalKm() {
		return totalKm;
	}

	public double getConsumoTotalRealizado() {
		return consumoTotalRealizado;
	}

	//Metodos
	public void repostar (double rellenar) throws IllegalStateException, IllegalArgumentException {
		if(encendido == true) {
			throw new IllegalStateException ("se intentó repostar con el motor encendido. No se ha repostado.");
		}if ((nivelDeposito + rellenar)> capacidadDeposito) {
			double resto = (nivelDeposito + rellenar)- capacidadDeposito;
			throw new IllegalArgumentException ("Deposito lleno. Se ha sobrepasado la capacidad del depósito del combustile en "+ resto + "litros.");
		}
		nivelDeposito = nivelDeposito + rellenar;
	}
	
	public void arrancar () throws IllegalStateException{
		if(encendido == true) {
			throw new IllegalStateException("Error: El motor ya se encuentra arrancado");
		}if(nivelDeposito < CONSUMO_ARRANCAR) {
			throw new IllegalStateException("Depósito vacío. Se intentó arrancar sin combustible suficiente.");
		}
	
		encendido = true;
		numVehEncendido ++;
		consumoRealizado += CONSUMO_ARRANCAR;
		consumoRealizado -= nivelDeposito;
		
		consumoTotalRealizado += consumoRealizado;
		
	}
	
	public void realizarTrayecto (double cantidadRecorrido) throws IllegalStateException, IllegalArgumentException {
		if(cantidadRecorrido < 0) {
			throw new IllegalArgumentException ("Error: Se intentó realizar un trayecto negativo.");
		}if (encendido = false) {
			throw new IllegalStateException ("Error: Se intentó realizar un trayecto con el motor apagado. No se ha avanzado");
		}
		
		
		cantidadKm += cantidadRecorrido;
		totalKm += cantidadKm;
	}
	
	public void apagar () throws IllegalStateException{
		if(encendido) {
			throw new IllegalStateException("el motor ya se encuentra apagado.");
		}
		
		encendido = false;
		cantidadKm = 0;
		consumoRealizado = 0;
		
	}

	@Override
	public String toString() {
		return "Motor: " + encendido + " - Deposito: " + nivelDeposito + " - Distancia: " + cantidadKm
				+ " - Consumo: " + consumoRealizado ;
	}
	
	
}
