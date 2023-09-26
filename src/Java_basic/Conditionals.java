package Java_basic;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Exercise: Translating grades

        int numberNoteEnglish;
        System.out.println(" Geben Sie die Note ein : ");
        numberNoteEnglish = sc.nextInt();

        if (numberNoteEnglish == 1) {
            System.out.println(" Very good ");
        } else if (numberNoteEnglish == 2) {
            System.out.println(" Good ");
        } else if (numberNoteEnglish == 3) {
            System.out.println(" Satisfactory ");
        } else if (numberNoteEnglish == 4) {
            System.out.println(" Sufficient ");
        } else if (numberNoteEnglish == 5) {
            System.out.println(" Not sufficient ");
        }
    }
}
