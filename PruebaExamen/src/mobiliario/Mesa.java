package mobiliario;

public class Mesa extends Mueble{
	//Atributos de clase constante
		public final static int MAX_COMENSALES = 16;
		public final static int MIN_COMENSALES = 4;
		public final static String FORMA_DEFECTO = "Mesa cuadrada";
		
		//Atributos de objeto
		private String forma;
		private int comensales;
		
		//Constructor
		public Mesa (double precio, String descripcion, String forma, int comensales) throws IllegalArgumentException {
			super(precio, descripcion);
			if(comensales<MIN_COMENSALES || comensales>MAX_COMENSALES) {
				throw new IllegalArgumentException("El número de comensales no está dentro del rango: "+comensales);
			}
			
			this.forma = forma;
			this.comensales = comensales;
		}
		
		

		public Mesa(int comensales){
			this(PRECIO_DEFECTO, DESCRIPCION_DEFECTO, FORMA_DEFECTO, comensales);
		}



		//Métodos
		public String getForma() {
			return forma;
		}

		public int getComensales() {
			return comensales;
		}

		@Override
		public String toString() {
			return super.toString() + "Forma=" + forma + ", comensales=" + comensales + "]";
		}
		
		
}
