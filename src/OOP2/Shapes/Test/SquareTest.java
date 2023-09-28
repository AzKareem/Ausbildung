package OOP2.Shapes.Test;

import OOP2.Shapes.Main.Rectangle;
import OOP2.Shapes.Main.Square;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    private Square square;


    @BeforeEach
    void setup() {
        square = new Square("blue", true,3);
    }
    @Test
    void getLength() {
        assertEquals(3,square.getLength());
    }


    @Test
    public void excSquareWidth(){
        assertThrows(IllegalArgumentException.class, () -> square.setWidth(-1), "Width can't be negative or Null! ");
    }
    @Test
    public void excSquareLength(){
        assertThrows(IllegalArgumentException.class, () -> square.setLength(-1), "Length can't be negative or Null! ");
    }
}