package datastructures;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    public void addLast(int item) {
        Node node = new Node(item);
        if (isEmpty()){
            first = last = node;
        }
        else {
            last.next = node;
        }
    }

    public void addFirst(int item){
        Node node = new Node(item);
        if (isEmpty()){
            first = last = node;
        }
        else {
            last.next = first;
            first = node;
        }
    }

    private boolean isEmpty(){
        return first == null;
    }

    public int indexOf(int item){
        int index =0;
        Node current = first;
        while (current !=null){
            if (current.value == item) return index;
            current=current.next;
            index++;
        }
        return -1;
    }
}