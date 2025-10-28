package examenT3;

import java.time.LocalDate;

import examenT3.Genero.Genero_Libro;


public abstract class Libro {
	//Atributos de clase constantes
	public static final String TITULO_DEFAULT = "Sin título";
	public static final String AUTOR_DEFAULT = "Sin Autor";
	public static final LocalDate FECHA_ACTUAL = LocalDate.now();
	public static final Genero_Libro GENERO_DEFECTO = Genero_Libro.CUENTO;
	public static final boolean DISPONIBILIDAD_DEFECTO = true ;
	
	private static int numCu = 0;
	private static int numFi = 0;
	private static int numNo = 0;
	private static int numFis = 0;
	private static int numDig = 0;
	
	//Atributos de objeto
		protected String identificador;
		protected String titulo;
		protected String autor;
		protected LocalDate fechapublicacion;
		protected Genero_Libro genero;
		protected boolean disponibilidad;
		
		public Libro(String titulo, String autor, LocalDate fechapublicacion, Genero_Libro genero,
		boolean disponibilidad) throws IllegalArgumentException{
			if (!genero.equals(Genero_Libro.CUENTO) && !genero.equals(Genero_Libro.FICCIÓN) && !genero.equals(Genero_Libro.NOVELA)) {
				throw new IllegalArgumentException("El género debe de ser o cuento o novela o ficción");
			}
			if(fechapublicacion.isAfter(FECHA_ACTUAL)) {
				throw new IllegalArgumentException("La fecha de publicación debe ser posterior a la fecha actual");
			}
			
			if(genero.equals(Genero_Libro.CUENTO)) {
				numCu++;
				this.identificador = String.format("CUE"+"-%03d", numCu);
			}else if (genero.equals(Genero_Libro.FICCIÓN)) {
				numFi++;
				this.identificador = String.format("FIC"+"-%03d",numFi);
			}else if (genero.equals(Genero_Libro.NOVELA)) {
				numNo++;
				this.identificador = String.format("NOV"+"-%03d", numNo);
			}
			
			if(this.getClass().getName().equalsIgnoreCase("LFisico")) {
				numFis++;
			}else if(this.getClass().getName().equalsIgnoreCase("LDigital")) {
				numDig++;
			}
			
			this.titulo = titulo;
			this.autor = autor;
			this.fechapublicacion = fechapublicacion;
			this.genero = genero;
			this.disponibilidad = disponibilidad;
		}

		public Libro() {
			this(TITULO_DEFAULT,AUTOR_DEFAULT,FECHA_ACTUAL,GENERO_DEFECTO,DISPONIBILIDAD_DEFECTO);
		}
		
		//Metodos
		public abstract double calcularPrecio();
			
		public int calcularAnnosPubl() {
			int annos = LocalDate.now().getYear() - fechapublicacion.getYear();
			return annos;
		}

		public String getIdentificador() {
			return identificador;
		}

		public String getTitulo() {
			return titulo;
		}

		public String getAutor() {
			return autor;
		}

		public LocalDate getFechapublicacion() {
			return fechapublicacion;
		}
		
		public void setFechapublicacion(LocalDate fechapublicacion) throws IllegalArgumentException{
			if(fechapublicacion.isAfter(FECHA_ACTUAL)) {
				throw new IllegalArgumentException("La fecha de publicacion no puede ser mayor a la actual");
			}
			this.fechapublicacion = fechapublicacion;
		}

		public Genero_Libro getGenero() {
			return genero;
		}

		public boolean isDisponibilidad() {
			return disponibilidad;
		}

		
		@Override
		public String toString() {
			return "Libro [identificador=" + identificador + ", titulo=" + titulo + ", autor=" + autor
					+ ", fechapublicacion=" + fechapublicacion + ", genero=" + genero + ", disponibilidad="
					+ disponibilidad + "]";
		}


		
		
		
}
