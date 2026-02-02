package phase_4.week4;

import java.util.Stack;

public class Steps_to_Make_Array_Non_decreasing{
    public static int totalSteps(int[] nums) {
        int n = nums.length;
        Stack<int[]> st = new Stack<>();
        int maxStep = 0;
        for(int i=n-1;i>=0;--i){
            int step = 0;
            while(!st.isEmpty() && nums[st.peek()[0]] < nums[i]){//if top less than curr, pop it
                step++;
                step = Math.max(step, st.peek()[1]);
                st.pop();
            }
            maxStep = Math.max(maxStep, step);
            st.push(new int[]{i, step});
        }
        return maxStep;
    }
    public static void main(String[] args) {
        int[] arr = {5,3,4,4,7,3,6,11,8,5,11};

        System.out.println(totalSteps(arr));
    }
}
