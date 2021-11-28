package pgdp.collections;

public interface Queue <T> extends DataStructure {
    <T> void enqueue(T x);
    <T> void dequeue();

}