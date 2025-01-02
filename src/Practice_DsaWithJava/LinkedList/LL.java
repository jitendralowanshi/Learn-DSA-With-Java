package Practice_DsaWithJava.LinkedList;

public class LL {
    Node head;

    class Node {
        int data;
        Node next;

        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    //add first method
    void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    //addLast method
    void add(int data) {
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        else {
            Node currNode = head;
            while (currNode.next != null){
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
    }

    // PrintList method
    void printList() {
        if (head == null){
            System.out.println("list is empty");
        }
        else {
            Node currNode = head;
            while (currNode != null){
                System.out.print(currNode.data + "->");
                currNode = currNode.next;
            }
            System.out.println("NULL");
        }
    }


    public static void main(String[] args) {
        LL list = new LL();
        list.add(50);
        list.add(60);
        list.add(70);
        list.addFirst(40);
        list.printList();

        list.addFirst(30);
        list.addFirst(20);
        list.printList();
    }
}
