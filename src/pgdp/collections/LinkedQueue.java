package pgdp.collections;

public class LinkedQueue<T> implements Queue<T> {
    private List<T> firs;

    @Override
    public int size() {
        return firs.length();
    }

    @Override
    public boolean isEmpty() {
        return firs==null;
    }

    @Override
    public void enqueue(T x) {
          List<T> tem = firs;
          while(tem.getNext()!=null)
              tem=tem.getNext();
          firs.insert(x);
    }

    @Override
    public T dequeue() {
        if(firs==null) return null;
        T rem = firs.getInfo();
        firs=firs.getNext();
        return rem;
    }


}
