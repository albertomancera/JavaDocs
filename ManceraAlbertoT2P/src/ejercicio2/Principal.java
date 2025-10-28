package ejercicio2;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		
		FacturaElectrica facturaElec1 = new FacturaElectrica (LocalDate.of(2023, 10,22), 1, 146, 0.176913085, 0.02582931041);
		
		System.out.println(facturaElec1.toString());
	}

}
