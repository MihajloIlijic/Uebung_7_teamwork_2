package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class DrinkQueueTest {

    private queue<Drink> drinkQueue;
    private Drink water;
    private Drink juice;

    @BeforeEach
    void setUp() {
        drinkQueue = new queue<>();
        water = new Drink("Water") {
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

        juice = new Drink("Juice") {
            @Override
            public double getVolume() {
                return 0.3;
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
    }

    @Test
    void testEnqueue() {
        drinkQueue.enqueue(water);
        assertEquals(water, drinkQueue.front());
        assertEquals(water, drinkQueue.rear());

        drinkQueue.enqueue(juice);
        assertEquals(water, drinkQueue.front());
        assertEquals(juice, drinkQueue.rear());
    }

    @Test
    void testDequeue() {
        drinkQueue.enqueue(water);
        drinkQueue.enqueue(juice);

        drinkQueue.dequeue();
        assertEquals(juice, drinkQueue.front());
        assertEquals(juice, drinkQueue.rear());

        drinkQueue.dequeue();
        assertNull(drinkQueue.front());
        assertNull(drinkQueue.rear());
    }

    @Test
    void testEmpty() {
        assertTrue(drinkQueue.empty());
        drinkQueue.enqueue(water);
        assertFalse(drinkQueue.empty());
    }

    @Test
    void testFront() {
        assertNull(drinkQueue.front());
        drinkQueue.enqueue(water);
        assertEquals(water, drinkQueue.front());
    }

    @Test
    void testRear() {
        assertNull(drinkQueue.rear());
        drinkQueue.enqueue(water);
        assertEquals(water, drinkQueue.rear());
    }

    @Test
    void testToString() {
        assertEquals("", drinkQueue.toString());
        drinkQueue.enqueue(water);
        assertEquals("Water", drinkQueue.toString());
        drinkQueue.enqueue(juice);
        assertEquals("Water->Juice", drinkQueue.toString());
    }
}
