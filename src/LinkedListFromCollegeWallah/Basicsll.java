package LinkedListFromCollegeWallah;

public class Basicsll {

    public static class Node {
        int data;    //value
        Node next;   // addres of next node

        //constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

//    displya a list using recursive functio n
    public static void displayRec(Node head) {
        if(head == null) {
            return;
        }
        System.out.print(head.data+" ");
        displayRec(head.next);
    }

    //reverse list using recurisive function
//    all calls save in stack, after print list return on reverse stack
    public static void reverseList(Node head) {
        if(head == null) {
            return;
        }
        reverseList(head.next);
        System.out.print(head.data+" ");
    }

//    print list lenght
    public static int length(Node head) {
      Node temp = head;
      int count = 0;
      while (temp != null) {
          count++;
          temp = temp.next;
      }
      return count;
    }


    public static void main(String[] args) {
//        Basicsll list = new Basicsll();

//        create a node
        Node a = new Node(5);
        System.out.println(a.next);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        Node f = new Node(10);

        a.next = b;     // 3->5 9 8 16 10
        b.next = c;     // 3->5->9 8 16  10
        c.next = d;     // 3->5->9->8 16 10
        d.next = e;     // 3->5->9->8->16 10
        e.next = f;     // 3->5->9->8->16->10


        System.out.println();
        System.out.println(a.next);
        System.out.println(b);
        System.out.println("node a ka data  "+a.data);

        System.out.println(b.next);
        System.out.println(b.data);

        System.out.println(c.next);


        //this is not good because hm head kho denge or dowara se list print nhi kr payenge
//        while(a != null) {
//            System.out.print(a.data+" ");
//            a = a.next;
//        }


        //kabhi bhi head ek new pointer ko de dena chahiye taki head no khoye ham
//        ek new node bani jo head ko point kar rhi hai
        Node temp = a;   //pointer

        while(temp != null) {
            System.out.print(temp.data+" ");
           temp = temp.next;
        }

        System.out.println();
        display(a);
        display(a);

        System.out.println();
        displayRec(a);
        System.out.println();

        System.out.println("Using recursive function");
        reverseList(a);
        System.out.println();

        System.out.println();
        System.out.println("total length is "+length(a));





    }
}
