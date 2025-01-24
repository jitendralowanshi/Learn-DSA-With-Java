package Learn_Arrays;

import java.util.Scanner;

public class ReturnArrayInMethod {

    public static int[] sortArrDece(int[] arr) {

        int n = arr.length;
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (arr[i] < arr[j]) {
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
        }
        return arr;
    }


    public static int[] sortArr(int[] arr) {

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
        int[] arr = new int[n];

        System.out.println("enter your array elements ");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

//        CALL SORTARR FUNCTION
        sortArr(arr);
        System.out.println("Your sorted Assending array is ");
        for (int ans: arr){
            System.out.print(ans+" ");
        }
        System.out.println();


//        CALL SORDARRDECENDING ARRAY
        sortArrDece(arr);
        System.out.println("Your sorted Decending array is ");
        for (int dec: arr){
            System.out.print(dec+" ");
        }


    }
}
