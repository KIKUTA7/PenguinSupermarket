package pgdp.collections;

public class Checkout {
    private  Queue<PenguinCustomer> pen;
    private  Queue<FishyProduct> be;
    private  Queue<FishyProduct> af;
    public Checkout()
    {
        pen = new LinkedQueue<>();
        be = new LinkedQueue<>();
        af = new LinkedQueue<>();

    }


    public Queue<FishyProduct> getBandAfterCashier() { return af; }

    public Queue<FishyProduct> getBandBeforeCashier() {
        return be;
    }

    public Queue<PenguinCustomer> getQueue() {
        return pen;
    }
    public int queueLength()
    {
        return pen.size();
    }
    public void serveNextCustomer()
    {
        PenguinCustomer clien1 = pen.dequeue();
        if(clien1==null) return;
        clien1.placeAllProductsOnBand(be);
        int sum=0;
        while (!be.isEmpty())
        {

            FishyProduct fis = be.dequeue();
            af.enqueue(fis);
            sum+= fis.getPrice();
        }
        clien1.pay(sum);
        clien1.takeAllProductsFromBand(af);

    }

    @Override
    public String toString() {
        return "Checkout{" +
                "pen=" + pen +
                ", be=" + be +
                ", af=" + af +
                '}';
    }
}

