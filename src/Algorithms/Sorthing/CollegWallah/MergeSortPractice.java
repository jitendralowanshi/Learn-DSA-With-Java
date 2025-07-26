package Algorithms.Sorthing.CollegWallah;

public class MergeSortPractice {

    public static void mergeConqurer(int[] arr, int l, int mid, int r) {
        int[] newArr = new int[r-l+1];
        int x = 0;

        int indx1 = l;
        int indx2 = mid+1;

        while(indx1 <= mid && indx2 <= r) {
            if(arr[indx1] <= arr[indx2]) {
                newArr[x++] = arr[indx1++];
            }
            else {
                newArr[x++] = arr[indx2++];
            }
        }

        while(indx1 <= mid) {
            newArr[x++] = arr[indx1++];
        }

        while(indx2 <= r) {
            newArr[x++] = arr[indx2++];
        }

        for(int i=0, j=l; i<newArr.length; i++, j++) {
            arr[j] = newArr[i];
        }
    }

    public static void divide(int[] arr, int l, int r) {
        if(l >= r) return;
        int mid = l + (r - l)/2;
        divide(arr, l, mid);
        divide(arr, mid+1, r);

        //call conqurer method
        mergeConqurer(arr, l, mid, r);
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 1, 9, 3, 8};
        int n = arr.length;

        divide(arr, 0, n-1);

        System.out.println("Quick Sorthing using recurtion");

        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();


    }
}
