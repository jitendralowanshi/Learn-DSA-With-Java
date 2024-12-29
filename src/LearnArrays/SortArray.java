package LearnArrays;

import java.util.Scanner;

public class SortArray {

    public static int[] sortArr(int[] arr) {
        int n = arr.length;
        int[] abc = new int[n];

        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i]>arr[j]) {
                    int swap = arr[j];
                    arr[j] = arr[i];
                    arr[i] = swap;
                }

            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your array size ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter your array elements ");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

//        for(int an: arr){
//            System.out.print(an+" ");
//        }
//        System.out.println();


       sortArr(arr);
        System.out.println("Your sorted array is ");
        for (int ans: arr){
            System.out.print(ans+" ");
        }

    }
}
