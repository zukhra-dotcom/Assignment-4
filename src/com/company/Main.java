package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        public int deepestLeavesSum(TreeNode root) {
            Queue<TreeNode> queue=new LinkedList<>();
            queue.add(root);
            int sum=0;

            while(!queue.isEmpty()){
                int size=queue.size();
                sum=0;

                for(int i=0;i<size;i++){
                    TreeNode curr=queue.poll();
                    sum+=curr.val;

                    if(curr.left!=null) queue.add(curr.left);
                    if(curr.right!=null) queue.add(curr.right);
                }
            }
            return sum;
        }
    }
}
