package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrinkTest {

    private Drink nonAlcoholicDrink;
    private Drink alcoholicDrink;

    @BeforeEach
    void setUp() {
        nonAlcoholicDrink = new Drink("Water") {
            @Override
            public double getVolume() {
                return 0.5;
            }

            @Override
            public double getAlcoholPercent() {
                return 0;
            }

            @Override
            public boolean isAlcoholic() {
                return false;
            }
        };

        alcoholicDrink = new Drink("Beer") {
            @Override
            public double getVolume() {
                return 0.33;
            }

            @Override
            public double getAlcoholPercent() {
                return 5;
            }

            @Override
            public boolean isAlcoholic() {
                return true;
            }
        };
    }

    @Test
    void testGetName() {
        assertEquals("Water", nonAlcoholicDrink.getName());
        assertEquals("Beer", alcoholicDrink.getName());
    }

    @Test
    void testSetName() {
        nonAlcoholicDrink.setName("Juice");
        assertEquals("Juice", nonAlcoholicDrink.getName());
    }

    @Test
    void testGetVolume() {
        assertEquals(0.5, nonAlcoholicDrink.getVolume());
        assertEquals(0.33, alcoholicDrink.getVolume());
    }

    @Test
    void testGetAlcoholPercent() {
        assertEquals(0, nonAlcoholicDrink.getAlcoholPercent());
        assertEquals(5, alcoholicDrink.getAlcoholPercent());
    }

    @Test
    void testIsAlcoholic() {
        assertFalse(nonAlcoholicDrink.isAlcoholic());
        assertTrue(alcoholicDrink.isAlcoholic());
    }
}
