package Personenverwaltung.Main;

public class P_Practice {
    public static void main(String[] args) {

        Address address1 = new Address("Herrenstrasse", 5, 4020, "Linz");
        Address address2 = new Address("Figulystraße", 9, 4020, "Linz");
        Address address3 = new Address("Auwisenstraße", 11, 4020, "Linz");

        Personenverwaltung codersBay = new Personenverwaltung();

        codersBay.createPerson("Karim", "Azimi");
        codersBay.createPerson("Khalil", "Azimi");
        System.out.println("________________________");
        codersBay.displayAllPersons();
        System.out.println("________________________");
        codersBay.findPerson("Khalil");
        codersBay.removePerson("Khalil");
        System.out.println("________________________");
        codersBay.displayAllPersons();
//        Personenverwaltung magistrat = new Personenverwaltung();
//        magistrat.createPerson("Ferzer", "Null", "06.06.1997", address1, Person.Gender.Male);
//        magistrat.createPerson("xxx", "Nxxxull", "06.06.1997", address2, Person.Gender.Male);
//        System.out.println("________________________");
//        magistrat.displayAllPersons();
//        magistrat.removePerson("xxx");
//
//        magistrat.createPerson("oli", "Null");
//        Personenverwaltung ferzer = new Personenverwaltung();
//        ferzer.createPerson("patrick", "lol");
//
//        magistrat.displayAllPersons();
    }
}
