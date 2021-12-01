package pgdp.collections;

public class DataStructureLink<T> {
    private DataStructureConnector<T> data1,data2;
    public DataStructureLink(DataStructureConnector<T> data1, DataStructureConnector<T> data2)
    {
        this.data1 = data1;
        this.data2 = data2;
    }


    public boolean moveNextFromAToB()
    {
        if(data1==null) return false;
        T rem = data1.removeNextElement();
        data2.addElement(rem);
        return true;
    }
    public void moveAllFromAToB(){
        while(data1.hasNextElement())
        {
            T rem = data1.removeNextElement();
            data2.addElement(rem);
        }
    }
}
