package Sortieralgortihmen_MehrdimensionaleArrays;

import java.util.ArrayList;
import java.util.Random;

public class BingoCardGenerator {
    public static void main(String[] args) {



        Random random = new Random();
        int[][] bingo = new int[5][5];
        ArrayList<Integer> numbers = new ArrayList<>();
        int shift = 0;


        for (int i = 0; i < bingo.length; i++) {
            for (int j = 0; j < bingo.length; j++) {
                bingo[j][i] = random.nextInt(1, 16) + shift;
                if (numbers.contains(bingo[j][i])) {
                    --j;
                } else {
                    numbers.add(bingo[j][i]);
                    bingo[2][2] = -1;
                    System.out.print(bingo[j][i] + " ");
                }

            }
            System.out.println(" ");
            shift += 15;
        }

    }
}
