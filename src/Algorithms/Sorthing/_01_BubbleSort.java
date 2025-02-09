package Algorithms.Sorthing;

public class _01_BubbleSort {
//    total time complexity is  O(n*n) & this is not good time complexity

    public static void bubbleSort(int[]arr, int n) {
        for(int i=0; i<n-1; i++) {  // time complexity n

            for(int j=0; j<n-1-i; j++) {  //time complexity n
                if(arr[j] > arr[j+1]) {
//                    swap(arr[j],arr[j+1]);
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
//        print array
        for(int ans: arr) {
            System.out.print(ans+" ");
        }

    }


    public static void main(String[] args) {
        int n = 5;
        int[] arr = {4, 1, 5, 2, 3};
        bubbleSort(arr, n);

    }
}
