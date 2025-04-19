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

    public int findTilt(TreeNode root) {
        int sum=0;
        if(root==null) return sum;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            //count
            int temp = 0;
            if(node.left!=null){
                stack.push(node.left);
                temp+=node.left.val;
            }
            if(node.right!=null){
                stack.push(node.right);
                temp=Math.abs(node.right.val-temp);
            }
            sum+=temp;
        }
        return sum;
    }
}
