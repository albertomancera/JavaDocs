package ejercicio1;

public class PrincipalAutomovil {

	public static void main(String[] args) {
	
		//1
		  
		Automovil automovil1 = new Automovil();
		
		System.out.println("Automovil por defecto: ");
		System.out.println("------------------------");
		System.out.println(automovil1.toString());	
		System.out.println(automovil1.getCantidadAutomoviles());
		System.out.println();
		//2
		try {
		automovil1.aumentarVelocidad(80);
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		//3
		try {
		automovil1.bajarVelocidad(30);
		}catch(IllegalArgumentException e1) {
			System.out.println(e1.getMessage());
		}
		
		//4
		try {
		automovil1.aumentarVelocidad(20);
		}catch(IllegalArgumentException e2){
			System.out.println(e2.getMessage());
		}
		
		System.out.println("Automovil con los cambios: ");
		System.out.println("------------------------");
		System.out.println(automovil1.toString());
		
		
		//5
		try {
		Automovil automovil2 = new Automovil();
		}catch (IllegalArgumentException e3) {
			System.out.println("Error al crear automovil2: " + e3.getMessage());
		}
		
	}

}
