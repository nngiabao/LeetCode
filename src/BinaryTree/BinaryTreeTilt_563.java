package BinaryTree;

import java.util.*;

public class BinaryTreeTilt_563 {
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

    //post-order traversal
    public int findTilt(TreeNode root) {
        int sum = 0;
        if (root == null) return root.val;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            //travel to leftmost node
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            //
            curr = stack.pop();
            int l_val = 0, r_val = 0;
            if (curr.left != null) l_val = curr.left.val;
            if (curr.right != null) r_val = curr.right.val;
            int temp = Math.abs(l_val - r_val);
            sum += temp;
            curr.val = temp;
            //move to the right
            curr = curr.right;
        }
        return sum;
    }
}
