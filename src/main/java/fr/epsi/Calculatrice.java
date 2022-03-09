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
     * @return a - b
     */
    public final double sub(final double a, final double b) {
        return a - b;
    }

    /**
     * @param a double value
     * @param b double value
     * @return a / b
     */
    public final double div(final double a, final double b) throws ArithmeticException {
        final double product = a / b;

        if (Double.isInfinite(product)) {
            throw new ArithmeticException("Impossible de diviser par zero");
        }

        return product;
    }
    
    /**
     * @param a double value
     * @param b double value
     * @return a * b
     */
    public final double mul(final double a, final double b) {
        return a * b;
    }
}