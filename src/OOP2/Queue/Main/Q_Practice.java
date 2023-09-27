package OOP2.Queue.Main;

import OOP2.Queue.Main.DoubleChainedListQueue;

public class Q_Practice {
    public static void main(String[] args) {



        DoubleChainedListQueue queue = new DoubleChainedListQueue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println(queue.toString());
        System.out.println("--------------");
        queue.dequeue();
        System.out.println("--------------");
        System.out.println(queue.toString());
        System.out.println("--------------");
        int[] queuedElements = queue.dequeue(2);
        System.out.println("--------------");
        System.out.println(queue.toString());
    }
}
