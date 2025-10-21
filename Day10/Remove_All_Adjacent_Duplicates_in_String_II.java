import java.util.Stack;

public class Remove_All_Adjacent_Duplicates_in_String_II {
    class Solution {
    class Pair{
        char ch;
        int freq;

        public Pair(char ch, int freq){
            this.ch=ch;
            this.freq= freq;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<Pair> st = new Stack<>();
        for(char c: s.toCharArray()){
            if(!st.isEmpty() && st.peek().ch == c){
                st.peek().freq++;
            }else{
                st.push(new Pair(c, 1));
            }
            if(st.peek().freq == k){
                st.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        for(Pair p: st){
            while(p.freq-- > 0){
                sb.append(p.ch);
            }
        }
        return sb.toString();
    }
}
}
