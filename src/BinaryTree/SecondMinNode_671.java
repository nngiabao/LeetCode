package BinaryTree;

import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;

public class SecondMinNode_671 {
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

    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) return -1;
        TreeSet<Integer> tree = new TreeSet<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            //
            tree.add(node.val);
            //check left and right
            if(node.left != null) stack.push(node.left);
            if(node.right != null) stack.push(node.right);
        }
        if(tree.size() == 1) return -1;
        else{
            tree.removeFirst();
            return tree.first();
        }
    }
}
