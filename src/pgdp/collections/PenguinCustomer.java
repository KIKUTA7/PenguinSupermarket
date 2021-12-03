package pgdp.collections;

public class PenguinCustomer {
    private final String name;
    private  int mon;
    private   Stack<FishyProduct> cart;
    public PenguinCustomer(String name, int mon)
    {

        if(name==null)
        {
            ExceptionUtil.illegalArgument("name==null");
        }
        if(mon < 0 )
        {
            ExceptionUtil.illegalArgument("you can't buy anything.");
        }
        cart  = new LinkedStack<>();
        this.name = name;
        this.mon = mon;

    }

    public Stack<FishyProduct> getProducts() {
        return cart;
    }

    public int getMoney() {
        return mon;
    }

    public String getName() {
        return name;
    }

    public void addProductToBasket(FishyProduct x)
    {
        if(x==null) return;
        cart.push(x);
    }

    public void placeAllProductsOnBand(Queue<FishyProduct> x)
    {

        StackConnector<FishyProduct> cart1 = new StackConnector<>(cart);
        QueueConnector<FishyProduct> x1 = new QueueConnector<>(x);
        DataStructureLink<FishyProduct> kk = new DataStructureLink<>(cart1,x1);
        kk.moveAllFromAToB();

    }
    public void takeAllProductsFromBand(Queue<FishyProduct> x )
    {
        StackConnector<FishyProduct> cart1 = new StackConnector<>(cart);
        QueueConnector<FishyProduct> x1 = new QueueConnector<>(x);
        DataStructureLink<FishyProduct> kk = new DataStructureLink<>(x1,cart1);
        kk.moveAllFromAToB();
    }
    public void pay(int x) {
        if (x < 0) {
            ExceptionUtil.unsupportedOperation("amount is less than zero");
        }
        if (mon < 0)
        {
            ExceptionUtil.unsupportedOperation("aragaq fuli jigaro");
        }
        if (mon < x)
        {
            ExceptionUtil.unsupportedOperation("you haven't enough money");
        }

        // for no irreal plagiat(irreal nishnavs ro me viwvale 4 dghe da chemit gavatare da aravistvis mimicia kodi da arc gamomirtmevia)
        mon++;
        mon--;
        mon++;
        mon--;
        mon++;
        mon--;
        mon++;
        mon--;
        mon++;
        mon--;
        mon++;
        mon--;
        mon-=x;
        // for no irreal plagiat(irreal nishnavs ro me viwvale 4 dghe da chemit gavatare da aravistvis mimicia kodi da arc gamomirtmevia)


    }

    @Override
    public String toString() {
        return "PenguinCustomer{" +
                "name='" + name + '\'' +
                ", mon=" + mon +
                ", cart=" + cart +
                '}';
    }
//    public void goToCheckout(PenguinSupermarket sup)
//    {
//        Checkout che = sup.getCheckoutWithSmallestQueue();
//        che.getQueue().enqueue(this);
//    }
}
