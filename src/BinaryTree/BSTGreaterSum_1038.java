package BinaryTree;

import java.util.*;

public class BSTGreaterSum_1038 {
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

    //Solution 1:Using custom class
    class CustomNode{
        boolean isVisited;
        TreeNode node;
        public CustomNode(boolean isVisited, TreeNode node) {
            this.isVisited = isVisited;
            this.node = node;
        }
    }
    public TreeNode bstToGst(TreeNode root) {
        //travel in-order
        //but when u sum you have to go from right -> root -> left
        //why ?
        //because we sum from greater node
        Stack<CustomNode> stack = new Stack<>();
        //
        stack.push(new CustomNode(false, root));
        int sum =0;
        while(!stack.isEmpty()) {
            CustomNode curr = stack.pop();
            if(curr == null) continue; //this is edge case to check leaf
            if(!curr.isVisited) {
                if(curr.node.left != null) stack.push(new CustomNode(false, curr.node.left));
                //add the current node
                stack.push(new CustomNode(true, curr.node));
                if(curr.node.right != null) stack.push(new CustomNode(false, curr.node.right));
            }else{
                //if this one visited => update value
                sum += curr.node.val;
                curr.node.val = sum;
            }
        }
        return root;
    }
}
