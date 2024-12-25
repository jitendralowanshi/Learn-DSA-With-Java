package LearnStrings;

public class StringTypcast {
//    in java String can not be converted in integer
//    integer value can converted in String

    public static void main(String[] args) {
        int num = 10;
        String name =" jitendra";
        String num2 = String.valueOf((int)num);
        System.out.println(num2+2);

    }
}
