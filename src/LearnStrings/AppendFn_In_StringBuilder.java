package LearnStrings;

import java.util.Scanner;

public class AppendFn_In_StringBuilder {

    public static void addTwoStrings() {
        StringBuilder result = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first");
        String s1 = sc.nextLine();

        System.out.println("enter second");
        String s2 = sc.nextLine();

        int i = 0;
        while (i<s1.length() || i<s2.length()) {

            if (i<s1.length()){
//               char ans = s1.charAt(i);  Exeption show this line
//               result.append(ans);
                result.append(s1.charAt(i));
            }

            if (i<s2.length()){
//               char ans = s2.charAt(i+1); we can not use char ans string in srisng builser
//               result.append(ans);
                result.append(s2.charAt(i));
            }
            i++;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("H");
        System.out.println(sb);

        sb.append('e');
        sb.append('l');
        sb.append('l');
        sb.append('o');

        System.out.println(sb);
        addTwoStrings();

    }

}
