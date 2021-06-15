package linked_lists.middle_element;

public class FindMiddleElementTest {
    Node head;

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public int findMiddleElement(){
        Node fastPointer = head;
        Node slowPointer = head;
        while (fastPointer!=null && fastPointer.next!=null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        return slowPointer.data;
    }

    public static void main(String[] args) {
        FindMiddleElementTest linkedList = new FindMiddleElementTest();
        Node node1 = new Node(5);
        linkedList.head = node1;
        node1.next = new Node(6);
        node1.next.next = new Node(7);
        node1.next.next.next = new Node(8);
        node1.next.next.next.next = new Node(9);
        node1.next.next.next.next.next = new Node(10);

        System.out.println("Middle element is : "+ linkedList.findMiddleElement());
    }
}
