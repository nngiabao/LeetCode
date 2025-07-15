package LinkedList;

import java.util.Stack;

public class BinSearchTree_178 {
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

    Stack<TreeNode> stack;

    //
    public BinSearchTree_178(TreeNode root) {
        stack = new Stack<TreeNode>();
        //move far left as asap
        pushLeftPath(root);
        //
    }

    // Push all left nodes to the stack
    void pushLeftPath(TreeNode node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }

    //
    public int next() {
        //check the right
        TreeNode node = stack.pop();
        //before we pop the node we have to check if it
        while (node.right != null) {
            pushLeftPath(node.right);
        }
        return node.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();//stack still have element
    }
}
