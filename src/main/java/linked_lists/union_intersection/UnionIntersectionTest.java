package linked_lists.union_intersection;

/*
Given two Linked Lists, create union and intersection lists that contain union and intersection
of the elements present in the given lists
 */

import java.util.HashMap;
import java.util.Map;

public class UnionIntersectionTest {
    Node head1, head2;
    public Map<Integer,Integer> map = new HashMap<Integer, Integer>();

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public void unionIntersection(){
        Node pointer1 = head1;
        Node pointer2 = head2;
        int val=0;
        while (pointer1!=null){
            if (map.containsKey(pointer1.data))
                val = map.get(pointer1.data);
            map.put(pointer1.data, val+1);
            pointer1 = pointer1.next;
        }
        while (pointer2!=null){
            if (map.containsKey(pointer2.data))
                val = map.get(pointer2.data);
            map.put(pointer2.data, val+1);
            pointer2 = pointer2.next;
        }
        System.out.println("Union: "+map.keySet());

        System.out.println("Intersection: ");
        map.forEach((k,v) -> {
            if (v>1)
                System.out.println(k);
        });
    }

    public static void main(String[] args) {
        UnionIntersectionTest linkedList = new UnionIntersectionTest();
        Node list1Node1 = new Node(3);
        linkedList.head1 = list1Node1;
        list1Node1.next = new Node(4);
        list1Node1.next.next = new Node(7);

        Node list2Node1 = new Node(5);
        linkedList.head2 = list2Node1;
        list2Node1.next = new Node(6);
        list2Node1.next.next = new Node(7);
        list2Node1.next.next.next = new Node(3);

        linkedList.unionIntersection();
    }
}
