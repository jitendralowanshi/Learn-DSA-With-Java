package Bit_Manipulation;

public class array {

    public static int[] sortAr(int[] arr) {
        int n = arr.length;
        int i=-1;
        int j=-1;
         while (arr[i] > arr[j]) {
             int swap = arr[i];
             arr[i] = arr[j];
             arr[j] = swap;
             i++;
             j++;
         }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 6, 8, 4};
        int[] ans = sortAr(arr);

        for (int i: ans) {
            System.out.print(i+" ");
        }

    }
}