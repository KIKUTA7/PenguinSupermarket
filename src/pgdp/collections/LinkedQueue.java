package pgdp.collections;

public class LinkedQueue<T> {
    private T info;
    private LinkedQueue<T> next;
    private LinkedQueue<T> prev;

    public LinkedQueue(T x) {
        info = x;
    }
}
