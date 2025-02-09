package BinaryTree;

import com.sun.source.tree.Tree;

import java.util.*;

public class BinaryTreePath_257 {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        //node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(5);
        node.right.left = new TreeNode(5);
        node.right.right = new TreeNode(3);
        System.out.println(binaryTreePaths(node));
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

    //custom class to store path at that node
    static class Pair{
        String path;
        TreeNode node;

        public Pair(String path, TreeNode node){
            this.path = path;
            this.node = node;
        }
    }

    //Solution 1: use stack
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        Stack<Pair> stack = new Stack<>();
        if(root == null) return res;
        stack.push(new Pair(Integer.toString(root.val),root));

        while(!stack.isEmpty()) {
            Pair p = stack.pop();
            //check leaf first
            if(p.node.left == null && p.node.right == null){
                res.add(p.path);
            }

            if(p.node.left != null){
                stack.push(new Pair(p.path+"->"+p.node.left.val,p.node.left));
            }

            if(p.node.right != null){
                stack.push(new Pair(p.path+"->"+p.node.right.val,p.node.right));
            }
        }
        return res;
    }

    //Recursion

    //DFS
    public static String DFS(TreeNode root) {
        if(root.left == null && root.right == null) return Integer.toString(root.val);
        if(root.left != null) return root.val + "->" + DFS(root.left);
        return root.val + "->" + DFS(root.right);
    }
}
