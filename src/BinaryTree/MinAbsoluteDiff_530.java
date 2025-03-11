package BinaryTree;

import java.util.Stack;

public class MinAbsoluteDiff_530 {
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

    //Solution 1: Inorder Travel
    public int getMinimumDifference(TreeNode root) {
        int minDiff = Integer.MAX_VALUE;
        if(root == null) return 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            //check left
            if(node.left != null){
                stack.push(node.left);
                minDiff = Math.min(Math.abs(node.val-node.left.val), minDiff);
            }
            //check right
            if(node.right != null){
                stack.push(node.right);
                minDiff = Math.min(Math.abs(node.val-node.left.val), minDiff);
            }
        }
        return minDiff;
    }
}
