package fr.epsi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

import org.junit.Test;

public final class CalculatriceTest {
    @Test
    public final void calculatrice_add_1_to_2() {
        // ETANT DONNE une calculatrice
        final Calculatrice calculatrice = new Calculatrice();

        // QUAND elle ajoute deux nombres entre-eux
        final double result = calculatrice.add(1d, 2d);

        // ALORS le résultat doit être correct
        assertEquals(3d, result, 0);
    }

    @Test
    public final void calculatrice_remove_2_by_1() {
        // ETANT DONNE une calculatrice
        final Calculatrice calculatrice = new Calculatrice();

        // QUAND elle soustrait jun nombre à un autre
        final double result = calculatrice.sub(2d, 1d);

        // ALORS le résultat doit être correct
        assertEquals(1d, result, 0);
    }

    @Test
    public final void calculatrice_divide_10_by_2() {
        // ETANT DONNE une calculatrice
        final Calculatrice calculatrice = new Calculatrice();

        // QUAND elle divise un nombre par un autre
        try {
            final double result = calculatrice.div(10d, 2d);

            // ALORS le résultat doit être correct
            assertEquals(5d, result, 0);
        } catch(Exception ex) {
            fail(ex.getMessage());
            ex.printStackTrace();
        }
    }

    @Test
    public final void calculatrice_divide_by_zero() {
        assertThrows(ArithmeticException.class, () -> {
            // ETANT DONNE une calculatrice
            final Calculatrice calculatrice = new Calculatrice();

            // QUAND elle divise un nombre par zéro
            // ALORS une exception doit être levée
            calculatrice.div(10d, 0d);
        });
    }

    @Test
    public final void calculatrice_multiply_2_by_2() {
        // ETANT DONNE une calculatrice
        final Calculatrice calculatrice = new Calculatrice();

        // QUAND elle multiplie un nombre par un autre
        final double result = calculatrice.mul(2d, 2d);

        // ALORS le résultat doit être correct
        assertEquals(4d, result, 0);
    }
}