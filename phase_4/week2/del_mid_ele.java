package phase_4.week2;

import java.util.Stack;

public class del_mid_ele {
    public static void solve(Stack<Integer> st, int currIdx, int n){
        if(currIdx == n/2){
            st.pop();
            return;
        }

        int ele = st.pop();
        solve(st, currIdx + 1, n);

        st.push(ele);
    }
    public static void main(String[] args) {
        int[] arr = {10,20,40,50};
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            st.push(arr[i]);
        }
        solve(st, 0, arr.length);

        while(!st.isEmpty()){
            System.out.print(st.pop() + " ");
        }
    }
}
