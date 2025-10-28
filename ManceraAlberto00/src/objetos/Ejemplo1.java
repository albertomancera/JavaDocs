package objetos;

public class Ejemplo1 {

	public static void main(String[] args) {
		
		Boolean oBooleano;
		Character aChar;
		Integer oInt;
		
		oBooleano = new Boolean(true);
		aChar = new Character('a');
		oInt = new Integer('o');
		System.out.println("Objetos"+ oBooleano +" "+ aChar +" "+ oInt);
		
		boolean valorBooleano = oBooleano.booleanValue();
		char character= aChar.charValue();
		int integer = oInt.intValue();
		System.out.println("Primitivos "+valorBooleano+" "+ character+" "+integer);
		
		System.out.println("Introduce un booleano: ");
		boolean nuevoBooleano =  new sc.nextBoolean();
		
		boolean oBooleano2;
		
		oBooleano2 = new Boolean(nuevoBooleano);
		
		System.out.println(oBooleano2.equals(oBooleano));
		
	}
}
