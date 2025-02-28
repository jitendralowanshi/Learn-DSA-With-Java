package Learn_Stack.FromApnaCollege;

import java.util.ArrayList;

public class ImplimentUsingArrayList {
    public static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            if(list.size() == 0) {
                return -1;
            }
           int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public static int peek() {
            if( list.size() == 0) {
                return -1;
            }
            int top = list.get(list.size()-1);
            return top;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

      while(!s.isEmpty()) {
          System.out.print(s.peek()+" ");
          s.pop();
      }

    }
}
