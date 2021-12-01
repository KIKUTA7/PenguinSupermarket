package pgdp.collections;

public class QueueConnector<T> implements DataStructureConnector<T> {
    private Queue<T> que;
    public QueueConnector ()
    {
        que = new LinkedQueue<T>();
    }
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
        return que.dequeue();
    }


}
