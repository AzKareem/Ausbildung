package Personenverwaltung;

public class PersonverwaltungMainTest {

    public static void main(String[] args) {


        Addresen address1 = new Addresen("Herrenstrasse",5,4020,"Linz");
        Addresen address2 = new Addresen("Figulystraße",9,4020,"Linz");
        Addresen address3 = new Addresen("Auwisenstraße",11,4020,"Linz");

        Personenverwaltung codersBay = new Personenverwaltung();

        codersBay.createPerson("Karim","Azimi");
        System.out.println("________________________");
        codersBay.displayAllPersons();
        Personenverwaltung magistrat = new Personenverwaltung();
        magistrat.createPerson("Ferzer", "Null","06.06.1997",address1, Person.Gender.Male);
        magistrat.createPerson("xxx", "Nxxxull","06.06.1997",address2, Person.Gender.Male);
        System.out.println("________________________");
        magistrat.displayAllPersons();
        magistrat.removePerson("xxx");

        magistrat.createPerson("oli","Null");
        Personenverwaltung ferzer = new Personenverwaltung();
        ferzer.createPerson("patrick","lol");

        magistrat.displayAllPersons();
    }

}

