package recetario;

import java.util.ArrayList;

public class Recetario {
	
	ArrayList<Receta> recetario = new ArrayList();

	public Recetario(ArrayList<Receta> recetario) {
		this.recetario = recetario;
	}

	@Override
	public String toString() {
		return "Recetario "+ recetario + "]";
	}
}
