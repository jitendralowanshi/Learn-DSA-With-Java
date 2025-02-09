package Learn_Arrays;

public class ReverseArray {
    public static int[] reverseArr(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        while(arr[i] > arr[j]) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {7, 6, 5, 4, 3, 2 ,1 };
        int[]num = reverseArr(arr);

        for(int ans: num) {
            System.out.print(ans+ " ");
        }
    }
}

