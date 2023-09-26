package Java_basic;

import java.util.Scanner;

public class Caesar_Chiffre {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String alphabetUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetLowerCase = "abcdefghijklmnopqrstuvwxyz";
        String input = "";
        int keyNumber;

        System.out.println(" Bitte geben Sie ihren Text ein: ");
        input = sc.nextLine();

        System.out.println(" Bitte geben Sie ihren Keynumber ein: ");
        keyNumber = sc.nextInt();

        for (int i = 0; i < input.length(); i++) {

            int c = input.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c += keyNumber;
                if (c > 'Z') {
                    c -= 26;
                }
                System.out.print((char) c);

            } else if (c >= 'a' && c <= 'z') {

                c += keyNumber;

                if (c > 'z') {
                    c -= 26;
                }
                System.out.print((char) c);

            } else {
                System.out.print((char) c);
            }
        }
    }
}
