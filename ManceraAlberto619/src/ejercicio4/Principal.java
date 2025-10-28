package ejercicio4;

public class Principal {
	public static void main(String[] args) {
		
		Articulo articulo1 = new Articulo();
		
		articulo1.nombre = "Pijama";
		articulo1.precio = 10;
		
		double pvp = (articulo1.precio * articulo1.iva )/100 ;
		
		System.out.println(articulo1.nombre + " Precio: "+ articulo1.precio + " IVA: "+ articulo1.iva + " PVP: "+ pvp);
	}

}
