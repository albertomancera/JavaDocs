package ejercicio2;

public class Principal {

	public static void main(String[] args) {
	
		Persona persona1 = new Persona("","Luis","Loopez Villalba", 24);
		
		System.out.println(persona1.getDni());
		System.out.println(persona1.getNombre());
		System.out.println(persona1.getApellidos());
		System.out.println(persona1.getEdad());
		
		persona1.setEdad(54);
		persona1.setNombre("Victor");
		persona1.setDni(null);
		
		System.out.println(persona1.getDni());
		System.out.println(persona1.getNombre());
		System.out.println(persona1.getApellidos());
		System.out.println(persona1.getEdad());
}
}
