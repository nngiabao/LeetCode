package BinaryTree;

import java.util.*;

public class InvertBinaryTree_226 {
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
    //SOlution 1:Stack
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        //TreeNode dummy = new TreeNode(0);
        //TreeNode tail = dummy;
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            //swap
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            //when we swap node the pointer will swap the same
            if(node.right != null) stack.push(node.right);
            if(node.left != null) stack.push(node.left);
        }
        return root;
    }
}
