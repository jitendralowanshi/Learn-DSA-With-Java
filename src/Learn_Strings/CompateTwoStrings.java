package Learn_Strings;

public class CompateTwoStrings {
    public static void main(String[] args) {
        String name = "jitendra";
        String surname = "jitendra";

//     compateTo()
//   three cases
//        1: s1 > s2  return  1    positive
//        2: s1 == s2 return  0    true
//        3: s1 < s2  return -1    negative
        System.out.println(name.compareTo(surname));

        if (name.compareTo(surname)==0) {
            System.out.println("String are equal to");
        }
        else {
            System.out.println("Strings are sot equal");
        }

//non primitive type declaration
//        String s1 = new String("Shidharth");

//        if (new String("name") == new String("name")){
//            System.out.println("string are equal");
//        }else {
//            System.out.println("Stringa are not equals");
//        }

    }
}
