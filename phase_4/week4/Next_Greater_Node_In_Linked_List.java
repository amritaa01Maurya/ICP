package phase_4.week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Next_Greater_Node_In_Linked_List {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static int[] nextLargerNodes(ListNode head) {
        ListNode curr = head;

        List<Integer> l =new ArrayList<>();

        while(curr != null){
            l.add(curr.val);
            curr = curr.next;
        }
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[l.size()];
        for(int i=l.size()-1;i>=0;i--){
            while(!st.isEmpty() && l.get(st.peek()) <= l.get(i)){
                st.pop();
            }

            ans[i] = st.isEmpty() ? 0 : l.get(st.peek());

            st.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,4,3,5};

        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;

        for (int i = 1; i < arr.length; i++) {
            ListNode node = new ListNode(arr[i]);
            curr.next = node;
            curr = node;
        }

        int[] ans = nextLargerNodes(head);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}
