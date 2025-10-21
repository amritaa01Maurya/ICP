import java.util.Stack;

public class Basic_Calculator_II {
    class Solution {
    public int calculate(String s) {
        s = s.replaceAll(" ","");
        Stack<Integer> st = new Stack<>();
        int val = 0;
        char op = '+';
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                val = val * 10 + (ch - '0');
            }
            if (!Character.isDigit(ch) || i == s.length() - 1) {
                if(op == '+'){
                    st.push(val);
                }else if(op == '-'){
                    st.push(-val);
                }else if(op == '*'){
                    st.push(st.pop() * val);
                }else{
                    st.push(st.pop() / val);
                }
                val = 0;
                op = ch;
            }
        }
        int ans = 0;
        for(int num: st){
            ans += num;
        }
        return ans;
    }
}
}
