package Learn_Strings;

class String_Builder {

    public static void stringBuilder() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("jitendra");
        System.out.println(sb);

        System.out.println(sb.charAt(0));
//value set any index
        sb.setCharAt(0,'K');
        System.out.println(sb);

//insert value in any index
        sb.insert(sb.length(), "L1C");
        System.out.println(sb);

// delet any sub string in string
        sb.delete(8, 12);
        System.out.println(sb);

//  append means any char and string add in last
        sb.append("L1C");
        System.out.println(sb);

    }



    public static void reverseString() {
        StringBuilder sb = new StringBuilder("HELLO");


        for (int i=0; i<sb.length()/2; i++) {
            //value find
            int frunt = i;
            int back = sb.length()-1-i;

//            character find
            char fruntChar = sb.charAt(frunt);
            char backChar = sb.charAt(back);

//            setcharat function use
            sb.setCharAt(frunt, backChar);
            sb.setCharAt(back, fruntChar);

        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        stringBuilder();
        System.out.println("Thanks to learn StringBuilder");
        reverseString();

    }
}
