package linked_lists.nth_element;

/*
PROBLEM STATEMENT
Find the Nth element in the linked list from the last

SOLUTION
Maintain two pointers – reference pointer and main pointer.
Initialize both reference and main pointers to head.
First, move the reference pointer to n nodes from head.
Now move both pointers one by one until the reference pointer reaches the end.
Now the main pointer will point to nth node from the end. Return the main pointer.

Time Complexity : O(n)
 */

public class FindNthEleLinkedListTest {
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public int findNthElementFromLast(int n){
        Node pointer1 = head;
        Node pointer2 = head;
        int counter = 1;
        while (counter!=n){
            pointer1 = pointer1.next;
            counter ++;
        }
        while (pointer1.next!=null){
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        return pointer2.data;
    }

    public static void main(String[] args) {
        FindNthEleLinkedListTest linkedList = new FindNthEleLinkedListTest();
        Node node1 = new Node(5);
        linkedList.head = node1;
        node1.next = new Node(6);
        node1.next.next = new Node(7);
        node1.next.next.next = new Node(8);
        node1.next.next.next.next = new Node(9);

        int n = 2;
        System.out.println(n+"th element from the last is: "+linkedList.findNthElementFromLast(n));
    }
}
