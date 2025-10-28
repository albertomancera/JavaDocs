package mobiliario;

public class Sofa extends Asiento{
	//Atributos de objeto
		private String composicion;
		
		//Constructores
		public Sofa (double precio, String descripcion, int numPlazas, String tapiceria, String color, String composicion) {
			super(precio, descripcion, numPlazas, tapiceria, color);
			this.composicion = composicion;
		}

		//Métodos
		public String getComposicion() {
			return composicion;
		}

		@Override
		public String toString() {
			return super.toString() + " Composicion=" + this.getComposicion() ;
		}
		
		
}
