package PracticeDSA.Stack;

import java.util.Stack;

public class StackInCollectionFramwork {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
//        s.add(0,12);
//        s.remove(2);
//        s.removeElement(12);
        System.out.println(s);

        s.removeElement(10); // remove object element
        s.remove(1);        // remove index element 20
//        s.removeFirst();
        System.out.println(s);
    }
}
