package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LiquidTest {

    private Liquid liquid;

    @BeforeEach
    void setUp() {
        liquid = new Liquid("Water", 0.5, 0);
    }

    @Test
    void testGetName() {
        assertEquals("Water", liquid.getName());
    }

    @Test
    void testSetName() {
        liquid.setName("Juice");
        assertEquals("Juice", liquid.getName());
    }

    @Test
    void testGetVolume() {
        assertEquals(0.5, liquid.getVolume(), 0.0001);
    }

    @Test
    void testSetVolume() {
        liquid.setVolume(0.7);
        assertEquals(0.7, liquid.getVolume(), 0.0001);
    }

    @Test
    void testGetAlcoholPercent() {
        assertEquals(0, liquid.getAlcoholPercent(), 0.0001);
    }

    @Test
    void testSetAlcoholPercent() {
        liquid.setAlcoholPercent(5);
        assertEquals(5, liquid.getAlcoholPercent(), 0.0001);
    }
}
