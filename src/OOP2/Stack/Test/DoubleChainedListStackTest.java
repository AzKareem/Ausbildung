package OOP2.Stack.Test;

import OOP2.Stack.Main.DoubleChainedListStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DoubleChainedListStackTest {

private DoubleChainedListStack stack;
private int size;

    @BeforeEach
        //This Method will be executed before each other test method
    void setUp(){
        stack = new DoubleChainedListStack();
    }

    @Test
    void push() {
    stack.push(3);
    stack.push(4);
    stack.push(7);
        assertEquals(3, stack.sizeAusgabe());
    }



    @Test
    void pop() {
        stack.push(3);
        stack.push(4);
        stack.push(7);
        assertEquals(7,stack.pop());
        assertEquals(2, stack.sizeAusgabe());
    }

    @Test
    void peek() {
        stack.push(3);
        stack.push(4);
        stack.push(7);
       assertEquals(7,stack.peek());
        assertEquals(3, stack.sizeAusgabe());
    }

    @Test
    void testPop() {
        stack.push(3);
        stack.push(4);
        stack.push(7);
        int[] poppedElements = stack.pop(2);
        assertEquals(1, stack.sizeAusgabe());
    }
    @Test
    public void excPop(){
        assertThrows(NullPointerException.class, () -> stack.pop(), "The Stack is empty to pop! ");
    }
    @Test
    public void excPopN(){
        assertThrows(IndexOutOfBoundsException.class, () -> stack.pop(10), "Index out of Bound!");
    }

    @Test
    public void excPeek() {
        assertThrows(NullPointerException.class, () -> stack.peek(), "The Stack is empty to peek!");
    }
}