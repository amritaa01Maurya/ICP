package phase_4.week2;

public class stack_imp {
    static class Stack{
        int idx = -1;
        int n;
        int[] arr;
        public Stack(int len){
            n = len;
            arr = new int[n];
        }

        public void push(int ele){
            if(idx == n - 1){
                System.out.println("overflow");
                return;
            }
            idx++;
            arr[idx] = ele;
        }

        public int pop(){
            if(idx == -1){
                System.out.println("underflow");
                return -1;
            }
            int top = arr[idx];
            idx--;
            return top;
        }

        public int peek(){
            if(idx == -1){
                System.out.println("underflow");
                return -1;
            }
            int top = arr[idx];
            return top;
        }

        public boolean isEmpty(){
            return idx == -1;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(8);
        st.push(10);
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
    }
}
