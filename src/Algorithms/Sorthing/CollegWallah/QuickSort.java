package Algorithms.Sorthing.CollegWallah;

public class QuickSort {

    public static void partition(int[] arr, int start, int end) {
        if(start >= end) return;
        int pivot = arr[end];
        partition(arr, start, pivot-1);
        partition(arr, pivot+1, end);

    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 9, 1, 6};
        int n = arr.length;

        partition(arr, 0, n-1);

        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
