package Learn_Recursion;

public class SumOfnNaturalNum {
    public static void sumOfNaturalNum(int i, int n, int sum) {

        if (i == n) {
            sum = sum + i;
            System.out.println(sum);
            return;
        }
        sum = sum+i;
//        System.out.println(sum);
        sumOfNaturalNum(i+1, n, sum );
    }


    public static int factorialNum(int n) {
        if (n == 1 || n == 0 ) {
            return 1;
        }

        int factNm1 = factorialNum(n-1);
        int fact = n * factNm1;
        return fact;

    }


    public static void main(String[] args) {
//        sumOfNaturalNum(1,5, 0);

        int n = 6;
        int ans = factorialNum(n);
        System.out.println(ans);

    }
}
