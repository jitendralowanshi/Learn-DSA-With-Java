package PracticeDSA.LinkedList;

public class List {

    Node head;

//    create a linked list
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


//    creat a add first node in a linked list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

//    create a add last function in linked list
    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

//    print list function
    public void printList() {
        if(head == null) {
            return;
        }

        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

//    create a delet function
    public void deletFirst() {
        if(head == null) {
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }

//    deletLast function
    public void deletLast() {
        if(head == null) {
            System.out.println("list is empty");
            return;
        }
        if(head.next == null) {
            head = null;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while(lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public static void main(String[] args) {
        List list = new List();
        list.addFirst(4);
        list.addLast(5);
        list.addFirst(3);
        list.printList();

        list.deletLast();
        list.printList();

        list.deletFirst();
        list.printList();
        
    }

}
