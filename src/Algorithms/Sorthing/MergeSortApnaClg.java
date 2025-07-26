package Algorithms.Sorthing;

public class MergeSortApnaClg {

    public static void conqurerArr(int []arr, int start, int mid, int end) {
        int []merged = new int[end-start+1];
        int idx1 = start;
        int idx2 = mid+1;
        int x = 0;

        while(idx1 <= mid && idx2 <= end) {
            if(arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        while(idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        while(idx2 <= end) {
            merged[x++] = arr[idx2++];
        }
        for(int i=0, j=start; i< merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divideArr(int []arr, int start, int end) {
        if(start >= end) {
            return;
        }

        int mid =  start + (end - start)/2;
        divideArr(arr, start, mid);
        divideArr(arr,mid+1, end);
        conqurerArr(arr, start, mid, end);
    }

    public static void main(String[] args) {
        int []arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        divideArr(arr, 0, n-1);

        for(int i=0; i<=n; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
