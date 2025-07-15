package BinaryTree;

import java.util.Stack;

public class ConstructBinTree_105 {
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

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) return null;
//
        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = new TreeNode(preorder[0]);
        stack.push(root);

        int inorderIndex = 0;

        for (int i = 1; i < preorder.length; i++) {
            int currVal = preorder[i];
            TreeNode node = stack.peek();

            if (node.val != inorder[inorderIndex]) {
                // current val is left child
                node.left = new TreeNode(currVal);
                stack.push(node.left);
            } else {
                // backtrack to find the parent to attach the right child
                while (!stack.isEmpty() && stack.peek().val == inorder[inorderIndex]) {
                    node = stack.pop();
                    inorderIndex++;
                }
                node.right = new TreeNode(currVal);
                stack.push(node.right);
            }
        }

        return root;
        //
    }
}
