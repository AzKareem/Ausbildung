package OOP2.Shapes.Main;

import java.util.List;

public class S_Practice {
    public static void main(String[] args) {

        Circle c1 = new Circle("blue",true,3);
        Rectangle r1 = new Rectangle("red",true,3,5);
        Square s1 = new Square("black",false,3);
        c1.showOff();
        System.out.println("----------------");
        r1.showOff();
        System.out.println("----------------");
        s1.showOff();




    }
}
