package pgdp.collections;


public class DataStructureLink<T> {
    private DataStructureConnector<T> one,two;
    public DataStructureLink(DataStructureConnector<T> one,DataStructureConnector<T> two )
    {
        this.one = one;
        this.two = two;
    }
    public boolean moveNextFromAToB()
    {
        if(!one.hasNextElement()) return false;
        T rem = one.removeNextElement();
        two.addElement(rem);

        return true;
    }
    public void moveAllFromAToB()
    {
        while(one.hasNextElement()) {
            T rem = one.removeNextElement();
            two.addElement(rem);
        }

    }
}
