package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class FlattenBinTree_114 {
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
    //Solution 1:Normal way
    public void flatten(TreeNode root) {
        if (root == null) return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        TreeNode prev = null;

        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();

            if (prev != null) {
                prev.right = curr;
                prev.left = null;
            }

            // Push right first so that left is processed first (preorder)
            if (curr.right != null) stack.push(curr.right);
            if (curr.left != null) stack.push(curr.left);

            prev = curr;
        }
    }

    //Solution 2:Using recursion
}
