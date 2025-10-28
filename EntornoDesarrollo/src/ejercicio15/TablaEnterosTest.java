package ejercicio15;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TablaEnterosTest {

    @Test
    void testSumaTabla() {
        int[] array = {2, 8, 1, 5};
        TablaEnteros tabla = new TablaEnteros(array);
        assertEquals(16, tabla.sumaTabla());
    }

    @Test
    void testMayorTabla() {
        int[] array = {2, 8, 1, 5};
        TablaEnteros tabla = new TablaEnteros(array);
        assertEquals(8, tabla.mayorTabla());
    }

    @Test
    void testPosicionTabla() {
        int[] array = {2, 8, 1, 5};
        TablaEnteros tabla = new TablaEnteros(array);
        assertEquals(1, tabla.posicionTabla(8));
    }

    @Test
    void testConstructorConArrayVacio() {
        IllegalArgumentException ex = assertThrows(
            IllegalArgumentException.class,
            () -> new TablaEnteros(new int[]{})
        );
        assertEquals("No hay elementos", ex.getMessage());
    }

    @Test
    void testPosicionTablaElementoNoExiste() {
        int[] array = {1, 2, 3};
        TablaEnteros tabla = new TablaEnteros(array);

        assertThrows(java.util.NoSuchElementException.class,
            () -> tabla.posicionTabla(10));
    }
}
