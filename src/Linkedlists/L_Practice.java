package Linkedlists;

public class L_Practice {
    public static void main(String[] args) {
        ChainedList<String> liste = new ChainedList<>();

        liste.add("A");
        liste.add("B");
        liste.add("C");
        liste.add("D");
        liste.add("E");
        liste.add("F");

        System.out.println(liste.toString());
        //System.out.println(liste.get(3));
        liste.remove(1);
        //liste.addIndexAndValue(3,"KKK");
        System.out.println(liste.toString());
        //System.out.println("Size: " + liste.sizeAusgabe());


        DoubleChainedList<Integer> doubleList = new DoubleChainedList<>();


        doubleList.add(2);
        doubleList.add(19);
        doubleList.add(139);
        doubleList.add(1397);
        doubleList.add(1, 3333);
        System.out.println(doubleList.toString());

        doubleList.remove(4);
        System.out.println(doubleList.toString());
        System.out.println(doubleList.toStringReverse());

    }
}
