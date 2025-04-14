package BST;

import java.util.*;

public class ModeInBST_501 {
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

    //Soltion 1: hash map + stack (bad)
    public int[] findMode(TreeNode root) {
        //pq to find mode
        if(root == null) return new int[0];
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            //save to map
            if(map.containsKey(node.val)) map.put(node.val, map.get(node.val) + 1);
            else map.put(node.val, 1);
            //
            if(node.left != null) stack.push(node.left);
            if(node.right != null) stack.push(node.right);
        }
        //find mode
        ArrayList<Integer> res = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            int val = entry.getValue();
            int key = entry.getKey();
            if(val >= max){
                if(max == val) res.add(entry.getKey());
                else{
                    max = val;
                    res.clear();
                    res.add(key);
                }
            }
        }
        //return int
        return res.stream().mapToInt(i->i).toArray();
    }
    //Solution 2:

}
