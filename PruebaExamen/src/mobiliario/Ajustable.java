package mobiliario;

public interface Ajustable {

	int obtenerPosicion();
	
	int subirPosicion() throws IllegalStateException;
	
	int bajarPosicion() throws IllegalStateException;
	
	int subirDosPosiciones() throws IllegalStateException;
	
	int bajarDosPosiciones() throws IllegalStateException;
}
