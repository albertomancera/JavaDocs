package ejercicio14;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Disabled;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    @DisplayName("Calcula factorial correctamente para valores válidos")
    void testFactorialValido() {
        assertAll("Pruebas de factorial válidas",
            () -> assertEquals(1, Factorial.calculo(0)),
            () -> assertEquals(1, Factorial.calculo(1)),
            () -> assertEquals(2, Factorial.calculo(2)),
            () -> assertEquals(6, Factorial.calculo(3)),
            () -> assertEquals(24, Factorial.calculo(4)),
            () -> assertEquals(120, Factorial.calculo(5))
        );
    }

    @Test
    @DisplayName("Lanza excepción si el número es negativo")
    void testFactorialNegativo() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> Factorial.calculo(-1)
        );
        assertEquals("Número -1 no puede ser < 0", exception.getMessage());
    }

    @Test
    @DisplayName("Lanza excepción si ocurre desbordamiento (overflow)")
    void testOverflow() {
        ArithmeticException exception = assertThrows(
            ArithmeticException.class,
            () -> Factorial.calculo(20) // 20! = 2_432_902_008_176_640_000 (overflow en int)
        );
        assertEquals("Overflow, número 20 demasiado grande", exception.getMessage());
    }

    @Test
    @Disabled("Test deshabilitado temporalmente")
    @DisplayName("Este test está deshabilitado")
    void testDeshabilitado() {
        assertEquals(42, Factorial.calculo(8)); // incorrecto, se ignora
    }
}
