package BinaryTree;

import java.util.*;
import java.util.Stack;

public class SmallestSubTree_865 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Pair{
        TreeNode prev;
        TreeNode curr;
        public Pair(TreeNode prev, TreeNode curr) {
            this.prev = prev;
            this.curr = curr;
        }
    }

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if (root == null) return null;
        //
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root,root));
        TreeNode prev = null;
        while (!queue.isEmpty()) {
            int i=0;
            int size= queue.size();
            prev = null;
            while(i < size){
                Pair p = queue.poll();
                TreeNode curr = p.curr;
                TreeNode c_prev = p.prev;                //
                if(prev == null) prev = c_prev;
                else if(prev.val > c_prev.val) prev = c_prev;
                //
                if(curr.left != null) queue.offer(new Pair(curr,curr.left));
                if(curr.right != null) queue.offer(new Pair(curr,curr.right));
                i++;
            }
        }
        return prev;
    }

    // Your original approach with correct logic
    public TreeNode subtreeWithAllDeepestFixed(TreeNode root) {
        if (root == null) return null;
        
        // Step 1: Find all deepest nodes using BFS
        List<TreeNode> deepestNodes = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            deepestNodes.clear(); // This will keep only the deepest level
            
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                deepestNodes.add(curr); // Add all nodes at current level
                
                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);
            }
        }
        
        // Step 2: Find LCA of all deepest nodes
        return findLCA(root, new HashSet<>(deepestNodes));
    }
    
    private TreeNode findLCA(TreeNode root, Set<TreeNode> targets) {
        if (root == null || targets.contains(root)) return root;
        
        TreeNode left = findLCA(root.left, targets);
        TreeNode right = findLCA(root.right, targets);
        
        if (left != null && right != null) return root;
        return left != null ? left : right;
    }
    
    // Test to show the difference
    public static void main(String[] args) {
        SmallestSubTree_865 solution = new SmallestSubTree_865();
        
        // Create test tree:
        //         10
        //       /    \
        //      5      15  
        //     / \    /  \
        //    2   7  12  20
        //   /   /
        //  1   6
        
        TreeNode root = solution.new TreeNode(10);
        root.left = solution.new TreeNode(5);
        root.right = solution.new TreeNode(15);
        root.left.left = solution.new TreeNode(2);
        root.left.right = solution.new TreeNode(7);
        root.right.left = solution.new TreeNode(12);
        root.right.right = solution.new TreeNode(20);
        root.left.left.left = solution.new TreeNode(1);
        root.left.right.left = solution.new TreeNode(6);
        
        TreeNode wrongResult = solution.subtreeWithAllDeepest(root);
        TreeNode correctResult = solution.subtreeWithAllDeepestFixed(root);
        
        System.out.println("Your original approach result: " + (wrongResult != null ? wrongResult.val : "null"));
        System.out.println("Correct approach result: " + (correctResult != null ? correctResult.val : "null"));
        System.out.println("Deepest nodes are 1 and 6. Their LCA should be 5, not 2!");
    }
}
