package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class FindBottomLeftTreeValue_513 {
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

    // Original BFS approach - O(n) time, O(w) space where w is max width
    public int findBottomLeftValue(TreeNode root) {
        if(root == null) return -1; // or throw an exception since the problem guarantees non-null root
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        TreeNode firstLeft = root;
        while(!queue.isEmpty()) {
            int size = queue.size();
            firstLeft = null;
            for(int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                if(firstLeft == null) firstLeft = curr; // First node in this level is the leftmost
                if(curr.left != null) queue.add(curr.left);
                if(curr.right != null) queue.add(curr.right);
            }
        }
        return firstLeft.val;
    }
    
    // Method 2: Reverse BFS - More space efficient for wide trees
    // Process from right to left, last processed node will be leftmost
    public int findBottomLeftValueReverseBFS(TreeNode root) {
        if(root == null) return -1;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode node = root;
        
        while(!queue.isEmpty()) {
            node = queue.poll();
            // Add right first, then left (reverse order)
            if(node.right != null) queue.add(node.right);
            if(node.left != null) queue.add(node.left);
        }
        
        return node.val; // Last processed node is leftmost of bottom row
    }
    
    // Method 3: DFS with single pass - O(n) time, O(h) space where h is height
    // Better space complexity for tall, narrow trees
    private int maxDepth = -1;
    private int bottomLeftValue = 0;
    
    public int findBottomLeftValueDFS(TreeNode root) {
        if(root == null) return -1;
        
        maxDepth = -1; // Reset for multiple calls
        dfs(root, 0);
        return bottomLeftValue;
    }
    
    private void dfs(TreeNode node, int depth) {
        if(node == null) return;
        
        // If this is a deeper level than we've seen, update the leftmost value
        if(depth > maxDepth) {
            maxDepth = depth;
            bottomLeftValue = node.val;
        }
        
        // Visit left first to ensure we get the leftmost node at each depth
        dfs(node.left, depth + 1);
        dfs(node.right, depth + 1);
    }
    
    // Method 4: Two-pass DFS - Find max depth first, then find leftmost at that depth
    public int findBottomLeftValueTwoPassDFS(TreeNode root) {
        if(root == null) return -1;
        
        int maxDepth = findMaxDepth(root);
        return findLeftmostAtDepth(root, 0, maxDepth - 1);
    }
    
    private int findMaxDepth(TreeNode node) {
        if(node == null) return 0;
        return 1 + Math.max(findMaxDepth(node.left), findMaxDepth(node.right));
    }
    
    private int findLeftmostAtDepth(TreeNode node, int currentDepth, int targetDepth) {
        if(node == null) return -1;
        
        if(currentDepth == targetDepth) return node.val;
        
        // Try left first to get leftmost node
        int leftResult = findLeftmostAtDepth(node.left, currentDepth + 1, targetDepth);
        if(leftResult != -1) return leftResult;
        
        return findLeftmostAtDepth(node.right, currentDepth + 1, targetDepth);
    }
    
    // Method 5: Post-order Traversal - O(n) time, O(h) space
    // Process left subtree completely before right subtree
    private int postOrderMaxDepth = -1;
    private int postOrderResult = 0;
    
    public int findBottomLeftValuePostOrder(TreeNode root) {
        if(root == null) return -1;
        
        postOrderMaxDepth = -1; // Reset for multiple calls
        postOrderTraversal(root, 0);
        return postOrderResult;
    }
    
    private void postOrderTraversal(TreeNode node, int depth) {
        if(node == null) return;
        
        // Post-order: Left -> Right -> Root
        postOrderTraversal(node.left, depth + 1);
        postOrderTraversal(node.right, depth + 1);
        
        // Process current node (after visiting children)
        // Since we visit left subtree first, the first node we encounter 
        // at max depth will be the leftmost
        if(depth > postOrderMaxDepth) {
            postOrderMaxDepth = depth;
            postOrderResult = node.val;
        }
    }
    
    // Method 6: Enhanced Post-order with early termination
    // More efficient version that can terminate early in some cases
    public int findBottomLeftValuePostOrderOptimized(TreeNode root) {
        if(root == null) return -1;
        
        Result result = new Result();
        postOrderOptimized(root, 0, result);
        return result.value;
    }
    
    // Helper class to store result
    private class Result {
        int maxDepth = -1;
        int value = 0;
    }
    
    private void postOrderOptimized(TreeNode node, int depth, Result result) {
        if(node == null) return;
        
        // Post-order: Left -> Right -> Root
        postOrderOptimized(node.left, depth + 1, result);
        postOrderOptimized(node.right, depth + 1, result);
        
        // Process current node
        // Update only if we found a deeper level
        if(depth > result.maxDepth) {
            result.maxDepth = depth;
            result.value = node.val;
        }
    }
}
