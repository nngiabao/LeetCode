package BinaryTree;

import java.util.*;
public class NaryTreePreoderTraversel_589 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    //Solution 1:
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        Stack<Node> stack = new Stack<>();
        stack.add(root);
        while(!stack.isEmpty()) {
            Node cur = stack.pop();
            result.add(cur.val);
                if(cur.children != null) {
                    for(Node child : cur.children.reversed()) {
                        stack.push(child);
                    }
                }
            }
        return result;
    }
    //Solution 2:
    public List<Integer> preorder2(Node root) {
        List<Integer> result = new ArrayList<>();
        return result;
    }
}
