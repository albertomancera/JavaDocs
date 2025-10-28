package constructor;

import java.time.LocalTime;

public class Principal {

	public static void main(String[] args) {
		
		Alumno alumno1 = new Alumno("79381184L","Alberto","Mancera",1.70 ,true ,4,LocalTime.of(20,23));
		System.out.print(alumno1.toString());
		

	}

}
