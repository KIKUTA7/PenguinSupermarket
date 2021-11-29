package pgdp.collections;

public class StackConnector<T> implements DataStructureConnector{
    private Stack<T> name;
    public StackConnector(LinkedStack<T> x)
    {
        name = x;
    }
    @Override
    public boolean hasNextElement() {
        return name==null;
    }

    @Override
    public void addElement(Object x) {
        name.push((T) x);
    }

    @Override
    public Object removeNextElement() {
        return name.pop();
    }
}
