package Datenstrukturen;

import java.util.ArrayList;
import java.util.List;

public class ListeSortieren {
    public static void main(String[] args) {


        ArrayList<Integer> bubbleSort = new ArrayList<>(List.of(4, 3, 2, 9, 2, 4));

        int temp;

        for (int i = 0; i < bubbleSort.size(); i++) {
            for (int j = 1; j < bubbleSort.size(); j++) {
                if (bubbleSort.get(j - 1) > bubbleSort.get(j)) {
                    temp = bubbleSort.get(j - 1);
                    bubbleSort.set(j - 1,bubbleSort.get(j));
                    bubbleSort.set(j, temp);
                }
            }
        }

        System.out.println(bubbleSort);

    }
}
