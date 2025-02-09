package BinaryTree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class SymmetricTree_101 {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(2);
        //node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(4);
        node.right.left = new TreeNode(4);
        //node.right.right = new TreeNode(3);

        System.out.println(isSymmetric(node));

    }

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
        //Solution 1: BFS
        public static boolean isSymmetric(TreeNode root) {
            if (root == null) return true;
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            ArrayList<Integer> row;
            int maxNode=2;
            //BFS
            while(!q.isEmpty()) {
                int size=q.size();
                row =new ArrayList<>();
                //
                while(size>0) {
                    TreeNode node = q.poll();
                    if(node == null) row.add(null);
                    else{
                        row.add(node.val);
                        q.add(node.left);
                        q.add(node.right);
                    }
                    size--;
                }
                //check array reflection
                int i=0,j=row.size()-1;
                while(i<j){
                    if(row.get(i) != row.get(j)) return false;
                    i++;
                    j--;
                }
            }
            return true;
        }



}
