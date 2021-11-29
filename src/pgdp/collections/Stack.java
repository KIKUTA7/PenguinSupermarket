package pgdp.collections;

public interface Stack <T> extends DataStructure {
     LinkedStack<T> push(T x);
     LinkedStack<T> pop();

}
