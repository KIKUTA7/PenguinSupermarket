package pgdp.collections;

public class LinkedQueue<T> implements Queue<T>{
    private List<T> first, last;
    @Override
    public int size() {
        int siz=1;
        if(first==null && last==null) return 0;
        for (List<T> t =first;t!=last;t=t.getNext())
            siz++;
        return siz;
    }

    @Override
    public boolean isEmpty() {
        return first==last && first==null;
    }

    @Override
    public void enqueue(T x) {
           if(first==null && last==null)
           {
               first = new List<T>(x);
               last = first;
           }
           else
           {
               last.insert(x);
               last=last.getNext();
           }

    }

    @Override
    public T dequeue() {
        if(first==null) return null;
        T ans  = first.getInfo();
        first = first.getNext();
        return ans;
    }
}
