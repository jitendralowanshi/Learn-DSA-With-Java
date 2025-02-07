package Algorithms.Searching;

public class linearSearch {

    public static void linearSerch(int[] arr, int target) {
        int n = arr.length;

        for(int i=0; i<n; i++) {
            if(arr[i] == target) {
                System.out.println("target present in index"+" "+i);
            }
        }

    }


    public static void main(String[] args) {
        int target = 5;
        int[] arr = {-1, 0, 3, 5};
        linearSerch(arr, target);



    }
}
