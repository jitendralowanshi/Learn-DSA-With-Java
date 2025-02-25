package Learn_Linked_List.FromApnaCollege;

public class ImplimentationLL {

    Node head;
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addfirst(int data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printList(){

        if(head == null){
            System.out.print("list is empty");
        }
        else {
            Node currNode = head;
            while(currNode != null) {
                System.out.print(currNode.data+"->");
                currNode = currNode.next;
            }
        }
        System.out.print("NULl");

    }

    public static void main(String[] args) {
        ImplimentationLL list = new ImplimentationLL();
        list.addfirst(5);
        list.addfirst(10);
        list.printList();

    }

}
