package BinaryTree;

import com.sun.source.tree.Tree;

import java.util.*;

class CousinsBinTree_993 {
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
    //Solution 1:Using BFS queue
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null) return false;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            int i=0,size = q.size();
            boolean xFound = false,yFound = false;
            while(i < size){
                TreeNode curr = q.poll();
                //check same parrent or not first
                if(curr.left != null && curr.right != null){
                    int l = curr.left.val, r = curr.right.val;
                    if((x==l && y==r) || (x==r && y==l)) return false;
                }
                //
                if(x == curr.val) xFound = true;
                if(y == curr.val) yFound = true;
                //
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
                //if(xFound && yFound) return false;
            }
            if(xFound && yFound) return true;
            //because every node is unique
            //so if this x or y appears but another doesnt => cant not be cousin
            if(xFound ||  yFound) return false;
        }
        return false;
    }
}