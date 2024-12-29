package LearnRecursion;

public class Recursion {

    public static int calcPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        int xPowernm1 = calcPower(x,n-1);
//        System.out.println(xPowernm1); //1
        int xPower = x * xPowernm1;
        System.out.println(xPower); //5
        return xPower;

    }

    public static void main(String[] args) {
        int x = 2 , n = 5;
        int ans = calcPower(x,n);
        System.out.println(ans);

    }
}
