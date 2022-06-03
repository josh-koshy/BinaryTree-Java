package dev.koshy;


import java.util.ArrayList;

public class Main {

    static Node a = new Node("a");
    static Node b = new Node("b");
    static Node c = new Node("c");
    static Node d = new Node("d");
    static Node e = new Node("e");
    static Node f = new Node("f");
    static Node g = new Node("g");
    static Node h = new Node("h");

    static void assign() {
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        e.right = h;
    }
    static void BFS() {
        ArrayList<Node> stack = new ArrayList<Node>();
        stack.add(0, Main.a);
        while (stack.size() > 0) {
            Node CurrentVal = stack.remove(0);
            System.out.println(CurrentVal.val);
            if (CurrentVal.right != null) {
                stack.add(CurrentVal.right);
            }
            if (CurrentVal.left != null) {
                stack.add(CurrentVal.left);
            }
        }
    }

    public static void main(String[] args) {
        assign();
        BFS();
    }
}

/*
            a
           / \
          b   c
         / \ / \
        d  e f  g
            \
             h
*/

class Node {
    String val;
    Node left;
    Node right;

    Node(String val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

}
