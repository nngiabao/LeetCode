package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostorderTraversal_145 {
    public static void main(String[] args) {

    }

    /**
     * Post-order traversal using stack
     * Post-order traversal visits nodes in the order: left -> right -> root
     * @param root The root node of the binary tree
     * @return List of node values in post-order traversal
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        TreeNode lastVisited = null;
        
        // Continue while we have nodes to process or current node is not null
        while (!stack.isEmpty() || current != null) {
            // Reach the leftmost node of current node
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            
            // Get the top node from stack without removing it
            TreeNode peekNode = stack.peek();
            
            // If right child exists and hasn't been visited yet, process it
            if (peekNode.right != null && peekNode.right != lastVisited) {
                current = peekNode.right;
            } else {
                // If right child doesn't exist or has been visited, process current node
                result.add(peekNode.val);
                lastVisited = stack.pop();
            }
        }
        
        return result;
    }

    public class TreeNode {
        int val;
        PostorderTraversal_145.TreeNode left;
        PostorderTraversal_145.TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, PostorderTraversal_145.TreeNode left, PostorderTraversal_145.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
