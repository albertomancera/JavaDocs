package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class PrincipalAtletas {

	public static void main(String[] args) {
		
		Atleta atl1 = new Atleta("Juan", 23, 1.75);
		Atleta atl2 = new Atleta("María", 28, 1.55);
		Atleta atl3 = new Atleta("Laura", 19, 1.60);
		Atleta atl4 = new Atleta("Pedro", 21, 1.85);
		
		List<Atleta> atletas = new ArrayList<>();
		
		//Añadir atletas
		atletas.add(atl1);
		atletas.add(atl2);
		atletas.add(atl3);
		atletas.add(atl4);
		
		//Calcular promedio
		int sumaEdades = 0;
		double sumaAlturas = 0;
		int menoresDeEdad = 0;
		int mayoresDeEdad = 0;
		
		for (Atleta atleta : atletas) {
			sumaEdades += atleta.edad;
			sumaAlturas += atleta.altura;
			
			if(atleta.edad >= 18) {
				mayoresDeEdad ++;
			}else {
				menoresDeEdad ++;
			}
		}
		
		double promedioEdad = sumaEdades / atletas.size();
		double promedioAltura = sumaAlturas/ atletas.size();
		
		//Resultados
		System.out.println("El promedio de edad de los atletas es : "+ promedioEdad);
		System.out.println("----------------------------------------");
		System.out.println("El promedio de altura de los atletas es : "+ promedioAltura);
		System.out.println("----------------------------------------");
		System.out.println("Los atletas menores de edad hay: "+ menoresDeEdad);
		System.out.println("----------------------------------------");
		System.out.println("Los atletas mayores de edad hay: "+ mayoresDeEdad);
		System.out.println("----------------------------------------");
		System.out.println("Los nombres de los atletas más altos que el promedio son: ");
		for (Atleta atleta : atletas) {
			if(atleta.altura > promedioAltura) {
				System.out.println(atleta.nombre);
			}
		}
		
		
	}
}
