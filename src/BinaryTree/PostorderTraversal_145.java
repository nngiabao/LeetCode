package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostorderTraversal_145 {
    public static void main(String[] args) {

    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();

        if(root == null) return result;
        //visit root first
        stack.push(root);
        //
        while(!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            result.add(0,curr.val);

            if(curr.left != null) {
                stack.push(curr.left);
            }

            if(curr.right != null) {
                stack.push(curr.right);
            }
        }
        return result;
    }

    public class TreeNode {
        int val;
        PostorderTraversal_145.TreeNode left;
        PostorderTraversal_145.TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, PostorderTraversal_145.TreeNode left, PostorderTraversal_145.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
