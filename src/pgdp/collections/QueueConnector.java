package pgdp.collections;

public class QueueConnector<T> implements DataStructureConnector<T> {
    private Queue<T> que;

    @Override
    public boolean hasNextElement() {
        return que==null;
    }

    @Override
    public void addElement(T x) {
        que.enqueue(x);
    }

    @Override
    public T removeNextElement() {
        if(que==null) return null;
        return que.dequeue();
    }
}
