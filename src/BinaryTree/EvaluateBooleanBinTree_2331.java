package BinaryTree;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.Stack;

public class EvaluateBooleanBinTree_2331 {
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

    public boolean evaluateTree(TreeNode root) {
        if (root == null) return true;
        boolean res = true;
        //create 2 stak - 1 for node - 1 for leaves
        //
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> command = new ArrayList<>();
        //using DFS
        //move to most far left
        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            command.addFirst(curr.val);
            if(curr.right != null) stack.push(curr.right);
            if(curr.left != null) stack.push(curr.left);
        }
        for(int num : command){
            if(num == 0) res = false;
        }
        return true;
    }
}
