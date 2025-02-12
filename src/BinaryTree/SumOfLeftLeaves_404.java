package BinaryTree;

import java.util.*;

public class SumOfLeftLeaves_404 {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(3);
        a.left = new TreeNode(9);
        a.right = new TreeNode(20);
        //a.left.left = new TreeNode(null);
        //a.left.right = new TreeNode(7);
        a.right.left = new TreeNode(15);
        a.right.right = new TreeNode(7);
        System.out.println(sumOfLeftLeaves(a));
    }
    public static class TreeNode {
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

    public static int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        Stack<Map.Entry<Boolean, TreeNode>> stack = new Stack<>();
        stack.push(new AbstractMap.SimpleEntry<>(false, root));
        int sum=0;
        while (!stack.isEmpty()) {
            Map.Entry<Boolean, TreeNode> entry = stack.pop();
            //get Value of this entry
            boolean isLeft = entry.getKey() ;
            TreeNode node = entry.getValue() ;
            //check until find leaf
            if(node.left == null && node.right == null && isLeft) sum+= node.val;
            if(node.left != null) stack.push(new AbstractMap.SimpleEntry<>(true, node.left));
            if(node.right != null) stack.push(new AbstractMap.SimpleEntry<>(false, node.right));
        }
        return sum;
    }
}
