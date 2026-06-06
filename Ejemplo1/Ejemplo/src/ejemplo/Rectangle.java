package ejemplo;

/**
 * Clase que representa un rectángulo con ancho y alto.
 * Permite calcular su área (surface) y perímetro (perimeter).
 *
 * @author Raúl Beltrán Gracia
 * @version 2.0
 */
public class Rectangle {

    /**
     * Número de lados usado en el cálculo del perímetro.
     */
    private static final int SIDES = 2;

    /** Ancho del rectángulo. */
    private int ancho;

    /** Alto del rectángulo. */
    private int alto;

    /**
     * Constructor de la clase Rectangle.
     *
     * @param ancho ancho del rectángulo
     * @param alto  alto del rectángulo
     */
    public Rectangle(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    /**
     * Valida los parámetros del rectángulo.
     * Comprueba si alguno es negativo o cero.
     *
     * @return -1 si algún parámetro es negativo,
     *          0 si algún parámetro es cero,
     *          1 si ambos son válidos y positivos
     */
    private int validateParams() {
        if (ancho < 0 || alto < 0) return -1;
        if (ancho == 0 || alto == 0) return 0;
        return 1;
    }

    /**
     * Calcula la superficie (área) del rectángulo.
     *
     * @return el área del rectángulo (ancho * alto),
     *         -1 si algún parámetro es negativo,
     *          0 si algún parámetro es cero
     */
    public int surface() {
        int validation = validateParams();
        if (validation != 1) return validation;
        return ancho * alto;
    }

    /**
     * Calcula el perímetro del rectángulo.
     *
     * @return el perímetro del rectángulo (2 * ancho + 2 * alto),
     *         -1 si algún parámetro es negativo,
     *          0 si algún parámetro es cero
     */
    public int perimeter() {
        int validation = validateParams();
        if (validation != 1) return validation;
        return SIDES * ancho + SIDES * alto;
    }
}