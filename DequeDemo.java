import java.util.*;

public class DequeDemo {
    public static void main(String[] args) {
        // Deque implementation using ArrayDeque
        // Faster traversal than LinkedList
        Deque<Integer> d1 = new ArrayDeque<>();

        d1.addFirst(10);
        d1.addLast(30);
        d1.offerFirst(5);
        d1.offerLast(50);

        System.out.println(d1);

        System.out.println(d1.removeFirst());
        System.out.println(d1.removeLast());

        System.out.println(d1);

        System.out.println(d1.peekFirst());
        System.out.println(d1.peekLast());

        System.out.println(d1.pollFirst());
        System.out.println(d1.pollLast());

        System.out.println(d1);

        System.out.println();

        // Deque implementation using Linked List
        Deque<Integer> d2 = new LinkedList<>();

        // Uses same methods as ArrayDeque
        // Better than ArrayDeque only in the case of insertion or deletion somewhere in the middle
        d2.addFirst(90);
        d2.addLast(70);
        d2.offerFirst(65);
        d2.offerLast(60);

        System.out.println(d2);
    }
}
