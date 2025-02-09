package Algorithms.Searching;

public class BinarySearch {
    public static int binSearch(int[] arr, int target) {
//        time complexity is O(logn)
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start <= end) {
            int mid = start + (end-start)/2;
            if(target > arr[mid]) {
                start = mid+1;
            }
            else if (target < arr[mid]) {
                end = mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int target = 5;
        int[] arr = {1,2,3,4,5,6,7};
       int ans = binSearch(arr, target);
        System.out.println(ans);

    }
}
