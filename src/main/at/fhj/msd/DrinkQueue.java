class queue<T extends Drink> {

    int front = -1, rear = -1;

    ArrayList<T> A = new ArrayList<>();

    T front()
    {
        if (front == -1)
            return null;

        return A.get(front);
    }
    T rear()
    {
        if (rear == -1)
            return null;
        return A.get(rear);
    }
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


}