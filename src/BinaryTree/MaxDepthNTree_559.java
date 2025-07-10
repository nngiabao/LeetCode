package BinaryTree;

import java.util.*;
public class MaxDepthNTree_559 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
    //Solution 1: BFS
    public int maxDepth(Node root) {
        //
        if (root == null) return 0;
        //
        int depth = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                //if node has children
                for(Node child : node.children) {
                    queue.add(child);
                }
            }
            depth++;
        }
         //
        return depth;
    }
    //Solution 2:Recursion - DFS
    public int maxDepth2(Node root) {
        if (root == null) return 0;
        int max=0;
        //
        for(Node child : root.children) {
            max = Math.max(max,maxDepth2(child));
        }
        //
        return max+1;
    }
}
