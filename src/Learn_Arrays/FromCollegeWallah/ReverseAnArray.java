package Learn_Arrays.FromCollegeWallah;

public class ReverseAnArray {

    public static void display(int []arr) {

        for(int ans: arr) {
            System.out.print(ans+" ");
        }
        System.out.println();

    }

    public static void swapArray(int[]arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    //reverse array first approaches
    public static int[] reverseArr(int []arr) {
        int n = arr.length;
        int []ans = new int[n];

//        int j = 0;
//        for(int i=n-1; i>=0; i--) {
//            ans[j++] = arr[i];
//        }


//        Using while loop
        int i = n-1;
        int j = 0;

        while(i>=0) {
            ans[j++] = arr[i--];
        }

        return ans;
    }


    //reverse array without using new array
    public static int[] reverseArr1(int[]arr) {

        int i = 0;
        int j = arr.length-1;
        //jese hi arr[left] greater than hua condition break ho jayegi
        while (i  < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

////            call swap array
//            swapArray(arr, i , j);

            i++;
            j--;
        }


        return arr;
    }
 

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,10};
        int []ans = reverseArr(arr);
        display(ans);
        System.out.println();

        int []wt = reverseArr1(arr);
        display(wt);

    }
}
