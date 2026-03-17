package dsa_theory.src.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        // In-built Linked List class
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        System.out.println(ll);

        // Custom Linked List implementation
        CustomLinkedList cll = new CustomLinkedList();

        // adding elements into the list
        cll.add(5);
        cll.add(10);
        cll.add(15);
        cll.addFirst(0);

        // removing elements from the list
        cll.delete(15);
        cll.deleteFirst(); // 0
        cll.deleteLast(); // 20

        cll.display();
    }
}
