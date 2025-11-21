package Day13;

import java.util.Stack;

public class Remove_K_Digits {
    class Solution {
    public String removeKdigits(String num, int k) {
        int n =num.length();
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<n;i++){
            int val = num.charAt(i) - '0';
            while(!st.isEmpty() && st.peek() > val && k > 0){
                st.pop();
                k--;
            }
            st.push(val);
        }
        while(k > 0 && !st.isEmpty()){
            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        for(int s: st){
            if(sb.isEmpty() && s == 0) continue;
            sb.append(s);
        }
        return sb.isEmpty()? "0":sb.toString();
    }
}
}
