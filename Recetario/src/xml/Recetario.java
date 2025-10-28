package xml;

import java.io.Serializable;
import java.util.ArrayList;

public class Recetario implements Serializable{
	
	private static final long serialVersionUID = 42L;
	ArrayList<Receta> recetario = new ArrayList();

	public Recetario(ArrayList<Receta> recetario) {
		this.recetario = recetario;
	}
	
	@Override
	public String toString() {
		return "Recetario "+ recetario + "]";
	}
}
