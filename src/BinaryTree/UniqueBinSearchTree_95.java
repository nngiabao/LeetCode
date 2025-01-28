package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class UniqueBinSearchTree_95 {
    public List<TreeNode> generateTrees(int n) {
        ArrayList<TreeNode> res = new ArrayList<TreeNode>();
        if(n == 0) return res;
        return buildTree(n,res);
    }

    public static List buildTree(int n, List<TreeNode> res) {
        //build left
        //build right
        return null;
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
