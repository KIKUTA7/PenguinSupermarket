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
    public List<T> push(Object x) {
         l = new List<T>((T) x,l);
         return l;
    }

    @Override
    public List<T> pop() {
        l=l.getNext();
        if(this.size()==0) return null;
        return l;
    }
}
