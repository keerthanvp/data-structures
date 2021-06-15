package linked_lists.linked_list_operations;

public class LinkedList implements LinkedListOps{

    Node head;

    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public void insertFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtPos(int data, int pos){
        Node newNode = new Node(data);
        Node prev = head;
        Node current = head.next;
        int count = 1;
        if (pos<1){
            System.out.println("Invalid Position");
            return;
        }
        if (pos==1){
            newNode.next = head;
            head = newNode;
        }else{
            while (current!=null){
                if (count==pos-1)
                    break;
                prev = prev.next;
                current = current.next;
                count = count + 1;
            }
            prev.next = newNode;
            newNode.next = current;
        }
    }

    public void insertLast(int data){
        Node newNode = new Node(data);
        Node pointer = head;
        while (pointer.next!=null){
            pointer = pointer.next;
        }
        pointer.next = newNode;
    }

    public void removeFirst(){
        head = head.next;
    }

    public void removeLast(){
        Node current = head.next;
        Node prev = head;
        while (current.next!=null){
            current = current.next;
            prev = prev.next;
        }
        prev.next = null;
    }

    public void removeAtPos(int pos){
        if (pos<1){
            System.out.println("Incorrect position");
            return;
        }
        if (pos == 1){
            head = head.next;
        }else {
            int count = 1;
            Node prev = head;
            Node current = head.next;
            while (count<pos-1){
                current = current.next;
                prev = prev.next;
                count++;
            }
            if (current==null){
                System.out.println("Position out of bound");
                return;
            }
            prev.next = current.next;
        }
    }

    public void printList(){
        Node pointer = head;
        while (pointer!=null){
            System.out.println(pointer.data);
            pointer = pointer.next;
        }
        System.out.println("\n");
    }

    public int findLength() {
        Node current = head;
        int count = 0;
        while (current!=null){
            current = current.next;
            count = count + 1;
        }
        return count;
    }

    public boolean search(int data){
        Node current = head;
        while (current!=null){
            if (current.data == data){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.insertFirst(4);
        list1.insertFirst(3);
        list1.insertLast(5);
        list1.insertFirst(2);
        list1.insertLast(8);
        list1.insertAtPos(6,1);

        System.out.println("Linked list: ");
        list1.printList();
        System.out.println("Length of the linked list is: "+ list1.findLength());

        list1.removeFirst();
        System.out.println("After removing first element\n");
        list1.printList();

        list1.removeLast();
        System.out.println("After removing last element\n");
        list1.printList();

        int pos = 4;
        list1.removeAtPos(pos);
        System.out.println("After removing element at position:"+pos);
        list1.printList();

        System.out.println("After inserting an element in the beginning and at position:"+pos);
        list1.insertFirst(9);
        list1.insertAtPos(6,pos);
        list1.printList();

        System.out.println("Length of the linked list is: "+ list1.findLength());

        System.out.println("Searching for element 3: "+list1.search(3));
        System.out.println("Searching for element 7: "+list1.search(7));

    }

}
