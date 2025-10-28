package ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ejercicio4.Informacion.estadoCivil;
import ejercicio4.Informacion.sexo;

public class PrincipalCenso {

	public static void main(String[] args) {
	
		 Scanner sc = new Scanner(System.in);
		
		Informacion p1 = new Informacion("Sofia", sexo.FEMENINO , estadoCivil.DIVORCIADO, 56 );
		Informacion p2 = new Informacion("Pedro", sexo.MASCULINO, estadoCivil.CASADO, 29 );
		Informacion p3 = new Informacion("Lucas", sexo.MASCULINO  , estadoCivil.SOLTERO, 21 );
		Informacion p4 = new Informacion("Rafa", sexo.MASCULINO , estadoCivil.SOLTERO, 25 );
		Informacion p5 = new Informacion("Pepa", sexo.FEMENINO , estadoCivil.VIUDO, 87 );
		
		
		List<Informacion> censo = new ArrayList<>();
		
		censo.add(p1);
		censo.add(p2);
		censo.add(p3);
		censo.add(p4);
		censo.add(p5);
		
		//Calcular
		int cantidadPorSexo = 0;
		int cantidadPorEstadoCivil = 0;
		String sexoDicho;
		int cantidadPorEstadoCivilYSexo = 0;
		
		System.out.println("Dime el sexo que quieres consultar: ");
		sexoDicho = sc.nextLine().toUpperCase();
		
			sexo sexoConsultado = sexo.valueOf(sexoDicho);
			
			for (Informacion informacion : censo) {
				if(informacion.getSexo().equals(sexoConsultado)) {
					cantidadPorSexo++;
				}
			}
			System.out.println("La cantidad de personas con este sexo son : "+ cantidadPorSexo);
			System.out.println("----------------------------------------");
			
			
			System.out.println("Dime el estado Civil que quieres consultar: ");
			String estadoDicho = sc.nextLine().toUpperCase();
			
			estadoCivil estadoCivilConsul = estadoCivil.valueOf(estadoDicho);
			
			for (Informacion informacion : censo) {
				if(informacion.getEstadoCivil() == estadoCivilConsul) {
					cantidadPorEstadoCivil++;
				}
			}
			System.out.println("La cantidad de personas con este estado Civil son : "+ cantidadPorEstadoCivil);
			System.out.println("----------------------------------------");
			
		}
		
	}


