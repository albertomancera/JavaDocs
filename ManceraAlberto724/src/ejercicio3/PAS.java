package ejercicio3;

import java.time.LocalDate;

public class PAS extends Personal {
	//Atributos
	  private boolean aleman;
	    private boolean chino;
	    private boolean ingles;
	    private String areaAtencion;
	    
	    private int contador = 0;
	    
	    //Constructor
		public PAS(String dni, String nombre, String apellidos, LocalDate fechaNacimiento, String genero, int telefono,
				String email, double salario, boolean aleman, boolean chino, boolean ingles, String areaAtencion) {
			super(dni, nombre, apellidos, fechaNacimiento, genero, telefono, email, salario);
			this.aleman = aleman;
			this.chino = chino;
			this.ingles = ingles;
			this.areaAtencion = areaAtencion;
		}

		 public int numIdiomas() {
		        if (aleman) {
		        	contador++;
		        } if (chino) {
		        	contador++;
		        }if (ingles) {
		        	contador++;
		        }
		        return contador;
		    }

		 public void cambioIdioma(String idioma) {
		        switch (idioma.toLowerCase()) {
		            case "aleman":
		                this.aleman = !this.aleman;
		                break;
		            case "chino":
		                this.chino = !this.chino;
		                break;
		            case "ingles":
		                this.ingles = !this.ingles;
		                break;
		        }
		    }
		 
		 //To String
		  @Override
		    public String toString() {
		        return super.toString() + ", Idiomas: " + numIdiomas() + ", Área de Atención: " + areaAtencion;
		    }
}
