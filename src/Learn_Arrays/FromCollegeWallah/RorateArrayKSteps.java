package Learn_Arrays.FromCollegeWallah;

import java.util.Scanner;

public class RorateArrayKSteps {
    public static void display(int[] arr) {
//        int n = arr.length;
        for(int ans: arr) {
            System.out.print(ans+" ");
        }
        System.out.println();
    }

    public static int[] rotateKStepsArr(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for(int i = n-k; i < n; i++){
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n-k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8};

        System.out.println("Enter your k steps to rotate ");
        int rr = sc.nextInt();

        int[] ans = rotateKStepsArr(arr, rr);
        display(ans);



    }
}
