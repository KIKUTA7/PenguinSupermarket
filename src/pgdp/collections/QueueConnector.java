package pgdp.collections;

public class QueueConnector<T> implements DataStructureConnector<T> {
    private Queue<T> que = new LinkedQueue<>();

    @Override
    public boolean hasNextElement() {
        if(que.isEmpty()) return false;
        return true;
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
