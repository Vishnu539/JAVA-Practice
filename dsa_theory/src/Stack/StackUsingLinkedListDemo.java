package dsa_theory.src.Stack;

import dsa_theory.src.LinkedList.CustomLinkedList;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackUsingLinkedListDemo {
    public static void main(String[] args) {
        // We can implement a Stack using either Linked Lists or Arrays
        // Implementing Stack using inbuilt Linked List
        CustomStack cs = new CustomStack();

        cs.push(10);
        cs.push(20);
        cs.push(30);
        cs.push(40);
        cs.push(60);

        cs.printStack();

        cs.peek();

        cs.pop();

        cs.printStack();
    }
}