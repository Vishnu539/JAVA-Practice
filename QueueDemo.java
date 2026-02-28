import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        // Queue using Linked List
        LinkedList<Integer> ls1 = new LinkedList<>();
        ls1.addLast(10); // enqueue
        ls1.addLast(20);
        ls1.addLast(30);

        System.out.println(ls1);
        System.out.println(ls1.removeFirst()); // dequeue
        System.out.println(ls1.getFirst()); // peek

        System.out.println();

        // Queue implementation
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);

        System.out.println(q1);
        System.out.println(q1.peek());
        System.out.println(q1.poll());
        System.out.println(q1.offer(50));
        System.out.println(q1.element()); // same as peek
        System.out.println(q1);

        System.out.println();
    }
}
