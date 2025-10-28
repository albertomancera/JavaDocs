package ejercicio4;

public class Principal {
	public static void main(String[] args) {
		
		Articulo articulo1 = new Articulo("Pijama", 10, 21, 12);
		
		double pvp = (articulo1.precio * articulo1.iva )/100 ;
		
		System.out.println(articulo1.nombre + " Precio: "+ articulo1.precio + " IVA: "+ articulo1.iva + " PVP: "+ pvp);
	}

}
