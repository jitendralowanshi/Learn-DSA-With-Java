package Learn_Linked_List.FromApnaCollege;

import java.util.LinkedList;

public class ReverseALinkedList {

    static Node head;
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

//learn from anuj bhaiya
    public static Node reverseList(Node head) {
        Node curr = head;
        Node prev = null;
         while (curr != null) {
             Node temp = curr.next;
             curr.next = prev;
             prev = curr;
             curr = temp;
         }
//         print revers linked list
         while(prev.next != null) {
             System.out.print(prev.data+" ");
             prev = prev.next;
         }
         return prev;
    }


    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;


        Node temp = reverseList(a);
        System.out.println(temp.data);


    }
}
