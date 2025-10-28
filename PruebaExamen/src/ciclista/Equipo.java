package ciclista;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

	//Atributos de objeto
	private String nombre;
	private String pais;
	private List<Ciclista> ciclistas = new ArrayList<>();
	
	public Equipo(String nombre, String pais) {
		this.nombre = nombre;
		this.pais = pais;
		this.ciclistas = new ArrayList<>();
	}
	

	public void añadirCilista(Ciclista ciclista) {
		ciclistas.add(ciclista);
		
	}
	
	public void desvincularCiclista(int identificador) {
		ciclistas.removeIf(c -> c.getIdentificador() == (identificador));
	}
	
	public int calcularTiempoTotal() {
		int total = 0;
		
		for (Ciclista ciclista : ciclistas) {
			total += ciclista.getTiempoAcumulado();
		}
		return total;
	}
	
	public List<Ciclista> getCiclistas(){
		return ciclistas;
	}
	
	
	
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", pais=" + pais + "]";
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
	
}
