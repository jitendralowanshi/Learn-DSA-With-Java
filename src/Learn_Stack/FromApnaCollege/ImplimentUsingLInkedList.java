package Learn_Stack.FromApnaCollege;

import java.util.Stack;

public class ImplimentUsingLInkedList {
    public static Node head;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public static class Stack {


//            push Function
            public static void push(int data) {
                Node newNode = new Node(data);
                if (head == null) {
                    head = newNode;
                    return;
                }

                newNode.next = head;
                head = newNode;
            }


//            pop Function
            public static int pop() {
                if (head == null) {
                    return -1;
                }
                int top = head.data;
                head = head.next;
                return top;
            }


//            peek Function
            public static int peek() {
                if (head == null) {
                    return -1;
                }
               return head.data;
            }

        }

    }



    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.print(s+" ");
        System.out.println();

        s.pop();
        System.out.print(s+" ");
        System.out.println();

        s.pop();
        System.out.print(s+" ");
        System.out.println();
        s.pop();

        System.out.println("peek and top is "+s.peek());




    }
}
