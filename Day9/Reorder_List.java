package Day9;

public class Reorder_List {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static class Solution {
        public void reorderList(ListNode head) {
            if(head == null || head.next == null){
                return;
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

            curr = head;
            ListNode curr2;
            ListNode prev2;
            while(prev.next != null){
                curr2 = curr.next;
                prev2 = prev.next;
                curr.next = prev;
                prev.next = curr2;
                curr = curr2;
                prev = prev2;
            }
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();

        ListNode n5 = new ListNode(5);
        ListNode n4 = new ListNode(4, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode head = new ListNode(1, n2);

        ListNode temp = head;
        System.out.println("Before");
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
        sol.reorderList(head);

        ListNode curr = head;
        System.out.println("After");
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}
