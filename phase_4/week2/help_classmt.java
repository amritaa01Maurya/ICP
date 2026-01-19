package phase_4.week2;

import java.util.Stack;

public class help_classmt {
    public static int[] help_classmate(int arr[], int n) {
        // Your code goes here
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i =n -1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            int NGE = st.isEmpty() ? -1: arr[st.peek()];
            ans[i] = NGE;
            st.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3,8,5,2,25};
        int n = 5;
        int[] ans = help_classmate(arr, n);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
