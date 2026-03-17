package dsa_theory.src.LinkedList;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        next = null;
    }
}

public class CustomLinkedList {
    Node head = null;

    public void add(int data){
        Node newNode = new Node(data);
        Node current = head;

        if(head == null) head = newNode;
        else{
            while(current.next != null) current = current.next;
            current.next = newNode;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);

        if(head == null) head = newNode;
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void delete(int data){
        Node current = head;

        while(current.next != null && current.next.data != data) current = current.next;

        if(current.next != null) current.next = current.next.next;
    }

    public void deleteFirst(){
        head = head.next;
    }

    public void deleteLast(){
        Node current = head;

        while(current.next.next != null){
            current = current.next;
        }

        current.next = null;
    }

    public void display(){
        Node current = head;

        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public int size(){
        Node current = head;
        int cnt = 0;

        while(current.next != null){
            current = current.next;
            cnt++;
        }

        return cnt + 1;
    }
}
