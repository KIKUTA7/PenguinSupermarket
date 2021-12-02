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

    public Queue<FishyProduct> getBandAfterCashier() {
        return af;
    }

    public Queue<FishyProduct> getBandBeforeCashier() {
        return be;
    }

    public Queue<PenguinCustomer> getQueue() {
        return pen;
    }
    public void serveNextCustomer()
    {


    }
}
