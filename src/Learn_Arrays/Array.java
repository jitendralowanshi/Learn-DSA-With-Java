package Learn_Arrays;

public class Array {

    public static int[] sortAr(int[] arr) {
        int i= 0;
        int j= arr.length-1;
         while (arr[i] > arr[j]) {
             int swap = arr[i];
             arr[i] = arr[j];
             arr[j] = swap;
             i++;
             j--;
         }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 6, 8, 4};
        int[] ans = sortAr(arr);

        for (int i: ans) {
            System.out.print(i+" ");
        }
//git

    }
}
