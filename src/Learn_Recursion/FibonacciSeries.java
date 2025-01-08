package Learn_Recursion;

import java.util.Scanner;

public class FibonacciSeries {
    public static void fibb(int a, int b, int n){
        if (n == 0){
            return;
        }

        int c = a + b;
        System.out.println(c);
        fibb(b,c,n-1);

    }
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number : ");
        int n = sc.nextInt();

        System.out.println(a);
        System.out.println(b);
//        n me se a and b ko mines kr diya to n term hi print hogi extra nhi n-2
        fibb(a,b,n-2);


    }
}
