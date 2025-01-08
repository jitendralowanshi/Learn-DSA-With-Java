
import java.util.Scanner;

public class Main {

    public static void returnName() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Yout First name");
        String name = sc.nextLine();

        System.out.println("Enter your last name ");
        String surname = sc.nextLine();
        String fullName = name + surname;

        System.out.println("WELCOME, "+fullName);
        sc.close();
//        return fullName;
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter Yout First name ");
//        String name = sc.nextLine();
//
//        System.out.println("Enter your last name ");
//        String surname = sc.nextLine();

        returnName();
//        oneBuilder();

    }

}