package Algorithms.Sorthing;

public class _02_SelectionSort {
//    time complexity is O(n^2)

    public static void selectionSort(int[]arr, int n) {
        for(int i=0; i<n-1; i++) {
            int smalIndex = i;

            for(int j=i+1; j<n; j++) {
                if(arr[j] < arr[smalIndex]) {
                    smalIndex = j;
                }
            }

            int swap = arr[i];
            arr[i] = arr[smalIndex];
            arr[smalIndex] = swap;
        }

//        print array
        for(int ans: arr) {
            System.out.print(ans+" ");
        }

    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 5, 2, 3};
        int n = arr.length;

        selectionSort(arr, n);

    }
}
