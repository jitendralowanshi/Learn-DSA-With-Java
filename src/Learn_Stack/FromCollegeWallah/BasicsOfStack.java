package Learn_Stack.FromCollegeWallah;


import java.util.Stack;

public class BasicsOfStack {

    public static void StackRecursive() {


    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        // copy code next line use ctrl + d
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(5);
        System.out.print(st+" ");
        System.out.println();

//        System.out.println(st.peek());

        st.pop();
        System.out.println(st);

        Stack<Integer> nt = new Stack<>();
        while(st.size()>0) {
            nt.push(st.pop());
        }

        System.out.println("st stack "+st);
        System.out.print("Nt Stac "+nt+" ");


    }
}
