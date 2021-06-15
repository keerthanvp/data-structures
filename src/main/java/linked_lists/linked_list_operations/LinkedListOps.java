package linked_lists.linked_list_operations;

public interface LinkedListOps {
    void insertFirst(int data);
    void insertLast(int data);
    void insertAtPos(int data, int pos);
    void removeFirst();
    void removeLast();
    void removeAtPos(int pos);
    void printList();
    int findLength();
    boolean search(int data);
}
