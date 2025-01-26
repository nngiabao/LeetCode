package BinaryTree;

import java.util.*;

public class LevelOrderTraversal2_107 {

    public static List<List<Integer>> levelOrder(LevelOrderTraversal2_107.TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            List<Integer> row = new ArrayList<>();
            int size = q.size();
            while (size-- > 0) {
                TreeNode node = q.poll();
                row.add(node.val);
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            res.add(row);
        }
        return res.reversed();
    }

    public class TreeNode {
        int val;
        LevelOrderTraversal2_107.TreeNode left;
        LevelOrderTraversal2_107.TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, LevelOrderTraversal2_107.TreeNode left, LevelOrderTraversal2_107.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
