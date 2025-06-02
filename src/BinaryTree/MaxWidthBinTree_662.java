package BinaryTree;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MaxWidthBinTree_662 {
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
        int index;
        TreeNode node;
        public Pair(int index, TreeNode node) {
            this.index = index;
            this.node = node;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        //
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(0,root));
        int maxWidth = 0;
        //
        int leftMost = 0, rightMost = 0;
        //TreeNode leftMost = null, rightMost = null;
        while(!queue.isEmpty()) {
            //
            int i=0;
            int size = queue.size();
            leftMost = -1;rightMost = -1;
            while(i < size) {
                Pair p = queue.poll();
                TreeNode curr = p.node;
                int index = p.index;
                //check first max width
                if(leftMost == -1)  leftMost = index;
                if(i == size-1)  rightMost = index;
                //
                if(curr.left != null) queue.add(new Pair(index*2, curr.left));
                //
                if(curr.right != null) queue.add(new Pair(index*2+1, curr.right));
                i++;
            }
            if(leftMost != -1 && rightMost != -1 && leftMost != rightMost)
                maxWidth = Math.max(maxWidth, rightMost-leftMost+1);
            //else return maxWidth;
        }
        return maxWidth;
    }
}
