package pgdp.collections;

public class StackConnector<T> implements DataStructureConnector<T> {
    private Stack<T> sta = new LinkedStack<>();
    public StackConnector(Stack<T> sta)
    {
        this.sta=sta;
    }
    @Override
    public boolean hasNextElement() {
        if(sta.isEmpty()) return false;
        return true;
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
