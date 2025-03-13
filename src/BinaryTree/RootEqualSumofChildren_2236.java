package BinaryTree;

import java.util.Stack;

public class RootEqualSumofChildren_2236 {
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

    public boolean checkTree(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) return true;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            //check either left or right different from null
            if (node.left != null || node.right != null) {
                if (node.left != null && node.right != null) {
                    if (root.val != root.right.val + root.right.val) return false;
                    stack.push(root.left);
                    stack.push(root.right);
                } else if (root.left == null) {
                    if (root.val != root.right.val) return false;
                    stack.push(root.right);
                } else {
                    if (root.val != root.left.val) return false;
                    stack.push(root.left);
                }
            }
        }
        return true;
    }
}
