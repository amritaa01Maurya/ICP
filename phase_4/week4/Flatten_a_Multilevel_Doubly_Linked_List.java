package phase_4.week4;

import java.util.Stack;
/*
codechef



    Flatten a Linked List
Alice has a strange singly-linked list. A usual singly linked-list or a not-strange linked list consist of nodes pointing to exactly one node ( except for the the tail node which points to null ). However, in case of a strange singly-linked list, instead of pointing towards a single linked-list node, some nodes of the linked-list are pointing towards two nodes! Each node in the strange linked-list has two pointers named :

next
child
The “child” pointer of a node may again point towards a strange singly linked list.

Alice wants to restructure this linked-list into a not-strange linked list. While doing so, she must follow the following rules.

Let cur be a node in restructured linked-list, then

cur.next must occur after cur in the restructured linked-list.
All the nodes ( if any ) which are part of cur.child linked list must occur after the node cur and before the node cur.next in the restructured linked list.
Let cur be a node in the restructured linked-list, then cur.child must be “null”.
NOTE : Refer to sample case for a visual depiction.

Input Format
The first line of the input contains a single integer T - the number of test cases. The description of T test cases follows.

The first line of each test case contains a single integer 
N
N.

The following 
N
−
1
N−1 lines contain three space separated integers 
u
,
v
u,v and 
t
y
p
e
type. If the value of 
t
y
p
e
type is equal to 0, then the next pointer of node with value equal to 
u
u points towards the node with value equal to 
v
v. If the value of type is equal to 1, then the child pointer of node with value equal to 
u
u points towards the node with value equal to 
v
v.

For C++ language, you need to:

Complete the function in the submit solution tab:

bool flatten(Node* head){ . . . }

Output Format
For each test case, the function you complete should return the restructured linked-list.

Constraints
1
≤
T
≤
100
1≤T≤100
1
≤
N
≤
2
∗
10
5
1≤N≤2∗10 
5
 
It is guaranteed that the sum of 
N
N over all test cases is less than or equal to 
3
∗
10
5
3∗10 
5
 .
Subtasks
5 points : There is at most one node whose child pointer in NOT null. All the other nodes have their child pointers as null pointer.
95 points : ORIGINAL CONSTRAINTS
Sample 1:
Input
Output
1
9
4 7 1
1 2 0
2 3 0
6 9 0
3 6 0
2 4 1
4 8 0
6 5 1
*/

public class Flatten_a_Multilevel_Doubly_Linked_List {

    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    };


class Solution {
    public Node flatten(Node head) {
        Node curr = head;

        Stack<Node> st = new Stack<>();
        while(curr != null){
            if(curr.child != null){// curr node have child go to the end 
                if(curr.next != null){// store its next node to connect after we traverse from child brach
                    st.push(curr.next);
                }

                // here flatten the child branch with curr node
                curr.next = curr.child;
                curr.child.prev = curr;
                curr.child = null;
            }
            if(curr.next == null && !st.isEmpty()){// if we are at the end of child branch
                Node node = st.pop();
                curr.next = node;
                node.prev = curr;
            }

            curr = curr.next;
        }
        return head;
    }

}

}