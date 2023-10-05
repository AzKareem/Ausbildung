package Personenverwaltung.Main;

public class Util {
    public static boolean containsNumber(String str) {
        return str != null && str.matches(".*\\d.*");
    }
}
