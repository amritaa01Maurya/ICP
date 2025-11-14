package Day12;

import java.util.Stack;

public class Decode_String {
    class Solution {
    public String decodeString(String s) {
        Stack<StringBuilder> chars = new Stack<>();
        Stack<Integer> nums = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int k=0;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                k = k * 10 + (ch-'0');
            }
            else if(ch == '['){
                chars.push(sb);
                nums.push(k);
                sb = new StringBuilder();
                k=0;
            }else if(ch == ']'){
                int count = nums.pop();
                StringBuilder t = sb;
                sb = chars.pop();
                while(count-- > 0){
                    sb.append(t);
                } 
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
}
