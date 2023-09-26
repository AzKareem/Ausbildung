package Java_basic;

public class OachkatzlSchwoaf {
    public static void main(String[] args) {


        for (int i = 0; i < 101; i++) {

            if (i % 3 == 0) {

                if (i % 5 == 0) {
                    System.out.println("OachkatzlSchwoaf( " + i + " )!");
                } else {
                    System.out.println("Oachkatzl( " + i + " )!");
                }

            } else if (i % 5 == 0) {
                System.out.println("Schwoaf( " + i + ")!");
            } else {
                System.out.println(i + "!");
            }
        }


    }
}
