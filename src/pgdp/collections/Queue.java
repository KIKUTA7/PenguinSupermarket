package pgdp.collections;

public interface Queue <T> extends DataStructure {
    LinkedQueue<T> enqueue(T x);
    LinkedQueue<T> dequeue();

}
