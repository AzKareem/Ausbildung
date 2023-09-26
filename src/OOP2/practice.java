package OOP2;

public class practice {
    public static void main(String[] args) {

 // Aufgabe Stack:

        DoubleChainedListStack stack = new DoubleChainedListStack();


        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("--------------");

        System.out.println(stack.toString());
        System.out.println("--------------");
        stack.pop();
        System.out.println("--------------");
        stack.peek();
        System.out.println("--------------");
        int[] poppedElements = stack.pop(2);
        System.out.println("--------------");

        System.out.println(stack.toString());

//
//        // Aufgabe OOP2.Queue:
//        System.out.println("Aufgabe OOP2.Queue");
//
//
//        OOP2.DoubleChainedListQueue queue = new OOP2.DoubleChainedListQueue();
//
//        queue.enqueue(1);
//        queue.enqueue(2);
//        queue.enqueue(3);
//        queue.enqueue(4);
//        queue.enqueue(5);
//        System.out.println(queue.toString());
//        System.out.println("--------------");
//        queue.dequeue();
//        System.out.println("--------------");
//        System.out.println(queue.toString());
//        System.out.println("--------------");
//        int[] queuedElements = queue.dequeue(2);
//        System.out.println("--------------");
//        System.out.println(queue.toString());


        // Aufgabe Fotografie;

//        OOP2.Lens gg1 = new OOP2.Lens(100, 1001);
//        OOP2.Lens gg2 = new OOP2.Lens(100, 1002);
//        OOP2.Lens gg3 = new OOP2.Lens(100, 1003);
//
//        OOP2.Camera camera1 = new OOP2.Camera("keine Ahnung1", 155, 1010, true, gg1);
//        OOP2.Camera camera2 = new OOP2.Camera("keine Ahnung3", 158, 1100, true, gg2);
//        OOP2.Camera camera3 = new OOP2.Camera("keine Ahnung4", 159, 101, true, gg3);
//        camera1.setBrand("keine Ahnung 2");
//        System.out.println(camera1.toString());
//        camera1.getBrand();
//
//        System.out.println(gg1.toString());
//        System.out.println(camera3.toString());
//
//        camera2.getDisplaySize();

    }
}
