package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxDiffBetweenNodeAndAncestor_1026 {
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

    class CustomeNode {
        TreeNode node;
        int min;
        int max;

        public CustomeNode(TreeNode node, int min, int max) {
            this.node = node;
            this.min = min;
            this.max = max;
        }
    }

    public int maxAncestorDiff(TreeNode root) {
        if (root == null) return 0;
        int res = 0;
        Queue<CustomeNode> queue = new LinkedList<>();
        queue.add(new CustomeNode(root, root.val, root.val));

        while (!queue.isEmpty()) {
            CustomeNode s = queue.poll();
            TreeNode cur = s.node;

            // update result
            res = Math.max(res, Math.max(Math.abs(cur.val - s.min), Math.abs(cur.val - s.max)));

            // push children
            if (cur.left != null) {
                queue.add(new CustomeNode(cur.left,
                        Math.min(s.min, cur.left.val),
                        Math.max(s.max, cur.left.val)));
            }
            if (cur.right != null) {
                queue.add(new CustomeNode(cur.right,
                        Math.min(s.min, cur.right.val),
                        Math.max(s.max, cur.right.val)));
            }
        }
        return res;
    }
}
