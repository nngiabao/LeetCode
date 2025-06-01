package BST;

import java.util.Stack;

public class KthSmallestElement_230 {
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

    //Solution 1:Using stack
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return -1;
        //
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        int count = 1;
        //
        while(curr != null && !stack.isEmpty()) {
            //move to far left as posible
            TreeNode node = stack.pop();
            while(curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            //pop this element
            curr = stack.pop();
            count++;
            if(k == count) return curr.val;
            //move to right node
            curr = curr.right;
        }
        return -1;
    }
}
