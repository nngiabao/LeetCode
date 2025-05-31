package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class PopNextRightNode2_117 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public Node connect(Node root) {
        if(root == null) return null;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            int i =0;
            int size = q.size();
            Node prev = null;
            while(i < size) {
                Node cur = q.poll();
                if (prev != null) prev.next = cur;
                prev = cur; // prev to cur node
                //
                if(cur.left != null) q.add(cur.left);
                if(cur.right != null) q.add(cur.right);
                //
                i++;
            }
        }
        return root;
    }
}
