package ciclista;

import java.util.ArrayList;
import java.util.List;

public class Ciclista {

	//Atributos de objeto
	protected final int identificador;
	protected String nombre;
	protected int tiempoAcumulado ;
	protected List<String> eventos = new ArrayList<>();//Lista de eventos
	
	public Ciclista(int identificador, String nombre) throws IllegalArgumentException{
		if(identificador < 0) {
			throw new IllegalArgumentException("Los valores no pueden ser negativo");
		}
		
		this.identificador = identificador;
		this.nombre = nombre;
		this.tiempoAcumulado = 0;
	}

	public void asignarTiempoAcumulado(int tiempo) throws IllegalArgumentException{
		if(tiempo < 0) {
			throw new IllegalArgumentException("El tiempo a asignar no puede ser negativo");
		}
		
		this.tiempoAcumulado += tiempo ;
		
	}
	
	//Registrar un evento al que ha asistido el ciclista
	public void registrarEvento(String evento, String fecha, String tiempo) {
		int minutos = convertirTiempoMinutos(tiempo);
		asignarTiempoAcumulado(minutos);
		
		eventos.add(evento + " (" + fecha + ") -" + tiempo);
	}
	
	
	private int convertirTiempoMinutos(String tiempo) {
		String[] partes = tiempo.split(":");
		int h = Integer.parseInt(partes[0]);
		int m = Integer.parseInt(partes[1]);
		int s = Integer.parseInt(partes[2]);
		
		return h * 60 + m + (s >= 30 ? 1 : 0); // redondeo de segundos
	}
	
	//Getters
	public int getTiempoAcumulado() {
		return tiempoAcumulado;
	}
	public List<String> getEventos() {
		return eventos;
	}

	public int getIdentificador() {
		return identificador;
	}
		
	@Override
	public String toString() {
		return "Ciclista [identificador=" + identificador + ", nombre=" + nombre + ", tiempoAcumulado="
				+ tiempoAcumulado + "]";
	}
	

}
