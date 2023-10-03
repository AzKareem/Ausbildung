package Personenverwaltung.Main;

public class Person {
    public String name;
    String lastName;
    String birthday;
    Addresen address;
    Gender gender;



   public enum Gender {
        Male,
        Female
    }
    public Person(String name, String lastName, String birthday, Addresen address, Gender gender) {
        this.name = name;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
        this.gender = gender;
    }
    public Person(String name, String lastName,Gender gender, String birthday) {
        this.name = name;
        this.lastName = lastName;
        this.birthday = birthday;
        this.gender = gender;
    }
    public Person(String name, String lastname) {
        this.name = name;
        this.lastName = lastname;
    }
}
