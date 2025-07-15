package BinaryTree;

import com.sun.source.tree.Tree;

import java.util.*;
public class LCABinTree_236 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    //
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //
        if(root == null) return null;
        //
        Map<TreeNode,TreeNode> map = new HashMap<>(); //dung de store value cua parent
        Set<TreeNode> set = new HashSet<>();
        Stack<TreeNode> stack = new Stack<>();
        map.put(root, null);//root k co cha
        stack.push(root);
        //step 1 build ascentor
        while (!map.containsKey(q) || !map.containsKey(p)) {
            TreeNode node = stack.pop();
            if(node.left != null){
                stack.push(node.left);
                map.put(node.left, node);
            }
            if(node.right != null){
                stack.push(node.right);
                map.put(node.right, node);
            }
        }
        //step 2: put p in the set => to find p or q
        while(p != null){ //no chay 1 hoi len thang root
            set.add(p);//add nhung thang cha cua cai node p
            p = map.get(p);
        }
        //step 3: find the lca p and q
        //tim nhung thang con lai cua not q
        while(!set.contains(q)){
            q = map.get(q);
        }
        return q;
    }
}
