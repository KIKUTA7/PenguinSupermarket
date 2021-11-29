package pgdp.collections;

public class LinkedStack<T> implements Stack{
    private List<T> l;
    public List<T> getNext() {
        return l;
    }
    public LinkedStack()
    {
        l = null;
    }
    @Override
    public int size() {
        int count=0;
        for(List<T> t=l;t!=null;t=t.getNext())
            count++;
        return count;
    }

    @Override
    public LinkedStack<T> push(Object x) {
         l = new List<T>((T) x,l);
         return this;
    }

    @Override
    public LinkedStack<T> pop() {
        l=l.getNext();
        return this;
    }
}
