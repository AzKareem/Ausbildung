package Java_basic;

import java.util.Scanner;

public class Operatoren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberToFind = 7;
        int luckyNumber;

        System.out.println("Geben Sie ihre Glückszahl ein ; ");
        luckyNumber = sc.nextInt();
        if (luckyNumber % 10 == 0) {
            System.out.println(" Es ist eine Runde Zahl!");
        } else {
            System.out.println("Es ist keine runde Zahl!");
        }
        if (luckyNumber % 2 == 0) {
            System.out.println(" Es ist eine gerade Zahl");
        } else {
            System.out.println(" Es ist eine ungerade Zahl");
        }
        if (luckyNumber == numberToFind) {
            System.out.println(" Es entpricht deiner Glückszahl!");
        } else {
            System.out.println(" Es entpricht nicht deiner Glückszahl!");
        }
        if (luckyNumber < 0 || luckyNumber >= 10) {
            System.out.println(" Es ist eine zweistellige Zahl!");
        } else {
            System.out.println(" Es ist keine zweistellige Zahl!");
        }


//        //Arbeit- oder Freizeit?


        double time;
        System.out.println(" Geben Sie eine Zahl ein: ");
        time = sc.nextDouble();
        if (time < 8.5 || time > 15.5) {
            System.out.println(" Die Stunde liegt nicht in der Arbeitszeit!");
        } else if (time >= 12 && time <= 12.5) {
            System.out.println(" Es ist Mittag");
        } else {
            System.out.println("Die Stunde liegt in der Arbeitszeit!");
        }

        System.out.println("Geben Sie eine Uhrzeit ein: ");
        String inputTime = sc.next();
        String[] timeForWork = inputTime.split(":");
        double hours = Integer.parseInt(timeForWork[0]);
        double minutes = Integer.parseInt(timeForWork[1]);
        hours += (double) minutes / 60d;
        System.out.println("hours = " + hours);


        // Assignment and logical operators


        int numberToFind1 = 10;
        int luckyNumber1;

        System.out.println("Geben Sie ihre Glückszahl ein ; ");
        luckyNumber1 = sc.nextInt();

        if (luckyNumber1 % 10 == 0) {
            System.out.println(" Es ist eine Runde Zahl!");
        } else {
            System.out.println("Es ist keine runde Zahl!");
        }
        if (luckyNumber1 % 2 == 0) {
            System.out.println(" Es ist eine gerade Zahl");
        } else {
            System.out.println(" Es ist eine ungerade Zahl");
        }
        if (luckyNumber1 == numberToFind1) {
            System.out.println(" Es entpricht deiner Glückszahl!");
        } else {
            System.out.println(" Es entpricht nicht deiner Glückszahl!");
        }
        if (luckyNumber1 < 100 || luckyNumber1 >= 10) {
            System.out.println(" Es ist eine zweistellige Zahl!");
        } else {
            System.out.println(" Es ist keine zweistellige Zahl!");
        }


    }
}
