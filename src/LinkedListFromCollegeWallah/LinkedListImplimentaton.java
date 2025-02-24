package LinkedListFromCollegeWallah;

public class LinkedListImplimentaton {
    Node head;
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

//    Create a linked list class
    public static class linkedlist {
        Node head = null;
        Node tail = null;


//        create a insertAtend method
        public void insertAtEnd(int data) {
            Node newNode = new Node(data);

            if(head == null) {
                head = newNode;
                return;
            }

            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;

        }


//        create a insertAtLast Method
        public void insertAtStart(int data) {
            Node newNode = new Node(data);
            if(head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

       public void display() {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
       }

//       create a delLast Node method
        public void delLast() {
            if(head.next == null) {
                head = null;
                return;
            }

            Node secLast = head;
            Node lastNode = head.next;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
                secLast = secLast.next;
            }
            secLast.next = null;
        }


//        create a first Node Method
        public void delStart() {
            if(head.next == null) {
                head = null;
            }
            head = head.next;
        }
    }



    public static void main(String[] args) {
        linkedlist list = new linkedlist();

        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.display();
        System.out.println();

        list.insertAtEnd(3);
        list.insertAtEnd(4);

        list.display();
        System.out.println();

        list.insertAtStart(0);
        list.insertAtStart(-1);
        list.insertAtStart(-2);
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.display();
        System.out.println();

        list.delLast();
        list.delLast();
        list.display();
        System.out.println();

        list.delStart();
        list.display();
        System.out.println();

        list.delStart();
        list.display();

    }
}
