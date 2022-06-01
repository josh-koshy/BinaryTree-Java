package dev.koshy;

/*
* roses are red
* violets are blue
* this language kinda stinks
* and you do too
* */

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
    static Node i = new Node("i");
    static Node j = new Node("j");
    static Node k = new Node("k");
    static Node x = new Node("x");
    static Node z = new Node("z");



    public static void main(String[] args) {

        a.left = b;     // --------------------------           --------------------------
        a.right = c;    // |         Tree 1:        |           |         Tree 1:        |
        b.left = d;     // |------------------------|           |------------------------|
        b.right = e;    // |                        |           |                        |
        c.right = f;    // |            a           | ---L1-->  |            a           |
        d.left = g;     // |           / \          | ------->  |           / \          |
        d.right = h;    // |         b    c         | ---L2-->  |         c    b         |
        e.left = i;     // |       /   \    \       | ------->  |       /     /  \       |
        e.right = j;    // |      d     e    f      | ---L3-->  |      f     e    d      |
        f.right = k;    // |     / \   / \    \     | ------->  |     /     / \   /\     |
        j.left = x;     // |    g   h  i j     k    | ---L4-->  |    k      j  i h  g    |
        j.right = z;    // |            / \         | ------->  |          / \           |

        Traverse.BFS();

    }
}

class Node {
    String value;
    Node left;
    Node right;

    Node(String value) {
        this.value = value;
        right = null;
        left = null;
    }
}

class Traverse {

    // Breath First Search
    public static void BFS() {
        ArrayList<Node> stack = new ArrayList<Node>();
        stack.add(0, Main.a);
        while (stack.size() > 0) {
            Node CurrentVal = stack.remove(0);
            System.out.println(CurrentVal.value);
            if (CurrentVal.right != null) {
                stack.add(CurrentVal.right);
            }
            if (CurrentVal.left != null) {
                stack.add(CurrentVal.left);
            }
        }
    }
    // Depth First Search

}
