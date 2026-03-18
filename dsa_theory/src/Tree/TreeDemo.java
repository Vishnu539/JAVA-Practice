package dsa_theory.src.Tree;

import com.sun.source.tree.Tree;

public class TreeDemo {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(10);
        tree.insert(20);
        tree.insert(8);
        tree.insert(12);
        tree.insert(4);

        tree.printTree();
    }
}
