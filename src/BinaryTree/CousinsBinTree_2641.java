package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class CousinsBinTree_2641 {

    public static class TreeNode {
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

    //class Pair
    class Pair {
        TreeNode parent;
        TreeNode curr;

        public Pair(TreeNode prev, TreeNode curr) {
            this.parent = prev;
            this.curr = curr;
        }
    }

    public TreeNode replaceValueInTree(TreeNode root) {
        if (root == null) return null;
        //
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, root));
        //
        int prev_sumLevel = 0;
        while (!queue.isEmpty()) {
            int i = 0;
            int size = queue.size();
            while (i < size) {
                Pair pair = queue.poll();
                TreeNode curr = pair.curr;
                TreeNode parent = pair.parent;
                int sumLevel = prev_sumLevel;
                prev_sumLevel = 0;
                //edge case
                if (curr == root) curr.val = 0;
                else{
                    int temp =sumLevel;
                    //check siblings sum
                    int right = (parent.right != null) ? parent.right.val : 0;//right child
                    int left = (parent.left != null) ? parent.left.val : 0;//left child
                    //
                    curr.val = temp - (right + left);
                }
                //check  child node
                if (curr.left != null) {
                    prev_sumLevel += curr.left.val;
                    queue.offer(new Pair(curr, curr.left));
                }
                //
                if (curr.right != null) {
                    prev_sumLevel += curr.right.val;
                    queue.offer(new Pair(curr, curr.right));
                }
                i++;
            }
        }
        return root;
    }
    public static void main(String[] args) {
        CousinsBinTree_2641 a = new CousinsBinTree_2641();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(9);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(10);

        root.right.right = new TreeNode(7);
        a.replaceValueInTree(root);
    }
}
