package Learn_Strings.StringAtAnujBhaiya;

public class AllStringMethods {
    public static void main(String[] args) {
        String name = "jiteNDra";
        String lastName = "LowANshi";

//       1 FIRST METHOD.  toUpperCase()
        String toUpperCase = name.toUpperCase();
        System.out.println(toUpperCase);

//       2 SECOND METHOD.   toLowerCase()
        String toLowerCase = lastName.toLowerCase();
        System.out.println(toLowerCase);


//        3 THIRD METHOD   trim()
//        this trim method only trim spaces both sides , and delet the spaces both sides
        String s = "    jitendra       ";
        String s1 = s.trim();
        System.out.println(s1);


//        4 FOURTH METHOD .  startsWith()
        System.out.println("startsWith = "+name.startsWith("jit"));


//        5 FOURTH METHOD .  endsWith()
        System.out.println("endsWith = "+name.endsWith("ra"));


//        6 SIXTH METHOD    equals()
        System.out.println(name.equals(lastName));


//        7 SEVENTH METHOD  equalsIgnoreCase()
        System.out.println("jitendra".equalsIgnoreCase("jiTEndra"));


//        MORE USEFUL METHODS IN DSA

//        8 EIGTH METHOD  charAt()
//        this method return any character in a string
        System.out.println(name.charAt(0));


//        9 NINETH METHOD   valueOf()
//        this method change any integer number into Strings
        int age = 123;
        String stringAge = String.valueOf(age);
        System.out.println(age);
        System.out.println(stringAge+6);



//        10 TENTH METHOD       replace()
//        11 ELEVANTH METHOD    contains()
//        12 TWELTH METHOD      substringn();
//        13 THIRTEEN METHOD    split()


//        14 FOURTEEN TH METHOD
//        toCharArray convert String into array
        String  color = "Brown";
        char letters[] = color.toCharArray();
        for (char let: letters) {
            System.out.println(let);
        }
//        System.out.println(letters[1]);


//        15 FIFTEEN TH METHOD  isEmpty()
        String animal = "     ";

        if (animal.isEmpty()) {
            System.out.println("empty");
        }
        else if (animal.isBlank()) {
            System.out.println("blank");
        }


    }
}
