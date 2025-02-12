package BinaryTree;

import java.util.*;

public class SumBST_653 {
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

    public boolean findTarget(TreeNode root, int k) {
        if(root == null) return false;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        HashSet<Integer> complement = new HashSet<>();
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int comp = k-node.val;
            if(complement.contains(node.val)) return true;
            else complement.add(comp);
            //check left
            if(node.left != null) stack.push(node.left);
            if(node.right != null) stack.push(node.right);
        }
        return false;
    }
}
