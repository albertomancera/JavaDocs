package correcionJose;

public class Vehiculo {
	// ATRIBUTOS DE CLASE
	// Atributos constantes de clase
	public final static double MIN_CONSUMO_MEDIO = 2; // litros/100 km Minimo consumo Medio
	public final static double MAX_CONSUMO_MEDIO = 20; // litros/100 km Maximo consumo Medio
	public final static double MIN_CAPACIDAD_DEPOSITO = 10; // litros/100 km Minima capacidad del deposito
	public final static double MAX_CAPACIDAD_DEPOSITO = 120; // litros/100 km Maxima capacidad del deposito
	public final static double CONSUMO = 0.02; // litros/100 km Consumo que se produce al arrancar el vehiculo
	public final static double VALOR_OMISION_CONSUMO_MEDIO = 5; // litros/100 km Valor por omision para el consumo medio
	public final static double VALOR_OMISION_CAPACIDAD_DEPOSITO = 50; // litros/100 km valor por imision para la
																		// capacidad del
	// deposito

	// Atributos de clase
	private static double distancia_total_todos = 0; // Distancia recorrida total por todos los vehiculos
	private static double total_consumido_todos = 0; // Combustible total consumido por todos los vehiculos
	private static int motores_encendidos = 0; // Número de vehiculos con el motor encendido

	// ATRIBUTOS DE OBJETO
	// Atributos constantes
	private final double capacidadDeposito;
	private final double consumoMedio;

	// Atributos de instancia
	private boolean motorEncendido; // Motor on/off
	private double combustible; // Nivel actual del deposito
	private double kmRecorridos; // Cantidad de km recorridos
	private double kmRecorridoTotal; // Cantidad total km recorrido
	private double consumo; // consumo de combustible desde que se arranco la ultima vez
	private double consumoTotal; // consumo total de combustible realizado

	// Constructor Principal
	public Vehiculo(double capacidadDeposito, double consumoMedio) throws IllegalArgumentException {
		if (capacidadDeposito < MIN_CAPACIDAD_DEPOSITO || capacidadDeposito > MAX_CAPACIDAD_DEPOSITO) {
			throw new IllegalArgumentException("La capacidad del deposivo es menor a 10 o mayor de 120.");
		} else if (consumoMedio < MIN_CONSUMO_MEDIO || consumoMedio > MAX_CONSUMO_MEDIO) {
			throw new IllegalArgumentException("El cosumo Medio es menor a 2 o mayor a 20.");
		}

		this.capacidadDeposito = capacidadDeposito;
		this.consumoMedio = consumoMedio;
	}

	// Constructor sobrecargado con capacidad del deposito y consumo por defecto
	public Vehiculo() {
		this(VALOR_OMISION_CAPACIDAD_DEPOSITO, VALOR_OMISION_CAPACIDAD_DEPOSITO);
	}

	// Métodos Get - Devuelven los valores de los atributos
	public boolean isArrancado() {
		return this.motorEncendido;
	}

	public double getConsumoMedio() {
		return this.consumoMedio;
	}

	public double getNivelCombustible() {
		return this.combustible;
	}

	public double getDistanciaRecorrida() {
		return this.kmRecorridos;
	}

	public double getDistanciaRecorridaTotal() {
		return this.kmRecorridoTotal;
	}

	public double getCombustibleConsumido() {
		return this.consumo;
	}

	public double getCombustibleConsumidoTotal() {
		return this.consumoTotal;
	}

	public double getDistanciaRecorridaFlota() {
		return Vehiculo.distancia_total_todos;
	}

	public double getCombustibleConsumidoFlota() {
		return Vehiculo.total_consumido_todos;
	}

	public double getNumVehiculosArrancadosFlota() {
		return Vehiculo.motores_encendidos;
	}

	// Método que rellena el depósito de combustible del vehículo
	public void repostar(double cantidad) throws IllegalStateException {
		if (this.combustible + cantidad > capacidadDeposito) {
			this.combustible = capacidadDeposito;
			throw new IllegalStateException(
					"Depósito lleno. Se ha sobrepasado la capacidad del depósito de combustible en "
							+ (this.capacidadDeposito - (this.combustible + cantidad)) + " litros.");

		} else if (this.motorEncendido) {
			throw new IllegalStateException("Se intentó repostar con el motor encendido. No se ha repostado.");
		}
		this.combustible += cantidad;
	}

	public void arrancar() throws IllegalStateException {
		if (this.motorEncendido) {
			throw new IllegalStateException("Error: El motor ya se encuentra arrancado.");
		} else if (this.combustible < MIN_CAPACIDAD_DEPOSITO) {
			this.combustible = 0;
			throw new IllegalArgumentException("Depósito vacío. Se intentó arrancar sin combustible suficiente.");
		}
		this.motorEncendido = true;
		Vehiculo.motores_encendidos++;
	}


	public void apagar() throws IllegalStateException {
		if (motorEncendido = false) {
			throw new IllegalStateException("El motor ya se encuentra apagado.");
		}
		this.motorEncendido = false;
		Vehiculo.motores_encendidos--;
	}

	public String toString() {
		String mensaje;
		String motor = this.motorEncendido ? "Encendido" : "Apagado";
		mensaje = "Información del coche" + "\n---------------------" + "\nEstado del motor: " + motor
				+ "\nNivel del deposito: " + this.combustible + "\nDistancia Recorrida: " + this.kmRecorridos
				+ "\nConsumo Recorrido: " + this.consumo;
		return mensaje;
	}

}
