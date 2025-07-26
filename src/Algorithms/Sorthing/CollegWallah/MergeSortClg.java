package Algorithms.Sorthing.CollegWallah;

public class MergeSortClg {

    public static void conqurer(int []arr, int left, int mid, int right) {
        int []merged = new int[right-left+1];
        int x = 0;

        int indx1 = left;
        int indx2 = mid+1;

        while(indx1 <= mid && indx2 <= right) {
            if(arr[indx1] <= arr[indx2]) {
                merged[x++] = arr[indx1++];
            } else {
                merged[x++] = arr[indx2++];
            }
        }

        while(indx1 <= mid) {
            merged[x++] = arr[indx1++];
        }

        while(indx2 <= right) {
            merged[x++] = arr[indx2++];
        }

        for(int i=0, j=left; i<merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divideArr(int []arr, int left, int right) {
        if(left >= right) {
            return;
        }

        int mid = left + (right - left)/2;
        divideArr(arr, left, mid);
        divideArr(arr, mid+1, right);

        //call conqurer and merge
        conqurer(arr, left, mid, right);

    }
    public static void main(String[] args) {
        int []arr = {6, 3, 2, 5, 1, 9, 4,7};
        int n = arr.length;

        //call divide array
        divideArr(arr, 0, n-1);

        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print(arr.length);


    }
}
