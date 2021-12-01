package pgdp.collections;

public class DataStructureLink<T> {
    private DataStructureConnector<T> data1,data2;
    public DataStructureLink(DataStructureConnector<T> data1, DataStructureConnector<T> data2)
    {
        this.data1 = data1;
        this.data2 = data2;

    }

    public DataStructureConnector<T> getData1() {
        return data1;
    }

    public void setData1(DataStructureConnector<T> data1) {
        this.data1 = data1;
    }

    public DataStructureConnector<T> getData2() {
        return data2;
    }

    public void setData2(DataStructureConnector<T> data2) {
        this.data2 = data2;
    }

    public void moveNextFromAToB()
    {
        T rem = data1.removeNextElement();
        data2.addElement(rem);
    }
    public void moveAllFromAToB(){
        while(data1.hasNextElement())
        {
            T rem = data1.removeNextElement();
            data2.addElement(rem);
        }
    }
}
