package BinaryTree;

import java.util.*;
public class FindLargestValueEachRow_515 {
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

    public List<Integer> largestValues(TreeNode root) {
        if(root == null) return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        //
        int max = Integer.MIN_VALUE;
        while (!queue.isEmpty()) {
            int size = queue.size();
            int i=0;
            max= Integer.MIN_VALUE;
            while (i < size) {
                TreeNode node = queue.poll();
                max = Math.max(max, node.val);
                //
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
                i++;
            }
            res.add(max);
        }
        return res;
    }
}
