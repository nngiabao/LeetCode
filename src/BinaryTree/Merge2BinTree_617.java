package BinaryTree;

import java.util.*;

public class Merge2BinTree_617 {
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

    //
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) return root2;
        if (root2 == null) return root1;

        //Result tree
        TreeNode resultRoot = new TreeNode(root1.val + root2.val);
        //using stack of array value to track node in 2 trees and merged tree
        //array include 2 node value from 2 tree and current node of merged tree
        Stack<TreeNode[]> stack = new Stack<>();
        stack.push(new TreeNode[]{root1, root2, resultRoot});
        //process 2 tree
        while (!stack.isEmpty()) {
            TreeNode[] nodes = stack.pop();
            TreeNode node1 = nodes[0];
            TreeNode node2 = nodes[1];
            TreeNode mergedNode = nodes[2];
            //left
            if (node1.left != null || node2.left != null) {
                if (node1.left != null && node2.left != null) {
                    mergedNode.left = new TreeNode(node1.left.val + node2.left.val);
                    stack.push(new TreeNode[]{node1.left, node2.left, mergedNode.left});
                } else {
                    mergedNode.left = (node1.left != null) ? node1.left : node2.left;
                }
            }
            //right side
            if (node1.right != null || node2.right != null) {
                if (node1.right != null && node2.right != null) {
                    mergedNode.right = new TreeNode(node1.right.val + node2.right.val);
                    stack.push(new TreeNode[]{node1.right, node2.right, mergedNode.right});
                } else {
                    mergedNode.right = (node1.right != null) ? node1.right : node2.right;
                }
            }
        }
        return resultRoot;
    }
}
