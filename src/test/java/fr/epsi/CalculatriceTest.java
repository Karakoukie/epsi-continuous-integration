package fr.epsi;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class CalculatriceTest {
    @Test
    public void calculatrice_add_1_to_2() {
        // ETANT DONNE une calculatrice
        Calculatrice calculatrice = new Calculatrice();

        // QUAND elle ajoute deux nombres entre-eux
        double result = calculatrice.add(1d, 2d);

        // ALORS le résultat doit être correct
        assertTrue(result == 3d);
    }

    @Test
    public void calculatrice_remove_2_by_1() {
        // ETANT DONNE une calculatrice
        Calculatrice calculatrice = new Calculatrice();

        // QUAND elle soustrait jun nombre à un autre
        double result = calculatrice.sub(2d, 1d);

        // ALORS le résultat doit être correct
        assertTrue(result == 1d);
    }

    @Test
    public void calculatrice_divide_10_by_2() {
        // ETANT DONNE une calculatrice
        Calculatrice calculatrice = new Calculatrice();

        // QUAND elle divise un nombre par un autre
        try {
            double result = calculatrice.div(10d, 2d);

            // ALORS le résultat doit être correct
            assertTrue(result == 5d);
        } catch(Exception ex) {
            fail();
            ex.printStackTrace();
        }
    }

    @Test
    public void calculatrice_divide_by_zero() {
        // ETANT DONNE une calculatrice
        Calculatrice calculatrice = new Calculatrice();

        // QUAND elle divise un nombre par zéro
        try {
            calculatrice.div(10d, 0d);
        } catch(Exception ex) {
            // ALORS une exception doit être levée
            assertTrue(ex instanceof DivideByZeroException);
        }
    }

    @Test
    public void calculatrice_multiply_2_by_2() {
        // ETANT DONNE une calculatrice
        Calculatrice calculatrice = new Calculatrice();

        // QUAND elle multiplie un nombre par un autre
        double result = calculatrice.mul(2d, 2d);

        // ALORS le résultat doit être correct
        assertTrue(result == 4d);
    }
}