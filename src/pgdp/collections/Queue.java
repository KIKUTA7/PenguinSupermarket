package pgdp.collections;

public interface Queue <T> extends DataStructure {
    List enqueue(T x);
    List dequeue();

}
