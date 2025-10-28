package ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;

class FechaTest {

    @Test
    void testFormatoDiaMesAno() throws ParseException {
        // Configurar fecha fija para pruebas: 07/12/2017
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaFija = sdf.parse("07/12/2017");
        Fecha miFecha = new Fecha(fechaFija);

        assertEquals("07/12/2017", miFecha.devuelveFecha(1));
    }

    @Test
    void testFormatoMesAno() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaFija = sdf.parse("07/12/2017");
        Fecha miFecha = new Fecha(fechaFija);

        assertEquals("12/2017", miFecha.devuelveFecha(2));
    }

    @Test
    void testFormatoCompleto() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaFija = sdf.parse("07/12/2017");
        Fecha miFecha = new Fecha(fechaFija);

        // Probamos solo el día y mes-año (la hora varía y no es testeable)
        String resultado = miFecha.devuelveFecha(3);
        assert(resultado.startsWith("jueves 07-dic-2017"));
    }

    @Test
    void testTipoInvalido() {
        Fecha miFecha = new Fecha(); // Usa fecha actual, pero no afecta
        assertEquals("ERROR", miFecha.devuelveFecha(99));
    }
}