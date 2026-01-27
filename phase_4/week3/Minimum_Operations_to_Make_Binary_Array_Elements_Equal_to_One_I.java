package phase_4.week3;

import java.util.LinkedList;
import java.util.Queue;

public class Minimum_Operations_to_Make_Binary_Array_Elements_Equal_to_One_I{
    public static int minOperations(int[] nums) {
        int n = nums.length;
        Queue<Integer> q = new LinkedList<>();

        int flip = 0;
        for(int i=0;i < n;i++){
            while(!q.isEmpty() && q.peek() + 2 < i ){// in q the flip is not affecting curr ele remove it
                q.poll();
            }
            // (ele + no. of flips affecting it) 
            if((nums[i] + q.size()) % 2 == 0){// if ele is 0(check if there is flip effecting it)
                if(i + 2 >= n){ // if last 2 ele is zero then we can not apply 3 cons. flipping rule in it
                    return -1;
                }
                flip++;
                q.add(i);// here we flip the ele so add it
            }
        }

        return flip;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,1,1,0,0};
        System.out.println(minOperations(arr));
    }
}