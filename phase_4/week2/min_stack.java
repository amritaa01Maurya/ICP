package phase_4.week2;

import java.util.Stack;

public class min_stack {
    static class MinStack {
        Stack<Integer> st;
        Stack<Integer> ms;
        
        public MinStack() {
            st = new Stack<>();
            ms = new Stack<>();
        }
        
        public void push(int val) {
            if(ms.isEmpty() || ms.peek() >= val){
                ms.push(val);
            }
            st.push(val);
        }
        
        public void pop() {
            int val = st.pop();
            if(ms.peek() == val){
                ms.pop();
            }
        }
        
        public int top() {
            return st.peek();
        }
        
        public int getMin() {
            return ms.peek();
        }
    }

    public static void main(String[] args) {
        MinStack ms = new MinStack();

        ms.push(-2);
        ms.push(0);
        ms.push(-3);
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.top());
        System.out.println(ms.getMin());
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
