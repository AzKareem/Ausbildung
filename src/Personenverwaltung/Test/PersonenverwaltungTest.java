package Personenverwaltung.Test;


import Personenverwaltung.Main.Personenverwaltung;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PersonenverwaltungTest {

 private  Personenverwaltung codersBay;

    @BeforeEach
    void setUp() {
         codersBay = new Personenverwaltung();
    }

    @Test
    void createPerson() {
       codersBay.createPerson("karim","azimi");
       assertEquals(1,codersBay.personArrayList.size());
    }

    @Test
    void findPerson() {
         codersBay.createPerson("karim","azimi");
         codersBay.createPerson("Khalil","azimi");
         assertEquals("Khalil",codersBay.findPerson("Khalil"));


    }

    @Test
    void removePerson() {
        codersBay.createPerson("karim","azimi");
        codersBay.createPerson("Khalil","azimi");
        codersBay.removePerson("Khalil");

        assertEquals(1,codersBay.personArrayList.size());
    }
}