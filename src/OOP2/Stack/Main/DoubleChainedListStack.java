package OOP2.Stack.Main;

public class DoubleChainedListStack {


    private class Stack {

        int newElement;


        Stack next;
        Stack previous;


        private Stack(int newElement) {
            this.newElement = newElement;
        }

    }

    private Stack head, tail = null;
    int size;


    public DoubleChainedListStack() {
    }

    public void push(int newElement) {
        Stack newStack = new Stack(newElement);
        if (head == null) {
            head = newStack;
            tail = newStack;

        } else {
            newStack.previous = tail;
            tail.next = newStack;
            tail = newStack;
        }
        size++;
    }

    public int sizeAusgabe() {
        return size;
    }

    private boolean isEmpty() {
        return size == 0;
    }


    public int pop() {
        if (isEmpty()) {
            throw new NullPointerException("The Stack is empty! ");
        }

        int popElement = tail.newElement;
        tail = tail.previous;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }
        size--;
        System.out.println(popElement);
        return popElement;
    }

    public int peek() {
        if (isEmpty()) {
            throw new NullPointerException("The Stack is empty! ");
        } else {
            int popElement = tail.newElement;
            System.out.println(popElement);
            return popElement;
        }

    }

    public int[] pop(int n) {
        if (n > size){
            throw new IndexOutOfBoundsException("Index out of Bound! ");
        }else{
            int[] poppedElements = new int[Math.min(n, size)];
            for (int i = 0; i < poppedElements.length; i++) {
                poppedElements[i] = pop();

            }

            return poppedElements;
        }

    }


    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (head == null) {
            return "";
        }
        DoubleChainedListStack.Stack temp = head;
        while (temp != null) {
            stringBuilder.append(temp.newElement);
            stringBuilder.append(", ");
            temp = temp.next;
        }
        return stringBuilder.toString();
    }
}





