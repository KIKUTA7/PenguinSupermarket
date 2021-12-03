package pgdp.collections;

import java.util.concurrent.ScheduledExecutorService;

public class PenguinSupermarket {
    Checkout[] alche = new Checkout[0];
    public PenguinSupermarket(int reg){
        if(reg<=0) ExceptionUtil.illegalArgument("aba minus -1 daxli ranairad geqneba , tu geqneba maswavle da kibatono");
        alche = new Checkout[reg];
        for (int i = 0; i < alche.length; i++) {
            alche[i] = new Checkout();
        }

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
        Checkout [] alche2 = alche.clone();
        Checkout [] alche1 = new Checkout[alche.length-1];
        for (int i=0;i<alche.length-1;i++)
        {
            alche1[i] = new Checkout();
        }
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
                alche = alche1;
                while(!sta.isEmpty())
                {
                    sta.pop().goToCheckout(this);
                }
            }
        }



    }
    public void serveCustomers() {
        for (Checkout checkout : alche) checkout.serveNextCustomer();
    }


}
