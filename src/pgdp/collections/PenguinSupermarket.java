package pgdp.collections;

public class PenguinSupermarket {
    Checkout[] alche = new Checkout[0];
    public PenguinSupermarket(int reg){
        if(reg<=0) ExceptionUtil.illegalArgument("aba minus -1 daxli ranairad geqneba , tu geqneba maswavle da kibatono");
        alche = new Checkout[reg];

    }

    public Checkout[] getCheckouts() {
        return alche;
    }
    public Checkout getCheckoutWithSmallestQueue()
    {
        int Mx = Integer.MAX_VALUE;
        int ind=-1;
        for (int i=0;i< alche.length;i++)
        {
            if(alche[i].queueLength()<Mx) {Mx = alche[i].queueLength();ind=i;}
        }
        return alche[ind];
    }
    public void closeCheckout(int index)
    {
         if(alche.length<index+1)    ExceptionUtil.unsupportedOperation("ra davketo ar maq eg salaro da");
         if(alche.length==1) ExceptionUtil.unsupportedOperation("azri?");
         Checkout che = alche[index];
         Checkout [] alche2 = alche.clone();
         Checkout [] alche1 = new Checkout[alche.length-1];
         int k=0;
         for (int i=0;i<alche2.length;i++)
         {
             if(i!=index) {alche1[k]=alche2[i];k++;}
             else {
                 Queue<PenguinCustomer> que = alche2[i].getQueue();
                 Stack<PenguinCustomer> sta = new LinkedStack<>();
                 while (!que.isEmpty())
                 {
                     sta.push(que.dequeue());

                 }
                 while(!sta.isEmpty())
                 {
                     sta.pop().goToCheckout(this);
                 }
             }
         }
         alche = alche1;


    }
    public void serveCustomers() {
        for (Checkout checkout : alche) checkout.serveNextCustomer();
    }


}
