package Java_basic;

import java.util.HashMap;
import java.util.Scanner;

public class Leetspeak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        String alphabetUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        String symbols = "@8(D3F6#!JK1MN0PQR$7UVWXY2";
//
//
//        String input = "";
//        System.out.println(" Bitte geben Sie ihren Text ein: ");
//        input = sc.nextLine().toUpperCase();
//
//
//        for (int i = 0; i < input.length(); i++) {
//            int c = input.charAt(i);
//            int difference;
//            if (c >= 'A' && c <= 'Z') {
//                difference = c - 65;
//                c = symbols.charAt(difference);
//                System.out.print((char) c);
//
//            } else {
//                System.out.print((char) c);
//            }
//        }

        //Aufgabe: Leetspeak - Hashmap

        HashMap<Character,Character> textData = new HashMap<>();
           textData.put('A','@');
           textData.put('B','!');
           textData.put('C','3');
           textData.put('D','L');
           textData.put('E','#');
           textData.put('F','1');
           textData.put('G','W');
           textData.put('H','Y');

        String input = "";
        System.out.println(" Bitte geben Sie ihren Text ein: ");
        input = sc.nextLine().toUpperCase();

        for (int i = 0; i < input.length(); i++){
            int c = input.charAt(i);
            if (textData.containsKey((char) c)){
                System.out.print(textData.get((char)c));
            }
            else{
                System.out.print((char) c);
            }

        }


    }
}
