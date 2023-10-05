package Personenverwaltung.Main;

public class Address {
    int plz;
    String location;
    String streetName;
    int houseNumber;

   public Address(String streetName, int houseNumber, int plz, String location){
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.plz = plz;
        this.location = location;
    }
    public String toString(){
       StringBuilder sp = new StringBuilder();
       sp.append(plz + " ");
       sp.append(location + " ");
       sp.append(streetName + " ");
       sp.append(houseNumber + " ");
       return sp.toString();
    }

}
