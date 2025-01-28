package BinaryTree;

public class BalancedBinTree_110 {

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return checkHeight(root) != -1;
    }

    public int checkHeight(TreeNode root) {
        if(root == null) return 0;
        //check left subtree
        int left = checkHeight(root.left);
        if(left == -1) return -1;
        //check right subtree
        int right = checkHeight(root.right);
        if(right == -1) return -1;
        // if the gap between 2 tree > 1 => false
        if(Math.abs(left - right) > 1) return -1;
        //return height of current subtree
        return Math.max(left, right) + 1;
    }

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
}
