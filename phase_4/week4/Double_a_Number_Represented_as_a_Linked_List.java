package phase_4.week4;

public class Double_a_Number_Represented_as_a_Linked_List {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
 

    public static int solve(ListNode curr) {
        if(curr == null){
            return 0;
        }
        int val = 2 * curr.val + solve(curr.next);

        int carry = val / 10;// take carry
        int dig = val % 10;// take unit digit
        curr.val = dig;// change curr val to dig

        return carry;// return the carry for prev node
    }
    public static ListNode doubleIt(ListNode head) {
        
        int carry = solve(head);
        if(carry != 0){
            ListNode newHead = new ListNode(carry);
            newHead.next = head;
            return newHead;
        }

        return head;
    }

    public static void main(String[] args) {
        int[] arr = {9,9,9};

        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;

        for (int i = 1; i < arr.length; i++) {
            ListNode node = new ListNode(arr[i]);
            curr.next = node;
            curr = node;
        }

        ListNode newHead = doubleIt(head);

        while(newHead != null){
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }

    
}
