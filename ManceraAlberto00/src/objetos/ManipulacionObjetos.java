package objetos;

import java.awt.Rectangle;

public class ManipulacionObjetos {
	public static void main(String[] args) {
	
		Rectangle r1, r2 ,r3;//Declaro objetos de tipo Rectangle
		
		r1 = new Rectangle(10,10,10,5);

		//r1 = new Rectangle();
		//r1.setBounds(10, 10, 10, 5);
		
		r2 = r1;
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		
		r1.width =20;
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		
		r3 = new Rectangle(100,20);
		
		r3 =r2;
		System.out.println(r3.toString());
		
		r2.setSize(50,20);
		
		double aleatorio;
		aleatorio= Math.random();
		
		Boolean oBooleano = new Boolean (true);
	}

}
