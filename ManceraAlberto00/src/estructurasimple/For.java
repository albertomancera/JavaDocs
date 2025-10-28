package estructurasimple;

public class For {
	public static void main(String args[]) {
		
		
		for (int num=5; num<=30; num++) {
		
			if (num%3 ==0 && (num%5==0)) {
				System.out.println(num + " es multiplo de 3 y 5");
			}else {
					System.out.println(num + " no es múltiplo de 3 y 5");
			}
		}
	}
}
