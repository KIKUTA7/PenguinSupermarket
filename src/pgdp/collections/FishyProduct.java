package pgdp.collections;

public class FishyProduct {
    private final String name;
    private final int price;
    public FishyProduct(String name, int price)
    {
       if(name!=null){

           this.name = name;
       }
       else{
           throw new UnsupportedOperationException("name == null");
       }
       if(price>=0)  this.price = price;
       else{
           throw new UnsupportedOperationException("price < 0");
       }
    }
    public String getName() {
        return name;
    }



    public int getPrice() {
        return price;
    }



}
