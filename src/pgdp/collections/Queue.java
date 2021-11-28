package pgdp.collections;

public interface Queue <T> extends DataStructure {
    List<T> enqueue(T x);
    List<T> dequeue();

}
