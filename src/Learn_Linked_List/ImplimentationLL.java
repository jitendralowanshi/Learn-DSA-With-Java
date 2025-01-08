package Learn_Linked_List;

public class ImplimentationLL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
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


    public void print() {
       Node currNode = head;
       while(currNode != null) {
           System.out.print(currNode.data + "->");
           currNode = currNode.next;
        }
        System.out.println("Null");
    }



    public static void main(String[] args) {
        ImplimentationLL list = new ImplimentationLL();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.print();

    }

}
