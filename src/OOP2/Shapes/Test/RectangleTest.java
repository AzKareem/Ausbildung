package OOP2.Shapes.Test;

import OOP2.Shapes.Main.Circle;
import OOP2.Shapes.Main.Rectangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    private Rectangle rectangle;
    private double width;
    private double length;

    @BeforeEach
    void setup() {
        rectangle = new Rectangle("blue", true,3,3);
    }

    @Test
    void getArea() {
        assertEquals(3*3,rectangle.getArea());
    }

    @Test
    void getPerimeter() {
        assertEquals((3*2)+(3*2),rectangle.getPerimeter());
    }
    @Test
    public void excRectangleLength(){
        assertThrows(IllegalArgumentException.class, () -> rectangle.setLength(-1), "Length can't be negative or Null! ");
    }
    @Test
    public void excRectangleWidth(){
        assertThrows(IllegalArgumentException.class, () -> rectangle.setWidth(-1), "Width can't be negative or Null! ");
    }

}