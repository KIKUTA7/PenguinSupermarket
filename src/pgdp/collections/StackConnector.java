package pgdp.collections;

public class StackConnector<T> implements DataStructureConnector{
    private Stack<T> name;
    public StackConnector()
    {
        name = new LinkedStack<>();
    }

    public Stack<T> getName() {
        return name;
    }

    public void setName(Stack<T> name) {
        this.name = name;
    }

    @Override
    public boolean hasNextElement() {
        if(name.isEmpty()) return false;
        return true;
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
