package fr.epsi;

/**
 * Calculatrice class
 */
public final class Calculatrice 
{
    public Calculatrice() {
        /* Empty constructor */
    }

    /**
     * @param a double value
     * @param b double value
     * @return a + b
     */
    public final double add(final double a, final double b) {
        return a + b;
    }

    /**
     * @param a double value
     * @param b double value
     * @return a + b
     */
    public final double sub(final double a, final double b) {
        return a - b;
    }

    /**
     * @param a double value
     * @param b double value
     * @return a + b
     */
    public final double div(final double a, final double b) throws DivideByZeroException {
        final double product = a / b;

        if (product == 0d) {
            throw new DivideByZeroException();
        }

        return product;
    }
    
    /**
     * @param a double value
     * @param b double value
     * @return a + b
     */
    public final double mul(final double a, final double b) {
        return a * b;
    }
}

final class DivideByZeroException extends Exception {

    public DivideByZeroException() {
        super("Impossible de diviser par zero");
    }

}