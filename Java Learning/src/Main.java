
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int age = 15;
        double gpa = 3.45;
        char initial = 'a';
        boolean ispresnt = true;
        String name = "Minu Johnson";
        char  Firstname = name.charAt(0);
        char  Lastname = name.charAt(5);


        System.out.println("Hello World");
        System.out.println(gpa);
        System.out.println(age);
        System.out.println(ispresnt);
        System.out.println(name);
        System.out.println(Firstname);
        System.out.println(Lastname);
        System.out.println(Firstname  + " " + Lastname  + " has a GPA of " + gpa);
        System.out.println("Update to new value?");

        Scanner input = new Scanner(System.in);
        gpa = input.nextDouble();
        System.out.println(Firstname  + " " + Lastname  + " has a GPA of " + gpa);
        System.out.println("Update to new name?");
        Scanner input2 = new Scanner(System.in);
        String name2 = input2.nextLine();
        System.out.println(name2);




    }

}

