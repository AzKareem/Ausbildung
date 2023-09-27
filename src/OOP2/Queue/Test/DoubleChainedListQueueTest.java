package OOP2.Queue.Test;

import OOP2.Queue.Main.DoubleChainedListQueue;
import OOP2.Stack.Main.DoubleChainedListStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DoubleChainedListQueueTest {

    private DoubleChainedListQueue queue;
    private int size;

    @BeforeEach
        //This Method will be executed before each other test method
    void setUp(){
        queue = new DoubleChainedListQueue();
    }
    @Test
    void enqueue() {
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        assertEquals(3, queue.sizeAusgabe());
    }



    @Test
    void dequeue() {
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        assertEquals(2,queue.dequeue());

    }

    @Test
    void testDequeue() {
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        int[] queuedElements = queue.dequeue(2);
        assertEquals(1, queue.sizeAusgabe());
    }
    @Test
    public void excDequeue(){
        assertThrows(NullPointerException.class, () -> queue.dequeue(), "The Queue is empty to dequeue! ");
    }
    @Test
    public void expTestDequeue(){
        assertThrows(IndexOutOfBoundsException.class, () -> queue.dequeue(10), "Index out of Bound!");
    }

}