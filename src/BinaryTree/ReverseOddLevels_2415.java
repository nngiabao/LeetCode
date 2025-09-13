package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReverseOddLevels_2415 {
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

    public TreeNode reverseOddLevels(TreeNode root) {
        //
        int height = 0;
        //Queue to store the the node
        Queue<TreeNode> queue = new LinkedList<>();
        //at odd height we swap
        queue.add(root);
        //Queue to store the parent node
        while (!queue.isEmpty()) {
            int size = queue.size();
            //BFS
            List<TreeNode> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            //
            //check height
            if ((height & 1) == 1) {
                //odd => swap
                int l = 0, r = list.size() - 1;
                while (l < r) {
                    //
                    //
                    int temp = list.get(l).val;
                    list.get(l).val = list.get(r).val;
                    list.get(r).val = temp;
                    l++;
                    r--;
                }
            }
            height++;
        }
        //
        return root;
    }
}
