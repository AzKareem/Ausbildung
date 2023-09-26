package Personenverwaltung;

import java.util.ArrayList;

public class Personenverwaltung {
    String name;
    String lastName;
    String birthday;
    Addresen address;
    Person.Gender gender;
    ArrayList<Person> personArrayList;

    public Personenverwaltung() {
        personArrayList = new ArrayList<>();
    }

    public void addPerson(Person person) {
        personArrayList.add(person);
    }

    public void displayAllPersons() {
        for (Person person : personArrayList) {
            System.out.println(person.name + " " + person.lastName + " " + person.birthday + " " + person.address + " " + person.gender);
        }
    }

    public void createPerson(String name, String lastName) {
        Person person = new Person(name, lastName);
        personArrayList.add(person);
    }

    public void createPerson(String name, String lastName, String birthday, Addresen address, Person.Gender gender) {
        Person person = new Person(name, lastName, birthday, address, gender);
        personArrayList.add(person);
    }

    public void createPerson(String name, String lastName, Person.Gender gender, String birthday) {
        Person person = new Person(name, lastName, gender, birthday);
        personArrayList.add(person);
    }

    public void removePerson(String name) {
        for (int i = 0; i < personArrayList.size(); i++) {
            Person p = personArrayList.get(i);
            if (p.name.equals(name)) {
                personArrayList.remove(p);
            }
        }
    }
}
