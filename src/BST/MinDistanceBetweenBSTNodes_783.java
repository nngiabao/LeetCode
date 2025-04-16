package BST;

import java.util.Stack;

public class MinDistanceBetweenBSTNodes_783 {
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

    public int minDiffInBST(TreeNode root) {
        int minDiff = Integer.MAX_VALUE;
        if (root == null) return 0;
        //
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode curr = root;
        Integer prev = null;
        while ( curr != null || !stack.isEmpty()) {
            //move as far left as posible
            while(curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            //start to the most far left
            curr = stack.pop();
            if(prev != null) {
                minDiff = Math.min(minDiff, curr.val - prev);
            }
            prev = curr.val;
            curr = curr.right;
        }
        return minDiff;
    }

    public static void main(String[] args) {

    }
}
