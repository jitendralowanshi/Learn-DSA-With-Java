package Learn_Linked_List.FromCollegeWallah;

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
        int size = 0;


//        create a insertAtEnd method
        public void insertAtEnd(int data) {
            Node newNode = new Node(data);

            if(head == null) {
                head = newNode;
                tail = newNode;
                size++;
                return;
            }

            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            tail = newNode;
            size++;

        }


//        create a insertAtStart Method
        public void insertAtStart(int data) {
            Node newNode = new Node(data);
            if(head == null) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
            size++;
        }

       public void display() {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
           System.out.println();
       }


//       create a DeletLast Node method
        public void delLast() {
            if(head.next == null) {
                head = null;
                return;
            }

            Node secLastNode = head;
            while (secLastNode.next.next != null) {
                secLastNode = secLastNode.next;
            }
            secLastNode.next = null;
            tail = secLastNode;
            size--;

//    ye code bhi right hai but isme do pinter banane pade
//            Node secLast = head;
//            Node lastNode = head.next;
//            while (lastNode.next != null) {
//                lastNode = lastNode.next;
//                secLast = secLast.next;
//            }
//            secLast.next = null;
//            tail = secLastNode;
//            size--;
        }


//        create a DeletFirst Node Method
        public void delStart() {
            if(head.next == null) {
                head = null;
            }
            head = head.next;
            size--;
        }


//        Insert Node in given Index position
         public void insertAt(int idx, int val) {
            Node newNode = new Node(val);
            Node temp = head;

            if(idx == 0) {
                insertAtStart(val);
                return;
            }
            else if(idx<0 || idx > size) {
                System.out.println("wrong index "+ idx);
                return;
            }

            for(int i=1; i<idx; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
         }

         //get element at index
         public int getElementAt(int idx) {
             if(idx < 0 || idx > size) {
                 System.out.print("get wrong index ");
                 return idx;
             }

           Node temp = head;
           for(int i=1; i<idx; i++) {
               temp = temp.next;
           }
           return temp.data;
         }

    //        DeletAtIndex method
    public void deletAtIndex(int idx) {
        Node temp = head;
        if(idx == 0) {
            head = head.next;
        }
        for(int i=1; i<idx; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        tail = temp;
        size--;
    }

//         travel a Linked List
         public void travel(Node head, int val) {
            Node t = new Node(val);
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = t;
        }



    }

    public static void main(String[] args) {
        linkedlist list = new linkedlist();

        list.insertAtEnd(1);
        list.insertAtEnd(2);
//        list.display();

        list.insertAtEnd(3);
        list.insertAtEnd(4);
////        list.display();
//
        list.insertAtStart(0);
        list.insertAtEnd(5);
        list.insertAtEnd(6);
////        list.display();

        list.delLast();
        list.delLast();
//        list.display();

        list.delStart();
//        list.display();
//
        list.delStart();
//        list.display();

        list.insertAt(2,22);
        list.insertAt(0,100);
        list.insertAt(0,99);
//        list.display();
//
//        System.out.println(list.head.data);
//        System.out.println(list.tail.data);
//
        list.insertAtEnd(500);
        list.insertAtStart(60);
        list.insertAt(4,599);
//        list.display();
        list.insertAtEnd(100);
//
        list.insertAt(-1, 666);
        list.insertAt(12, 666);

        list.delLast();
        list.display();
//        System.out.println(list.getElementAt(5));

        list.deletAtIndex(8);
        list.deletAtIndex(7);
        list.deletAtIndex(6);

        System.out.println();
        list.display();
        System.out.println("head  = "+list.head.data);
        System.out.println("tail  = "+list.tail.data);
        System.out.println("list size is = "+list.size);
//        System.out.println(list.getElementAt(8));
//        System.out.println(list.getElementAt(9));

    }
}
