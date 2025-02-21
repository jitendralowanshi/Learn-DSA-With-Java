package PracticeDSA.LinkedList;

public class LinkedList {

    Node head;
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //add first function
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

//    addlast function
    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

//    print list
    public void printList() {
        if(head == null) {
            System.out.println("list is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("NUll");

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(8);
        list.addFirst(1);
        list.addLast(33);
        list.addFirst(10);
        list.printList();
    }
}
