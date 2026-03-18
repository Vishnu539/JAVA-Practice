package dsa_theory.src.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        CustomQueue cq = new CustomQueue(4);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);

        cq.printQueue();
        System.out.println("Peek: " + cq.peek());

//        cq.enqueue(50); // throws exception as the queue is full

        System.out.println("Dequeue: " + cq.dequeue());
        cq.printQueue();
        System.out.println("Dequeue: " + cq.dequeue());
    }
}
