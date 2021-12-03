package pgdp.collections;

public class Checkout {
    Queue<PenguinCustomer> pen;
    Queue<FishyProduct> be;
    Queue<FishyProduct> af;
    public Checkout(Queue<PenguinCustomer> pen)
    {
        this.pen = pen;
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
    public void serveNextCustomer()
    {
        PenguinCustomer clien1 = pen.dequeue();
        clien1.placeAllProductsOnBand(be);
        while (!be.isEmpty())
        {
            af.enqueue(be.dequeue());
        }
        int sum=0;
        while(!af.isEmpty())
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
