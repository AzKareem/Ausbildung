package Linkedlists;

public class DoubleChainedList<E> {

    private class Node2<E> {

        E value;
        Node2<E> next;
        Node2<E> previous;

        private Node2(E value) {
            this.value = value;

        }
    }

    private Node2<E> head, tail = null;
    int size;

    public DoubleChainedList() {
    }

    public void add(E value) {
        Node2<E> newNode = new Node2<>(value);
        if (head == null) {
            head = newNode;
            tail = newNode;

        } else {

            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;

        }
        size++;
    }

    public void addFirst(E value) {
        Node2<E> newNode = new Node2<>(value);
        if (head == null) {
            tail = newNode;
        } else {
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(E value) {
        Node2<E> newNode = new Node2<>(value);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        size++;
    }

    public E get(int index) {
        if (index == 0) {
            return head.value;
        }
        if (index == size - 1) {
            return tail.value;
        }

        int middle = size / 2;

        if (index < middle) {
            Node2<E> temp = head;
            for (int i = index; i < middle; i++) {
                temp = temp.next;
            }
            return temp.value;
        } else {
            Node2<E> temp = tail;
            for (int i = size - 1; i > index; i--) {
                temp = temp.previous;
            }
            return temp.value;
        }
    }

    public void remove(int index) {
        if (index == 0) {
            head = head.next;
            --size;
            return;
        }
        if (index == size-1) {
            tail.previous.next = null;
            tail = tail.previous;
            --size;
            return;
        }

        Node2<E> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        Node2<E> previousN = temp.previous;
        temp.next.previous = previousN;
        temp.previous.next = temp.next;
        --size;
    }

    public void add(int index, E value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(("index " + index));
        }
        Node2<E> newNode = new Node2<>(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else if (index == 0) {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        } else if (index == size) {
            newNode.previous = tail;
            tail.next = newNode;
            tail = newNode;
        } else {
            Node2<E> previousN = head;
            for (int i = 0; i < index - 1; i++) {
                previousN = previousN.next;
            }

            newNode.next = previousN.next;
            previousN.next = newNode;
            newNode.previous = previousN;
            newNode.next.previous = newNode;
        }
        size++;
    }

    public int sizeAusgabe() {
        return size;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (head == null) {
            return "";
        }
        Node2<E> temp = head;
        while (temp != null) {
            stringBuilder.append(temp.value);
            stringBuilder.append(", ");
            temp = temp.next;
        }
        return stringBuilder.toString();
    }

    public String toStringReverse() {
        StringBuilder stringBuilder = new StringBuilder();
        if (tail == null) {
            return "";
        }
        Node2<E> temp = tail;
        while (temp != null) {
            stringBuilder.append(temp.value);
            stringBuilder.append(", ");
            temp = temp.previous;
        }
        return stringBuilder.toString();
    }

}
