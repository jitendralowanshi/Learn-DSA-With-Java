package Practice_DsaWithJava.Array;

import java.util.Scanner;

public class _2D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your rows number");
        int rows = sc.nextInt();

        System.out.println("Enter Your column Number");
        int cols = sc.nextInt();

        int [][]arr = new int[rows][cols];

//        for (int i=0; i<rows; i++){
//            for (int j=0; j<cols; j++){
//                 arr[i][j] = sc.nextInt();
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        System.out.println("Your Two Dimantional Arrays is ");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
//        System.out.println("length is " + arr.length);


    }
}
