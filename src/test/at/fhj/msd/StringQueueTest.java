import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class StringQueueTest {

    private StringQueue queue;

    @BeforeEach
    void setUp() {
        queue = new StringQueue(3); // Initialize queue with max size 3
    }

    @Test
    void testOffer() {
        assertTrue(queue.offer("first"));
        assertTrue(queue.offer("second"));
        assertTrue(queue.offer("third"));
        assertFalse(queue.offer("fourth")); // Queue is full, should return false
    }

    @Test
    void testPoll() {
        assertNull(queue.poll()); // Queue is empty, should return null

        queue.offer("first");
        queue.offer("second");

        assertEquals("first", queue.poll());
        assertEquals("second", queue.poll());
        assertNull(queue.poll()); // Queue is empty again
    }

    @Test
    void testRemove() {
        assertThrows(NoSuchElementException.class, () -> queue.remove()); // Queue is empty, should throw exception

        queue.offer("first");
        queue.offer("second");

        assertEquals("first", queue.remove());
        assertEquals("second", queue.remove());
        assertThrows(NoSuchElementException.class, () -> queue.remove()); // Queue is empty again
    }

    @Test
    void testPeek() {
        assertNull(queue.peek()); // Queue is empty, should return null

        queue.offer("first");
        queue.offer("second");

        assertEquals("first", queue.peek());
        assertEquals("first", queue.peek()); // Peek should not remove elements
    }

    @Test
    void testElement() {
        assertThrows(NoSuchElementException.class, () -> queue.element()); // Queue is empty, should throw exception

        queue.offer("first");
        queue.offer("second");

        assertEquals("first", queue.element());
        assertEquals("first", queue.element()); // Element should not remove elements
    }
}
