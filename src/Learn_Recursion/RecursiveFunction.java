package Learn_Recursion;

public class RecursiveFunction {

    public static void recursivFun(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        recursivFun(n-1);
    }

    public static void recursivFun2(int num) {
        if (num == 6) {
            return;
        }

        System.out.println(num);
        recursivFun2(num+1);
    }




    public static void main(String[] args) {
        int n = 5;
//        recursivFun(n);

        int num = 1;
        recursivFun2(num);


    }
}
