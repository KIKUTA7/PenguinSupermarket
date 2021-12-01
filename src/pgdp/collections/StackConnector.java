package pgdp.collections;

public class StackConnector<T> implements DataStructureConnector<T> {
    private Stack<T> sta;

    @Override
    public boolean hasNextElement() {
        return sta==null;
    }

    @Override
    public void addElement(T x) {
        sta.push(x);
    }

    @Override
    public T removeNextElement() {
        if(sta==null) return null;
        return sta.pop();
    }
}
