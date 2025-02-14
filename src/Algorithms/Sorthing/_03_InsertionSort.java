package Algorithms.Sorthing;

public class _03_InsertionSort {
    public static void insertionSort(int[] arr, int n) {

        for(int i=0; i<n; i++) {
            int curr = arr[i];
            int prev = i-1;

            while(prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        for(int ans: arr) {
            System.out.print(ans+" ");
        }

    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 5, 2, 3, 8};
        int n = arr.length;
        insertionSort(arr, n);

    }
}
