package herencia;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		
		Programador pro1 = new Programador ("77777777L","Alberto", "Mancera", LocalDate.of(2000, 04, 1), 2, "Linux", 5, true);

		float salarioBase = 1899;
		
		pro1.calcularNomina(salarioBase);
		
		System.out.println(pro1.toString());
		System.out.println("La nomina es :  "+ pro1.calcularNomina(salarioBase));
		
		pro1.setEsJefeEquipo(false);
		System.out.println("La nomina es :  "+ pro1.calcularNomina(salarioBase));
		
		Analista ana1 = new Analista("45454545P", "Lucia", "Perez", LocalDate.of(2016, 06, 23), 0, "Nada", 3, false);
		
		salarioBase = 2000;
		
		System.out.println(ana1.toString());
		System.out.println("La nomina es: "+ ana1.calcularNomina(salarioBase));
		
		ana1.setHaSidoProg(true);
		System.out.println("La nomina es: "+ ana1.calcularNomina(salarioBase));

		Ingeniero ing1 = new Ingeniero ("12345678P", "Manolo", "Lopez", LocalDate.of(2022,11, 26), 0, true, false);
		
		salarioBase = 2000;
		
		System.out.println(ing1.toString());
		System.out.println("La nomina es: "+ ing1.calcularNomina(salarioBase));
		
		ing1.setSenior(false);
		ing1.setDirectivo(true);
		System.out.println("La nomina es: "+ ing1.calcularNomina(salarioBase));
	}

}
