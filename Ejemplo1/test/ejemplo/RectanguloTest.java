package ejemplo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectanguloTest {

    @Test
    void test() {
        Rectangulo r = new Rectangulo(3, 4);
        assertAll(
                () -> assertEquals(12, r.area()),
                () -> assertEquals(14, r.perimetro())
        );

    }

    @Test
    void testValoresNegativos() {

        Rectangulo r = new Rectangulo(-3, 4);

        assertAll(
            () -> assertEquals(-1, r.area()),
            () -> assertEquals(-1, r.perimetro())
        );
    }

    @Test
    void testValoresCero() {

        Rectangulo r = new Rectangulo(0, 4);

        assertAll(
            () -> assertEquals(0, r.area()),
            () -> assertEquals(0, r.perimetro())
        );
    }

    // ASERCION ERRONEA
    @Test
    void testErroneo() {

        Rectangulo r = new Rectangulo(3, 4);

        assertEquals(15, r.area());
    }

    @Test
    void testAmbosNegativos() {
        Rectangulo r = new Rectangulo(-3, -5);
        assertAll(
            () -> assertEquals(-1, r.area()),
            () -> assertEquals(-1, r.perimetro())
        );
    }

    @Test
    void testAmbosCero() {
        Rectangulo r = new Rectangulo(0, 0);
        assertAll(
            () -> assertEquals(0, r.area()),
            () -> assertEquals(0, r.perimetro())
        );
    }
}
