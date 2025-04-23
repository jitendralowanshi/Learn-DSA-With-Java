package Learn_Arrays.FromCollegeWallah;

public class ReverseAnArray {

    public static void display(int []arr) {

        for(int ans: arr) {
            System.out.print(ans+" ");
        }
        System.out.println();

    }


    //reverse array first approaches
    public static int[] reverseArr(int []arr) {
        int n = arr.length;
        int []ans = new int[n];
        int j = 0;

        for(int i=n-1; i>=0; i--) {
            ans[j++] = arr[i];
        }
        return ans;
    }








    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7};
        int []ans = reverseArr(arr);
        display(ans);

    }
}
