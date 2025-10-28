package ejercicio4;

public class Articulo {

	String nombre;
	double precio;
	int iva ;
	int cuantosQuedan;
	
	public Articulo (String nombre, double precio, int iva, int cuantosQuedan) throws IllegalArgumentException{
		if(nombre == null || nombre.isEmpty()) {
			throw new IllegalArgumentException ("el parámetro nombre es null o contiene la cadena vacía");
		}else if(precio <0) {
			throw new IllegalArgumentException ("el precio no puede ser negativo");
		}else if(iva !=21) {
			throw new IllegalArgumentException("el IVA siempre es 21");
		}else if(iva <0) {
			throw new IllegalArgumentException ("el iva no puede ser negativo");
		}else if(cuantosQuedan <0) {
			throw new IllegalArgumentException ("el cuantosQuedan no puede ser negativo");
		}
		
		this.nombre = nombre;
		this.precio = precio;
		this.iva = iva;
		this.cuantosQuedan = cuantosQuedan;
	}
}