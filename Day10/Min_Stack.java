// package Day10;

import java.util.*;

public class Min_Stack{
    static class MinStack {
        Stack<Integer> st;
        Stack<Integer> minst = new Stack<>();
        public MinStack() {
            st = new Stack<>();
        }
    
        public void push(int val) {
            st.push(val);
            if(minst.isEmpty() ||  val <= minst.peek()){
                minst.push(val);
            }
        }
        
        public void pop() {
            if(minst.peek().equals(st.peek())){
                minst.pop();
            }
            st.pop();
        }
        
        public int top() {
            return st.isEmpty() ? - 1 : st.peek();
        }
        
        public int getMin() {
            return minst.isEmpty() ? - 1 : minst.peek();
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
    public static void main(String[] args){
        MinStack obj = new MinStack();
        
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        System.out.println(obj.getMin()); 
        obj.pop();
        System.out.println(obj.top());    
        System.out.println(obj.getMin()); 
    }
}