class Solution {
    public String removeKdigits(String s, int k) {
        Stack<Integer> st = new Stack<>();
        st.push(s.charAt(0)-'0');
        for(int i=1;i<s.length();i++){
            int n = s.charAt(i)-'0';
            while(!st.isEmpty() && st.peek() > n && k > 0){
                st.pop();
                k--;
            }
            st.push(n);
        }
        while(k > 0 && !st.isEmpty()){
            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        for(int n: st){
            sb.append(n);
        }
        while(!sb.isEmpty() && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.isEmpty()?"0":sb.toString();
    }
}
