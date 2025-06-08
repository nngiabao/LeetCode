package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class UniqueBinTree_96 {
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

    //Solution 1: DFS
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode prev = null;
        TreeNode curr = root;
        while(!stack.isEmpty() || curr != null) {
            //check leaf or not
            //go as far left as posible
            while(curr != null) {
                stack.push(curr); //push left node to the stack
                curr = curr.left;
            }
            //check the visit node - thang dang dung
            curr = stack.pop();
            if(prev != null && curr.val <= prev.val) return false;
            prev = curr;
            //points to right child
            curr = curr.right;
        }
        return true;
    }
}
