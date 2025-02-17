package Algorithms.Sorthing;

public class _04_MergeSort {
    public static void conquer(int[] arr, int si, int mid, int ei) {
        int[] merged = new int[ei - si + 1];

        int ind1 = si;
        int ind2 = mid+1;
        int x = 0;

        while(ind1 <= mid && ind2 <= ei) {
            if(arr[ind1] <= arr[ind2]) {
                merged[x++] = arr[ind1++];
            }
            else {
                merged[x++] = arr[ind2++];
            }
        }

        while(ind1 <= mid) {
            merged[x++] = arr[ind1++];
        }

        while(ind2 <= ei) {
            merged[x++] = arr[ind2++];
        }

        for(int i=0, j=si; i<merged.length; i++, j++) {
            arr[j] = merged[i];
        }

    }

    public static void divide(int[] arr, int si, int ei) {
        //divide and conquer techniques  si=startIndex   ei=endingIndex
        if(si >= ei) {
            return;
        }

        int mid = si + (ei-si)/2;
        divide(arr, si, mid);
        divide(arr,mid+1, ei);
        conquer(arr, si, mid, ei);
    }


    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        int n = arr.length;
        divide(arr, 0, n-1);

        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
