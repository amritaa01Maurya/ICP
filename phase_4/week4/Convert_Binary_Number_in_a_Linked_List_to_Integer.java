package phase_4.week4;

public class Convert_Binary_Number_in_a_Linked_List_to_Integer {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
 
    public static int getDecimalValue(ListNode head) {
        int mask = 0;
        ListNode curr = head;
        while(curr != null){
            mask = mask << 1;
            mask |= curr.val;
            curr = curr.next;
        }
        return mask;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,1};

        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;

        for (int i = 1; i < arr.length; i++) {
            ListNode node = new ListNode(arr[i]);
            curr.next = node;
            curr = node;
        }
        System.out.println(getDecimalValue(head));
    }
}
