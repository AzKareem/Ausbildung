package Java_basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays_Notendurchschnitt {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int arrayLength;
        System.out.println(" Wie groß soll die länge des Arrays sein?");
        arrayLength = sc.nextInt();
        ArrayList<Integer> notenSammlung = new ArrayList<>(arrayLength);

        int noten = 0;
        int grades = 0;



        for (int i = 0; i < arrayLength; i++) {
            System.out.println(" Gib deine Noten ein: ");
            noten = sc.nextInt();
            notenSammlung.add(noten);
        }
        for (int i = 0; i < notenSammlung.size(); i++) {
            grades += notenSammlung.get(i);
        }

         double average = (double) grades / notenSammlung.size();
        System.out.println("Notendurchschnitt : " + average);


    }
}
