package linked_lists.detect_loop;

/*
PROBLEM STATEMENT
Detect if a loop exists in the given linked list

APPROACH 1 (Followed here)
This is the fastest method and has been described below:
Traverse linked list using two pointers.
Move one pointer(slow_p) by one and another pointer(fast_p) by two.
If these pointers meet at the same node then there is a loop. If pointers do not meet then linked list doesn’t have a loop.
Time Complexity O(n)
Space Complexity O(1)

APPROACH 2 - Hashing
Traverse the list one by one and keep putting the node addresses in a Hash Table.
At any point, if NULL is reached then return false and if next of current node points to
any of the previously stored nodes in Hash then return true.
Time Complexity O(n)
Space Complexity O(n)

 */

public class DetectLoopTest {
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public boolean detectLoop(){
        Node fastPointer = head;
        Node slowPointer = head;
        while (fastPointer!=null && fastPointer.next!=null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (slowPointer == fastPointer){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        DetectLoopTest linkedList = new DetectLoopTest();
        Node node1 = new Node(5);
        linkedList.head = node1;
        Node node2 = new Node(6);
        node1.next = node2;
        node2.next = new Node(7);
        node2.next.next = new Node(8);
        node2.next.next.next = new Node(9);
        Node node5 = new Node(10);
        node5.next = node2;
        node2.next.next.next.next = node5;

        System.out.println("Loop detected: "+linkedList.detectLoop());
    }
}
