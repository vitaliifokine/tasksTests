package datastructures;

public class Sample {

    public static void main(String[] args) {
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        linkedList2.add("rr");
        linkedList2.add("jj");
        linkedList2.get(1);
        System.out.println("L: " + linkedList2.get(1));

        LinkedList linkedList = new LinkedList();
        linkedList.addLast(26);
        linkedList.addLast(30);
        linkedList.addLast(40);
        System.out.println(linkedList.indexOf(26));




    }
}
