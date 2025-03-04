package Learn_Linked_List.FromCollegeWallah;

public class RemoveNthNodeFromEnd {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node findingNthNode(Node head, int n) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int m = count-n;
        temp = head;
        for(int i=1; i<=m; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return temp;
    }


    public static Node findingNthNode2(Node head, int n) {
        Node slow = head;
        Node fast = head;
        for (int i=1; i<n; i++){
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

//        slow.next = fast;
        return slow;

    }

    public static Node removeNthNodeFromEnd(Node head, int n) {
        Node slow = head;
        Node fast = head;

        for (int i=1; i<=n; i++){
            fast = fast.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
//        slow.next = slow.next.next;
        Node t = head;
        while(t.next != null) {
            System.out.print(t.data+" ");
            t = t.next;
        }
        System.out.println();
        return head;
    }


    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

//        100 13 4 5 12 10


        Node temp = findingNthNode(a,2);
        System.out.println(temp.data);

        Node t = findingNthNode2(a,2);
        System.out.println(t.data);

       Node p =  removeNthNodeFromEnd(a,  2);
        System.out.println(p.data);


    }
}
