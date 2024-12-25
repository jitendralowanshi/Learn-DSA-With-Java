package LearnStrings;

public class StringDeclaration {
//    Strings are immutable we cannot change

    public static void main(String[] args) {
        String firstName = "jitendra";
        String lastName = "Lowanshi";

// CONCATINATING TWO STRINGS .
        String fullName = firstName + lastName;
        System.out.println(fullName);

// FIND String length function
        System.out.println(fullName.length());

//   charAt() function 1 character ko return krta hai
//        for (int i=0; i<fullName.length(); i++) {
//            System.out.println(i+" = " +fullName.charAt(i));
//        }

    }
}
