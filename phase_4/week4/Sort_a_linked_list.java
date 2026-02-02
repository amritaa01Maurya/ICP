package phase_4.week4;

public class Sort_a_linked_list{
    /*
    Sort a linked list
You recently learned the concept of sorting and want to practice problems to enhance your skills. Chef gave you the task of sorting a linked list to try your skills.

Can you sort the given linked list?

Input Format
First-line will contain 
T
T, the number of test cases. Then the test cases follow.
Each test case contains two lines of input.
The first line of every test case contains an integer 
N
N - the length of array.
The second line of every test case contains 
N
N integers - 
A
1
,
A
2
,
.
.
,
A
N
A 
1
​
 ,A 
2
​
 ,..,A 
N
​
  denoting the integers in the linked list.
You don't need to read or print anything. Just complete the function sort() which takes the head of the linked list as input.
Output Format
Return the head of the sorted linked list.

Constraints
1
≤
T
≤
1000
1≤T≤1000
1
≤
N
≤
10
5
1≤N≤10 
5
 
1
≤
A
i
≤
10
9
1≤A 
i
​
 ≤10 
9
 
∑
N
≤
5
⋅
10
5
∑N≤5⋅10 
5
 
Subtasks
30 points :
1
≤
N
≤
10
3
1≤N≤10 
3
 ,
∑
N
≤
5
⋅
10
3
∑N≤5⋅10 
3
 
70 points : Original Constraints
Sample 1:
Input
Output
3
1
1
3
5 2 7
4
4 1 2 2
1
2 5 7
1 2 2 4
Explanation:
Test Case 1: The is only a single value in the entire linked list

Test Case 3: It is easy to see that the linked list after sorting is 
[
1
,
2
,
2
,
4
]
[1,2,2,4]
    */



     static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
 
    public static ListNode merge(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode curr= temp;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                curr.next = l1;
                curr= curr.next;
                l1 = l1.next;
            }else{
                curr.next = l2;
                curr= curr.next;
                l2 = l2.next;
            }
        }
        while(l1 != null){
            curr.next = l1;
            curr= curr.next;
            l1 = l1.next;
        }

        while(l2 != null){
            curr.next = l2;
            curr= curr.next;
            l2 = l2.next;
        }

        return temp.next;
    }
    public static ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode slow = head;
        ListNode prev = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);

        return merge(l1, l2);
    }
    public static void main(String[] args) {
        int[] arr = {2,7,4,3,5,6};
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;

        for (int i = 1; i < arr.length; i++) {
            ListNode node = new ListNode(arr[i]);
            curr.next = node;
            curr = node;
        }

        ListNode newHead = sortList(head);

        while(newHead != null){
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }
}
