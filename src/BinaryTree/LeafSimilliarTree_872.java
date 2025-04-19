package BinaryTree;

import java.util.*;

public class LeafSimilliarTree_872 {
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

    //Solution 1:
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        //
        if (root1 == null || root2 == null) return true;
        //
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        //count leaf
        countLeaf(root1, list1);
        countLeaf(root2, list2);
        //check
        if(list1.size() != list2.size()) return false;
        else{
            for (int i = 0; i < list1.size(); i++) {
                if (list1.get(i) != list2.get(i)) return false;
            }
        }
        return true;
    }

    //get leaf
    public void countLeaf(TreeNode root, List<Integer> list) {
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
//
            if (node.left == null && node.right == null) list.add(node.val);
            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
        }
    }
}
