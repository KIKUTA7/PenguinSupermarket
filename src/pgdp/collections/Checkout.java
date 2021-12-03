package pgdp.collections;

public class Checkout {
    Queue<PenguinCustomer> pen;
    Queue<FishyProduct> be;
    Queue<FishyProduct> af;
    public Checkout()
    {
        pen = new LinkedQueue<>();
        be = new LinkedQueue<>();
        af = new LinkedQueue<>();

    }

    public void setPen(Queue<PenguinCustomer> pen) {
        this.pen = pen;
    }

    public Queue<FishyProduct> getBandAfterCashier() { return af; }

    public Queue<FishyProduct> getBandBeforeCashier() {
        return be;
    }

    public Queue<PenguinCustomer> getQueue() {
        return pen;
    }
    public void serveNextCustomer()
    {
        PenguinCustomer clien1 = pen.dequeue();
        if(clien1==null) return;
        clien1.placeAllProductsOnBand(be);
        while (!be.isEmpty())
        {

            FishyProduct fis = be.dequeue();
            af.enqueue(fis);
        }
        int sum=0;
        while(!af.isEmpty())
        {

            FishyProduct fis = af.dequeue();
            sum+= fis.getPrice();

        }
        clien1.pay(sum);

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
