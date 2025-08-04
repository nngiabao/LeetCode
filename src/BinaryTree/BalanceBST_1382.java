package BinaryTree;

import java.util.*;

public class BalanceBST_1382 {
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

    // List to store in-order traversal
    List<Integer> sortedList = new ArrayList<>();

    public TreeNode balanceBST(TreeNode root) {
        // Step 1: Get sorted values via in-order traversal
        inOrder(root);

        // Step 2: Build balanced BST from sorted list
        return buildBalancedTree(0, sortedList.size() - 1);
    }

    private void inOrder(TreeNode node) {
        if (node == null) return;
        inOrder(node.left);
        sortedList.add(node.val);
        inOrder(node.right);
    }

    private TreeNode buildBalancedTree(int left, int right) {
        if (left > right) return null;

        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(sortedList.get(mid));
        node.left = buildBalancedTree(left, mid - 1);
        node.right = buildBalancedTree(mid + 1, right);
        return node;
    }
}

