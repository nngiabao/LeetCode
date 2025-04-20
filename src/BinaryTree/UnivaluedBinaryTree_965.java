package BinaryTree;

import java.util.Stack;

public class UnivaluedBinaryTree_965 {
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

    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        int val = root.val;
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if(val != node.val) return false;
            //
            if(node.left != null) stack.push(node.left);
            if(node.right != null) stack.push(node.right);
        }
        return true;
    }
}
