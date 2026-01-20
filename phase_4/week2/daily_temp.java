package phase_4.week2;

import java.util.*;

public class  daily_temp{
    public static int[] dailyTemperatures(int[] temperatures) {
        int n =temperatures.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i= n - 1;i >= 0;i--){
            while(!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]){
                st.pop();
            }

            ans[i] = st.isEmpty() ? 0:st.peek() - i;

            st.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {73,74,71,69,72,76,73};

        int[] ans = dailyTemperatures(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}