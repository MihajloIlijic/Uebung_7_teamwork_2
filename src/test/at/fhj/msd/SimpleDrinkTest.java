
package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleDrinkTest {

    private SimpleDrink juice;
    private SimpleDrink vodka;

    @BeforeEach
    void setUp() {
        // Setup for juice with 0% alcohol
        Liquid orangeJuice = new Liquid("Orange Juice", 0.25, 0);
        juice = new SimpleDrink("Orange Juice", orangeJuice);

        // Setup for vodka with 40% alcohol
        Liquid vodkaLiquid = new Liquid("Vodka", 0.05, 40);
        vodka = new SimpleDrink("Vodka Shot", vodkaLiquid);
    }

    @Test
    void testGetVolume() {
        assertEquals(0.25, juice.getVolume());
        assertEquals(0.05, vodka.getVolume());
    }

    @Test
    void testGetAlcoholPercent() {
        assertEquals(0, juice.getAlcoholPercent());
        assertEquals(40, vodka.getAlcoholPercent());
    }

    @Test
    void testIsAlcoholic() {
        assertFalse(juice.isAlcoholic());
        assertTrue(vodka.isAlcoholic());
    }
}
