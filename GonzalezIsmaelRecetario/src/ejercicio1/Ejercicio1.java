package ejercicio1;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Ejercicio 1: Lectura/escritura de un recetario en ficheros de texto.
 *
 * @author profe
 */
public class Ejercicio1 {

    /**
     * Método principal.
     *
     * @param args argumentos que recibe el método
     */
    public static void main(String args[]) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes
        // Variables de entrada
        // Variables de salida
        // Variables auxiliares

        //----------------------------------------------
        //       Entrada de datos + Procesamiento
        //----------------------------------------------
        // Abrimos archivo de contactos ListadoRecetas.txt
        System.out.println("Abriendo archivo de recetas...");

        ArrayList<Receta> lista;
        lista = importarReceta(new File("recursos/ListadoRecetas.txt"));
        System.out.println("Cerrando archivo de recetas...");

        System.out.println();

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        
            // Abrimos el archivo de la agenda Recetario.txt
            System.out.println("Abriendo archivo del recetario...");
        // 1. Se crea un objeto de tipo Recetario para albergar cada una de las recetas.
            Recetario recetas = new Recetario();
            
        // 6. Una vez creado el objeto, se añade al objeto Recetario.
            recetas.setRecetas(lista);
            System.out.println(recetas);
            exportarDatos("recursos/Recetario.txt",lista);

            System.out.println("Cerrando archivo del recetario...");

            System.out.println();
            System.out.println("Archivos cerrados y procesamiento finalizado");
            System.out.println("---------");
            System.out.println();
            System.out.println("Fin del programa.");
    }
    
    // 2. Leer el archivo de texto ListadoRecetas.txt, que contiene una receta por línea. Cada
    // dato dentro de la receta se separa por el carácter ";"
    private static ArrayList<Receta> importarReceta(File f) {
		ArrayList<Receta> l1 = new ArrayList<>();
		try {
			Scanner lector = new Scanner(f);
			while(lector.hasNext()) {
				/*3. Se extraen los datos de cada una de las recetas: nombre, tipo de plato, fecha de
creación, listado de ingredientes e instrucciones.*/
				String linea = lector.nextLine();
				String[] partes = linea.split(";");
				String nombre = partes[0];
				String tipoPlato = partes[1];
				LocalDate fechaCreacion = LocalDate.parse(partes[2]);
				
				/*4. Se extraen los ingredientes de manera individual y se insertan en una lista. Cada
ingrediente se separa por el carácter ","*/
				ArrayList<String> l2 = new ArrayList<>();
				String[] partes2 = partes[3].split(",");
				for (String string : partes2) {
					l2.add(string);
				}
				String instrucciones = partes[4];
				
				// 5. Para cada receta generamos un objeto de tipo Receta con los datos extraídos en los
				// puntos anteriores
				Receta al = new Receta(nombre, tipoPlato, fechaCreacion, l2, instrucciones);
				l1.add(al);
			}
			lector.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return l1;
	}
    
    /* 7. Cuando todas las recetas hayan sido incluidas en el Recetario, se genera su
representación textual mediante el método toString() y se escribe cada receta en el 
archivo de texto Recetario.txt, siguiendo el formato que se indica en el ejemplo de
ejecución*/
    private static void exportarDatos(String nombre, List<Receta> lista) {
		File f = new File(nombre);
		try {
			FileWriter escritor = new FileWriter(f);
			escritor.write("***********************************"+"\n");
			escritor.write("LIBRO DE RECETAS"+"\n");
			escritor.write("***********************************"+"\n");
			for (Receta receta : lista) {
				escritor.write("NOMBRE DE LA RECETA: "+receta.getNombre()+"\n");
				escritor.write("TIPO DE PLATO: "+receta.getTipoPlato()+"\n");
				escritor.write("FECHA DE CREACIÓN: "+receta.getFechaCreacion()+"\n");
				escritor.write("INGREDIENTES: "+receta.getIngredientes()+"\n");
				escritor.write("INSTRUCCIONES: "+"\n");
				String [] partes = receta.getInstrucciones().split("\\.");
				for(int i=0; i<partes.length; i++) {
					escritor.write((i+1)+".- "+partes[i]+"\n");
				}
				escritor.write("***********************************"+"\n");
			}
			escritor.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
