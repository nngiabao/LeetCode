package BinaryTree;

import java.util.*;
import java.util.Stack;

public class SmallestSubTree_865 {
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

    class Pair{
        TreeNode prev;
        TreeNode curr;
        public Pair(TreeNode prev, TreeNode curr) {
            this.prev = prev;
            this.curr = curr;
        }
    }

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if (root == null) return null;
        //
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root,root));
        TreeNode prev = null;
        while (!queue.isEmpty()) {
            int i=0;
            int size= queue.size();
            prev = null;
            while(i < size){
                Pair p = queue.poll();
                TreeNode curr = p.curr;
                TreeNode c_prev = p.prev;                //
                if(prev == null) prev = c_prev;
                else if(prev.val > c_prev.val) prev = c_prev;
                //
                if(curr.left != null) queue.offer(new Pair(curr,curr.left));
                if(curr.right != null) queue.offer(new Pair(curr,curr.right));
                i++;
            }
        }
        return prev;
    }
}
