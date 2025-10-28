package poo;

public class Principal {
	public static void main (String[] args) {
	try {
		Persona p = new Persona ("Fernando", "Lopez", 25);
		
		System.out.println(p.getNombre());
		System.out.println(p.getApellidos());
		System.out.println(p.getEdad());
		
		p.setNombre("Manolo");
		
		System.out.println(p.getNombre());
		System.out.println(p.getApellidos());
		System.out.println(p.getEdad());
		
		System.out.println(p.nombreCompleto());
		if (p.mayorEdad()) {
			System.out.println("Es mayor de edad");
		}else {
			System.out.println("No es mayor de edad");
		}
		
		System.out.println(p.toString());
		
		}catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
	}
	
	
}
}
