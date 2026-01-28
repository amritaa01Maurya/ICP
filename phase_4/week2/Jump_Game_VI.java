package phase_4.week2;

import java.util.*;

public class Jump_Game_VI {

    public static int maxResult(int[] nums, int k) {
        int n = nums.length;
        int[] dp = new int[n];

        dp[0] = nums[0];
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(0);

        for(int i=1;i<n;i++){
            while(!dq.isEmpty() && dq.peekFirst() < i - k){
                dq.pollFirst();
            }

            dp[i] = nums[i] + nums[dq.peekFirst()];

            while(!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]){
                dq.pollLast();
            }
            dq.addLast(i);
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        int[] arr = {}
    }
    
}
