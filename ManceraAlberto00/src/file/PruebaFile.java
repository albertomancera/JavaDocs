package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PruebaFile {
	public static final int NUM_VALORES = 10;
	
	public static void main(String[] args) {
		
			//Intentamos abrir el archivo
			File f = new File ("numEnteros.txt");
			try {
			Scanner lector = new Scanner(f);
			
			//Si llega aqui es que ha abierto el fichero
			for(int i = 0; i< NUM_VALORES; i++) {
				int valor = lector.nextInt();
				System.out.println("El valor leido es: "+ valor);
			}
			
			//Cerramos el fichero
			lector.close();
		}catch (Exception e) {
			System.out.println("Error: "+ e);
		}
		
		try {
			File f1 = new File("numEnteros.txt");
			FileWriter fw = new FileWriter(f);
			
			int valor = 1;
			
			for(int i = 1; i <=20; i++) {
				fw.write("" + valor); //Escribimos valor
				fw.write(" ");        //escribimos espacio en blanco
				valor = valor * 2;    //Calculamos epróximo valor
			}
			
			fw.write("\n"); //escribimos nueva línea
			fw.close();     //cerramos el FileWriter
			
			System.out.println("Fichero escrito correctamente");
		}catch(IOException e) {
			System.out.println("Error: "+ e);
		}
				
	}

}
