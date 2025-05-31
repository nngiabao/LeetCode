package BinaryTree;

import java.util.*;

public class BinTreeLevelOrderTraversal_102 {
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

        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> level = new ArrayList<>();
            if(root == null) return res;
            //
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()) {
                int size = queue.size();
                int i=0;
                level = new ArrayList<>();
                while(i<size) {
                    TreeNode node = queue.poll();
                    level.add(node.val);
                    if(node.left != null) queue.add(node.left);
                    if(node.right != null) queue.add(node.right);
                    i++;
                }
                res.add(level);
            }
            return res;
        }
    }
}
