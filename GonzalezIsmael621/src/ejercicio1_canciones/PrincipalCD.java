package ejercicio1_canciones;

public class PrincipalCD {

	public static void main(String[] args) {
		// 1. Crear un CD llamado unCd.
        CD unCd = new CD();

        // 2. Incluir tres canciones y mostrar el número de canciones que incluye.
        unCd.agrega(new Canciones("Blinding Lights", "The Weeknd"));
        unCd.agrega(new Canciones("Someone Like You", "Adele"));
        unCd.agrega(new Canciones("Bohemian Rhapsody", "Queen"));
        System.out.println("Número de canciones en unCd: " + unCd.numeroCanciones());

        // 3. Eliminar la segunda canción.
        unCd.elimina(1);

        // 4. Crear un CD llamado otroCd y copiar el contenido de unCd a él.
        CD otroCd = new CD();
        for (int i = 0; i < unCd.numeroCanciones(); i++) {
            otroCd.agrega(unCd.dameCancion(i).clonar());
        }

        // 5. Agregar una canción a otroCd.
        otroCd.agrega(new Canciones("Rolling in the Deep", "Adele"));

        // 6. Mostrar el contenido de unCd.
        System.out.println("Contenido de unCd:\n" + unCd);

        // 7. Mostrar el contenido de otroCd.
        System.out.println("Contenido de otroCd:\n" + otroCd);

	}

}
