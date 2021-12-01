package pgdp.collections;

public class LinkedStack<T> implements Stack<T>{
    private List<T> lis;

    @Override
    public int size() {
        if(lis==null) return 0;
        return lis.length();
    }

    @Override
    public boolean isEmpty() {
        return lis==null;
    }

    @Override
    public void push(T x) {
        lis = new List<T>(x,lis);
    }

    @Override
    public T pop() {
        if(lis==null) return null;
        T rem = lis.getInfo();
        lis=lis.getNext();
        return rem;
    }
}
