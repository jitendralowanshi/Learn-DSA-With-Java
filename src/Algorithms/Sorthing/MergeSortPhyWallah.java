package Algorithms.Sorthing;

public class MergeSortPhyWallah {

    public static void merge(int[] arr, int startIndex, int mid, int endIndex) {
        //        this is for merge arr index
        int x = 0;
        int[] merge = new int[endIndex - startIndex + 1];


        int n1 = startIndex;
        int n2 = mid+1;


        while(n1 <= mid && n2 <= endIndex) {
            if(arr[n1] <= arr[n2]) {
                merge[x++] = arr[n1++];
            }
            else{
                merge[x++] = arr[n2++];
            }
        }

        while(n1 <= mid) {
            merge[x++] = arr[n1++];
        }

        while(n2 <= endIndex) {
            merge[x++] = arr[n2++];
        }

//        merged array copy in main array
        for(int i=0, j=startIndex; i<merge.length; i++, j++) {
            arr[j] = merge[i];
        }


    }

    public static void mergeSort(int[] arr, int startIndex, int endIndex) {
        if(startIndex >= endIndex) {
            return;
        }

        int mid = startIndex + (endIndex - startIndex)/2;

//        Recursive call - this two call after divide array
        mergeSort(arr, startIndex, mid);                  //  call left array [4,1,3]
        mergeSort(arr, mid+1, endIndex);        //  call right array [5,2,6

//        this call for merge function
        merge(arr,startIndex, mid, endIndex);


    }



    public static void main(String[] args) {
        int[] arr = {4,1,3,5,2,6};
        int n = arr.length;

//        call merge sort function
        mergeSort(arr, 0, n-1);


        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();


    }
}
