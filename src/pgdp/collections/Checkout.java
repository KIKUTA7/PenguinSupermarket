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

    public Queue<FishyProduct> getBandAfterCashier() { return af; }

    public Queue<FishyProduct> getBandBeforeCashier() {
        return be;
    }

    public Queue<PenguinCustomer> getQueue() {
        return pen;
    }
    public int queueLength(Queue que)
    {
       return que.size();
    }
    public void serveNextCustomer()
    {
        PenguinCustomer clien1 = pen.dequeue();
        clien1.placeAllProductsOnBand(be);
        while (!be.isEmpty())
        {
            af.enqueue(be.dequeue());
        }
        int sum=0;
        for (int i=0;i< this.queueLength(af);i++)
        {
            sum += af.dequeue().getPrice();
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
