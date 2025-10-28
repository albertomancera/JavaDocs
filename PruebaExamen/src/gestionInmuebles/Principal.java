package gestionInmuebles;

public class Principal {

	public static void main(String[] args) {
		//1. Crea 10 instancias de cada uno de los tipos de inmuebles con valores aleatorios de superficie entre -100 y 100.
		System.out.println("==1==");
		int contador = 0;
		while(contador < 10) {
			int superficie = obtenerNumeroAleatorio(-100,100);
			try {
				CasaRural casaRural1 = new CasaRural(superficie);
				System.out.println(casaRural1);
				
				CasaConjuntoCerrado casaConjunto1 = new CasaConjuntoCerrado(superficie);
				System.out.println(casaConjunto1);
				
				CasaIndependiente casaIndependiente1 = new CasaIndependiente(superficie);
				System.out.println(casaIndependiente1);
				
				ApartaEstudio apartaEstudio1 = new ApartaEstudio(superficie);
				System.out.println(apartaEstudio1);
				
				ApartamentoFamiliar apartamento1 = new ApartamentoFamiliar(superficie);
				System.out.println(apartamento1);
				
				LocalComercial local1 = new LocalComercial(superficie);
				System.out.println(local1);
				
				Oficina oficina1 = new Oficina(superficie);
				System.out.println(oficina1);
				contador++;
			}catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("==========================");
		System.out.println("==2==");
		int contador1 = 0;
		while(contador1 < 2) {
			CasaRural casaRural1 = new CasaRural();
			System.out.println(casaRural1);
			
			CasaConjuntoCerrado casaConjunto1 = new CasaConjuntoCerrado();
			System.out.println(casaConjunto1);
			
			CasaIndependiente casaIndependiente1 = new CasaIndependiente();
			System.out.println(casaIndependiente1);
			
			ApartaEstudio apartaEstudio1 = new ApartaEstudio();
			System.out.println(apartaEstudio1);
			
			ApartamentoFamiliar apartamento1 = new ApartamentoFamiliar();
			System.out.println(apartamento1);
			
			LocalComercial local1 = new LocalComercial();
			System.out.println(local1);
			
			Oficina oficina1 = new Oficina();
			System.out.println(oficina1);
			contador1++;
		}
		
	}

	public static int obtenerNumeroAleatorio(int min, int max) {
		 return (int)(Math.random() * (max - min + 1)) + min;
  }
}
