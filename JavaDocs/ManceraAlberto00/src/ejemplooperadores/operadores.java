package ejemplooperadores;

public class operadores {
 public static void main (String[] args) {
	
	 int x1 = 10 , x2 = 5, x3 = 0;
	 char c1= 'Z', c2= 'S' ;
	 boolean resultado;
	 
	// x1 es igual a x2
	 resultado = x1 == x2;
	 System.out.println ("x1 es igual a x2 " + resultado);
	 
	 // c1 es distinto a c2
	 resultado = c1!=c2;
	 System.out.println ("c1 es distinto a c2: " + resultado);
	 
	//x1 está entre 10 y 100
     resultado =x1>=10 && x1<=100; 
     System.out.println("x1 está entre 10 y 100: " + resultado );
     
     //x2 no está entre 10 y 100
     resultado = !(x2>=10 && x2<=100);
     System.out.println( "x2 no está entre 10 y 100: " + resultado);
     
     //x3 no está entre 10 y 100
     resultado = !(x3>=10 && x3<=100);
    System.out.println( "x3 no está entre 10 y 100: " + resultado) ;
    
    //x1 es mayor a x2 y c1 es igual a c2
    resultado =x1>x2 && c1==c2;
    System.out.println("x1 es mayor a x2 y c1 es igual a c2: "+resultado);
    
    //O x1 es mayor que x2, o c1 es distinto a c2, cualquiera de los dos casos
    resultado = x1>x2 || c1!=c2;
    System.out.println("O x1 es mayor que x2, o c1 es distinto a c2, cualquiera de los dos casos: "+ resultado);
    
    // x1 es menor o igual q 7 y c2 es igual a c1
    resultado = x1<= 7 && c2==c1;
    System.out.println("x1 es menor o igual que 7 y c2 es igual que c1:" + resultado);
 }
	
}
