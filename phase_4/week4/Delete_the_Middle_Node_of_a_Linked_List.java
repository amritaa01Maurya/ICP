package phase_4.week4;

public class Delete_the_Middle_Node_of_a_Linked_List {
    static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
 
    public static ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null;
        }
        ListNode curr = head;
        ListNode slow = head;
        ListNode prev = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,7,1,2,6};
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;

        for (int i = 1; i < arr.length; i++) {
            ListNode node = new ListNode(arr[i]);
            curr.next = node;
            curr = node;
        }

        ListNode newHead = deleteMiddle(head);

        while(newHead != null){
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }
}
