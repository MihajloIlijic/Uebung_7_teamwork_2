
 class queue<T extends Drink> {



/**
 * A generic queue implementation for objects that extend the Drink class.
 *
 * @param <T> the type of elements in the queue, which must extend Drink
 */
import java.util.ArrayList;
class queue<T extends Drink> {


    int front = -1, rear = -1;

    ArrayList<T> A = new ArrayList<>();

    /**
     * Returns the front element of the queue without removing it.
     *
     * @return the front element of the queue, or null if the queue is empty
     */

    T front()
    {
        if (front == -1)
            return null;

        return A.get(front);
    }
    /**
     * Returns the rear element of the queue without removing it.
     *
     * @return the rear element of the queue, or null if the queue is empty
     */
    T rear()
    {
        if (rear == -1)
            return null;
        return A.get(rear);
    }
    /**
     * Adds an element to the end of the queue.
     *
     * @param X the element to be added to the queue
     */
    void enqueue(T X)
    {
        if (this.empty()) {
            front = 0;
            rear = 0;
            A.add(X);
        }
        else {
            front++;
            if (A.size() > front) {
                A.set(front, X);
            }
            else
                A.add(X);
        }
    }
    /**
     * Removes the front element of the queue.
     */
    void dequeue()
    {

        if (this.empty())


            System.out.println("Queue is already empty");


        else if (front == rear) {


            front = rear = -1;
        }


        else {


            rear++;
        }
    }

    /**
     * Checks if the queue is empty.
     *
     * @return true if the queue is empty, false otherwise
     */

    boolean empty()
    {

        if (front == -1 && rear == -1)
            return true;
        return false;
    }


    /**
     * Returns a string representation of the queue.
     *
     * @return a string representation of the queue
     */


    public String toString()
    {
        if (this.empty())
            return "";

        String Ans = "";

        for (int i = rear; i < front; i++) {
            Ans += String.valueOf(A.get(i)) + "->";
        }

        Ans += String.valueOf(A.get(front));

        return Ans;
    }



}