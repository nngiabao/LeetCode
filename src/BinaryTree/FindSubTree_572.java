package BinaryTree;

import java.util.*;

public class FindSubTree_572 {
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

    //Solution 1: Stack
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        //find root node start
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            //find until meet subRoot
            if(node.val == subRoot.val && isSubTree(node, subRoot)){
                return true;
            }else{
                //keep going
                if(root.left != null) stack.push(root.left);
                if(root.right != null) stack.push(root.right);
            }
        }
        return false;
    }

    public static boolean isSubTree(TreeNode node1, TreeNode node2) {
        Stack<TreeNode[]> stack = new Stack<>();
        stack.push(new TreeNode[]{node1, node2});
        while (!stack.isEmpty()) {
            TreeNode[] nodes = stack.pop();
            TreeNode node = nodes[0];
            TreeNode subNode = nodes[1];
            //if 2 null => no check
            if (node == null && subNode == null) continue;
            //check 2 node (left,right value)
            if (node == null || subNode == null || node.val != subNode.val)
                return false;
            //keep going until detect node of subRoot
            stack.push(new TreeNode[]{node.left, subNode.left});
            stack.push(new TreeNode[]{node.right, subNode.right});
        }
        return true;
    }

}
