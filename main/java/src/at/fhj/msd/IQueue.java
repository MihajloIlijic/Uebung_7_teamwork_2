
// fastly written (not really nice) comments you should adapt
public interface IQueue {
    /**
     * I am a really bad comment
     * <p>
     * fasdfadsffdsadsf
     * <p>
     * fdsasdfadsf
     * <p>
     * add object to queue, true if okay
     * <p>
     * i fell asleep on my keyboard...
     */
    public abstract boolean offer(String obj);



    /**
     * returns + del 1st element; null if nothing in there
     *
     */

    public abstract String poll();

    /**
     * same as poll, if there is nothing in there error NoSuchElementException
     */
    public abstract String remove();


    /**
     * 1st element without dlete, otherwise null
     *
     * @return
     */

    public abstract String peek();


    /**
     * element is to peek what remove is to poll
     */

    public abstract String element();
}