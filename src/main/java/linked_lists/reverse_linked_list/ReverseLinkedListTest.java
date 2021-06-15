package linked_lists.reverse_linked_list;

public class ReverseLinkedListTest {
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public void reverse(){
        Node prev = null,next = null;
        Node current = head;
        while (current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void printList(){
        Node pointer = head;
        while (pointer!=null){
            System.out.println(pointer.data);
            pointer = pointer.next;
        }
    }

    public static void main(String[] args) {
        ReverseLinkedListTest linkedList = new ReverseLinkedListTest();
        Node node = new Node(4);
        node.next = new Node(5);
        node.next.next = new Node(6);
        node.next.next.next = new Node(7);
        node.next.next.next.next = new Node(8);
        linkedList.head = node;

        System.out.println("Linked list: ");
        linkedList.printList();
        linkedList.reverse();
        System.out.println("Reversed Linked list: ");
        linkedList.printList();
    }
}
