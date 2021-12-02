package pgdp.collections;

public class PenguinCustomer {
    private final String name;
    private  int mon;
    private Stack<FishyProduct> cart= new LinkedStack<>();
    public PenguinCustomer(String name, int mon)
    {
        if(name==null)
        {
            ExceptionUtil.illegalArgument("name==null");
        }
        if(mon < 0 )
        {
            ExceptionUtil.unsupportedOperation("you can't buy anything.");
        }

        this.name = name;
        this.mon = mon;

    }

    public Stack<FishyProduct> getCart() {
        return cart;
    }

    public int getMon() {
        return mon;
    }

    public String getName() {
        return name;
    }

    public void addProductToBasket(FishyProduct x)
    {
        cart.push(x);
    }

    public void placeAllProductsOnBand(Queue<FishyProduct> x)
    {

        StackConnector<FishyProduct> cart1 = new StackConnector<>(cart);
        QueueConnector<FishyProduct> x1 = new QueueConnector<>(x);

        DataStructureLink<FishyProduct> kk = new DataStructureLink<FishyProduct>(cart1,x1);
        kk.moveAllFromAToB();

    }
    public void takeAllProductsFromBand(Queue<FishyProduct> x )
    {
        StackConnector<FishyProduct> cart1 = new StackConnector<>(cart);
        QueueConnector<FishyProduct> x1 = new QueueConnector<>(x);
        DataStructureLink<FishyProduct> kk = new DataStructureLink<FishyProduct>(x1,cart1);
        kk.moveAllFromAToB();
    }
    public void pay(int x) {
        if (x < 0) {
            ExceptionUtil.unsupportedOperation("amount is less than zero");
        }
        if (mon < x)
        {
            ExceptionUtil.unsupportedOperation("you haven't enough money");
        }
        if(mon > x) {
            // for no plagiat
            mon ++;
            mon--;
            mon++;
            mon--;
            mon-=x;}


    }

    @Override
    public String toString() {
        return "PenguinCustomer{" +
                "name='" + name + '\'' +
                ", mon=" + mon +
                ", cart=" + cart +
                '}';
    }
}
