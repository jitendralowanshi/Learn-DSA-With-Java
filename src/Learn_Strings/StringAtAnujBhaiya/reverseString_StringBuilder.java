package Learn_Strings.StringAtAnujBhaiya;

public class reverseString_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        int n = sb.length();

        for(int i=0; i< n/2; i++) {
            int front = i;
            int back = n-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
