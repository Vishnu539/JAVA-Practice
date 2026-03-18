package dsa_theory.src.Queue;

public class CustomQueue {
    private int front = 0;
    private int rear = -1;
    private int count = 0;
    private int capacity;
    private int[] arr;

    public CustomQueue(int size){
        this.capacity = size;
        arr = new int[size];
    }

    public void enqueue(int data){
        if(isFull()) throw new RuntimeException("Queue is full");

        rear = (rear + 1) % capacity;
        arr[rear] = data;
        count++;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return 0;
        }

        int temp = arr[front];
        front = (front + 1) % capacity;
        count--;
        return temp;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return 0;
        }

        return arr[front];
    }

    public void printQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }

        for(int i = 0; i < count; i++) System.out.print(arr[(front + i) % capacity] + " ");
        System.out.println();
    }

    public boolean isFull(){
        return count == capacity;
    }

    public boolean isEmpty(){
        return count == 0;
    }
}
