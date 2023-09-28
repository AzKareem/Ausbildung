package OOP2.Shapes.Test;

import OOP2.Shapes.Main.Circle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class CircleTest  {

    private Circle circle;
    private double radius;

    @BeforeEach
    void setup(){circle = new Circle("blue",true,3.0);}

    @Test
    void getArea() {
        assertEquals(Math.PI*3*3,circle.getArea());

    }

    @Test
    void getPerimeter() {
        assertEquals(2*3*Math.PI,circle.getPerimeter());
    }

    @Test
    public void excRadius(){
        assertThrows(IllegalArgumentException.class, () -> circle.setRadius(-3.0), "Radius can't be negative or Null! ");
    }
}