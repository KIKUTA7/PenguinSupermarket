package pgdp.collections;

public interface Queue <T> extends DataStructure {
    Object enqueue(T x);
    Object dequeue();

}
