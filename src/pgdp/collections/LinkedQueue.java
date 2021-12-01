package pgdp.collections;

public class LinkedQueue<T> implements Queue<T> {
    private List<T> firs;

    @Override
    public int size() {
        if(firs==null) return 0;
        return firs.length();
    }

    @Override
    public boolean isEmpty() {
        return firs==null;
    }

    @Override
    public void enqueue(T x) {
        List<T> tem = firs;
        while(tem!=null && tem.getNext()!=null)
            tem=tem.getNext();
        if(tem!=null) tem.insert(x);
        else
        {
            firs = new List<T>(x,null);
        }
    }

    @Override
    public T dequeue() {
        if(firs==null) return null;
        T rem = firs.getInfo();
        firs=firs.getNext();
        return rem;
    }


}
