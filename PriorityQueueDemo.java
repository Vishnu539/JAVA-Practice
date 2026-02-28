import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<String> q1 = new PriorityQueue<>(); 
        // Maintains natural ordering
        // Internally uses Min Heap (Smallest will always be at head)
        // String are stored in lexicographical order
        // Numbers are stroed in natural order

        q1.add("Wednesday");
        q1.add("Monday");
        q1.add("Tuesday");

        System.out.println(q1);

        while(!q1.isEmpty()) System.out.println(q1.poll());

        System.out.println();

        Queue<Integer> q2 = new PriorityQueue<>();
        q2.add(30);
        q2.add(10);
        q2.add(40);
        q2.add(20);
        q2.add(50);

        System.out.println(q2);

        while(!q2.isEmpty()){
            System.out.println(q2.poll());
        }
    }
}