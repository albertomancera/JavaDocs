package serializado;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class RecetarioIO {

	public RecetarioIO() {
	}

	public static void escribir(Recetario recetario) {
		FileOutputStream recetaBin;
		try {
			recetaBin = new FileOutputStream("C:\\Users\\smr\\eclipse-workspace\\Recetario\\Recetario.dat");
			ObjectOutputStream oos = new ObjectOutputStream(recetaBin);
			oos.writeObject(recetario);
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Recetario leer(Recetario recetario) {
		FileInputStream recetaBin;
		Recetario recetaOb = null;
		try {
			recetaBin = new FileInputStream("C:\\Users\\smr\\eclipse-workspace\\Recetario\\Recetario.dat");
			ObjectInputStream ois = new ObjectInputStream(recetaBin);
			recetaOb = (Recetario) ois.readObject();
			ois.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return recetaOb;
	}
}
