package fr.epsi;

/**
 * Hello world!
 *
 */
public class Calculatrice 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public Calculatrice() {}

    /**
     * @param a double value
     * @param b double value
     * @return a + b
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * @param a double value
     * @param b double value
     * @return a + b
     */
    public double sub(double a, double b) {
        return a - b;
    }

    /**
     * @param a double value
     * @param b double value
     * @return a + b
     */
    public double div(double a, double b) throws DivideByZeroException {
        double product = a / b;

        if (a == 0d || b == 0d) throw new DivideByZeroException("Impossible de diviser par zero");

        return product;
    }
    
    /**
     * @param a double value
     * @param b double value
     * @return a + b
     */
    public double mul(double a, double b) {
        return a * b;
    }
}

class DivideByZeroException extends Exception {

    public DivideByZeroException(String message) {
        super(message);
    }

}