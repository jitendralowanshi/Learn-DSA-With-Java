package Learn_Strings;

public class ReverseString {
    public static void reversStr(String name) {

    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Jitendra");

        for(int i=0; i<sb.length()/2; i++) {
            int front = i;
            int back = sb.length()-1-i;

            char fruntChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, fruntChar);

        }

        System.out.println(sb);
    }
}
