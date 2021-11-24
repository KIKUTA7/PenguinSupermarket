package pgdp.collections;

public class List {
    public int info;
    public List next;

    public List(int x) {
        info = x;
        next = null;
    }

    public List(int x, List l) {
        info = x;
        next = l;
    }

    public void insert(int x) {
        next = new List(x, next);
    }

    public void delete() {
        if (next != null)
            next = next.next;
    }

    public int length() {
        int result = 1;
        for (List t = next; t != null; t = t.next)
            result++;
        return result;
    }

    @Override
    public String toString() {
        String result = "[" + info;
        for (List t = next; t != null; t = t.next)
            result = result + ", " + t.info;
        return result + "]";
    }
}
