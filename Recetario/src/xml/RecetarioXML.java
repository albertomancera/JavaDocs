package xml;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.thoughtworks.xstream.XStream;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder; 
import org.w3c.dom.Document;

public class RecetarioXML {

	protected static XStream xstream;
	
	public RecetarioXML() {
		this.xstream = new XStream();
	}

	public static void escribir(Recetario recetario, File ArchivoXml ) {
		String xml = xstream.toXML(recetario);
		//File ArchivoXml = new File("C:\\Users\\smr\\eclipse-workspace\\Recetario\\ArchivoXml.txt");
		try (FileWriter ArchivoXmlW = new FileWriter(ArchivoXml)) {
			ArchivoXmlW.write(xml); // escribimos valor
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static Recetario leer(File ArchivoXml) {
		//File ArchivoXml = new File("C:\\Users\\smr\\eclipse-workspace\\Recetario\\ArchivoXml.txt");
		String xmlString = "";
		Recetario recetario = null;
		try (BufferedReader br = new BufferedReader(new FileReader(ArchivoXml))) {
			
			String linea;
			while ((linea = br.readLine()) != null) {
				xmlString = xmlString + linea +  "\n";
			}
			recetario = (Recetario) xstream.fromXML(xmlString);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return recetario;
	}
}
