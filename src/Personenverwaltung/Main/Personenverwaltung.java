package Personenverwaltung.Main;

import java.util.ArrayList;


public class Personenverwaltung {

    String name;
    String lastName;
    String birthday;
    Addresen address;
    Person.Gender gender;
    public static ArrayList<Person> personArrayList;

    public Personenverwaltung() {
        personArrayList = new ArrayList<>();
    }

    public static void addPerson(Person person) {
        personArrayList.add(person);
    }

    public void displayAllPersons() {
        for (Person person : personArrayList) {
            System.out.println(person.name + " " + person.lastName + " " + person.birthday + " " + person.address + " " + person.gender);
        }
    }

    public static void createPerson(String name, String lastName) {
        if (containsNumber(name) || containsNumber(lastName)) {
            throw new IllegalArgumentException("Name oder Nachname dürfen keine Zahlen enthalten.");
        }
        Person person = new Person(name, lastName);
        addPerson(person);
    }


    public void createPerson(String name, String lastName, String birthday, Addresen address, Person.Gender gender) {
        if (containsNumber(name) || containsNumber(lastName)) {
            throw new IllegalArgumentException("Name oder Nachname dürfen keine Zahlen enthalten.");
        }
        Person person = new Person(name, lastName, birthday, address, gender);
        addPerson(person);
    }


    public void createPerson(String name, String lastName, Person.Gender gender, String birthday) {
        if (containsNumber(name) || containsNumber(lastName)) {
            throw new IllegalArgumentException("Name oder Nachname dürfen keine Zahlen enthalten.");
        }
        Person person = new Person(name, lastName, gender, birthday);
        addPerson(person);
    }

    public String findPerson(String name) {
        for (Person person : personArrayList) {
            if (person.name.equals(name)) {
                System.out.println("Details der gefundenen Person:");
                System.out.println("Name: " + person.name);
                System.out.println("Nachname: " + person.lastName);
                System.out.println("Geburtstag: " + person.birthday);
                System.out.println("Adresse: " + person.address);
                System.out.println("Geschlecht: " + person.gender);
                return name; // Return the found person
            }
        }


        throw new NullPointerException("Diese Person " + name + " exestiert nicht!");
    }


    private static boolean containsNumber(String str) {
        return str != null && str.matches(".*\\d.*");
    }

    public void removePerson(String name) {
        Person personToRemove = null;
        for (int i = 0; i < personArrayList.size(); i++) {
            Person p = personArrayList.get(i);
            if (p.name.equals(name)) {
                personToRemove = p;
                break;
            }
        }
        if (personToRemove != null) {
            personArrayList.remove(personToRemove);

        } else {
            throw new NullPointerException("Diese Person " + name + " exestiert nicht!");
        }
    }
}
