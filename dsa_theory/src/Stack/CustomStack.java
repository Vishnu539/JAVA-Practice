package dsa_theory.src.Stack;

class Node{
    int data;
    Node next;
    int top;

    public Node(int data){
        this.data = data;
        next = null;
    }
}

public class CustomStack {
    Node head = null;

    public void push(int data){
        Node newNode = new Node(data);

        if(head == null) head = newNode;
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void pop(){
        Node current = head;

        while(current.next.next != null) current = current.next;

        int temp = current.next.data;
        current.next = null;

        System.out.println(temp);
    }

    public void peek(){
        System.out.println(head.data);
    }

    public void printStack(){
        Node current = head;

        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }
}
