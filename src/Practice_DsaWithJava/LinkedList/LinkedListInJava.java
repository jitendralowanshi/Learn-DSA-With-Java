package Practice_DsaWithJava.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListInJava {

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void creation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your data ");
        int data = sc.nextInt();
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }
        else {
            newNode.next =  head;
            head = newNode;
        }

    }

//    linked list function
//    public static void add(){
//        LinkedList<Integer> list = new LinkedList<Integer>();
//        System.out.println("Enter Your data here ");
//        Scanner sc = new Scanner(System.in);
//        int data = sc.nextInt();
//        list.add(data);
//        System.out.println(data);
//
//    }

    public static void main(String[] args) {
//       LinkedListInJava l1 = new LinkedListInJava();
//       l1.creation();
//       LinkedListInJava.add();


//     this is linked list in collection framework
       LinkedList<Integer> list = new LinkedList<Integer>();

       list.add(10);
       list.add(30);
       list.add(40);
       list.add(60);
       System.out.println(list);

//       list.add(1,20);
//       list.add(4,50);
//        System.out.println(list);
//
//        list.remove(1);
//        list.remove(3);
//        System.out.println(list);
//        list.add(2,100);
////        list.clear();
//          list = list.reversed();
//        System.out.println(list); //reversed func using for reverse linked list

//



    }

}
