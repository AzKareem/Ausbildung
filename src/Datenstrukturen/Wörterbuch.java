package Datenstrukturen;

import java.util.*;

public class Wörterbuch {
    static HashMap<String, String> dictionaryNormal = new HashMap<>();
    static HashMap<String, String> dictionaryReverse = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        addWords("Hallo", "Hello");
        addWords("Auto", "Car");
        addWords("Baum", "Java_basic.Tree");
        addWords("Sonne","Sun");

        System.out.println(dictionaryNormal);
        System.out.println(dictionaryReverse);
        System.out.println("--------------------------------------");
        removeWordsGerman("Hallo");
        System.out.println(dictionaryNormal);
        removeWordsEnglish("Car");
        System.out.println(dictionaryReverse);
        System.out.println("--------------------------------------");
        System.out.println(dictionaryReverse.get("Hello"));
        System.out.println(dictionaryNormal.get("Baum"));

    }

    public static void addWords(String german, String english) {
        if (!dictionaryNormal.containsKey(german) && !dictionaryNormal.containsValue(english)) {
            dictionaryNormal.put(german, english);

        } else {
            System.out.println("Dieses Paar existiert bereits!");
        }
        if (!dictionaryReverse.containsKey(english) && !dictionaryReverse.containsValue(german)){
            dictionaryReverse.put(english,german);
        }else {
            System.out.println("Dieses Paar existiert bereits!");
        }
    }

    public static void removeWordsGerman(String german) {
        if (dictionaryNormal.containsKey(german)) {
            dictionaryNormal.remove(german);
        }
    }
    public static void removeWordsEnglish(String english) {
        if (dictionaryReverse.containsKey(english)) {
            dictionaryReverse.remove(english);
        }
    }

}
