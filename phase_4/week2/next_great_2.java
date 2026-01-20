package phase_4.week2;

import java.util.*;

public class next_great_2{
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i= n - 1;i >= 0;i--){
            while(!st.isEmpty() && nums[st.peek()] <= nums[i]){
                st.pop();
            }

            ans[i] = st.isEmpty() ? -1:nums[st.peek()];

            st.push(i);
        }
        for(int i= n - 1;i >= 0;i--){
            while(!st.isEmpty() && nums[st.peek()] <= nums[i]){
                st.pop();
            }

            ans[i] = st.isEmpty() ? -1:nums[st.peek()];

            st.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int[] ans = nextGreaterElements(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}