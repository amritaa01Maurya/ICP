package phase_4.week2;

import java.util.Stack;

public class valid_par2 {
    public static boolean checkValidString(String s) {
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '('){
                st.push(i);
            }else if(s.charAt(i) == '*'){
                st2.push(i);
            }else{
                if(!st.isEmpty()){
                    st.pop();
                }
                else if(!st2.isEmpty()){
                    st2.pop();
                }else{
                    return false;
                }
            }
        }
        while(!st.isEmpty() && !st2.isEmpty()){
            if(st.pop() > st2.pop()){
                return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String s = "(**(*()**()**((**(*)";
        
        System.out.println(checkValidString(s));
    }
}
