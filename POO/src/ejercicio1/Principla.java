package ejercicio1;

public class Principla {

	public static void main(String[] args) {
		
		Libro l1 = new Libro (Messages.getString("Principla.0"), Messages.getString("Principla.1"), 456, Messages.getString("Principla.2"), false); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

		System.out.println(l1);
		
		l1.prestar();
		
		System.out.println(l1);
		
		l1.devolver();
		try {
		l1.devolver();
		}catch ( IllegalArgumentException e1){
			System.out.println(e1.getMessage());
		}
		System.out.println(l1);
		
		 l1.imprimir(0.05);
		 
		System.out.println( l1.toString());
		
	}

}
