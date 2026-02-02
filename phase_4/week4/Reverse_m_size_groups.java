package phase_4.week4;

public class Reverse_m_size_groups {
    /*
    You are given a linked list with 
N
N nodes. You have to perform following commands -

Make groups of size 
M
M from the head node to the last node.
Assuming 
x
x groups are created, you have to reverse the order of nodes in each group.
Relative order of the groups in the final linked list must remain the same i.e after reversing, all the elements of group 
1
1 should appear before group 
2
2 and so on.
In order to solve this problem, you just have to complete the function

Node* reverseMSizeGroups(Node* head, int M) by returning the head node of the linked list

It is guaranteed that 
N
N is divisible by 
M
M for all test cases.

Input Format
First line will contain 
T
T, the number of testcases. Then the testcases follow.
The first line of each test case contains 2 integers 
N
N - length of linked list and 
M
M-group size
Second line of each test case contains 
N
N space separated integers 
v
a
l
1
,
v
a
l
2
,
.
.
.
.
v
a
l
i
,
.
.
.
v
a
l
n
val 
1
​
 ,val 
2
​
 ,....val 
i
​
 ,...val 
n
​
  where 
v
a
l
i
val 
i
​
  is the value stored at ith node starting from the head node.
Note:

For C++ language, you need to:
Complete the function in the submit solution tab:

Node* reverseMSizeGroups(Node* head, int M)
 
 

Output Format
Using the function you complete, for each testcase linked list generated must be the required linked list.

For each test case N space separated integers 
n
v
a
l
1
,
n
v
a
l
2
,
.
.
,
n
v
a
l
i
,
.
.
.
n
v
a
l
N
nval 
1
​
 ,nval 
2
​
 ,..,nval 
i
​
 ,...nval 
N
​
  will be outputted, where 
n
v
a
l
i
nval 
i
​
  is the new value stored at ith node starting from the head node.
Constraints
1
≤
T
≤
10
3
1≤T≤10 
3
 
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
M
≤
10
5
1≤M≤10 
5
 , 
N
N is divisible by 
M
M
1
≤
v
a
l
i
≤
10
5
1≤val 
i
​
 ≤10 
5
 
Sum of 
N
N over all test cases will not exceed 10^5
    
    */

    static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode reverseMGroup(ListNode head, int m) {
        if(head == null){
            return null;
        }

        int i = 0;

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head;

        while(i++ < m){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = reverseMGroup(next, m);

        return prev;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,4,3,5,6};
        int m = 3;
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;

        for (int i = 1; i < arr.length; i++) {
            ListNode node = new ListNode(arr[i]);
            curr.next = node;
            curr = node;
        }

        ListNode newHead = reverseMGroup(head, m);

        while(newHead != null){
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }
}
