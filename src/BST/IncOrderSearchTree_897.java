package BST;

import java.util.Stack;

public class IncOrderSearchTree_897 {
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

    public TreeNode increasingBST(TreeNode root) {
        if(root == null) return null;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        //Here dummy is like the starting node of the new tree we have as result
        TreeNode dummy = new TreeNode(0);
        TreeNode tail = dummy; // tail is pointer
        while(cur != null || !stack.isEmpty()) {
            //go most far left
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            //pop element
            cur = stack.pop();
            //create the tree
            tail.left = null;//we dont have left node
            tail.right = cur; // append node
            tail = cur; // point to this one
            cur = cur.right;
        }
        return dummy.left;
    }
}
