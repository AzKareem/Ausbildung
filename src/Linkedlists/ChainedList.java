package Linkedlists;

public class ChainedList<E> {

   private class Node<E> {
        E value;
        Node<E> next;

        public Node(E value) {
            this.value = value;
            this.next = null;
        }
    }

    int size;

    public ChainedList() {

    }

    public Node<E> head = null;

    public void add(E value) {
        Node<E> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
        } else {
            Node<E> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    public E get(int index) {
        Node<E> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.value;
    }

    public void remove(int index) {
        if(index == 0){
            head = head.next;
            --size;
            return;
        }
        Node<E> temp = head;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        --size;
    }

    public void add(int index, E value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(("index "+ index));
        } else {
            Node<E> newNode = new Node<E>(value);
            Node<E> temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }

    }

    public int sizeAusgabe() {
        return size;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (head == null) {
            return "";
        }
        Node<E> temp = head;
        while (temp != null) {
            stringBuilder.append(temp.value);
            stringBuilder.append(", ");
            temp = temp.next;
        }
        return stringBuilder.toString();
    }

}
