package dsa_theory.src.Tree;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
    }
}

public class BinaryTree {
    // This class implements a Binary Search Tree
    // BST - all elements to the left of the root are smaller than the root and all elements to the right of the root are greater than the root.
    // There are three traversal techniques for BST - preorder, inorder, postorder
    // inorder - left, root, right (naturally prints the elements in a sorted order)
    // preorder - root, left, right
    // postorder - left, right, root

    Node root;

    public void insert(int data){
        root = insertRecursion(root, data);
    }

    private Node insertRecursion(Node root, int data){
        if(root == null) root = new Node(data);
        else if(data < root.data) root.left = insertRecursion(root.left, data);
        else if(data > root.data) root.right = insertRecursion(root.right, data);

        return root;
    }

    public void printTree(){
        inorder(root);
    }

    private void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
}
