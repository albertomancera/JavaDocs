//Objetivo:
package metodosarrays;

public class MetodosArrays {
	public static void main(String[] args) {
	
		int array[]= {1, 2, 3, 4, 5, 6};
		
		imprimirArray(array);
		array = rellenarArrayDesde(15);
		
		System.out.println(" ");
		imprimirArray(array);
	}
//Mostrar el array
	public static void imprimirArray (int [] lista) {
		for(int i=0; i<lista.length;i++) {
			System.out.println(lista[i]);
		}
	}
//Crear array dentro de un metodo y devolverlo
	public static int [] rellenarArrayDesde(int a) {
		int num[]= new int [10];
		for (int i=0; i<num.length;i++) {
			num[i]=a;
			a++;
		}
		return num;
	}
}
