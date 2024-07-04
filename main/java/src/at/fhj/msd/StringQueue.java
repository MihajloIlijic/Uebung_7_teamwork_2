

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE

public class StringQueue implements IQueue {

    private List<String> elements = new ArrayList<String>();
    private int maxSize = 5;

    /**
     * Creates a StringQueue with a specified maximum size.
     *
     * @param maxSize the maximum number of elements the queue can hold
     */
    public StringQueue(int maxsize) {
        this.maxSize = maxSize;
    }


    /**
     * Adds an element to the queue if there is space available.
     *
     * @param obj the string to add to the queue
     * @return true if the element was added, false if the queue is full
     */
    @Override
    public boolean offer(String obj) {
        if (elements.size() != maxSize)
            elements.add(obj);
        else
            return false;

        return true;
    }

    /**
     * Retrieves and removes the head of the queue, or returns null if the queue is empty.
     *
     * @return the head of the queue, or null if the queue is empty
     */

    @Override
    public String poll() {
        String element = peek();

        if (elements.size() > 0) {
            elements.remove();
        }

        return element;
    }

    /**
     * Retrieves and removes the head of the queue.
     *
     * @return the head of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    @Override
    public String remove() {
        String element = poll();
        element = "";
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }

    /**
     * Retrieves, but does not remove, the head of the queue, or returns null if the queue is empty.
     *
     * @return the head of the queue, or null if the queue is empty
     */

    @Override
    public String peek() {
        String element;
        if (elements.size() > 0)
            element = elements.get(0);
        else
            element = null;

        return element;
    }

    /**
     * Retrieves, but does not remove, the head of the queue.
     *
     * @return the head of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    @Override
    public String element() {
        String element = peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }

}