import java.util.HashMap;
import java.util.Stack;

public class Next_Greater_Element_I {
    class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
            int curr = nums2[i];
            while(!st.isEmpty() && st.peek() <= curr){
                st.pop();
            }
            if(st.isEmpty()){
                map.put(nums2[i],-1);
            }else{
                map.put(nums2[i],st.peek());
            }
            st.push(curr);
        }
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                nums1[i] = map.get(nums1[i]);
            }
        }
        return nums1;
    }
    //
}
}
