package LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class PopNextRightNode_116 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

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
        if (root == null) return root;
        //
        Node dummy = new Node(0);
        dummy = root;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int i = 0;
            int size = q.size();
            Node prev = null;
            while (i < size) {
                Node cur = q.poll();
                if(prev != null) prev.next = cur;
                prev = cur;
                if (cur.left != null) q.add(cur.left);
                if (cur.right != null) q.add(cur.right);
                i++;
            }
        }
        return root;
    }
}
