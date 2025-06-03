package BinaryTree;

import com.sun.source.tree.Tree;

import java.util.Stack;

public class SumRootToLeaf_129 {
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

    //using pairs
    class Pair{
        StringBuilder sum;
        TreeNode node;
        public Pair(StringBuilder sum, TreeNode node) {
            this.sum = sum;
            this.node = node;
        }
    }


    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        //
        Stack<Pair> stack = new Stack<>();
        //
        stack.push(new Pair(new StringBuilder().append(root.val),root));
        //
        int sum = 0;
        while (!stack.isEmpty()) {
            Pair p = stack.pop();
            TreeNode node = p.node;
            StringBuilder val = p.sum;
            if(node.left == null && node.right == null) {
                sum+= Integer.parseInt(val.toString());
            }
            //
            if(node.left != null) {

                stack.push(new Pair(new StringBuilder(val).append(node.left.val), node.left));
            }
            //
            if(node.right != null) {
                stack.push(new Pair(new StringBuilder(val).append(node.right.val), node.right));
            }
        }
        return sum;
    }
}
