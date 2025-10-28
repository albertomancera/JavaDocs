package ejercicio3;

public class Rectangulo {

	private int  x1, y1, x2, y2;
	
	public Rectangulo(int x1,int y1, int x2 ,int  y2) {
		
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1)throws IllegalArgumentException {
		if(x1 <= 0)  {
			throw new IllegalArgumentException("<x1>  no puede ser un número negativo");
		} 
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1)throws IllegalArgumentException {
		if(y1 <= 0)  {
		throw new IllegalArgumentException("<y1>  no puede ser un número negativo");
	}  
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2)throws IllegalArgumentException {
		if(x2 <= x1) {
	}
		throw new IllegalArgumentException("<x2> no puede ser mayor que <x1>");
	} {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2)throws IllegalArgumentException {
		if(y2 <= y2) {
		throw new IllegalArgumentException("<y2> no puede ser menor que <y1>");
	} 
		this.y2 = y2;
	}
	
	
}
