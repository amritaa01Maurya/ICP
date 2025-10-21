import java.util.Stack;

public class Asteroid_Collision {
    class Solution {        
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int ast:asteroids){
            if(ast > 0){
                st.push(ast);
            }else{
                while(!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(ast)){
                    st.pop();
                }
                if(st.isEmpty() || st.peek() < 0){
                  st.push(ast);  
                }
                if(st.peek() == Math.abs(ast)){
                 st.pop();   
                }
            }
        }
        int[] res = new int[st.size()];
        int idx = st.size()-1;
        while(!st.isEmpty()){
            res[idx--] = st.pop();
        }
        return res;
    }
}
}
