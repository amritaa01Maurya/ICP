package Day9;

import Day9.Remove_Duplicates_from_Sorted_List.ListNode;

public class Palindrome_Linked_List {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
 
    public static class Solution {
        public boolean isPalindrome(ListNode head) {
            if(head == null || head.next == null){
                return true;
            }

            ListNode slow = head;
            ListNode fast = head;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }

            ListNode curr = slow;
            ListNode prev = null;
            ListNode ahead;
            while(curr != null){
                ahead = curr.next;
                curr.next = prev;
                prev = curr;
                curr = ahead;
            }

            ListNode last = prev;
            ListNode first = head;

            while(last != null){
                if(first.val != last.val){
                    return false;
                }
                first = first.next;
                last = last.next;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        ListNode n5 = new ListNode(1);
        ListNode n4 = new ListNode(2, n5);
        ListNode n3 = new ListNode(1, n4);
        ListNode n2 = new ListNode(3, n3);
        ListNode head = new ListNode(1, n2);

        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
        
        boolean result = sol.isPalindrome(head);

        System.out.println(result);
    }

}
