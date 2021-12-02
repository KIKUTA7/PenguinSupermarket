package pgdp.collections;

public class Main {

    public static void main(String[] args) {
        LinkedStack<Integer> x = new LinkedStack<>();
        StackConnector<Integer> x1 = new StackConnector<>(x);
        x1.addElement(27);
        x1.removeNextElement();
        x1.addElement(27);
        x1.addElement(27);
        x1.addElement(27);
        System.out.println(x1.hasNextElement());
        DataStructureConnector<Integer> x3 = x1;
        DataStructureConnector<Integer> x4 = null;
        DataStructureLink<Integer> x5 = new DataStructureLink<>(x3, x4);
        x5.moveNextFromAToB();
        x5.moveAllFromAToB();
        System.out.println(x3.hasNextElement());
    }
}
