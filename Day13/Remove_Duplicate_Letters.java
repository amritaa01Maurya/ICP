package Day13;

import java.util.Stack;

public class Remove_Duplicate_Letters {
    class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> st = new Stack<>();
        int[] freq = new int[26];
        boolean[] stack = new boolean[26];
        for(char ch: s.toCharArray()){
            freq[ch - 'a']++;
        }
        for(char ch: s.toCharArray()){
            freq[ch - 'a']--;
            if(stack[ch - 'a']) continue;
            while(!st.isEmpty() && st.peek() > ch && freq[st.peek() - 'a'] > 0){
                stack[st.pop() - 'a'] = false;
            }
            st.push(ch);
            stack[ch - 'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        for(char ch: st){
            sb.append(ch);
        }
        return sb.toString();
    }
    // 
}
}
