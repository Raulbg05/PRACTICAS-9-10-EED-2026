package ejemplo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Clase de tests unitarios para la clase Rectangle.
 * Cubre todos los casos posibles de entrada.
 *
 * @author Raúl Beltrán Gracia
 * @version 2.0
 */
class RectangleTest {

    /**
     * Test con valores positivos.
     * Comprueba que area=12 y perimetro=14 para un rectángulo 3x4.
     */
    @Test
    void test() {
        Rectangle r = new Rectangle(3, 4);
        assertAll(
            () -> assertEquals(12, r.surface()),
            () -> assertEquals(14, r.perimeter())
        );
    }

    /**
     * Test con un valor negativo.
     * Comprueba que surface() y perimeter() devuelven -1.
     */
    @Test
    void testValoresNegativos() {
        Rectangle r = new Rectangle(-3, 4);
        assertAll(
            () -> assertEquals(-1, r.surface()),
            () -> assertEquals(-1, r.perimeter())
        );
    }

    /**
     * Test con un valor cero.
     * Comprueba que surface() y perimeter() devuelven 0.
     */
    @Test
    void testValoresCero() {
        Rectangle r = new Rectangle(0, 4);
        assertAll(
            () -> assertEquals(0, r.surface()),
            () -> assertEquals(0, r.perimeter())
        );
    }

    /**
     * Test con ambos valores negativos.
     * Comprueba que surface() y perimeter() devuelven -1.
     */
    @Test
    void testAmbosNegativos() {
        Rectangle r = new Rectangle(-3, -5);
        assertAll(
            () -> assertEquals(-1, r.surface()),
            () -> assertEquals(-1, r.perimeter())
        );
    }

    /**
     * Test con ambos valores cero.
     * Comprueba que surface() y perimeter() devuelven 0.
     */
    @Test
    void testAmbosCero() {
        Rectangle r = new Rectangle(0, 0);
        assertAll(
            () -> assertEquals(0, r.surface()),
            () -> assertEquals(0, r.perimeter())
        );
    }

    /**
     * Test intencionalmente erróneo.
     * Verifica que JUnit detecta correctamente una aserción fallida.
     * Se espera que este test FALLE.
     */
    @Test
    void testErroneo() {
        Rectangle r = new Rectangle(3, 4);
        assertEquals(15, r.surface());
    }
}