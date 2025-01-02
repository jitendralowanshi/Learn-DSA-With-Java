package Practice_DsaWithJava.Stack;

public class StackClass {

 // stack implimentation
    static class Node {
        int data;
        Node next;
        public Node (int data){
            this.data = data;
            this.next = next;
        }
    }

    static class Stack {
        public static Node head;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            else {
                newNode.next = head;
                head = newNode;
            }
        }

       public static int pop() {
            if (isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
       }

       public static int peek() {
            if (isEmpty()){
                return -1;
            }
            return head.data;
       }
    }
    // this is recursion in java its most important fumnction for java
    public static void recursion(int data ){
        System.out.println(data);
        recursion(data);
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        
    }
}
