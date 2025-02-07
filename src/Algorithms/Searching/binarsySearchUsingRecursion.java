package Algorithms.Searching;

public class binarsySearchUsingRecursion {
    public static int recursivBinarySerach(int[] arr, int target, int start, int end) {

        int mid = start + (end-start)/2;
        if(target > arr[mid]) {
            return recursivBinarySerach(arr, target, mid+1, end);
        }
        else if (target < arr[mid]) {
            return recursivBinarySerach(arr,target,start,mid-1);
        }
        else {
            return mid;
        }

    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 6;

        int start = 0;
        int end = arr.length-1;

        int ans = recursivBinarySerach(arr, target,start,end);
        System.out.println(ans);
    }
}
