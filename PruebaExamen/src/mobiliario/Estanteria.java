package mobiliario;

public class Estanteria extends Almacenaje{
	//Atributos de objeto
		private String tipo;
		
		//Constructores
		public Estanteria (double precio, String descripcion, double anchura, double altura, int numMaxModulos, String tipo) {
			super(precio, descripcion, anchura, altura, numMaxModulos);
			this.tipo = tipo;
		}
		
		//Métodos
		@Override
		public void anyadirModulo(Modulo modulo) throws IllegalArgumentException, NullPointerException {
			if (modulo==null) {
				throw new NullPointerException("El módulo no puede ser nulo, debe ser tipo BALDA");
			}
			
			super.anyadirModulo(modulo);
		}

		public String getTipo() {
			return tipo;
		}
		
		@Override
		public String toString() {
			return super.toString() + " Tipo: "+ getTipo();
		}
}

