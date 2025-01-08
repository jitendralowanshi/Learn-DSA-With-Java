package Learn_Strings.StringAtAnujBhaiya;

public class StringBasics {
    public static void main(String[] args) {
//        using string literals
        String name = "Jitendra";
        String sameName = "Jitendra";

//        using new akeywords
        String newName = new String("Jitendra");

        System.out.println(name);
        System.out.println(sameName);
        System.out.println(newName);

//it is also, == check refrences like name & sameName point same space
        if (name == sameName) {
            System.out.println("both are same ");
        } else {
            System.out.println("both are not same");
        }

//it is check only,== check refrences  like name & newname point diffenent space
        if (name == newName) {
            System.out.println("Both are same");
        } else {
            System.out.println("both are not same");
        }

//  it is check values are equals or not
//  java is a casesensative language jitendra & JITENDRA  are different values
//   if we can ignore the tho cases jitendra & JITENDRA then use {  equalsIgnoreCAse()  } methid
        if(name.equals(sameName)) {
            System.out.println("name and samename are equls ");
        } else {
            System.out.println("name and sameName are Not equals ");
        }

        if (name.equals(newName)) {
            System.out.println("name and newName are equals ");
        } else {
            System.out.println("name and newName are Not equals ");
        }

//  this method ignore the cases and ignore casesensitive values
        String a = "name";
        String b = "NAME";

        if (a.equalsIgnoreCase(b)){
            System.out.println("a and b are same values ");
        }
    }
}
