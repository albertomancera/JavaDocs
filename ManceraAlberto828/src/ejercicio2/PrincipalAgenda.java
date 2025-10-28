package ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;




public class PrincipalAgenda {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		ArrayList<Agenda> lista = new ArrayList<>();
		
		  System.out.println("\nMenú de Agenda:");
          System.out.println("1. Ingresar datos");
          System.out.println("2. Consultar por nombre");
          System.out.println("3. Mostrar todos ordenados");
          System.out.println("4. Mostrar cumpleaños de una fecha");
          System.out.println("5. Salir");
          System.out.print("Seleccione una opción: ");
          int opcion = sc.nextInt();
          sc.nextLine();

          switch (opcion) {
              case 1:
                  System.out.print("Nombre: ");
                  String nombre = sc.nextLine();
                  System.out.print("Dirección: ");
                  String direccion = sc.nextLine();
                  System.out.print("Teléfono: ");
                  String telefono = sc.nextLine();
                  System.out.print("Email: ");
                  String email = sc.nextLine();
                  System.out.print("Fecha de Nacimiento (DD/MM/YYYY): ");
                  String fechaNacimiento = sc.nextLine();
                 
              case 2:
                  System.out.print("Ingrese el nombre a buscar: ");
                  String nombreBuscar = sc.nextLine();
                  System.out.println(consultarPorNombre(nombreBuscar));
               
              case 3:
                 mostrarDatosOrdenado();
              
                 
             
          }
      }
	
	private static String consultarPorNombre(String nombre) {
		ArrayList<Agenda> lista = new ArrayList<>();
		String informacion ="Registro no encontrado";
		Iterator<Agenda> iterador1 = lista.iterator();
		
		while(iterador1.hasNext()) {
			Agenda al=iterador1.next();
			if(al.getNombre().equalsIgnoreCase(nombre)) {
				informacion = al.toString();
			}
		}
		return informacion ;
	}
	
	private static void mostrarDatosOrdenado() {
		ArrayList<Agenda> lista = new ArrayList<>();
		Collections.sort(lista,Comparator.comparing(Agenda::getNombre));
		System.out.println("Lista de contactos ordenada: ");
		
	}
  }

		


