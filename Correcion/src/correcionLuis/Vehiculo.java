/*
 * Luis Miguel Rodríguez Narváez
 * 
 */

package correcionLuis;
import 
java.lang.IllegalStateException;
public class Vehiculo {
	//Atributos constantes de clase
	public static final double CONSUMO_MIN = 2.0;
	public static final double CONSUMO_MAX = 20.0;
	public static final double CAPACIDAD_MIN = 10.0;
	public static final double CAPACIDAD_MAX = 120.0;
	public static final double CONSUMO_ARRANQUE = 0.02;
	public static final double CONSUMO_MEDIO_DEFAULT = 5.0;
	public static final double CAPACIDAD_DEPOSITO_DEFAULT = 50.0;
	//Atributos variables de clase
	private static double distanciaConjunta;
	private static int vehiculosEncendidos;
	//Atributos constantes de objeto
	private final double capacidadDeposito;
	//Atributos variables del objeto
	private double consumoMedio;
	private boolean motorEncendido;
	private double cantidadCombustible;
	private double kmDesdeUltArranque;
	private double consumoDesdeUltArranque;
	private double kmTotales;
	private double consumoTotal;
	
	//Constructores
	
	//Constructor de dos parámetros
	public Vehiculo(double capacidadDeposito, double consumoMedio) {
		if ((capacidadDeposito < CAPACIDAD_MIN || capacidadDeposito > CAPACIDAD_MAX) ||
				(consumoMedio < CONSUMO_MIN || consumoMedio > CONSUMO_MAX)) {
			throw new IllegalArgumentException ("Alguno (o ambos) de los valores son erróneos,"
					+ "no pueden salir del rango marcado por sus máximos y mínimos constantes");
		}
		
		this.capacidadDeposito = capacidadDeposito;
		this.consumoMedio = consumoMedio;
		this.motorEncendido = false;
		this.cantidadCombustible = 30.0;
		this.kmDesdeUltArranque = 0;
		this.consumoDesdeUltArranque = 0;
		this.kmTotales = 0;
		this.consumoTotal = 0;
	}
	
	//Constructor sin parámetros
	public Vehiculo() {
		this (CAPACIDAD_DEPOSITO_DEFAULT,CONSUMO_MEDIO_DEFAULT);
		
	}
	
	//Métodos getter
	public boolean isArrancado() {
		return this.motorEncendido;
	}
	
	public double getConsumoMedio() {
		return this.consumoMedio;
	}
	
	public double getCapacidadDeposito() {
		return this.capacidadDeposito;
	}
	
	public double getNivelCombustible() {
		return this.cantidadCombustible;
	}
	
	public double getDistanciaRecorrida() {
		return this.kmDesdeUltArranque;
	}
	
	public double getDistanciaRecorridaTotal() {
		return this.kmTotales;
	}
	
	public double getCombustibleConsumido() {
		return this.consumoDesdeUltArranque;
	}
	
	public double getCombustibleConsumidoTotal() {
		return this.consumoTotal;
	}
	
	public double getDistanciaRecorridaFlota() {
		return Vehiculo.distanciaConjunta;
	}
	
	
	public double getVehiculosArrancadosFlota() {
		return Vehiculo.vehiculosEncendidos;
	}
	
	//Métodos de acción
	
	//Rellenar motor
	public void repostar(double cantidad) {
		if(this.motorEncendido) {
			throw new IllegalStateException ("El motor está encendido, apáguelo para repostar");
		}
		
		if(cantidad + this.cantidadCombustible > this.capacidadDeposito) {
			throw new IllegalArgumentException ("Cantidad no válida, sobrepasaría la "
					+ "capacidad del depósito");
		}
		
		if (cantidad < 0) {
			throw new IllegalArgumentException ("La cantidad indicada no puede ser negativa");
		}
		
		this.cantidadCombustible = this.cantidadCombustible  + cantidad;
	}
	
	//Encender el motor
	public void arrancar() {
		if (this.motorEncendido) {
			throw new IllegalStateException ("El motor ya está encendido");
		}
		
		if (this.cantidadCombustible <= CONSUMO_ARRANQUE ) {
			throw new IllegalStateException ("No es posible arrancar con la cantidad"
					+ "de combustible disponible");
		}
		
		this.consumoDesdeUltArranque = CONSUMO_ARRANQUE;
		this.consumoTotal = this.consumoTotal + CONSUMO_ARRANQUE;
		this.cantidadCombustible = this.cantidadCombustible-CONSUMO_ARRANQUE;
		Vehiculo.vehiculosEncendidos++;
		
	}
	
	//Trayecto según distancia indicada
	public void realizarTrayecto(double distancia) {
		double distanciaRecorrida;
		if (!this.motorEncendido) {
			throw new IllegalStateException ("Error: Se intentó realizar un"
					+ " trayecto con el motor apagado. No se ha avanzado.");
		}
		
		
		if(distancia < 0) {
			throw new IllegalArgumentException ("La distancia no puede ser negativa");
		}
		
		
		if (this.cantidadCombustible < this.consumoMedio * distancia/100) {
			distanciaRecorrida = this.cantidadCombustible / this.consumoMedio;
			this.kmTotales = this.kmTotales + distanciaRecorrida;
			Vehiculo.distanciaConjunta = Vehiculo.distanciaConjunta + distanciaRecorrida;
			this.cantidadCombustible = 0;
			this.motorEncendido = false;
			throw new IllegalArgumentException("no se ha podido finalizar "
					+ "el trayecto completamente."
					+ " Depósito vacío. Han faltado por recorrer " + 
					(distancia-distanciaRecorrida) + "km.");
		}
		
		this.cantidadCombustible = this.cantidadCombustible - this.consumoMedio * distancia/100;
		this.kmTotales = this.kmTotales + distancia;
		Vehiculo.distanciaConjunta = Vehiculo.distanciaConjunta + distancia;
				
		
		
	}
	
	//Apagar el motor
	public void apagar() {
		if (!this.motorEncendido) {
			throw new IllegalStateException ("El motor ya se encuentra apagado");
		}
		
		this.consumoDesdeUltArranque = 0;
		this.kmDesdeUltArranque = 0;
		Vehiculo.vehiculosEncendidos--;
		
	}
	
	//toString
	public String toString() {
		String encendidoApagado;
		
		
		if(this.motorEncendido) {
			encendidoApagado = "Motor encendido";
		} else {
			encendidoApagado = "Motor apagado";
		}
		
		return String.format("Estado del motor: %s\n"
				+ "Nivel del depósito: %f\n"
				+ "Distancia recorrida: %f\n"
				+ "Consumo realizado: %f\n", encendidoApagado,this.cantidadCombustible
				,this.kmDesdeUltArranque,this.consumoDesdeUltArranque);
	}
	
	
	
	
	
	
	
}
