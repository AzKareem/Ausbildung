package Java_basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Berrechnung_des_Maximums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numberList = new ArrayList<>();
        String input;
        int number = 0;
        int maximum = Integer.MIN_VALUE;
        while (true) {
            boolean end = false;
            System.out.println(" Geben Sie Zahlen ein: ");
            input = sc.next();

            if (input.equals("q")) {
                end = true;
            } else {
                number = Integer.parseInt(input);
                numberList.add(number);

            }
            if (end) {
                for (int x : numberList) {
                    if (x > maximum) {
                        maximum = x;
                    }
                }

                //   maximum = Collections.max(numberList);    // andere variante um den maximalen wert rauszuholen!
                System.out.println(maximum);
                break;
            }
        }
    }
}
