package OOP2.Stack;

public class S_Practice {
    public static void main(String[] args) {




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
    }
}
