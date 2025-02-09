package Algorithms.Sorthing;

public class _02_SelectionSort {
//    time complexity is O(n^2)

    public static void selectionSort(int[]arr, int n) {
        for(int i=0; i<n; i++) {
            int smallestIndex = i;

            for(int j=i+1; j<n; j++) {
                if(arr[j] < arr[smallestIndex]) {
                    smallestIndex = j;
                }
            }
//            int swap = 0;

        }
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {4, 1, 5, 2, 3};

        selectionSort(arr, n);

    }
}
