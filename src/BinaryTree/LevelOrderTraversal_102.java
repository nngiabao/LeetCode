package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal_102 {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return res;

        queue.add(root);

        int size = queue.size();
        while(!queue.isEmpty()) {
            size = queue.size();
            List<Integer> row = new ArrayList<>();
            while(size > 0) {
                TreeNode cur = queue.poll();
                size--;
                row.add(cur.val);
                if(cur.left != null ) queue.add(root.left);
                if(cur.right != null ) queue.add(root.right);
            }
            res.add(row);
        }
        return res;
    }

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
}
