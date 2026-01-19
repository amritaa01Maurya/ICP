package phase_4.week2;

import java.util.*;

public class valid_par {
    public static boolean solve(String s){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            }else{
                if(s.charAt(i) == ')' && st.peek() == '('){
                    st.pop();
                }
                if(s.charAt(i) == '}' && st.peek() == '{'){
                    st.pop();
                }
                if(s.charAt(i) == ']' && st.peek() == '['){
                    st.pop();
                }

            }
        }
        return st.isEmpty();
    }

    // public static boolean solve(String s){
    //     int count = 0;
    //     for (int i = 0; i < s.length(); i++) {
    //         if(s.charAt(i) == '('){
    //             count++;
    //         }else{
    //             count--;
    //         }

    //         if(count < 0){
    //             return false;
    //         }
    //     }
    //     return count == 0;
    // }

    public static void main(String[] args) {
        // String s = "(((()))())";
        String s = "()[]{}";

        System.out.println(solve(s));
    }
}
