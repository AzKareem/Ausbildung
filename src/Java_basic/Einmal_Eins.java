package Java_basic;

public class Einmal_Eins {
    public static void main(String[] args) {


        int reihe = 11;
        int a = 1;

        for (int i = 1; i < reihe; i++) {
            System.out.println(i + "er Reihe: ");
            a = 1;
            if (a < reihe) {
                for (int j = 1; j < reihe; j++) {
                    System.out.println(a + " * " + i + " = " + (a * i));
                    a++;
                }
            }
        }

    }
}
