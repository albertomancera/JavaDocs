package xml;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import xml.*;

public class Main {

	public static void main(String args[]) {
		Scanner lector = new Scanner(System.in);
		RecetarioXML xml = new RecetarioXML();
		File ListaDeRecetas = new File("C:\\Users\\smr\\eclipse-workspace\\Recetario\\recursos\\ListadoRecetas.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(ListaDeRecetas));) {
			String linea;
			ArrayList<Receta> listaRecetas = new ArrayList<Receta>();
			ArrayList<Receta> listaRecetasAux = new ArrayList<Receta>();
			while ((linea = br.readLine()) != null) {
				String[] datosReceta = linea.split(";");
				String nombre = datosReceta[0];
				String tipoDeDato = datosReceta[1];
				String fechaString = datosReceta[2];
				LocalDate fecha = LocalDate.parse(fechaString); 
				String LineaIngredientes = datosReceta[3];
				String[] ingredientes = LineaIngredientes.split(",");
				String[] instrucciones = datosReceta[4].split("\\.");
				Receta receta = new Receta(nombre, tipoDeDato, fecha, ingredientes, instrucciones);
				listaRecetas.add(receta);
			}
			listaRecetasAux.add(listaRecetas.get(0));
			listaRecetasAux.add(listaRecetas.get(1));
			Recetario recetario = new Recetario(listaRecetasAux);
			
			System.out.println("******************************************\nLIBRO DE RECETAS\n******************************************");
			for(int x=0; x<recetario.recetario.size(); x++) {
				System.out.println("NOMBRE DE LA RECETA: "+recetario.recetario.get(x).nombre +
						"\nTIPO DE PLATO: "+ recetario.recetario.get(x).tipoDePlato +
						"\nFECHA DE CREACIÓN: "+ recetario.recetario.get(x).tipoDePlato +
						"\nFECHA DE CREACIÓN: "+ recetario.recetario.get(x).fechaCreacion +
						"\nINGREDIENTES: "+ Arrays.toString(recetario.recetario.get(x).listadoIngredientes) +
						"\nINSTRUCCIONES: ");
				for(int i=0; i<recetario.recetario.get(x).instrucciones.length; i++) {
					System.out.println(i+1+".- "+recetario.recetario.get(x).instrucciones[i]+".");
				}
				System.out.println("****************************************************************************************************\n");
			}
			File ArchivoXml = new File("C:\\Users\\smr\\eclipse-workspace\\Recetario\\ArchivoXml.xml");
			xml.escribir(recetario, ArchivoXml);
			
			recetario.recetario.add(listaRecetas.get(2));
			
			System.out.println("******************************************\nLIBRO DE RECETAS\n******************************************");
			for(int x=0; x<recetario.recetario.size(); x++) {
				System.out.println("NOMBRE DE LA RECETA: "+recetario.recetario.get(x).nombre +
						"\nTIPO DE PLATO: "+ recetario.recetario.get(x).tipoDePlato +
						"\nFECHA DE CREACIÓN: "+ recetario.recetario.get(x).tipoDePlato +
						"\nFECHA DE CREACIÓN: "+ recetario.recetario.get(x).fechaCreacion +
						"\nINGREDIENTES: "+ Arrays.toString(recetario.recetario.get(x).listadoIngredientes) +
						"\nINSTRUCCIONES: ");
				for(int i=0; i<recetario.recetario.get(x).instrucciones.length; i++) {
					System.out.println(i+1+".- "+recetario.recetario.get(x).instrucciones[i]+".");
				}
				System.out.println("****************************************************************************************************\n");
				}
			
			Recetario recetarioLeer = xml.leer(ArchivoXml);
			
			System.out.println("******************************************\nLIBRO DE RECETAS\n******************************************");
			for(int x=0; x<recetarioLeer.recetario.size(); x++) {
				System.out.println("NOMBRE DE LA RECETA: "+recetarioLeer.recetario.get(x).nombre +
						"\nTIPO DE PLATO: "+ recetarioLeer.recetario.get(x).tipoDePlato +
						"\nFECHA DE CREACIÓN: "+ recetarioLeer.recetario.get(x).tipoDePlato +
						"\nFECHA DE CREACIÓN: "+ recetarioLeer.recetario.get(x).fechaCreacion +
						"\nINGREDIENTES: "+ Arrays.toString(recetarioLeer.recetario.get(x).listadoIngredientes) +
						"\nINSTRUCCIONES: ");
				for(int i=0; i<recetarioLeer.recetario.get(x).instrucciones.length; i++) {
					System.out.println(i+1+".- "+recetarioLeer.recetario.get(x).instrucciones[i]+".");
				}
				System.out.println("****************************************************************************************************\n");
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
