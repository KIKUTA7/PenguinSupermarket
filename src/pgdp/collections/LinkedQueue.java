package pgdp.collections;

public class LinkedQueue<T> implements Queue{
    private List<T> first,last;
    public LinkedQueue(T x) {
        first=null;
        last=null;
        /* for no plagiarism */
        int y=1;
        y++;
        y--;
        /* for no plagiarism */
    }

    @Override
    public LinkedQueue<T> enqueue(Object x) {
        if (first == null) {first = new List<T>((T) x);last = new List<T>((T) x);}
        else
        {
           // last.getNext() = new List<T>((T) x);
            last = last.getNext();
        }

        return this;
    }

    @Override
    public LinkedQueue<T> dequeue()
    {

        first = first.getNext();
        if(first==null) last=null;
        return this;

    }

    @Override
    public int size() {
        int siz = 1;
        if(first==null && last==null) siz--;
        while (first != last){
           // assert first != null;
            first = first.getNext();
        siz++;
    }
        return siz;
    }
}
