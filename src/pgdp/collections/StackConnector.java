package pgdp.collections;

public class StackConnector<T> implements DataStructureConnector<T>{
    private Stack<T> name;
    public StackConnector(Stack<T> a)
    {
        name = a;
    }
    @Override
    public boolean hasNextElement() {
        if(name.isEmpty()) return false;
        return true;
    }

    @Override
    public void addElement(T x) {
        name.push((T) x);
    }

    @Override
    public T removeNextElement() {
        return name.pop();
    }
}
