package pgdp.collections;

public class QueueConnector<T> implements DataStructureConnector<T> {
    private  Queue<T> que;
    public QueueConnector(Queue<T> que)
    {
        this.que=que;
    }
    @Override
    public boolean hasNextElement() {
        return !que.isEmpty();
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
