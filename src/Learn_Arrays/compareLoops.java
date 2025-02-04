package Learn_Arrays;

public class compareLoops {
    public static void forLoop(int[] nums, int target) {
        int n = nums.length;

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(nums[i] + nums[j] == target ){
                    System.out.println(i+" "+j);
                }
            }
        }
    }

    public static void whileLoopp(int[] nums, int target) {
        int n = nums.length;
        int i = 0;
        int j = i+1;

        while(i<n && j<n) {
            if(nums[i] + nums[j] == target) {
                System.out.println(i+" "+j);
            }

            j++;

//            if(j>n) {
//                i++;
//            }
        }

    }
    public static void main(String[] args) {
        int[] nums = {4, 2, 12, 5, 3, 7};
        int target = 9;

        forLoop(nums, target);
        System.out.println();
        whileLoopp(nums, target);

    }
}
