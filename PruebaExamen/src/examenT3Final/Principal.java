package examenT3Final;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import examenT3Final.EnumTipo.TipoYate;


public class Principal {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Embarcacion>lista = new ArrayList<>();

		//Ruta ficheros
		File fVeleros = new File ("veleros.txt");
		File fYates = new File ("yates.txt");
		File fLanchas = new File ("lanchas.txt");
		
		System.out.println("==1==");
		importarVeleros(fVeleros,lista);
		importarYates(fYates, lista);
		importarLanchas(fLanchas, lista);
		System.out.println(lista.toString());
		System.out.println("Elementos en la lista: " + lista.size());
		
		System.out.println("==2==");
		int contador = 0;
		while(contador <10) {
			int anio = obtenerNumeroAleatorio(2000,2050);
				try {
					Velero veleros1 = new Velero(LocalDate.of(anio, 5,26));
					lista.add(veleros1);
					contador ++;
					System.out.println(veleros1);
				}catch(IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}	
			}
		
		System.out.println("==3==");
		Yate[] yates1 = new Yate[10];
		
		for(int i = 0; i < yates1.length; i++) {
			try {
				yates1[i] = new Yate(obtenerNumeroAleatorio(10,80));
				System.out.println(yates1[i]);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("==4==");
		Lancha[] lanchas1 = new Lancha[3];
		
		for(int i = 0; i <lanchas1.length; i++) {
			lanchas1[i] = new Lancha();
			System.out.println(lanchas1[i]);
		}
		
		System.out.println("==5==");
		Collections.sort(lista,Comparator.comparing(Embarcacion :: getEslora));
		for (Embarcacion listas : lista) {
			System.out.println(listas);
		}
		System.out.println("Número total de embarcaciones: " + lista.size());
		
		System.out.println("==6==");
		int anio, mes, dia;
		System.out.println("Dime el año de la fecha de entrada: ");
		anio = sc.nextInt();
		System.out.println("Dime el mes de la fecha de entrada: ");
		mes = sc.nextInt();
		System.out.println("Dime el dia de la fecha de entrada: ");
		dia = sc.nextInt();
		
		LocalDate fechaIni = LocalDate.of(anio, mes, dia);
		
		System.out.println("Dime el año de la fecha de salida: ");
		anio = sc.nextInt();
		System.out.println("Dime el mes de la fecha de salida: ");
		mes = sc.nextInt();
		System.out.println("Dime el dia de la fecha de salida: ");
		dia = sc.nextInt();
		
		LocalDate fechaFin = LocalDate.of(anio, mes, dia);
		
		for (Embarcacion e : lista) {
			System.out.println(e);
			System.out.println("Precio : " + e.calcularAtraque(fechaIni, fechaFin));
		}
		
		System.out.println("==7==");
		System.out.println("Dime la matricula de la embarcacion la cual quieras buscar la nformacion");
		String matricula =  sc.nextLine();
		System.out.println(buscarMatricula(lista,matricula));
		System.out.println(lista.size());
		
		System.out.println("==8==");
		// lista.removeIf(l1 -> l1.getEslora() > 70 && l1.getTipo() == Yate.TipoYate.MEGAYATE);
		System.out.println(lista.size());
	}
		


	public static int obtenerNumeroAleatorio(int min, int max) {
		 return (int)(Math.random() * (max - min + 1)) + min;
   }
	
	
	
	private static void importarVeleros(File f, ArrayList<Embarcacion> lista) {
		try {
			Scanner lector = new Scanner(f);
			while(lector.hasNext()) { //bucle mientras el lector pueda seguir
				String linea = lector.nextLine();
				String[] partes = linea.split(","); //Lo que separa cada parte
				String matricula = partes[0];
				LocalDate fechaConstruccion = LocalDate.parse(partes[1]);
				int eslora = Integer.parseInt(partes[2]);
				int pasajeros = Integer.parseInt(partes[3]);
				boolean tieneBase = Boolean.parseBoolean(partes[4]);
				int numMastiles = Integer.parseInt(partes[5]);
				
				Velero velero = new Velero(matricula, fechaConstruccion, eslora, pasajeros, tieneBase, numMastiles);
				lista.add(velero);
			}
			lector.close();
		}catch (Exception e) {
			System.out.println("Error al importar veleros : " + e.getMessage());
		}
	}
		private static void importarYates(File f, ArrayList<Embarcacion> lista) {
			try {
				Scanner lector = new Scanner(f);
				while(lector.hasNext()) { //bucle mientras el lector pueda seguir
					String linea = lector.nextLine();
					String[] partes = linea.split(","); //Lo que separa cada parte
					String matricula = partes[0];
					LocalDate fechaConstruccion = LocalDate.parse(partes[1]);
					int eslora = Integer.parseInt(partes[2]);
					int pasajeros = Integer.parseInt(partes[3]);
					boolean tieneBase = Boolean.parseBoolean(partes[4]);
					
					Yate yate = new Yate(matricula, fechaConstruccion, eslora, pasajeros, tieneBase);
					lista.add(yate);
				}
				lector.close();
			}catch (Exception e) {
				System.out.println("Error al importar veleros : " + e.getMessage());
			}
		}
	
		private static void importarLanchas(File f, ArrayList<Embarcacion> lista) {
			try {
				Scanner lector = new Scanner(f);
				while(lector.hasNext()) { //bucle mientras el lector pueda seguir
					String linea = lector.nextLine();
					String[] partes = linea.split(","); //Lo que separa cada parte
					String matricula = partes[0];
					LocalDate fechaConstruccion = LocalDate.parse(partes[1]);
					int eslora = Integer.parseInt(partes[2]);
					int pasajeros = Integer.parseInt(partes[3]);
					boolean tieneBase = Boolean.parseBoolean(partes[4]);
					int potencia_motor = Integer.parseInt(partes[5]);
					
					Lancha lancha = new Lancha(matricula, fechaConstruccion, eslora, pasajeros, tieneBase, potencia_motor);
					lista.add(lancha);
				}
				lector.close();
			}catch (Exception e) {
				System.out.println("Error al importar veleros : " + e.getMessage());
			}
		}
		
		
		public static String buscarMatricula (ArrayList<Embarcacion> lista, String matricula) {
			String informacion = "No se ha encontrado nada";
			
			Iterator<Embarcacion> iterador = lista.iterator();
			
			while(iterador.hasNext()) {
				Embarcacion emb = iterador.next();
				
				if(emb.getMatricula().equalsIgnoreCase(matricula)) {
					informacion = emb.toString();
				}
			}
			return informacion;
		}
		
}
