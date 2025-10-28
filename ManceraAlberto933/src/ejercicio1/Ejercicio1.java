package ejercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.format.DateTimeFormatter;

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
    	//Ruta de los archivos
    	  String rutaRecetas = System.getProperty("user.dir") + "/recursos/ListadoRecetas.txt"; //Archivo de entrada con las recetas en formato crudo
          String rutaRecetario = System.getProperty("user.dir") + "/recursos/Recetario.txt"; //Archivo de salida con las recetas formateadas
        //----------------------------------------------
        //       Entrada de datos + Procesamiento
        //----------------------------------------------
        // Abrimos archivo de contactos ListadoRecetas.txt
        System.out.println("Abriendo archivo de recetas...");
        Recetario recetario = new Recetario(); //Inicializamos recetario para almacenar las recetas en memoria

        try (BufferedReader br = new BufferedReader(new FileReader(rutaRecetas))){
        	String linea;
        	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        }
        

        System.out.println("Cerrando archivo de recetas...");

        System.out.println();

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        
            // Abrimos el archivo de la agenda Recetario.txt
            System.out.println("Abriendo archivo del recetario...");

           

            System.out.println("Cerrando archivo del recetario...");

            System.out.println();
            System.out.println("Archivos cerrados y procesamiento finalizado");
            System.out.println("---------");
            System.out.println();
            System.out.println("Fin del programa.");
    }
}
