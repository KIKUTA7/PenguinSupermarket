package pgdp.collections;

public class LinkedStack<T> implements Stack<T>{
    private List<T> list;
    @Override
    public int size() {
        int siz = 0;
        for (List<T> t = list;t!=null;t=t.getNext())
            siz++;
        return siz;
    }

    @Override
    public boolean isEmpty() {
        return list==null;
    }

    @Override
    public void push(T x) {
        list = new List<T>(x,list);
    }

    @Override
    public T pop() {
        if(list==null) return null;
        T ans = list.getInfo();
        list = list.getNext();
        return ans;
    }

}
