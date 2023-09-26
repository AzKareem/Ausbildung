package OOP2.Queue;

public class DoubleChainedListQueue {


    private class Queue {

        int newElement;


      Queue next;
      Queue previous;


        private Queue(int newElement) {
            this.newElement = newElement;
        }

    }

    private Queue head, tail = null;
    int size;


    public DoubleChainedListQueue() {
    }

    public void enqueue(int newElement) {
        Queue newStack = new Queue(newElement);
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


    public int dequeue() {
        if (isEmpty()) {
            throw new NullPointerException("The Stack is empty! ");
        }

        int queueElements = head.newElement;
        head = head.next;
        if (head != null) {
            head.previous = null;
        } else {
            tail = null;
        }
        size--;
        System.out.println(queueElements);
        return queueElements;
    }

    public int[] dequeue(int n) {
        int[] queuedElements = new int[Math.min(n, size)];
        for (int i = 0; i < queuedElements.length; i++) {
            queuedElements[i] = dequeue();

        }

        return queuedElements;
    }


    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (head == null) {
            return "";
        }
        Queue temp = head;
        while (temp != null) {
            stringBuilder.append(temp.newElement);
            stringBuilder.append(", ");
            temp = temp.next;
        }
        return stringBuilder.toString();
    }
}







