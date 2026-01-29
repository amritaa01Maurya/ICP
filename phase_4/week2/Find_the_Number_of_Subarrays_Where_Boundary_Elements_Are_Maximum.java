package phase_4.week2;

import java.util.*;;

public class Find_the_Number_of_Subarrays_Where_Boundary_Elements_Are_Maximum {
    public static long numberOfSubarrays(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        long[] dp = new long[n];// valid subarray ending at idx i
        Arrays.fill(dp, 1);

        long count = 0;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()] <= nums[i]){
                if(nums[st.peek()] == nums[i]){
                    dp[i] += dp[st.peek()];// we found prev ele with max boundary ele, include it in current idx
                }
                st.pop();
            }

            count += dp[i];// valid subarray ending at i idx
            st.push(i);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,3,3,2};

        System.out.println(numberOfSubarrays(arr));
    }
}
