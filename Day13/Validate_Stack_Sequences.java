package Day13;

import java.util.Stack;

public class Validate_Stack_Sequences {
    class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n = pushed.length;
        int j = 0;
        int i =0;
        Stack<Integer> st = new Stack<>();
        while(i < n && j < n){
            st.push(pushed[i]);
            while(!st.isEmpty() && st.peek() == popped[j]){
                st.pop();
                j++;
            }
            i++;
        }
        return st.isEmpty() ? true : false;
    }
}
}
