package Learn_Strings.StringAtAnujBhaiya;

import java.util.Scanner;

public class AddTwoStringsInStringBUilder {
    public static void oneBuilder() {
        StringBuilder sb = new StringBuilder();
//        StringBuilder sb1 = new StringBuilder();

        Scanner sc = new Scanner(System.in);
//        sb = new StringBuilder(sc.nextLine());
        System.out.println("enter first strings");  //jitendra
        String name = sc.nextLine();

        System.out.println("enter second String");  //lowanshi
        String surname = sc.nextLine();

        for (int i=0; i< name.length(); i++ ){
            sb.append(name.charAt(i));
        }
        for (int i=0; i<surname.length(); i++) {
            sb.append(surname.charAt(i));
        }
        System.out.println(sb);  // OUTPUT --> jitendralowanshi

//        if convert string builde into String then use toCharArray funtion
//        String sbConvert = StringBuilder.valueOf()    -->  only use in strings only
//        char letters[] = sb.toCharArray();            --> same only use in strings because this is String sfunction

//        int i = 0;
//        while (i<name.length() || i<surname.length()) {
//            if (i<name.length()){
//                sb.append(name.charAt(i));
//            }
//            if (i<surname.length()) {
//                sb.append(surname.charAt(i));
//            }
//            i++;
//        }
//        System.out.println(sb);
//        System.out.println(sb.toCharArray(i));
//        addTwoStrings();
        sc.close();    //Scanner class close

    }

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
//        addTwoStrings();
//        sc.close();
    }

    public static void main(String[] args) {
        oneBuilder();

    }
}
