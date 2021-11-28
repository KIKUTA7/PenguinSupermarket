package pgdp.collections;

public interface Queue {
    <T> void enqueue(T x);
    void dequeue();

}
