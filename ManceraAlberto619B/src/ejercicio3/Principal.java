package ejercicio3;

public class Principal {

	public static void main(String[] args) {
		
		Rectangulo rect1 = new Rectangulo(7,0,5,5);
		
		double perimetros, area;
		
		perimetros = rect1.x1 + rect1.y1 + rect1.x2 + rect1.y2;
		area = (rect1.x1 + rect1.x2)/2 * (rect1.y1 + rect1.y2)/2;
		
		System.out.println("("+ rect1.x1 +","+ rect1.y1 +") "+"("+ rect1.x2 +","+ rect1.y2+")");
		System.out.println("El perimetro del rectangulo es: "+perimetros);
		System.out.println("El area del rectangulo es: "+area);
		
		Rectangulo rect2 = new Rectangulo(7,9,2,3);
		
		perimetros = rect2.x1 + rect2.y1 + rect2.x2 + rect2.y2;
		area = (rect2.x1 + rect2.x2)/2 * (rect2.y1 + rect2.y2)/2;
		
		System.out.println("("+ rect2.x1 +","+ rect2.y1 +") "+"("+ rect2.x2 +","+ rect2.y2+")");
		System.out.println("El perimetro del rectangulo es: "+perimetros);
		System.out.println("El area del rectangulo es: "+area);
	}

}
