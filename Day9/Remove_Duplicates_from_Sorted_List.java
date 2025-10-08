package Day9;

public class Remove_Duplicates_from_Sorted_List {
  
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode curr = head;
            if(head == null){
                return null;
            }
            while(curr.next != null){
                if(curr.val == curr.next.val){
                    curr.next = curr.next.next;
                }else{
                    curr = curr.next;
                }
            }
            return head;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        ListNode n5 = new ListNode(3);
        ListNode n4 = new ListNode(3, n5);
        ListNode n3 = new ListNode(2, n4);
        ListNode n2 = new ListNode(1, n3);
        ListNode head = new ListNode(1, n2);
        // 1 1 2 3 3 
        // 
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();

        ListNode result = sol.deleteDuplicates(head);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
