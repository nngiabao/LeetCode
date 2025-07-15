package BinaryTree;

import com.sun.source.tree.Tree;

import java.util.Stack;

public class ConstructBinTree2_106 {
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
    //Solution 1:Using stack
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (postorder.length == 0) return null;

        int n = postorder.length;
        int inorderIndex = n - 1;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = new TreeNode(postorder[n - 1]);
        stack.push(root);

        for (int i = n - 2; i >= 0; i--) {
            int currVal = postorder[i];
            TreeNode node = stack.peek();

            if (node.val != inorder[inorderIndex]) {
                // Case 1: Not matching inorder → must be right child
                node.right = new TreeNode(currVal);
                stack.push(node.right);
            } else {
                // Case 2: Matches inorder → pop stack to find parent for left child
                while (!stack.isEmpty() && stack.peek().val == inorder[inorderIndex]) {
                    node = stack.pop();
                    inorderIndex--;
                }
                // Now currVal is left child of the last popped node
                node.left = new TreeNode(currVal);
                stack.push(node.left);
            }
        }

        return root;
    }
}
