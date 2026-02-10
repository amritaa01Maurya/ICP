package phase_4.week5;

import java.util.*;

public class Even_Odd_Tree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static boolean isEvenOddTree(TreeNode root) {
        int level = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int len =q.size();
            int prevVal = level % 2 == 1 ? 1000001 : 0;

            for(int i=0;i<len;i++){
                TreeNode curr = q.poll();
                
                // if even level, check odd parity and strictly +ing
                if(level % 2 == 0){
                    if(curr.val % 2 == 0 || curr.val <= prevVal){
                        return false;
                    }
                }else{
                     if(curr.val % 2 == 1 || curr.val >= prevVal){
                        return false;
                    }
                }

                // update prev val
                prevVal = curr.val;

                // add curr node children in q
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            
            level++;
        }
        return true;
    }

    public static void main(String[] args) {
        
    }
}
