package ejercicio2;

public class PincipalCafetera {
	 public static void main(String[] args) {
		 
	        Cafetera cafetera1 = new Cafetera();
	        System.out.println("--------------------");
	     System.out.println(cafetera1.toString());
	     
	        cafetera1.llenarCafetera(250);
	        System.out.println(cafetera1.toString());
	        while (cafetera1.getCantidadActual() > 0) {
	            try {
	                cafetera1.servirTaza(50);
	            } catch (IllegalArgumentException e) {
	                System.out.println(e.getMessage());
	            }
	        }
	        System.out.println("--------------------");
	        System.out.println(cafetera1.toString());

	        Cafetera cafetera2 = new Cafetera(1000);
	       System.out.println("--------------------");
	        System.out.println(cafetera2.toString());
	        
	        for (int i = 0; i < 50; i++) {
	            if (cafetera2.getCantidadActual() < 50) {
	                System.out.println("Recargando cafetera...");
	                cafetera2.llenarCafetera(1000);
	                System.out.println("--------------------");
	                System.out.println(cafetera2.toString());
	            }
	            try {
	                cafetera2.servirTaza(50);
	                System.out.println("--------------------");
	                System.out.println(cafetera2.toString());
	            } catch (IllegalArgumentException e) {
	                System.out.println(e.getMessage());
	            }
	        }
	    }
}
