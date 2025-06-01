package BinaryTree;

import java.util.Stack;

public class PathSum3_437 {
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

    //using class
    class Pair{
        int val;
        TreeNode node;
        public Pair(int val, TreeNode node) {
            this.val = val;
            this.node = node;
        }
    }

    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        //
        int count =0;
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root.val, root));
        //
        while(!stack.isEmpty()){
            Pair p = stack.pop();
            //
            int sum = p.val;
            TreeNode node = p.node;
            //
            if(sum == targetSum) count++;
            if(node.left != null) stack.push(new Pair(sum+node.left.val, node.left));
            if(node.right != null) stack.push(new Pair(sum+node.right.val, node.right));
        }
        return count;
    }
}
