package PracticeDSA.LinkedList;

public class List {
    Node head;
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

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


    public static void main(String[] args) {
        List list = new List();
        list.addFirst(4);
        list.addLast(5);
        list.addFirst(3);
        list.printList();
    }

}
