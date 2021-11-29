package pgdp.collections;

public class LinkedStack<T> implements Stack{
    private T info;
    private LinkedStack<T> next;
    public T getInfo() {
        return info;
    }

    public LinkedStack<T> getNext() {
        return next;
    }
    public LinkedStack(T x)
    {
        info = x;
        next = null;
    }
    public LinkedStack(T x, LinkedStack<T> l) {
        info = x;
        next = l;
    }


    @Override
    public int size() {
        int count=0;
        for (LinkedStack<T> t = this; t!=null; t=t.next)
            count++;
        return count;
    }

    @Override
    public LinkedStack<T> push(Object x) {
        LinkedStack<T> t =this;
        while (t.next!=null)
            t=t.next;
        t.next  = new LinkedStack<T>((T) x,this);
        return this;
    }

    @Override
    public LinkedStack<T> pop() {
        LinkedStack<T> t =this;
        while (t.next!=null)
            t=t.next;
        t=null;
        return this;
    }

    public void insert(T x) {
        next = new LinkedStack<>(x, next);
    }

    public void delete() {
        if (next != null)
            next = next.next;
    }

    public int length() {
        int result = 1;
        for (LinkedStack<T> t = next; t != null; t = t.next)
            result++;
        return result;
    }

    @Override
    public String toString() {
        String result = "[" + info;
        for (LinkedStack<T> t = next; t != null; t = t.next)
            result = result + ", " + t.info;
        return result + "]";
    }
}
