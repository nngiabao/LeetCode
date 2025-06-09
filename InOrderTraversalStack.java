import java.util.*;

// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    // Iterative in-order traversal using stack
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        
        // Continue while we have nodes to process
        while (current != null || !stack.isEmpty()) {
            // Reach the leftmost node of current node
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            
            // Process current node and move to right subtree
            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }
        
        return result;
    }
    
    // Recursive in-order traversal for comparison
    public List<Integer> inorderTraversalRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderHelper(root, result);
        return result;
    }
    
    private void inorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) return;
        
        inorderHelper(node.left, result);
        result.add(node.val);
        inorderHelper(node.right, result);
    }
    
    public int kthSmallest(TreeNode root, int k) {
        if (root == null) return -1;
        
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        int count = 0;  // Start count from 0
        
        // Continue while we have nodes to process or current node is not null
        while (curr != null || !stack.isEmpty()) {
            // Reach the leftmost node of current node
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            
            // Process current node
            curr = stack.pop();
            count++;
            
            // If we've found the kth element, return it
            if (count == k) {
                return curr.val;
            }
            
            // Move to right subtree
            curr = curr.right;
        }
        
        return -1;  // Return -1 if k is greater than number of nodes
    }
    
    // Example usage
    public static void main(String[] args) {
        // Create a sample tree:   3
        //                       /   \
        //                      1     4
        //                       \
        //                        2
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        
        Solution solution = new Solution();
        
        // Test kth smallest element
        System.out.println("1st smallest element: " + solution.kthSmallest(root, 1));  // Should print 1
        System.out.println("2nd smallest element: " + solution.kthSmallest(root, 2));  // Should print 2
        System.out.println("3rd smallest element: " + solution.kthSmallest(root, 3));  // Should print 3
        System.out.println("4th smallest element: " + solution.kthSmallest(root, 4));  // Should print 4
        
        // Test invalid k
        System.out.println("5th smallest element: " + solution.kthSmallest(root, 5));  // Should print -1
    }
} 