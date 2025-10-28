package ejercicio13;

import java.text.SimpleDateFormat;
import java.util.Date;

	public class Fecha {
	    private SimpleDateFormat formato;
	    private Date fecha;

	    // Constructor normal (usa fecha actual)
	    public Fecha() {
	        this(new Date());
	    }

	    // Constructor para testing (permite inyectar una fecha)
	    public Fecha(Date fecha) {
	        this.fecha = fecha;
	    }

	    public String devuelveFecha(int tipo) {
	        String cad = "";
	        switch (tipo) {
	            case 1: 
	                formato = new SimpleDateFormat("dd/MM/yyyy");
	                cad = formato.format(fecha);
	                break;
	            case 2: 
	                formato = new SimpleDateFormat("MM/yyyy");
	                cad = formato.format(fecha);
	                break;
	            case 3: 
	                formato = new SimpleDateFormat("EEEE dd-MMM-yyyy, HH:mm:ss", java.util.Locale.forLanguageTag("es"));
	                cad = formato.format(fecha);
	                break;
	            default: 
	                cad = "ERROR";
	        }
	        return cad;
	    }
	}
