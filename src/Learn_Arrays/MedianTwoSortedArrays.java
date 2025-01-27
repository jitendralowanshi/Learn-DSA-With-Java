package Learn_Arrays;

public class MedianTwoSortedArrays {
    public static double findMedianSortedArray(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int fullLength = m + n;
        int[] nums3 = new int[fullLength];

        for(int i=0; i<nums3.length; i++) {

            int sort1 = 0;
            while(sort1 < m) {
                nums3[sort1] = nums1[sort1];
                sort1++;
            }

            int sort2 = 0;
            while(sort2 < n) {
                nums3[m+sort2] = nums2[sort2];
                sort2++;
            }

//            for(int sort1=0; sort1<m; sort1++) {
//                nums3[sort1] = nums1[sort1];
//            }
//
//            for(int sort2=0; sort2<n; sort2++) {
//                nums3[m+sort2] = nums2[sort2];
//            }
        }

//        int first = 0;
//        int last = nums3.length-1;
//        while(first > nums3.length/2) {
//            if(nums3[first] < nums3[last]){
//                int swap = nums3[first];
//                nums3[first]= nums3[last];
//                nums3[last] = swap;
//            }
//            first++;
//            last--;
//        }

        for (int i = 0; i < nums3.length; i++) {
            for (int j = i+1; j < nums3.length; j++) {
                if(nums3[i] > nums3[j]) {
                    int swap = nums3[i];
                    nums3[i] = nums3[j];
                    nums3[j] = swap;
                }
            }
        }


        double median = 0;
        if(fullLength%2 != 0) {
            median =  fullLength/2;
            return median;
        }else{
            int x = fullLength/2;
            double p = nums3[x];
            double q = nums3[x-1];
            median = (p+q)/2;
        }

//        print array and array length
        System.out.println(nums3.length);
        for(int ans: nums3) {
            System.out.print(ans+ " ");
        }

//        print median
        System.out.println();
        System.out.println("Median is " +median);

        return median;
    }

    public static void abc(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int sum = m+n;
        int[] newArr  = new int[m+n];
        System.out.println(sum);

        for(int i=0; i<sum; i++) {

            int num = 0;
            while (num < m && num < n) {
                newArr[num] = nums1[num];
                newArr[m+num] = nums2[num];
                num++;
            }

        }

        for(int i=0; i<sum; i++) {
            for(int j=i+1; j<newArr.length; j++) {

                if(newArr[i] > newArr[j]) {
                    int temp = newArr[i];
                    newArr[i] = newArr[j];
                    newArr[j] = temp;
                }
            }
        }

        for(int ans: newArr) {
            System.out.print(ans+ " ");
        }

    }




    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,5,6};
        findMedianSortedArray(nums1, nums2);
        System.out.println();
        abc(nums1, nums2);

    }
}
