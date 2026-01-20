package phase_4.week2;

import java.util.Stack;

public class ast_coll {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for(int ast:asteroids){
            if(ast > 0){
                st.push(ast);
            }else{
                while(!st.isEmpty() && st.peek() > 0 && Math.abs(ast) > st.peek()){
                    st.pop();
                }
                if(st.isEmpty() || st.peek() < 0){
                    st.push(ast);
                }
                if(st.peek() > 0 && st.peek() == Math.abs(ast)){
                    st.pop();
                }
            }
        }
        if(st.isEmpty()){
            return new int[0];
        }
        int[] ans = new int[st.size()];
        int idx = 0;
        for(int s:st){
            ans[idx++] = s;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,-6,2,-1,4};

        int[] ans = asteroidCollision(arr);
    }
}
