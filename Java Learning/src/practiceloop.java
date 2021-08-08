import java.util.Scanner;
public class practiceloop {
    public static void main(String[] args){
        System.out.println("Who is the flying mammal?");
        String choice1 = "Bat";
        String choice2 = "Crow";
        String choice3 = "Dove";

        Scanner input = new Scanner(System.in);
        String choice = input.next();
        System.out.println(choice);
        if (choice.equals(choice1))
        {
            System.out.println("Congrats!Your answer is correct");
        }
        else
        {
            System.out.println("Sorry you gave wrong answer");
        }

        System.out.println("Who is the captian of Indian Cricket?");
        Scanner opt = new Scanner(System.in);
        String option = opt.next();
        boolean Dhoni = true;
        while(option.equals("Dhoni"))
        {
            System.out.println("Congrats!Your answer is correct");
            break;
        }


  }


}
